package typingsSlinky.reactDashNativeDashElements.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.BadgeProps
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsStrings.error
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsStrings.primary
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsStrings.success
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Badge
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.Badge
    ] {
  @JSImport("react-native-elements", "Badge")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: value */
  def apply(
    Component: ReactComponentClass[js.Object] = null,
    badgeStyle: StyleProp[ViewStyle] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    onPress: () => Unit = null,
    status: primary | success | warning | error = null,
    textStyle: StyleProp[TextStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.Badge
  ] = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (badgeStyle != null) __obj.updateDynamic("badgeStyle")(badgeStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.Badge
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.Badge](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = BadgeProps
}

