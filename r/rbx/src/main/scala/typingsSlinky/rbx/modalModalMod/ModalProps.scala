package typingsSlinky.rbx.modalModalMod

import org.scalajs.dom.raw.Document
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<rbx.rbx/components/modal/modal-container.ModalContainerProps, 'as' | 'innerRef'> */
@js.native
trait ModalProps extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var clipped: js.UndefOr[Boolean] = js.native
  
  var closeOnBlur: js.UndefOr[Boolean] = js.native
  
  var closeOnEsc: js.UndefOr[Boolean] = js.native
  
  var containerClassName: js.UndefOr[String] = js.native
  
  var document: js.UndefOr[Document] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClipped(value: Boolean): Self = this.set("clipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipped: Self = this.set("clipped", js.undefined)
    
    @scala.inline
    def setCloseOnBlur(value: Boolean): Self = this.set("closeOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnBlur: Self = this.set("closeOnBlur", js.undefined)
    
    @scala.inline
    def setCloseOnEsc(value: Boolean): Self = this.set("closeOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnEsc: Self = this.set("closeOnEsc", js.undefined)
    
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    
    @scala.inline
    def setDocument(value: Document): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
  }
}
