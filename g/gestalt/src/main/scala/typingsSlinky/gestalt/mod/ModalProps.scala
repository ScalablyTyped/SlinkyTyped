package typingsSlinky.gestalt.mod

import slinky.core.facade.ReactElement
import typingsSlinky.gestalt.gestaltStrings.alertdialog
import typingsSlinky.gestalt.gestaltStrings.dialog
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.sm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalProps extends StObject {
  
  var accessibilityModalLabel: String = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var closeOnOutsideClick: js.UndefOr[Boolean] = js.native
  
  var footer: js.UndefOr[ReactElement] = js.native
  
  var heading: js.UndefOr[String | ReactElement] = js.native
  
  def onDismiss(): Unit = js.native
  
  var role: js.UndefOr[alertdialog | dialog] = js.native
  
  var size: js.UndefOr[sm | md | lg | Double] = js.native
}
object ModalProps {
  
  @scala.inline
  def apply(accessibilityModalLabel: String, onDismiss: () => Unit): ModalProps = {
    val __obj = js.Dynamic.literal(accessibilityModalLabel = accessibilityModalLabel.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[ModalProps]
  }
  
  @scala.inline
  implicit class ModalPropsMutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityModalLabel(value: String): Self = StObject.set(x, "accessibilityModalLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setCloseOnOutsideClick(value: Boolean): Self = StObject.set(x, "closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnOutsideClickUndefined: Self = StObject.set(x, "closeOnOutsideClick", js.undefined)
    
    @scala.inline
    def setFooter(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterReactElement(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setHeading(value: String | ReactElement): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingReactElement(value: ReactElement): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRole(value: alertdialog | dialog): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSize(value: sm | md | lg | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
