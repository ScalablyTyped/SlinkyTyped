package typingsSlinky.reactRecaptchaV3.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRecaptchaV3.mod.ReCaptcha.ReCaptchaProps
import typingsSlinky.reactRecaptchaV3.mod.ReCaptcha_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReCaptcha {
  
  @JSImport("react-recaptcha-v3", "ReCaptcha")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ReCaptcha_] {
    
    @scala.inline
    def elementID(value: String): this.type = set("elementID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verifyCallback(value: /* response */ String => Unit): this.type = set("verifyCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def verifyCallbackName(value: String): this.type = set("verifyCallbackName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReCaptchaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(action: String, sitekey: String): Builder = {
    val __props = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sitekey = sitekey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReCaptchaProps]))
  }
}
