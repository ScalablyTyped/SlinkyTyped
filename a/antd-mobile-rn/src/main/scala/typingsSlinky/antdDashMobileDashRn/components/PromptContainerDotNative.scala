package typingsSlinky.antdDashMobileDashRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.`login-password`
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.`secure-text`
import typingsSlinky.antdDashMobileDashRn.libModalPromptContainerDotNativeMod.PropmptContainerProps
import typingsSlinky.antdDashMobileDashRn.libModalPromptContainerDotNativeMod.default
import typingsSlinky.antdDashMobileDashRn.libModalPropsTypeMod.CallbackOrActions
import typingsSlinky.antdDashMobileDashRn.libModalStylePromptDotNativeMod.IPromptStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PromptContainerDotNative
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile-rn/lib/modal/PromptContainer.native", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onAnimationEnd */
  def apply(
    actions: CallbackOrActions[TextStyle],
    title: TagMod[Any],
    defaultValue: String = null,
    message: TagMod[Any] = null,
    placeholders: js.Array[String] = null,
    styles: IPromptStyle = null,
    `type`: typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.default | `login-password` | `secure-text` = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (placeholders != null) __obj.updateDynamic("placeholders")(placeholders.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PropmptContainerProps
}

