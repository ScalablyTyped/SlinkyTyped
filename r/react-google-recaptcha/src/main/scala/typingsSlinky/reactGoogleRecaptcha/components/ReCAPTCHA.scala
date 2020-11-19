package typingsSlinky.reactGoogleRecaptcha.components

import typingsSlinky.reactGoogleRecaptcha.mod.ReCAPTCHAProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReCAPTCHA {
  
  @JSImport("react-google-recaptcha", "ReCAPTCHA")
  @js.native
  object component extends js.Object
  
  def withProps(p: ReCAPTCHAProps): SharedBuilder_ReCAPTCHAProps_334768010[typingsSlinky.reactGoogleRecaptcha.mod.ReCAPTCHA] = new SharedBuilder_ReCAPTCHAProps_334768010[typingsSlinky.reactGoogleRecaptcha.mod.ReCAPTCHA](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(sitekey: String): SharedBuilder_ReCAPTCHAProps_334768010[typingsSlinky.reactGoogleRecaptcha.mod.ReCAPTCHA] = {
    val __props = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
    new SharedBuilder_ReCAPTCHAProps_334768010[typingsSlinky.reactGoogleRecaptcha.mod.ReCAPTCHA](js.Array(this.component, __props.asInstanceOf[ReCAPTCHAProps]))
  }
}
