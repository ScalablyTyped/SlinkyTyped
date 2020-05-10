package typingsSlinky.reactGoogleRecaptcha.components

import typingsSlinky.reactGoogleRecaptcha.mod.ReCAPTCHAProps
import typingsSlinky.reactGoogleRecaptcha.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactGoogleRecaptcha {
  @JSImport("react-google-recaptcha", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ReCAPTCHAProps): SharedBuilder_ReCAPTCHAProps_334768010[default] = new SharedBuilder_ReCAPTCHAProps_334768010[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(sitekey: String): SharedBuilder_ReCAPTCHAProps_334768010[default] = {
    val __props = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
    new SharedBuilder_ReCAPTCHAProps_334768010[default](js.Array(this.component, __props.asInstanceOf[ReCAPTCHAProps]))
  }
}

