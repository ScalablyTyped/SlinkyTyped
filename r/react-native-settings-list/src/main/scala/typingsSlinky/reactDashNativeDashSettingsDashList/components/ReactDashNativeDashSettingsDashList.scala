package typingsSlinky.reactDashNativeDashSettingsDashList.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import typingsSlinky.reactDashNativeDashSettingsDashList.reactDashNativeDashSettingsDashListMod.SettingsListProps
import typingsSlinky.reactDashNativeDashSettingsDashList.reactDashNativeDashSettingsDashListMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashSettingsDashList
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-settings-list", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    defaultItemSize: Int | Double = null,
    defaultTitleInfoPosition: String = null,
    defaultTitleStyle: StyleProp[TextStyle] = null,
    scrollViewProps: js.Object = null,
    underlayColor: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (defaultItemSize != null) __obj.updateDynamic("defaultItemSize")(defaultItemSize.asInstanceOf[js.Any])
    if (defaultTitleInfoPosition != null) __obj.updateDynamic("defaultTitleInfoPosition")(defaultTitleInfoPosition.asInstanceOf[js.Any])
    if (defaultTitleStyle != null) __obj.updateDynamic("defaultTitleStyle")(defaultTitleStyle.asInstanceOf[js.Any])
    if (scrollViewProps != null) __obj.updateDynamic("scrollViewProps")(scrollViewProps.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SettingsListProps
}

