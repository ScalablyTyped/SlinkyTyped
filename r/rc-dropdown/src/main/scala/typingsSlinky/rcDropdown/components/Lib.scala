package typingsSlinky.rcDropdown.components

import typingsSlinky.rcDropdown.dropdownMod.DropdownProps
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Lib {
  @JSImport("rc-dropdown/lib", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: DropdownProps with RefAttributes[js.Any]): SharedBuilder_DropdownPropsRefAttributes821852308[Ref[js.Any] with js.Object] = new SharedBuilder_DropdownPropsRefAttributes821852308[Ref[js.Any] with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Lib.type): SharedBuilder_DropdownPropsRefAttributes821852308[Ref[js.Any] with js.Object] = new SharedBuilder_DropdownPropsRefAttributes821852308[Ref[js.Any] with js.Object](js.Array(this.component, js.Dictionary.empty))()
}

