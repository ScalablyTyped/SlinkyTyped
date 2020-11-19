package typingsSlinky.rcEasyui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rcEasyui.mod.TabPanel_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object TabPanel {
  
  @JSImport("rc-easyui", "TabPanel")
  @js.native
  object component extends js.Object
  
  def apply(p: js.Any): Default[tag.type, TabPanel_] = new Default[tag.type, TabPanel_](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TabPanel.type): Default[tag.type, TabPanel_] = new Default[tag.type, TabPanel_](js.Array(this.component, js.Dictionary.empty))()
}
