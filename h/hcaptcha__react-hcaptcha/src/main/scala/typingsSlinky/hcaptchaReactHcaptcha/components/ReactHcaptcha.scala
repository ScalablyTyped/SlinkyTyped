package typingsSlinky.hcaptchaReactHcaptcha.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.compact
import typingsSlinky.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.dark
import typingsSlinky.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.invisible
import typingsSlinky.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.light
import typingsSlinky.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.normal
import typingsSlinky.hcaptchaReactHcaptcha.mod.HCaptchaProps
import typingsSlinky.hcaptchaReactHcaptcha.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactHcaptcha {
  @JSImport("@hcaptcha/react-hcaptcha", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def languageOverride(value: String): this.type = set("languageOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def onError(value: /* event */ String => _): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def onExpire(value: () => _): this.type = set("onExpire", js.Any.fromFunction0(value))
    @scala.inline
    def onVerify(value: /* token */ String => _): this.type = set("onVerify", js.Any.fromFunction1(value))
    @scala.inline
    def size(value: normal | compact | invisible): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: light | dark): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HCaptchaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(sitekey: String): Builder = {
    val __props = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HCaptchaProps]))
  }
}

