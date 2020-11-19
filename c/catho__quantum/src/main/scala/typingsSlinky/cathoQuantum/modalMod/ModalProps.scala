package typingsSlinky.cathoQuantum.modalMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.cathoQuantum.anon.BreakpointsColors
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalProps extends js.Object {
  
  var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.native
  
  var closeButtonAriaLabel: js.UndefOr[String] = js.native
  
  var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  
  var theme: js.UndefOr[BreakpointsColors] = js.native
}
object ModalProps {
  
  @scala.inline
  def apply(): ModalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalProps]
  }
  
  @scala.inline
  implicit class ModalPropsOps[Self <: ModalProps] (val x: Self) extends AnyVal {
    
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
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ReactElement] | ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCloseButtonAriaLabel(value: String): Self = this.set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseButtonAriaLabel: Self = this.set("closeButtonAriaLabel", js.undefined)
    
    @scala.inline
    def setOnClose(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setTheme(value: BreakpointsColors): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
