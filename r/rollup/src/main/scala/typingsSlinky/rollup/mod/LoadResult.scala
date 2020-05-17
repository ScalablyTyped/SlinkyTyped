package typingsSlinky.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rollup.mod.SourceDescription
  - java.lang.String
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait LoadResult extends js.Object

object LoadResult {
  @scala.inline
  implicit def apply(value: Null): LoadResult = value.asInstanceOf[LoadResult]
  @scala.inline
  implicit def apply(value: SourceDescription): LoadResult = value.asInstanceOf[LoadResult]
  @scala.inline
  implicit def apply(value: String): LoadResult = value.asInstanceOf[LoadResult]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => LoadResult): LoadResult = value.asInstanceOf[LoadResult]
}

