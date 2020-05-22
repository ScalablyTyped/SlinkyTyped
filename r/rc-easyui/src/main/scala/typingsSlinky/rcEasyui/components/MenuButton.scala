package typingsSlinky.rcEasyui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rcEasyui.mod.MenuButton_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object MenuButton {
  @JSImport("rc-easyui", "MenuButton")
  @js.native
  object component extends js.Object
  
  def apply(p: js.Any): Default[tag.type, MenuButton_] = new Default[tag.type, MenuButton_](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MenuButton.type): Default[tag.type, MenuButton_] = new Default[tag.type, MenuButton_](js.Array(this.component, js.Dictionary.empty))()
}

