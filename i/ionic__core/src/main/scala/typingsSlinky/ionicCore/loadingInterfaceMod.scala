package typingsSlinky.ionicCore

import typingsSlinky.ionicCore.animationInterfaceMod.Animation
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.mod.Mode
import typingsSlinky.ionicCore.sanitizationMod.IonicSafeString
import typingsSlinky.ionicCore.spinnerConfigsMod.SpinnerTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingInterfaceMod {
  
  @js.native
  trait LoadingOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.native
    
    var backdropDismiss: js.UndefOr[Boolean] = js.native
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var keyboardClose: js.UndefOr[Boolean] = js.native
    
    var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var message: js.UndefOr[String | IonicSafeString] = js.native
    
    var mode: js.UndefOr[Mode] = js.native
    
    var showBackdrop: js.UndefOr[Boolean] = js.native
    
    var spinner: js.UndefOr[SpinnerTypes | Null] = js.native
    
    var translucent: js.UndefOr[Boolean] = js.native
  }
  object LoadingOptions {
    
    @scala.inline
    def apply(): LoadingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadingOptions]
    }
    
    @scala.inline
    implicit class LoadingOptionsMutableBuilder[Self <: LoadingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setBackdropDismiss(value: Boolean): Self = StObject.set(x, "backdropDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropDismissUndefined: Self = StObject.set(x, "backdropDismiss", js.undefined)
      
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
      def setShowBackdrop(value: Boolean): Self = StObject.set(x, "showBackdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowBackdropUndefined: Self = StObject.set(x, "showBackdrop", js.undefined)
      
      @scala.inline
      def setSpinner(value: SpinnerTypes): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinnerNull: Self = StObject.set(x, "spinner", null)
      
      @scala.inline
      def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
      
      @scala.inline
      def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
    }
  }
}
