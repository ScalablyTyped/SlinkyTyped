package typingsSlinky.reactstrap.tooltipMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipProps extends UncontrolledTooltipProps {
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var toggle: js.UndefOr[MouseEventHandler[_] | js.Function0[Unit]] = js.native
}
object TooltipProps {
  
  @scala.inline
  def apply(target: String | HTMLElement | ReactRef[HTMLElement]): TooltipProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
  
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
    
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setToggleFunction1(value: SyntheticMouseEvent[_] => Unit): Self = this.set("toggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleFunction0(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: MouseEventHandler[_] | js.Function0[Unit]): Self = this.set("toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
}
