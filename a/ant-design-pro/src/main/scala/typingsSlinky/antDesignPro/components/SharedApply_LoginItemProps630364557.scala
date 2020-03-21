package typingsSlinky.antDesignPro.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignPro.loginItemMod.LoginItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_LoginItemProps630364557 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  /* The following DOM/SVG props were specified: name, placeholder, style */
  def apply(
    form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any,
    updateActive: js.Any => Unit,
    `type`: String,
    buttonText: TagMod[Any] = null,
    countDown: Int | Double = null,
    customprops: js.Any = null,
    defaultValue: String = null,
    getCaptchaButtonText: String = null,
    getCaptchaSecondText: String = null,
    onChange: /* e */ js.Any => Unit = null,
    onGetCaptcha: /* event */ js.UndefOr[MouseEvent] => Unit = null,
    onPressEnter: /* e */ js.Any => Unit = null,
    rules: js.Array[_] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], updateActive = js.Any.fromFunction1(updateActive))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (countDown != null) __obj.updateDynamic("countDown")(countDown.asInstanceOf[js.Any])
    if (customprops != null) __obj.updateDynamic("customprops")(customprops.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (getCaptchaButtonText != null) __obj.updateDynamic("getCaptchaButtonText")(getCaptchaButtonText.asInstanceOf[js.Any])
    if (getCaptchaSecondText != null) __obj.updateDynamic("getCaptchaSecondText")(getCaptchaSecondText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onGetCaptcha != null) __obj.updateDynamic("onGetCaptcha")(js.Any.fromFunction1(onGetCaptcha))
    if (onPressEnter != null) __obj.updateDynamic("onPressEnter")(js.Any.fromFunction1(onPressEnter))
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = LoginItemProps
}

