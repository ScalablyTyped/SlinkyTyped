package typingsSlinky.reactRecaptcha.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRecaptcha.mod.RecaptchaProps
import typingsSlinky.reactRecaptcha.mod.^
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactRecaptcha {
  @JSImport("react-recaptcha", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def badge(value: bottomright | bottomleft | `inline`): this.type = set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def elementID(value: String): this.type = set("elementID", value.asInstanceOf[js.Any])
    @scala.inline
    def expiredCallback(value: () => _): this.type = set("expiredCallback", js.Any.fromFunction0(value))
    @scala.inline
    def expiredCallbackName(value: String): this.type = set("expiredCallbackName", value.asInstanceOf[js.Any])
    @scala.inline
    def hl(value: String): this.type = set("hl", value.asInstanceOf[js.Any])
    @scala.inline
    def onloadCallback(value: () => _): this.type = set("onloadCallback", js.Any.fromFunction0(value))
    @scala.inline
    def onloadCallbackName(value: String): this.type = set("onloadCallbackName", value.asInstanceOf[js.Any])
    @scala.inline
    def render(value: onload | explicit): this.type = set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def sitekey(value: String): this.type = set("sitekey", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: normal | compact | invisible): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def tabindex(value: Double | String): this.type = set("tabindex", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: dark | light): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: audio | image): this.type = set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def verifyCallback(value: /* response */ String => _): this.type = set("verifyCallback", js.Any.fromFunction1(value))
    @scala.inline
    def verifyCallbackName(value: String): this.type = set("verifyCallbackName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RecaptchaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactRecaptcha.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

