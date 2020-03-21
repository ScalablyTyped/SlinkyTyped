package typingsSlinky.reactNativeMaterialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeMaterialUi.mod.ListItemCenterElement
import typingsSlinky.reactNativeMaterialUi.mod.ListItemProps
import typingsSlinky.reactNativeMaterialUi.mod.ListItemStyle
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`1`
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`2`
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiNumbers.`3`
import typingsSlinky.reactNativeMaterialUi.reactNativeMaterialUiStrings.dynamic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeMaterialUi.mod.ListItem] {
  @JSImport("react-native-material-ui", "ListItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    centerElement: ReactElement | String | ListItemCenterElement,
    dense: js.UndefOr[Boolean] = js.undefined,
    divider: js.UndefOr[Boolean] = js.undefined,
    leftElement: ReactElement | String = null,
    numberOfLines: `1` | `2` | `3` | dynamic = null,
    onPress: () => Unit = null,
    onPressValue: js.Any = null,
    onRightElementPress: () => Unit = null,
    rightElement: ReactElement | String = null,
    style: ListItemStyle = null,
    testID: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.ListItem] = {
    val __obj = js.Dynamic.literal(centerElement = centerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(dense)) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (leftElement != null) __obj.updateDynamic("leftElement")(leftElement.asInstanceOf[js.Any])
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (onPressValue != null) __obj.updateDynamic("onPressValue")(onPressValue.asInstanceOf[js.Any])
    if (onRightElementPress != null) __obj.updateDynamic("onRightElementPress")(js.Any.fromFunction0(onRightElementPress))
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ListItemProps
}

