package typingsSlinky.rcEasyui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object TextEditor {
  
  def apply(p: js.Any): Default[tag.type, typingsSlinky.rcEasyui.mod.TextEditor] = new Default[tag.type, typingsSlinky.rcEasyui.mod.TextEditor](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("rc-easyui", "TextEditor")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TextEditor.type): Default[tag.type, typingsSlinky.rcEasyui.mod.TextEditor] = new Default[tag.type, typingsSlinky.rcEasyui.mod.TextEditor](js.Array(this.component, js.Dictionary.empty))()
}
