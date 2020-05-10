package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.captchaCaptchaMod.CaptchaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Captcha {
  @JSImport("primereact/captcha", "Captcha")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.captchaMod.Captcha] {
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def language(value: String): this.type = set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def onExpire(value: () => Unit): this.type = set("onExpire", js.Any.fromFunction0(value))
    @scala.inline
    def onResponse(value: /* response */ js.Any => Unit): this.type = set("onResponse", js.Any.fromFunction1(value))
    @scala.inline
    def siteKey(value: String): this.type = set("siteKey", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CaptchaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Captcha.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

