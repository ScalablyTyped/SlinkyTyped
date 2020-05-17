package typingsSlinky.braftEditor.mod

import typingsSlinky.braftEditor.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.braftEditor.mod.BuiltInControlType
  - typingsSlinky.braftEditor.anon.Key
  - typingsSlinky.braftEditor.mod.ExtendControlType
*/
trait ControlType extends js.Object

object ControlType {
  @scala.inline
  implicit def apply(value: BuiltInControlType): ControlType = value.asInstanceOf[ControlType]
  @scala.inline
  implicit def apply(value: ExtendControlType): ControlType = value.asInstanceOf[ControlType]
  @scala.inline
  implicit def apply(value: Key): ControlType = value.asInstanceOf[ControlType]
}

