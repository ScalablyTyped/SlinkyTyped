package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.Position[TLength]
  - java.lang.String
*/
trait MaskPositionProperty[TLength] extends js.Object

object MaskPositionProperty {
  @scala.inline
  implicit def apply[TLength](value: Globals): MaskPositionProperty[TLength] = value.asInstanceOf[MaskPositionProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Position[TLength]): MaskPositionProperty[TLength] = value.asInstanceOf[MaskPositionProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): MaskPositionProperty[TLength] = value.asInstanceOf[MaskPositionProperty[TLength]]
}

