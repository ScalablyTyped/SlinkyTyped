package typingsSlinky.reactNativePopupDialog.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativePopupDialog.mod.AlignTypes
import typingsSlinky.reactNativePopupDialog.mod.DialogButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativePopupDialog.mod.DialogButton] {
  @JSImport("react-native-popup-dialog", "DialogButton")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    text: String,
    activeOpacity: Int | Double = null,
    align: AlignTypes = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    onPress: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    style: StyleProp[ViewStyle] = null,
    textStyle: StyleProp[TextStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativePopupDialog.mod.DialogButton] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DialogButtonProps
}

