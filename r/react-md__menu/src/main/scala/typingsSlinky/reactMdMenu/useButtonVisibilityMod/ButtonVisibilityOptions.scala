package typingsSlinky.reactMdMenu.useButtonVisibilityMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.reactMdMenu.useVisibilityMod.VisibilityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonVisibilityOptions extends VisibilityOptions {
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
}
object ButtonVisibilityOptions {
  
  @scala.inline
  def apply(): ButtonVisibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonVisibilityOptions]
  }
  
  @scala.inline
  implicit class ButtonVisibilityOptionsOps[Self <: ButtonVisibilityOptions] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLButtonElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
  }
}
