package typingsSlinky.reactRecaptcha

import typingsSlinky.react.mod.Component
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.`inline`
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.audio
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.bottomleft
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.bottomright
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.compact
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.dark
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.explicit
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.image
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.invisible
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.light
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.normal
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.onload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-recaptcha", JSImport.Namespace)
  @js.native
  class ^ () extends Recaptcha
  @JSImport("react-recaptcha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("react-recaptcha", "defaultProps")
  @js.native
  def defaultProps: RecaptchaProps = js.native
  @scala.inline
  def defaultProps_=(x: RecaptchaProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("react-recaptcha", "propTypes")
  @js.native
  def propTypes: js.Any = js.native
  @scala.inline
  def propTypes_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Recaptcha
    extends Component[RecaptchaProps, js.Object, js.Any] {
    
    def execute(): Unit = js.native
    
    def reset(): Unit = js.native
  }
  
  @js.native
  trait RecaptchaProps extends StObject {
    
    var badge: js.UndefOr[bottomright | bottomleft | `inline`] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var elementID: js.UndefOr[String] = js.native
    
    var expiredCallback: js.UndefOr[js.Function0[_]] = js.native
    
    var expiredCallbackName: js.UndefOr[String] = js.native
    
    var hl: js.UndefOr[String] = js.native
    
    var onloadCallback: js.UndefOr[js.Function0[_]] = js.native
    
    var onloadCallbackName: js.UndefOr[String] = js.native
    
    var render: js.UndefOr[onload | explicit] = js.native
    
    var sitekey: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[normal | compact | invisible] = js.native
    
    var tabindex: js.UndefOr[Double | String] = js.native
    
    var theme: js.UndefOr[dark | light] = js.native
    
    var `type`: js.UndefOr[audio | image] = js.native
    
    var verifyCallback: js.UndefOr[js.Function1[/* response */ String, _]] = js.native
    
    var verifyCallbackName: js.UndefOr[String] = js.native
  }
  object RecaptchaProps {
    
    @scala.inline
    def apply(): RecaptchaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecaptchaProps]
    }
    
    @scala.inline
    implicit class RecaptchaPropsMutableBuilder[Self <: RecaptchaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: bottomright | bottomleft | `inline`): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setElementID(value: String): Self = StObject.set(x, "elementID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementIDUndefined: Self = StObject.set(x, "elementID", js.undefined)
      
      @scala.inline
      def setExpiredCallback(value: () => _): Self = StObject.set(x, "expiredCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExpiredCallbackName(value: String): Self = StObject.set(x, "expiredCallbackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiredCallbackNameUndefined: Self = StObject.set(x, "expiredCallbackName", js.undefined)
      
      @scala.inline
      def setExpiredCallbackUndefined: Self = StObject.set(x, "expiredCallback", js.undefined)
      
      @scala.inline
      def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
      
      @scala.inline
      def setOnloadCallback(value: () => _): Self = StObject.set(x, "onloadCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnloadCallbackName(value: String): Self = StObject.set(x, "onloadCallbackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnloadCallbackNameUndefined: Self = StObject.set(x, "onloadCallbackName", js.undefined)
      
      @scala.inline
      def setOnloadCallbackUndefined: Self = StObject.set(x, "onloadCallback", js.undefined)
      
      @scala.inline
      def setRender(value: onload | explicit): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSitekeyUndefined: Self = StObject.set(x, "sitekey", js.undefined)
      
      @scala.inline
      def setSize(value: normal | compact | invisible): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTabindex(value: Double | String): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      @scala.inline
      def setTheme(value: dark | light): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setType(value: audio | image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVerifyCallback(value: /* response */ String => _): Self = StObject.set(x, "verifyCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVerifyCallbackName(value: String): Self = StObject.set(x, "verifyCallbackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyCallbackNameUndefined: Self = StObject.set(x, "verifyCallbackName", js.undefined)
      
      @scala.inline
      def setVerifyCallbackUndefined: Self = StObject.set(x, "verifyCallback", js.undefined)
    }
  }
}
