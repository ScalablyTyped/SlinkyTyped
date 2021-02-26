package typingsSlinky.hcaptchaReactHcaptcha

import typingsSlinky.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.compact
import typingsSlinky.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.dark
import typingsSlinky.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.invisible
import typingsSlinky.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.light
import typingsSlinky.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.normal
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hcaptcha/react-hcaptcha", JSImport.Namespace)
  @js.native
  class ^ () extends HCaptcha
  
  @js.native
  trait HCaptcha
    extends Component[HCaptchaProps, HCaptchaState, js.Any] {
    
    def execute(): Unit = js.native
    
    def removeCaptcha(): Unit = js.native
    
    def renderCaptcha(): Unit = js.native
    
    def resetCaptcha(): Unit = js.native
  }
  
  @js.native
  trait HCaptchaProps extends StObject {
    
    var id: js.UndefOr[String] = js.native
    
    var languageOverride: js.UndefOr[String] = js.native
    
    var onError: js.UndefOr[js.Function1[/* event */ String, _]] = js.native
    
    var onExpire: js.UndefOr[js.Function0[_]] = js.native
    
    var onVerify: js.UndefOr[js.Function1[/* token */ String, _]] = js.native
    
    var reCaptchaCompat: js.UndefOr[Boolean] = js.native
    
    var sitekey: String = js.native
    
    var size: js.UndefOr[normal | compact | invisible] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var theme: js.UndefOr[light | dark] = js.native
  }
  object HCaptchaProps {
    
    @scala.inline
    def apply(sitekey: String): HCaptchaProps = {
      val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[HCaptchaProps]
    }
    
    @scala.inline
    implicit class HCaptchaPropsMutableBuilder[Self <: HCaptchaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLanguageOverride(value: String): Self = StObject.set(x, "languageOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageOverrideUndefined: Self = StObject.set(x, "languageOverride", js.undefined)
      
      @scala.inline
      def setOnError(value: /* event */ String => _): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnExpire(value: () => _): Self = StObject.set(x, "onExpire", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExpireUndefined: Self = StObject.set(x, "onExpire", js.undefined)
      
      @scala.inline
      def setOnVerify(value: /* token */ String => _): Self = StObject.set(x, "onVerify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVerifyUndefined: Self = StObject.set(x, "onVerify", js.undefined)
      
      @scala.inline
      def setReCaptchaCompat(value: Boolean): Self = StObject.set(x, "reCaptchaCompat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReCaptchaCompatUndefined: Self = StObject.set(x, "reCaptchaCompat", js.undefined)
      
      @scala.inline
      def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: normal | compact | invisible): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTheme(value: light | dark): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait HCaptchaState extends StObject {
    
    var captchaId: String = js.native
    
    var elementId: String = js.native
    
    var isApiReady: Boolean = js.native
    
    var isRemoved: Boolean = js.native
  }
  object HCaptchaState {
    
    @scala.inline
    def apply(captchaId: String, elementId: String, isApiReady: Boolean, isRemoved: Boolean): HCaptchaState = {
      val __obj = js.Dynamic.literal(captchaId = captchaId.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], isApiReady = isApiReady.asInstanceOf[js.Any], isRemoved = isRemoved.asInstanceOf[js.Any])
      __obj.asInstanceOf[HCaptchaState]
    }
    
    @scala.inline
    implicit class HCaptchaStateMutableBuilder[Self <: HCaptchaState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaptchaId(value: String): Self = StObject.set(x, "captchaId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsApiReady(value: Boolean): Self = StObject.set(x, "isApiReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRemoved(value: Boolean): Self = StObject.set(x, "isRemoved", value.asInstanceOf[js.Any])
    }
  }
}
