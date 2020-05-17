package typingsSlinky.braftEditor.mod

import typingsSlinky.braftEditor.anon.ArrowActive
import typingsSlinky.braftEditor.anon.ClassName
import typingsSlinky.braftEditor.anon.Component
import typingsSlinky.braftEditor.anon.Disabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.braftEditor.braftEditorStrings.separator
  - typingsSlinky.braftEditor.anon.ClassName
  - typingsSlinky.braftEditor.anon.ArrowActive
  - typingsSlinky.braftEditor.anon.Disabled
  - typingsSlinky.braftEditor.anon.Component
*/
trait ExtendControlType extends ControlType

object ExtendControlType {
  @scala.inline
  def separator: typingsSlinky.braftEditor.braftEditorStrings.separator = "separator".asInstanceOf[typingsSlinky.braftEditor.braftEditorStrings.separator]
  @scala.inline
  implicit def apply(value: ArrowActive): ExtendControlType = value.asInstanceOf[ExtendControlType]
  @scala.inline
  implicit def apply(value: ClassName): ExtendControlType = value.asInstanceOf[ExtendControlType]
  @scala.inline
  implicit def apply(value: Component): ExtendControlType = value.asInstanceOf[ExtendControlType]
  @scala.inline
  implicit def apply(value: Disabled): ExtendControlType = value.asInstanceOf[ExtendControlType]
}

