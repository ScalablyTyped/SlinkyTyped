package typingsSlinky.reactDashNativeDashElements.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.TextProperties
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.CheckBoxProps
import typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.IconType
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CheckBox
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.CheckBox
    ] {
  @JSImport("react-native-elements", "CheckBox")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: size */
  def apply(
    checked: Boolean,
    Component: ReactComponentClass[js.Object] = null,
    center: js.UndefOr[Boolean] = js.undefined,
    checkedColor: String = null,
    checkedIcon: String | ReactElement = null,
    checkedTitle: String = null,
    containerStyle: StyleProp[ViewStyle] = null,
    fontFamily: String = null,
    iconRight: js.UndefOr[Boolean] = js.undefined,
    iconType: IconType = null,
    onIconPress: () => Unit = null,
    onLongIconPress: () => Unit = null,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    right: js.UndefOr[Boolean] = js.undefined,
    textStyle: StyleProp[TextStyle] = null,
    title: String | ReactElement = null,
    titleProps: Partial[TextProperties] = null,
    uncheckedColor: String = null,
    uncheckedIcon: String | ReactElement = null,
    wrapperStyle: StyleProp[ViewStyle] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashElements.reactDashNativeDashElementsMod.CheckBox
  ] = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (checkedColor != null) __obj.updateDynamic("checkedColor")(checkedColor.asInstanceOf[js.Any])
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon.asInstanceOf[js.Any])
    if (checkedTitle != null) __obj.updateDynamic("checkedTitle")(checkedTitle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(iconRight)) __obj.updateDynamic("iconRight")(iconRight.asInstanceOf[js.Any])
    if (iconType != null) __obj.updateDynamic("iconType")(iconType.asInstanceOf[js.Any])
    if (onIconPress != null) __obj.updateDynamic("onIconPress")(js.Any.fromFunction0(onIconPress))
    if (onLongIconPress != null) __obj.updateDynamic("onLongIconPress")(js.Any.fromFunction0(onLongIconPress))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    if (uncheckedColor != null) __obj.updateDynamic("uncheckedColor")(uncheckedColor.asInstanceOf[js.Any])
    if (uncheckedIcon != null) __obj.updateDynamic("uncheckedIcon")(uncheckedIcon.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CheckBoxProps
}

