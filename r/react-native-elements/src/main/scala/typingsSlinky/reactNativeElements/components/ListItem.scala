package typingsSlinky.reactNativeElements.components

import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.SwitchProperties
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TargetedEvent
import typingsSlinky.reactNative.mod.TextProperties
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsSlinky.reactNative.reactNativeStrings.assertive
import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.button
import typingsSlinky.reactNative.reactNativeStrings.no
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.polite
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_checked
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsSlinky.reactNative.reactNativeStrings.yes
import typingsSlinky.reactNativeElements.anon.PartialAvatarProps
import typingsSlinky.reactNativeElements.anon.PartialIconProps
import typingsSlinky.reactNativeElements.mod.BadgeProps
import typingsSlinky.reactNativeElements.mod.ButtonGroupProps
import typingsSlinky.reactNativeElements.mod.CheckBoxProps
import typingsSlinky.reactNativeElements.mod.InputProps
import typingsSlinky.reactNativeElements.mod.ListItemProps
import typingsSlinky.reactNativeElements.mod.ScaleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItem {
  @JSImport("react-native-elements", "ListItem")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.ListItem] {
    @scala.inline
    def ComponentFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def ComponentComponentClass(value: ReactComponentClass[js.Object]): this.type = set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def Component(value: ReactComponentClass[js.Object]): this.type = set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def ViewComponentFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("ViewComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def ViewComponentComponentClass(value: ReactComponentClass[js.Object]): this.type = set("ViewComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def ViewComponent(value: ReactComponentClass[js.Object]): this.type = set("ViewComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): this.type = set("accessibilityComponentType", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityLiveRegion(value: none | polite | assertive): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): this.type = set("accessibilityTraits", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    @scala.inline
    def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    @scala.inline
    def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def badge(value: BadgeProps): this.type = set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def bottomDivider(value: Boolean): this.type = set("bottomDivider", value.asInstanceOf[js.Any])
    @scala.inline
    def buttonGroup(value: ButtonGroupProps): this.type = set("buttonGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def checkBox(value: CheckBoxProps): this.type = set("checkBox", value.asInstanceOf[js.Any])
    @scala.inline
    def checkmarkReactElement(value: ReactElement): this.type = set("checkmark", value.asInstanceOf[js.Any])
    @scala.inline
    def checkmark(value: Boolean | PartialIconProps | ReactElement): this.type = set("checkmark", value.asInstanceOf[js.Any])
    @scala.inline
    def chevronReactElement(value: ReactElement): this.type = set("chevron", value.asInstanceOf[js.Any])
    @scala.inline
    def chevron(value: Boolean | PartialIconProps | ReactElement): this.type = set("chevron", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyleNull: this.type = set("containerStyle", null)
    @scala.inline
    def contentContainerStyle(value: StyleProp[ViewStyle]): this.type = set("contentContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def contentContainerStyleNull: this.type = set("contentContainerStyle", null)
    @scala.inline
    def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    @scala.inline
    def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
    @scala.inline
    def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def disabledStyle(value: StyleProp[ViewStyle]): this.type = set("disabledStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def disabledStyleNull: this.type = set("disabledStyle", null)
    @scala.inline
    def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def input(value: InputProps): this.type = set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def leftAvatarReactElement(value: ReactElement): this.type = set("leftAvatar", value.asInstanceOf[js.Any])
    @scala.inline
    def leftAvatar(value: PartialAvatarProps | ReactElement): this.type = set("leftAvatar", value.asInstanceOf[js.Any])
    @scala.inline
    def leftElement(value: ReactElement): this.type = set("leftElement", value.asInstanceOf[js.Any])
    @scala.inline
    def leftIconReactElement(value: ReactElement): this.type = set("leftIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def leftIcon(value: PartialIconProps | ReactElement): this.type = set("leftIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
    @scala.inline
    def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
    @scala.inline
    def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
    @scala.inline
    def onBlur(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: SyntheticEvent[NodeHandle, TargetedEvent] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onHideUnderlay(value: () => Unit): this.type = set("onHideUnderlay", js.Any.fromFunction0(value))
    @scala.inline
    def onLayout(value: /* event */ LayoutChangeEvent => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    @scala.inline
    def onLongPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onLongPress", js.Any.fromFunction1(value))
    @scala.inline
    def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
    @scala.inline
    def onPress(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPress", js.Any.fromFunction1(value))
    @scala.inline
    def onPressIn(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPressIn", js.Any.fromFunction1(value))
    @scala.inline
    def onPressOut(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onPressOut", js.Any.fromFunction1(value))
    @scala.inline
    def onShowUnderlay(value: () => Unit): this.type = set("onShowUnderlay", js.Any.fromFunction0(value))
    @scala.inline
    def pad(value: Double): this.type = set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def pressRetentionOffset(value: Insets): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def rightAvatarReactElement(value: ReactElement): this.type = set("rightAvatar", value.asInstanceOf[js.Any])
    @scala.inline
    def rightAvatar(value: PartialAvatarProps | ReactElement): this.type = set("rightAvatar", value.asInstanceOf[js.Any])
    @scala.inline
    def rightContentContainerStyle(value: StyleProp[ViewStyle]): this.type = set("rightContentContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def rightContentContainerStyleNull: this.type = set("rightContentContainerStyle", null)
    @scala.inline
    def rightElement(value: ReactElement): this.type = set("rightElement", value.asInstanceOf[js.Any])
    @scala.inline
    def rightIconReactElement(value: ReactElement): this.type = set("rightIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def rightIcon(value: PartialIconProps | ReactElement): this.type = set("rightIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def rightSubtitleReactElement(value: ReactElement): this.type = set("rightSubtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def rightSubtitle(value: String | ReactElement): this.type = set("rightSubtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def rightSubtitleProps(value: TextProperties): this.type = set("rightSubtitleProps", value.asInstanceOf[js.Any])
    @scala.inline
    def rightSubtitleStyle(value: StyleProp[TextStyle]): this.type = set("rightSubtitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def rightSubtitleStyleNull: this.type = set("rightSubtitleStyle", null)
    @scala.inline
    def rightTitleReactElement(value: ReactElement): this.type = set("rightTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def rightTitle(value: String | ReactElement): this.type = set("rightTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def rightTitleProps(value: TextProperties): this.type = set("rightTitleProps", value.asInstanceOf[js.Any])
    @scala.inline
    def rightTitleStyle(value: StyleProp[TextStyle]): this.type = set("rightTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def rightTitleStyleNull: this.type = set("rightTitleStyle", null)
    @scala.inline
    def scaleProps(value: ScaleProps): this.type = set("scaleProps", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def subtitleReactElement(value: ReactElement): this.type = set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def subtitle(value: String | ReactElement): this.type = set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def subtitleProps(value: TextProperties): this.type = set("subtitleProps", value.asInstanceOf[js.Any])
    @scala.inline
    def subtitleStyle(value: StyleProp[TextStyle]): this.type = set("subtitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def subtitleStyleNull: this.type = set("subtitleStyle", null)
    @scala.inline
    def switch(value: SwitchProperties): this.type = set("switch", value.asInstanceOf[js.Any])
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String | ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleProps(value: TextProperties): this.type = set("titleProps", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def titleStyleNull: this.type = set("titleStyle", null)
    @scala.inline
    def topDivider(value: Boolean): this.type = set("topDivider", value.asInstanceOf[js.Any])
    @scala.inline
    def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ListItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

