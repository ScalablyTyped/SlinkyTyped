package typingsSlinky.reactOverlays.dropdownMod

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.mod.KeyboardEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownInjectedProps extends js.Object {
  
  var onKeyDown: KeyboardEventHandler[Element] = js.native
}
object DropdownInjectedProps {
  
  @scala.inline
  def apply(onKeyDown: SyntheticKeyboardEvent[Element] => Unit): DropdownInjectedProps = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[DropdownInjectedProps]
  }
  
  @scala.inline
  implicit class DropdownInjectedPropsOps[Self <: DropdownInjectedProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[Element] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
  }
}
