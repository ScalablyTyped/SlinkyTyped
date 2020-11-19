package typingsSlinky.rcEasyui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object Messager {
  
  @JSImport("rc-easyui", "Messager")
  @js.native
  object component extends js.Object
  
  def apply(p: js.Any): Default[tag.type, typingsSlinky.rcEasyui.mod.Messager] = new Default[tag.type, typingsSlinky.rcEasyui.mod.Messager](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Messager.type): Default[tag.type, typingsSlinky.rcEasyui.mod.Messager] = new Default[tag.type, typingsSlinky.rcEasyui.mod.Messager](js.Array(this.component, js.Dictionary.empty))()
}
