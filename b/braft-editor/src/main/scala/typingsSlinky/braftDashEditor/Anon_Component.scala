package typingsSlinky.braftDashEditor

import slinky.core.TagMod
import typingsSlinky.braftDashEditor.braftDashEditorMod.ExtendControlType
import typingsSlinky.braftDashEditor.braftDashEditorStrings.component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Component extends ExtendControlType {
  var component: TagMod[Any]
  var key: String
  var `type`: component
}

object Anon_Component {
  @scala.inline
  def apply(component: TagMod[Any], key: String, `type`: component): Anon_Component = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Component]
  }
}

