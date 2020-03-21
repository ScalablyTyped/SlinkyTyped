package typingsSlinky.reactNativeCheckBox.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeCheckBox.mod.CheckBoxProps
import typingsSlinky.reactNativeCheckBox.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeCheckBox
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-check-box", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    isChecked: Boolean,
    onClick: () => Unit,
    checkBoxColor: String = null,
    checkedCheckBoxColor: String = null,
    checkedImage: ReactElement = null,
    leftText: String = null,
    leftTextStyle: StyleProp[TextStyle] = null,
    leftTextView: TagMod[Any] = null,
    rightText: String = null,
    rightTextStyle: StyleProp[TextStyle] = null,
    rightTextView: TagMod[Any] = null,
    style: StyleProp[ViewStyle] = null,
    unCheckedImage: ReactElement = null,
    uncheckedCheckBoxColor: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(isChecked = isChecked.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick))
    if (checkBoxColor != null) __obj.updateDynamic("checkBoxColor")(checkBoxColor.asInstanceOf[js.Any])
    if (checkedCheckBoxColor != null) __obj.updateDynamic("checkedCheckBoxColor")(checkedCheckBoxColor.asInstanceOf[js.Any])
    if (checkedImage != null) __obj.updateDynamic("checkedImage")(checkedImage.asInstanceOf[js.Any])
    if (leftText != null) __obj.updateDynamic("leftText")(leftText.asInstanceOf[js.Any])
    if (leftTextStyle != null) __obj.updateDynamic("leftTextStyle")(leftTextStyle.asInstanceOf[js.Any])
    if (leftTextView != null) __obj.updateDynamic("leftTextView")(leftTextView.asInstanceOf[js.Any])
    if (rightText != null) __obj.updateDynamic("rightText")(rightText.asInstanceOf[js.Any])
    if (rightTextStyle != null) __obj.updateDynamic("rightTextStyle")(rightTextStyle.asInstanceOf[js.Any])
    if (rightTextView != null) __obj.updateDynamic("rightTextView")(rightTextView.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unCheckedImage != null) __obj.updateDynamic("unCheckedImage")(unCheckedImage.asInstanceOf[js.Any])
    if (uncheckedCheckBoxColor != null) __obj.updateDynamic("uncheckedCheckBoxColor")(uncheckedCheckBoxColor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CheckBoxProps
}

