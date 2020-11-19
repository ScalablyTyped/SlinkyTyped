package typingsSlinky.ionicReact.anon

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonModalElement
import typingsSlinky.ionicCore.mod.FrameworkDelegate
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  children :react.react.ReactNode,   forwardedRef :react.react.RefObject<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonModalElement> | undefined} & std.Pick<@ionic/core.@ionic/core.ModalOptions<@ionic/core.@ionic/core.ComponentRef>, 'animated' | 'mode' | 'id' | 'cssClass' | 'backdropDismiss' | 'keyboardClose' | 'enterAnimation' | 'leaveAnimation' | 'showBackdrop' | 'presentingElement' | 'delegate' | 'swipeToClose'> & @ionic/react.@ionic/react/dist/types/components/createOverlayComponent.ReactOverlayProps & react.react.RefAttributes<@ionic/core.@ionic/core/dist/types/components.<global>.HTMLIonModalElement> */
@js.native
trait childrenReactNodeforwarde extends js.Object {
  
  var animated: js.UndefOr[Boolean] = js.native
  
  var backdropDismiss: js.UndefOr[Boolean] = js.native
  
  var children: ReactElement with js.UndefOr[ReactElement] = js.native
  
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  var forwardedRef: js.UndefOr[ReactRef[HTMLIonModalElement]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isOpen: Boolean = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  var keyboardClose: js.UndefOr[Boolean] = js.native
  
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  var mode: js.UndefOr[Mode] = js.native
  
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  
  var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  
  var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  
  var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  
  var presentingElement: js.UndefOr[HTMLElement] = js.native
  
  var ref: js.UndefOr[Ref[HTMLIonModalElement]] = js.native
  
  var showBackdrop: js.UndefOr[Boolean] = js.native
  
  var swipeToClose: js.UndefOr[Boolean] = js.native
}
object childrenReactNodeforwarde {
  
  @scala.inline
  def apply(isOpen: Boolean): childrenReactNodeforwarde = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[childrenReactNodeforwarde]
  }
  
  @scala.inline
  implicit class childrenReactNodeforwardeOps[Self <: childrenReactNodeforwarde] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setBackdropDismiss(value: Boolean): Self = this.set("backdropDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdropDismiss: Self = this.set("backdropDismiss", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement with js.UndefOr[ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    
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
    def setForwardedRef(value: ReactRef[HTMLIonModalElement]): Self = this.set("forwardedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardedRef: Self = this.set("forwardedRef", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
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
    def setOnDidDismiss(value: /* event */ CustomEvent => Unit): Self = this.set("onDidDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDidDismiss: Self = this.set("onDidDismiss", js.undefined)
    
    @scala.inline
    def setOnDidPresent(value: /* event */ CustomEvent => Unit): Self = this.set("onDidPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDidPresent: Self = this.set("onDidPresent", js.undefined)
    
    @scala.inline
    def setOnWillDismiss(value: /* event */ CustomEvent => Unit): Self = this.set("onWillDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWillDismiss: Self = this.set("onWillDismiss", js.undefined)
    
    @scala.inline
    def setOnWillPresent(value: /* event */ CustomEvent => Unit): Self = this.set("onWillPresent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWillPresent: Self = this.set("onWillPresent", js.undefined)
    
    @scala.inline
    def setPresentingElement(value: HTMLElement): Self = this.set("presentingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresentingElement: Self = this.set("presentingElement", js.undefined)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[HTMLIonModalElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLIonModalElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[HTMLIonModalElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    
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
