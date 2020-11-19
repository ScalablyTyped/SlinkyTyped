package typingsSlinky.reactOutsideClickHandler.mod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline-block`
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline`
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.block
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.contents
import typingsSlinky.reactOutsideClickHandler.reactOutsideClickHandlerStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<react-outside-click-handler.react-outside-click-handler.DefaultProps> */
@js.native
trait Props extends js.Object {
  
  var children: ReactElement = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var display: js.UndefOr[block | flex | `inline` | `inline-block` | contents] = js.native
  
  def onOutsideClick(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  
  var useCapture: js.UndefOr[Boolean] = js.native
}
object Props {
  
  @scala.inline
  def apply(onOutsideClick: SyntheticMouseEvent[HTMLElement] => Unit): Props = {
    val __obj = js.Dynamic.literal(onOutsideClick = js.Any.fromFunction1(onOutsideClick))
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setOnOutsideClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = this.set("onOutsideClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisplay(value: block | flex | `inline` | `inline-block` | contents): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setUseCapture(value: Boolean): Self = this.set("useCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCapture: Self = this.set("useCapture", js.undefined)
  }
}
