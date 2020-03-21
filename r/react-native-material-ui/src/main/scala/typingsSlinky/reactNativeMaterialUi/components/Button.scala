package typingsSlinky.reactNativeMaterialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeMaterialUi.AnonText
import typingsSlinky.reactNativeMaterialUi.mod.ButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Button] {
  @JSImport("react-native-material-ui", "Button")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    text: String,
    accent: js.UndefOr[Boolean] = js.undefined,
    icon: String | ReactElement = null,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    raised: js.UndefOr[Boolean] = js.undefined,
    style: AnonText = null,
    testID: String = null,
    upperCase: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Button] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(accent)) __obj.updateDynamic("accent")(accent.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (!js.isUndefined(upperCase)) __obj.updateDynamic("upperCase")(upperCase.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ButtonProps
}

