package typingsSlinky.reactNativeTabNavigator.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeTabNavigator.mod.TabNavigatorItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TabNavigatorItemProps1036101009[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: selected, title */
  def apply(
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    badgeText: String | Double = null,
    onPress: () => Unit = null,
    renderBadge: () => ReactElement = null,
    renderIcon: () => ReactElement = null,
    renderSelectedIcon: () => ReactElement = null,
    selectedTitleStyle: TextStyle = null,
    tabStyle: ViewStyle = null,
    titleStyle: TextStyle = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.asInstanceOf[js.Any])
    if (badgeText != null) __obj.updateDynamic("badgeText")(badgeText.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (renderBadge != null) __obj.updateDynamic("renderBadge")(js.Any.fromFunction0(renderBadge))
    if (renderIcon != null) __obj.updateDynamic("renderIcon")(js.Any.fromFunction0(renderIcon))
    if (renderSelectedIcon != null) __obj.updateDynamic("renderSelectedIcon")(js.Any.fromFunction0(renderSelectedIcon))
    if (selectedTitleStyle != null) __obj.updateDynamic("selectedTitleStyle")(selectedTitleStyle.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TabNavigatorItemProps
}

