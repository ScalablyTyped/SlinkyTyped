package typingsSlinky.braftEditor

import slinky.core.TagMod
import typingsSlinky.braftEditor.braftEditorStrings.component
import typingsSlinky.braftEditor.mod.ExtendControlType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponent extends ExtendControlType {
  var component: TagMod[Any]
  var key: String
  var `type`: component
}

object AnonComponent {
  @scala.inline
  def apply(component: TagMod[Any], key: String, `type`: component): AnonComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponent]
  }
}

