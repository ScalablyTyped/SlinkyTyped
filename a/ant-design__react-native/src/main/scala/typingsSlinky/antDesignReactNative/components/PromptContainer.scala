package typingsSlinky.antDesignReactNative.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`login-password`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`secure-text`
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.CallbackOrActions
import typingsSlinky.antDesignReactNative.promptContainerMod.PropmptContainerProps
import typingsSlinky.antDesignReactNative.promptContainerMod.default
import typingsSlinky.antDesignReactNative.stylePromptMod.PromptStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PromptContainer {
  @JSImport("@ant-design/react-native/lib/modal/PromptContainer", JSImport.Default)
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
    def message(value: ReactElement): this.type = set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def onAnimationEnd(value: /* visible */ Boolean => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onBackHandler(value: () => Boolean): this.type = set("onBackHandler", js.Any.fromFunction0(value))
    @scala.inline
    def placeholdersVarargs(value: String*): this.type = set("placeholders", js.Array(value :_*))
    @scala.inline
    def placeholders(value: js.Array[String]): this.type = set("placeholders", value.asInstanceOf[js.Any])
    @scala.inline
    def styles(value: Partial[PromptStyle]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(
      value: typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.default | `login-password` | `secure-text`
    ): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropmptContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(actions: CallbackOrActions[TextStyle]): Builder = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropmptContainerProps]))
  }
}

