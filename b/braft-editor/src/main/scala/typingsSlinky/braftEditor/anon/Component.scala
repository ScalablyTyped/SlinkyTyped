package typingsSlinky.braftEditor.anon

import slinky.core.TagMod
import typingsSlinky.braftEditor.braftEditorStrings.component
import typingsSlinky.braftEditor.mod.ExtendControlType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends ExtendControlType {
  var component: TagMod[Any]
  var key: String
  var `type`: component
}

object Component {
  @scala.inline
  def apply(key: String, `type`: component, component: TagMod[Any] = null): Component = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
}

