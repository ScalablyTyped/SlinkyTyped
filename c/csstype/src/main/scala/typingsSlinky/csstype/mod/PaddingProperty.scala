package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - TLength
  - java.lang.String
*/
trait PaddingProperty[TLength] extends js.Object

object PaddingProperty {
  @scala.inline
  implicit def apply[TLength](value: Globals): PaddingProperty[TLength] = value.asInstanceOf[PaddingProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): PaddingProperty[TLength] = value.asInstanceOf[PaddingProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): PaddingProperty[TLength] = value.asInstanceOf[PaddingProperty[TLength]]
}

