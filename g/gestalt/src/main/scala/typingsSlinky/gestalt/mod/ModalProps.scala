package typingsSlinky.gestalt.mod

import slinky.core.facade.ReactElement
import typingsSlinky.gestalt.gestaltStrings.alertdialog
import typingsSlinky.gestalt.gestaltStrings.dialog
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.gestaltStrings.sm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalProps extends js.Object {
  
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
    def setAccessibilityModalLabel(value: String): Self = this.set("accessibilityModalLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCloseOnOutsideClick(value: Boolean): Self = this.set("closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnOutsideClick: Self = this.set("closeOnOutsideClick", js.undefined)
    
    @scala.inline
    def setFooterReactElement(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooter(value: ReactElement): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeadingReactElement(value: ReactElement): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeading(value: String | ReactElement): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    
    @scala.inline
    def setRole(value: alertdialog | dialog): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSize(value: sm | md | lg | Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
