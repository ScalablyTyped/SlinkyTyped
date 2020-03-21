package typingsSlinky.antdMobileRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
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

object PromptContainerDotnative
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile-rn/lib/modal/PromptContainer.native", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    actions: CallbackOrActions[TextStyle],
    title: TagMod[Any],
    defaultValue: String = null,
    message: TagMod[Any] = null,
    onAnimationEnd: /* visible */ Boolean => Unit = null,
    placeholders: js.Array[String] = null,
    styles: IPromptStyle = null,
    `type`: typingsSlinky.antdMobileRn.antdMobileRnStrings.default | `login-password` | `secure-text` = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PropmptContainerProps
}

