package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.MaskLayer[TLength]
  - java.lang.String
*/
trait MaskProperty[TLength] extends js.Object

object MaskProperty {
  @scala.inline
  implicit def apply[TLength](value: Globals): MaskProperty[TLength] = value.asInstanceOf[MaskProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: MaskLayer[TLength]): MaskProperty[TLength] = value.asInstanceOf[MaskProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): MaskProperty[TLength] = value.asInstanceOf[MaskProperty[TLength]]
}

