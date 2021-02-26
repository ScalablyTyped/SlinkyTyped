package typingsSlinky.ionicCore

import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.ionicCoreStrings.bottom
import typingsSlinky.ionicCore.ionicCoreStrings.cancel
import typingsSlinky.ionicCore.ionicCoreStrings.end
import typingsSlinky.ionicCore.ionicCoreStrings.middle
import typingsSlinky.ionicCore.ionicCoreStrings.start
import typingsSlinky.ionicCore.ionicCoreStrings.top
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.sanitizationMod.IonicSafeString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastInterfaceMod {
  
  @js.native
  trait ToastButton extends StObject {
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    
    var handler: js.UndefOr[js.Function0[Boolean | Unit | (js.Promise[Boolean | Unit])]] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var role: js.UndefOr[cancel | String] = js.native
    
    var side: js.UndefOr[start | end] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object ToastButton {
    
    @scala.inline
    def apply(): ToastButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastButton]
    }
    
    @scala.inline
    implicit class ToastButtonMutableBuilder[Self <: ToastButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
      
      @scala.inline
      def setHandler(value: () => Boolean | Unit | (js.Promise[Boolean | Unit])): Self = StObject.set(x, "handler", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setRole(value: cancel | String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSide(value: start | end): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait ToastOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.native
    
    var buttons: js.UndefOr[js.Array[ToastButton | String]] = js.native
    
    var color: js.UndefOr[Color] = js.native
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var header: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var keyboardClose: js.UndefOr[Boolean] = js.native
    
    var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var message: js.UndefOr[String | IonicSafeString] = js.native
    
    var mode: js.UndefOr[Mode] = js.native
    
    var position: js.UndefOr[top | bottom | middle] = js.native
    
    var translucent: js.UndefOr[Boolean] = js.native
  }
  object ToastOptions {
    
    @scala.inline
    def apply(): ToastOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastOptions]
    }
    
    @scala.inline
    implicit class ToastOptionsMutableBuilder[Self <: ToastOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setButtons(value: js.Array[ToastButton | String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: (ToastButton | String)*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value :_*))
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEnterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
      
      @scala.inline
      def setLeaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
      
      @scala.inline
      def setMessage(value: String | IonicSafeString): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setPosition(value: top | bottom | middle): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
    }
  }
}
