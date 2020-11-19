package typingsSlinky.ionicReact.ionModalMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.mod.FrameworkDelegate
import typingsSlinky.ionicCore.mod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@ionic/core.@ionic/core.ModalOptions<@ionic/core.@ionic/core.ComponentRef>, 'component' | 'componentProps'> & {  children :react.react.ReactNode} */
@js.native
trait ReactModalOptions extends js.Object {
  
  var animated: js.UndefOr[Boolean] = js.native
  
  var backdropDismiss: js.UndefOr[Boolean] = js.native
  
  var children: ReactElement = js.native
  
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var keyboardClose: js.UndefOr[Boolean] = js.native
  
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  var mode: js.UndefOr[Mode] = js.native
  
  var presentingElement: js.UndefOr[HTMLElement] = js.native
  
  var showBackdrop: js.UndefOr[Boolean] = js.native
  
  var swipeToClose: js.UndefOr[Boolean] = js.native
}
object ReactModalOptions {
  
  @scala.inline
  def apply(): ReactModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactModalOptions]
  }
  
  @scala.inline
  implicit class ReactModalOptionsOps[Self <: ReactModalOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setBackdropDismiss(value: Boolean): Self = this.set("backdropDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropDismiss: Self = this.set("backdropDismiss", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCssClassVarargs(value: String*): Self = this.set("cssClass", js.Array(value :_*))
    
    @scala.inline
    def setCssClass(value: String | js.Array[String]): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDelegate(value: FrameworkDelegate): Self = this.set("delegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegate: Self = this.set("delegate", js.undefined)
    
    @scala.inline
    def setEnterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("enterAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEnterAnimation: Self = this.set("enterAnimation", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKeyboardClose(value: Boolean): Self = this.set("keyboardClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardClose: Self = this.set("keyboardClose", js.undefined)
    
    @scala.inline
    def setLeaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("leaveAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLeaveAnimation: Self = this.set("leaveAnimation", js.undefined)
    
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setPresentingElement(value: HTMLElement): Self = this.set("presentingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresentingElement: Self = this.set("presentingElement", js.undefined)
    
    @scala.inline
    def setShowBackdrop(value: Boolean): Self = this.set("showBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBackdrop: Self = this.set("showBackdrop", js.undefined)
    
    @scala.inline
    def setSwipeToClose(value: Boolean): Self = this.set("swipeToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeToClose: Self = this.set("swipeToClose", js.undefined)
  }
}
