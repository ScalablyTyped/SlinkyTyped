package typingsSlinky.antdMobile.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antdMobile.customKeyboardMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object CustomKeyboard {
  
  @JSImport("antd-mobile/lib/input-item/CustomKeyboard", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def apply(p: js.Any): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CustomKeyboard.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}
