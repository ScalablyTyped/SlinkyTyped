package typingsSlinky.objtools.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.objtools.mod.MaskObj
  - js.Array[typingsSlinky.objtools.mod.MaskObj]
  - scala.Boolean
*/
trait Mask extends js.Object

object Mask {
  @scala.inline
  implicit def apply(value: js.Array[MaskObj]): Mask = value.asInstanceOf[Mask]
  @scala.inline
  implicit def apply(value: Boolean): Mask = value.asInstanceOf[Mask]
  @scala.inline
  implicit def apply(value: MaskObj): Mask = value.asInstanceOf[Mask]
}

