package typingsSlinky.antdMobileRn.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`login-password`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`secure-text`
import typingsSlinky.antdMobileRn.modalPropsTypeMod.CallbackOrActions
import typingsSlinky.antdMobileRn.promptContainerNativeMod.PropmptContainerProps
import typingsSlinky.antdMobileRn.promptContainerNativeMod.default
import typingsSlinky.antdMobileRn.promptDotnativeMod.IPromptStyle
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PromptContainerDotnative {
  @JSImport("antd-mobile-rn/lib/modal/PromptContainer.native", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def messageReactElement(value: ReactElement): this.type = set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def message(value: TagMod[Any]): this.type = set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def onAnimationEnd(value: /* visible */ Boolean => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def placeholders(value: js.Array[String]): this.type = set("placeholders", value.asInstanceOf[js.Any])
    @scala.inline
    def styles(value: IPromptStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: TagMod[Any]): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: typingsSlinky.antdMobileRn.antdMobileRnStrings.default | `login-password` | `secure-text`): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropmptContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(actions: CallbackOrActions[TextStyle]): Builder = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropmptContainerProps]))
  }
}

