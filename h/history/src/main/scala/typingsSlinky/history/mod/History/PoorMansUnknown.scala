package typingsSlinky.history.mod.History

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The value type here is a "poor man's `unknown`". When these types support TypeScript
// 3.0+, we can replace this with `unknown`.
/* Rewritten from type alias, can be one of: 
  - js.Object
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait PoorMansUnknown extends js.Object

object PoorMansUnknown {
  @scala.inline
  implicit def apply(value: Null): PoorMansUnknown = value.asInstanceOf[PoorMansUnknown]
  @scala.inline
  implicit def apply(value: js.Object): PoorMansUnknown = value.asInstanceOf[PoorMansUnknown]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => PoorMansUnknown): PoorMansUnknown = value.asInstanceOf[PoorMansUnknown]
}

