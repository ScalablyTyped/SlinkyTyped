package typingsSlinky.nock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Essentially valid, decoded JSON with the addition of possible RegExp. TS doesn't currently have
// a great way to represent JSON type data, this data matcher design is based off this comment.
// https://github.com/microsoft/TypeScript/issues/1897#issuecomment-338650717
/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - scala.Double
  - java.lang.String
  - scala.Null
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.std.RegExp
  - typingsSlinky.nock.mod.DataMatcherArray
  - typingsSlinky.nock.mod.DataMatcherMap
*/
trait DataMatcher extends js.Object

object DataMatcher {
  @scala.inline
  implicit def apply(value: Boolean): DataMatcher = value.asInstanceOf[DataMatcher]
  @scala.inline
  implicit def apply(value: DataMatcherArray): DataMatcher = value.asInstanceOf[DataMatcher]
  @scala.inline
  implicit def apply(value: DataMatcherMap): DataMatcher = value.asInstanceOf[DataMatcher]
  @scala.inline
  implicit def apply(value: Double): DataMatcher = value.asInstanceOf[DataMatcher]
  @scala.inline
  implicit def apply(value: Null): DataMatcher = value.asInstanceOf[DataMatcher]
  @scala.inline
  implicit def apply(value: js.RegExp): DataMatcher = value.asInstanceOf[DataMatcher]
  @scala.inline
  implicit def apply(value: String): DataMatcher = value.asInstanceOf[DataMatcher]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => DataMatcher): DataMatcher = value.asInstanceOf[DataMatcher]
}

