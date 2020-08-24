package typingsSlinky.rcDropdown.components

import typingsSlinky.rcDropdown.dropdownMod.DropdownProps
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcDropdown {
  @JSImport("rc-dropdown", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: DropdownProps with RefAttributes[js.Any]): SharedBuilder_DropdownPropsRefAttributes821852308[js.Any with js.Object] = new SharedBuilder_DropdownPropsRefAttributes821852308[js.Any with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RcDropdown.type): SharedBuilder_DropdownPropsRefAttributes821852308[js.Any with js.Object] = new SharedBuilder_DropdownPropsRefAttributes821852308[js.Any with js.Object](js.Array(this.component, js.Dictionary.empty))()
}

