package typingsSlinky.rcEasyui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rcEasyui.mod.TextBox_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object TextBox {
  
  @JSImport("rc-easyui", "TextBox")
  @js.native
  object component extends js.Object
  
  def apply(p: js.Any): Default[tag.type, TextBox_] = new Default[tag.type, TextBox_](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TextBox.type): Default[tag.type, TextBox_] = new Default[tag.type, TextBox_](js.Array(this.component, js.Dictionary.empty))()
}
