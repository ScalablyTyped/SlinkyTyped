package typingsSlinky.rcDropdown.components

import typingsSlinky.rcDropdown.dropdownMod.DropdownProps
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropdown {
  
  @JSImport("rc-dropdown/es/Dropdown", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Dropdown.type): SharedBuilder_DropdownPropsRefAttributes821852308[js.Any with js.Object] = new SharedBuilder_DropdownPropsRefAttributes821852308[js.Any with js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropdownProps with RefAttributes[js.Any]): SharedBuilder_DropdownPropsRefAttributes821852308[js.Any with js.Object] = new SharedBuilder_DropdownPropsRefAttributes821852308[js.Any with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
