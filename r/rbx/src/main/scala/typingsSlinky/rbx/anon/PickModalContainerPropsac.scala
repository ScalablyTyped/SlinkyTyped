package typingsSlinky.rbx.anon

import org.scalajs.dom.raw.Document
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<rbx.rbx/components/modal/modal-container.ModalContainerProps, 'active' | 'document' | 'children' | 'clipped' | 'closeOnBlur' | 'closeOnEsc' | 'onClose' | 'containerClassName'> */
@js.native
trait PickModalContainerPropsac extends StObject {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var clipped: js.UndefOr[Boolean] = js.native
  
  var closeOnBlur: js.UndefOr[Boolean] = js.native
  
  var closeOnEsc: js.UndefOr[Boolean] = js.native
  
  var containerClassName: js.UndefOr[String] = js.native
  
  var document: js.UndefOr[Document] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
}
object PickModalContainerPropsac {
  
  @scala.inline
  def apply(): PickModalContainerPropsac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickModalContainerPropsac]
  }
  
  @scala.inline
  implicit class PickModalContainerPropsacMutableBuilder[Self <: PickModalContainerPropsac] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClipped(value: Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
    
    @scala.inline
    def setCloseOnBlur(value: Boolean): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnBlurUndefined: Self = StObject.set(x, "closeOnBlur", js.undefined)
    
    @scala.inline
    def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
    
    @scala.inline
    def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
    
    @scala.inline
    def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
  }
}
