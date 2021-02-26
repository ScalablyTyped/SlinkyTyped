package typingsSlinky.reactNativeElements.components

import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.anon.Layout
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.anon.Start
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.BackgroundPropType
import typingsSlinky.reactNative.mod.ColorValue
import typingsSlinky.reactNative.mod.DataDetectorTypes
import typingsSlinky.reactNative.mod.DocumentSelectionState
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.KeyboardTypeOptions
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.ReturnKeyTypeOptions
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.SwitchProperties
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TargetedEvent
import typingsSlinky.reactNative.mod.TextInputChangeEventData
import typingsSlinky.reactNative.mod.TextInputContentSizeChangeEventData
import typingsSlinky.reactNative.mod.TextInputEndEditingEventData
import typingsSlinky.reactNative.mod.TextInputFocusEventData
import typingsSlinky.reactNative.mod.TextInputKeyPressEventData
import typingsSlinky.reactNative.mod.TextInputScrollEventData
import typingsSlinky.reactNative.mod.TextInputSelectionChangeEventData
import typingsSlinky.reactNative.mod.TextInputSubmitEditingEventData
import typingsSlinky.reactNative.mod.TextInputTextInputEventData
import typingsSlinky.reactNative.mod.TextLayoutEventData
import typingsSlinky.reactNative.mod.TextProperties
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNative.reactNativeStrings.URL
import typingsSlinky.reactNative.reactNativeStrings.`cc-csc`
import typingsSlinky.reactNative.reactNativeStrings.`cc-exp-month`
import typingsSlinky.reactNative.reactNativeStrings.`cc-exp-year`
import typingsSlinky.reactNative.reactNativeStrings.`cc-exp`
import typingsSlinky.reactNative.reactNativeStrings.`cc-number`
import typingsSlinky.reactNative.reactNativeStrings.`postal-code`
import typingsSlinky.reactNative.reactNativeStrings.`street-address`
import typingsSlinky.reactNative.reactNativeStrings.`unless-editing`
import typingsSlinky.reactNative.reactNativeStrings.`while-editing`
import typingsSlinky.reactNative.reactNativeStrings.addressCity
import typingsSlinky.reactNative.reactNativeStrings.addressCityAndState
import typingsSlinky.reactNative.reactNativeStrings.addressState
import typingsSlinky.reactNative.reactNativeStrings.always
import typingsSlinky.reactNative.reactNativeStrings.bottom
import typingsSlinky.reactNative.reactNativeStrings.center
import typingsSlinky.reactNative.reactNativeStrings.characters
import typingsSlinky.reactNative.reactNativeStrings.countryName
import typingsSlinky.reactNative.reactNativeStrings.creditCardNumber
import typingsSlinky.reactNative.reactNativeStrings.dark
import typingsSlinky.reactNative.reactNativeStrings.default
import typingsSlinky.reactNative.reactNativeStrings.emailAddress
import typingsSlinky.reactNative.reactNativeStrings.familyName
import typingsSlinky.reactNative.reactNativeStrings.fullStreetAddress
import typingsSlinky.reactNative.reactNativeStrings.givenName
import typingsSlinky.reactNative.reactNativeStrings.jobTitle
import typingsSlinky.reactNative.reactNativeStrings.light
import typingsSlinky.reactNative.reactNativeStrings.location
import typingsSlinky.reactNative.reactNativeStrings.middleName
import typingsSlinky.reactNative.reactNativeStrings.name
import typingsSlinky.reactNative.reactNativeStrings.namePrefix
import typingsSlinky.reactNative.reactNativeStrings.nameSuffix
import typingsSlinky.reactNative.reactNativeStrings.never
import typingsSlinky.reactNative.reactNativeStrings.newPassword
import typingsSlinky.reactNative.reactNativeStrings.nickname
import typingsSlinky.reactNative.reactNativeStrings.noExcludeDescendants
import typingsSlinky.reactNative.reactNativeStrings.off
import typingsSlinky.reactNative.reactNativeStrings.oneTimeCode
import typingsSlinky.reactNative.reactNativeStrings.organizationName
import typingsSlinky.reactNative.reactNativeStrings.password
import typingsSlinky.reactNative.reactNativeStrings.postalCode
import typingsSlinky.reactNative.reactNativeStrings.sentences
import typingsSlinky.reactNative.reactNativeStrings.streetAddressLine1
import typingsSlinky.reactNative.reactNativeStrings.streetAddressLine2
import typingsSlinky.reactNative.reactNativeStrings.sublocality
import typingsSlinky.reactNative.reactNativeStrings.tel
import typingsSlinky.reactNative.reactNativeStrings.telephoneNumber
import typingsSlinky.reactNative.reactNativeStrings.top
import typingsSlinky.reactNative.reactNativeStrings.username
import typingsSlinky.reactNative.reactNativeStrings.words
import typingsSlinky.reactNative.reactNativeStrings.yesExcludeDescendants
import typingsSlinky.reactNativeElements.anon.PartialAvatarProps
import typingsSlinky.reactNativeElements.anon.PartialIconProps
import typingsSlinky.reactNativeElements.anon.PartialTextProperties
import typingsSlinky.reactNativeElements.anon.TextPropsrightbooleanunde
import typingsSlinky.reactNativeElements.anon.ViewPropertiesrightboolea
import typingsSlinky.reactNativeElements.mod.BadgeProps
import typingsSlinky.reactNativeElements.mod.ButtonGroupProps
import typingsSlinky.reactNativeElements.mod.CheckBoxProps
import typingsSlinky.reactNativeElements.mod.ElementObject
import typingsSlinky.reactNativeElements.mod.IconNode
import typingsSlinky.reactNativeElements.mod.IconType
import typingsSlinky.reactNativeElements.mod.InnerBorderStyleProperty
import typingsSlinky.reactNativeElements.mod.InputProps
import typingsSlinky.reactNativeElements.mod.ListItemProps
import typingsSlinky.reactNativeElements.mod.ScaleProps
import typingsSlinky.reactNativeElements.mod.TextProps
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`box-none`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`box-only`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.all
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.assertive
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.auto
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.balanced
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.button
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.clip
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.email
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.head
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.highQuality
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.link
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.middle
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.no
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.none
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.phoneNumber
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.polite
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.simple
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.tail
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.yes
import typingsSlinky.reactNativeVectorIcons.iconMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItem {
  
  object ButtonGroup {
    
    @scala.inline
    def apply(buttons: js.Array[ElementObject | String], onPress: Double => Unit): typingsSlinky.reactNativeElements.components.ListItem.ButtonGroup.Builder = {
      val __props = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], onPress = js.Any.fromFunction1(onPress))
      new typingsSlinky.reactNativeElements.components.ListItem.ButtonGroup.Builder(js.Array(this.component, __props.asInstanceOf[ButtonGroupProps]))
    }
    
    @JSImport("react-native-elements", "ListItem.ButtonGroup")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def Component(value: ReactComponentClass[_]): this.type = set("Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def ComponentComponentClass(value: ReactComponentClass[_]): this.type = set("Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def ComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def buttonContainerStyle(value: StyleProp[ViewStyle]): this.type = set("buttonContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def buttonContainerStyleNull: this.type = set("buttonContainerStyle", null)
      
      @scala.inline
      def buttonStyle(value: StyleProp[ViewStyle]): this.type = set("buttonStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def buttonStyleNull: this.type = set("buttonStyle", null)
      
      @scala.inline
      def containerBorderRadius(value: Double): this.type = set("containerBorderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerStyleNull: this.type = set("containerStyle", null)
      
      @scala.inline
      def disabled(value: Boolean | js.Array[Double]): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledSelectedStyle(value: StyleProp[ViewStyle]): this.type = set("disabledSelectedStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledSelectedStyleNull: this.type = set("disabledSelectedStyle", null)
      
      @scala.inline
      def disabledSelectedTextStyle(value: StyleProp[TextStyle]): this.type = set("disabledSelectedTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledSelectedTextStyleNull: this.type = set("disabledSelectedTextStyle", null)
      
      @scala.inline
      def disabledStyle(value: StyleProp[ViewStyle]): this.type = set("disabledStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledStyleNull: this.type = set("disabledStyle", null)
      
      @scala.inline
      def disabledTextStyle(value: StyleProp[TextStyle]): this.type = set("disabledTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledTextStyleNull: this.type = set("disabledTextStyle", null)
      
      @scala.inline
      def disabledVarargs(value: Double*): this.type = set("disabled", js.Array(value :_*))
      
      @scala.inline
      def innerBorderStyle(value: InnerBorderStyleProperty): this.type = set("innerBorderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onHideUnderlay(value: () => Unit): this.type = set("onHideUnderlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def onShowUnderlay(value: () => Unit): this.type = set("onShowUnderlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def selectMultiple(value: Boolean): this.type = set("selectMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectedButtonStyle(value: StyleProp[ViewStyle]): this.type = set("selectedButtonStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectedButtonStyleNull: this.type = set("selectedButtonStyle", null)
      
      @scala.inline
      def selectedIndex(value: Double): this.type = set("selectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectedIndexNull: this.type = set("selectedIndex", null)
      
      @scala.inline
      def selectedIndexes(value: js.Array[Double]): this.type = set("selectedIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectedIndexesVarargs(value: Double*): this.type = set("selectedIndexes", js.Array(value :_*))
      
      @scala.inline
      def selectedTextStyle(value: StyleProp[TextStyle]): this.type = set("selectedTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectedTextStyleNull: this.type = set("selectedTextStyle", null)
      
      @scala.inline
      def setOpacityTo(value: /* value */ Double => Unit): this.type = set("setOpacityTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def textStyleNull: this.type = set("textStyle", null)
      
      @scala.inline
      def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: ButtonGroupProps): typingsSlinky.reactNativeElements.components.ListItem.ButtonGroup.Builder = new typingsSlinky.reactNativeElements.components.ListItem.ButtonGroup.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object CheckBox {
    
    @scala.inline
    def apply(checked: Boolean): typingsSlinky.reactNativeElements.components.ListItem.CheckBox.Builder = {
      val __props = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
      new typingsSlinky.reactNativeElements.components.ListItem.CheckBox.Builder(js.Array(this.component, __props.asInstanceOf[CheckBoxProps]))
    }
    
    @JSImport("react-native-elements", "ListItem.CheckBox")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def Component(value: ReactComponentClass[js.Object]): this.type = set("Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def center(value: Boolean): this.type = set("center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def checkedColor(value: String): this.type = set("checkedColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def checkedIcon(value: String | ReactElement): this.type = set("checkedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def checkedIconReactElement(value: ReactElement): this.type = set("checkedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def checkedTitle(value: String): this.type = set("checkedTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerStyleNull: this.type = set("containerStyle", null)
      
      @scala.inline
      def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def iconRight(value: Boolean): this.type = set("iconRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def iconType(value: IconType): this.type = set("iconType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onIconPress(value: () => Unit): this.type = set("onIconPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def onLongIconPress(value: () => Unit): this.type = set("onLongIconPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def onLongPress(value: () => Unit): this.type = set("onLongPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def onPress(value: () => Unit): this.type = set("onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def right(value: Boolean): this.type = set("right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def textStyleNull: this.type = set("textStyle", null)
      
      @scala.inline
      def title(value: String | ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def titleProps(value: PartialTextProperties): this.type = set("titleProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def uncheckedColor(value: String): this.type = set("uncheckedColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def uncheckedIcon(value: String | ReactElement): this.type = set("uncheckedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def uncheckedIconReactElement(value: ReactElement): this.type = set("uncheckedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def wrapperStyle(value: StyleProp[ViewStyle]): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def wrapperStyleNull: this.type = set("wrapperStyle", null)
    }
    
    def withProps(p: CheckBoxProps): typingsSlinky.reactNativeElements.components.ListItem.CheckBox.Builder = new typingsSlinky.reactNativeElements.components.ListItem.CheckBox.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Chevron {
    
    @JSImport("react-native-elements", "ListItem.Chevron")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def Component(value: ReactComponentClass[js.Object]): this.type = set("Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value :_*))
      
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
      def accessibilityTraitsVarargs(value: AccessibilityTrait*): this.type = set("accessibilityTraits", js.Array(value :_*))
      
      @scala.inline
      def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def activeOpacity(value: Double): this.type = set("activeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def adjustsFontSizeToFit(value: Boolean): this.type = set("adjustsFontSizeToFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def background(value: BackgroundPropType): this.type = set("background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def borderRadius(value: Double): this.type = set("borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def brand(value: Boolean): this.type = set("brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerStyleNull: this.type = set("containerStyle", null)
      
      @scala.inline
      def dataDetectorType(value: phoneNumber | link | email | none | all): this.type = set("dataDetectorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dataDetectorTypeNull: this.type = set("dataDetectorType", null)
      
      @scala.inline
      def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def delayPressIn(value: Double): this.type = set("delayPressIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def delayPressOut(value: Double): this.type = set("delayPressOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledNull: this.type = set("disabled", null)
      
      @scala.inline
      def disabledStyle(value: StyleProp[ViewStyle]): this.type = set("disabledStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledStyleNull: this.type = set("disabledStyle", null)
      
      @scala.inline
      def ellipsizeMode(value: head | middle | tail | clip): this.type = set("ellipsizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def iconProps(value: IconProps): this.type = set("iconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def iconStyle(value: TextStyle): this.type = set("iconStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def lineBreakMode(value: head | middle | tail | clip): this.type = set("lineBreakMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maxFontSizeMultiplier(value: Double): this.type = set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maxFontSizeMultiplierNull: this.type = set("maxFontSizeMultiplier", null)
      
      @scala.inline
      def minimumFontScale(value: Double): this.type = set("minimumFontScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def numberOfLines(value: Double): this.type = set("numberOfLines", value.asInstanceOf[js.Any])
      
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
      def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
      
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
      def onTextLayout(value: SyntheticEvent[NodeHandle, TextLayoutEventData] => Unit): this.type = set("onTextLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def pressRetentionOffset(value: Insets): this.type = set("pressRetentionOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def raised(value: Boolean): this.type = set("raised", value.asInstanceOf[js.Any])
      
      @scala.inline
      def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def reverseColor(value: String): this.type = set("reverseColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectionColor(value: ColorValue): this.type = set("selectionColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def solid(value: Boolean): this.type = set("solid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: ViewStyle | TextStyle): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def suppressHighlighting(value: Boolean): this.type = set("suppressHighlighting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def textBreakStrategy(value: simple | highQuality | balanced): this.type = set("textBreakStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def touchSoundDisabled(value: Boolean): this.type = set("touchSoundDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def touchSoundDisabledNull: this.type = set("touchSoundDisabled", null)
      
      @scala.inline
      def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `type`(value: IconType): this.type = set("type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def underlayColor(value: ColorValue): this.type = set("underlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def useForeground(value: Boolean): this.type = set("useForeground", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Chevron.type): typingsSlinky.reactNativeElements.components.ListItem.Chevron.Builder = new typingsSlinky.reactNativeElements.components.ListItem.Chevron.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PartialIconProps): typingsSlinky.reactNativeElements.components.ListItem.Chevron.Builder = new typingsSlinky.reactNativeElements.components.ListItem.Chevron.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Content {
    
    @JSImport("react-native-elements", "ListItem.Content")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value :_*))
      
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
      def accessibilityTraitsVarargs(value: AccessibilityTrait*): this.type = set("accessibilityTraits", js.Array(value :_*))
      
      @scala.inline
      def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
      
      @scala.inline
      def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def onMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderGrant", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderReject", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderTerminate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def onStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def onStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEndCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def right(value: Boolean): this.type = set("right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def styleNull: this.type = set("style", null)
      
      @scala.inline
      def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Content.type): typingsSlinky.reactNativeElements.components.ListItem.Content.Builder = new typingsSlinky.reactNativeElements.components.ListItem.Content.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ViewPropertiesrightboolea): typingsSlinky.reactNativeElements.components.ListItem.Content.Builder = new typingsSlinky.reactNativeElements.components.ListItem.Content.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Input {
    
    @JSImport("react-native-elements", "ListItem.Input")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def InputComponent(value: ReactComponentClass[_]): this.type = set("InputComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def InputComponentComponentClass(value: ReactComponentClass[_]): this.type = set("InputComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def InputComponentFunctionComponent(value: ReactComponentClass[_]): this.type = set("InputComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value :_*))
      
      @scala.inline
      def accessibilityComponentType(
        value: typingsSlinky.reactNative.reactNativeStrings.none | typingsSlinky.reactNative.reactNativeStrings.button | typingsSlinky.reactNative.reactNativeStrings.radiobutton_checked | typingsSlinky.reactNative.reactNativeStrings.radiobutton_unchecked
      ): this.type = set("accessibilityComponentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityLiveRegion(
        value: typingsSlinky.reactNative.reactNativeStrings.none | typingsSlinky.reactNative.reactNativeStrings.polite | typingsSlinky.reactNative.reactNativeStrings.assertive
      ): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): this.type = set("accessibilityTraits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityTraitsVarargs(value: AccessibilityTrait*): this.type = set("accessibilityTraits", js.Array(value :_*))
      
      @scala.inline
      def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoCapitalize(value: typingsSlinky.reactNative.reactNativeStrings.none | sentences | words | characters): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoCompleteType(
        value: `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | typingsSlinky.reactNative.reactNativeStrings.email | name | password | `postal-code` | `street-address` | tel | username | off
      ): this.type = set("autoCompleteType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoCorrect(value: Boolean): this.type = set("autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def blurOnSubmit(value: Boolean): this.type = set("blurOnSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def caretHidden(value: Boolean): this.type = set("caretHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def clearButtonMode(value: never | `while-editing` | `unless-editing` | always): this.type = set("clearButtonMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def clearTextOnFocus(value: Boolean): this.type = set("clearTextOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def collapsable(value: Boolean): this.type = set("collapsable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def containerStyleNull: this.type = set("containerStyle", null)
      
      @scala.inline
      def contextMenuHidden(value: Boolean): this.type = set("contextMenuHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dataDetectorTypes(value: DataDetectorTypes | js.Array[DataDetectorTypes]): this.type = set("dataDetectorTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def dataDetectorTypesVarargs(value: DataDetectorTypes*): this.type = set("dataDetectorTypes", js.Array(value :_*))
      
      @scala.inline
      def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disableFullscreenUI(value: Boolean): this.type = set("disableFullscreenUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledInputStyle(value: StyleProp[TextStyle]): this.type = set("disabledInputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def disabledInputStyleNull: this.type = set("disabledInputStyle", null)
      
      @scala.inline
      def editable(value: Boolean): this.type = set("editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def enablesReturnKeyAutomatically(value: Boolean): this.type = set("enablesReturnKeyAutomatically", value.asInstanceOf[js.Any])
      
      @scala.inline
      def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def errorProps(value: TextProps): this.type = set("errorProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def errorStyle(value: StyleProp[TextStyle]): this.type = set("errorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def errorStyleNull: this.type = set("errorStyle", null)
      
      @scala.inline
      def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def importantForAccessibility(
        value: typingsSlinky.reactNative.reactNativeStrings.auto | typingsSlinky.reactNative.reactNativeStrings.yes | typingsSlinky.reactNative.reactNativeStrings.no | typingsSlinky.reactNative.reactNativeStrings.`no-hide-descendants`
      ): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def importantForAutofill(
        value: typingsSlinky.reactNative.reactNativeStrings.auto | typingsSlinky.reactNative.reactNativeStrings.no | noExcludeDescendants | typingsSlinky.reactNative.reactNativeStrings.yes | yesExcludeDescendants
      ): this.type = set("importantForAutofill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inlineImageLeft(value: String): this.type = set("inlineImageLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inlineImagePadding(value: Double): this.type = set("inlineImagePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputAccessoryViewID(value: String): this.type = set("inputAccessoryViewID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputContainerStyle(value: StyleProp[ViewStyle]): this.type = set("inputContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputContainerStyleNull: this.type = set("inputContainerStyle", null)
      
      @scala.inline
      def inputStyle(value: StyleProp[TextStyle]): this.type = set("inputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def inputStyleNull: this.type = set("inputStyle", null)
      
      @scala.inline
      def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def keyboardAppearance(value: default | light | dark): this.type = set("keyboardAppearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def keyboardType(value: KeyboardTypeOptions): this.type = set("keyboardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def label(value: String | ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def labelProps(value: TextProps): this.type = set("labelProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def labelStyle(value: StyleProp[TextStyle]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def labelStyleNull: this.type = set("labelStyle", null)
      
      @scala.inline
      def leftIcon(value: IconNode): this.type = set("leftIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def leftIconContainerStyle(value: StyleProp[ViewStyle]): this.type = set("leftIconContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def leftIconContainerStyleNull: this.type = set("leftIconContainerStyle", null)
      
      @scala.inline
      def leftIconReactElement(value: ReactElement): this.type = set("leftIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maxFontSizeMultiplier(value: Double): this.type = set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def maxFontSizeMultiplierNull: this.type = set("maxFontSizeMultiplier", null)
      
      @scala.inline
      def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def nativeID(value: String): this.type = set("nativeID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def needsOffscreenAlphaCompositing(value: Boolean): this.type = set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def numberOfLines(value: Double): this.type = set("numberOfLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): this.type = set("onAccessibilityAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def onAccessibilityEscape(value: () => Unit): this.type = set("onAccessibilityEscape", js.Any.fromFunction0(value))
      
      @scala.inline
      def onAccessibilityTap(value: () => Unit): this.type = set("onAccessibilityTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def onBlur(value: SyntheticEvent[NodeHandle, TextInputFocusEventData] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChange(value: SyntheticEvent[NodeHandle, TextInputChangeEventData] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onChangeText(value: /* text */ String => Unit): this.type = set("onChangeText", js.Any.fromFunction1(value))
      
      @scala.inline
      def onContentSizeChange(value: SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData] => Unit): this.type = set("onContentSizeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onEndEditing(value: SyntheticEvent[NodeHandle, TextInputEndEditingEventData] => Unit): this.type = set("onEndEditing", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFocus(value: SyntheticEvent[NodeHandle, TextInputFocusEventData] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def onKeyPress(value: SyntheticEvent[NodeHandle, TextInputKeyPressEventData] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMagicTap(value: () => Unit): this.type = set("onMagicTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def onMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def onMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderGrant", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderReject", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onResponderTerminate", js.Any.fromFunction1(value))
      
      @scala.inline
      def onResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def onScroll(value: SyntheticEvent[NodeHandle, TextInputScrollEventData] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSelectionChange(value: SyntheticEvent[NodeHandle, TextInputSelectionChangeEventData] => Unit): this.type = set("onSelectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def onStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def onStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): this.type = set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def onSubmitEditing(value: SyntheticEvent[NodeHandle, TextInputSubmitEditingEventData] => Unit): this.type = set("onSubmitEditing", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTextInput(value: SyntheticEvent[NodeHandle, TextInputTextInputEventData] => Unit): this.type = set("onTextInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchEndCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def onTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): this.type = set("onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def passwordRules(value: String): this.type = set("passwordRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def passwordRulesNull: this.type = set("passwordRules", null)
      
      @scala.inline
      def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def placeholderTextColor(value: ColorValue): this.type = set("placeholderTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def pointerEvents(
        value: typingsSlinky.reactNative.reactNativeStrings.`box-none` | typingsSlinky.reactNative.reactNativeStrings.none | typingsSlinky.reactNative.reactNativeStrings.`box-only` | typingsSlinky.reactNative.reactNativeStrings.auto
      ): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rejectResponderTermination(value: Boolean): this.type = set("rejectResponderTermination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rejectResponderTerminationNull: this.type = set("rejectResponderTermination", null)
      
      @scala.inline
      def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderErrorMessage(value: Boolean): this.type = set("renderErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def returnKeyLabel(value: String): this.type = set("returnKeyLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def returnKeyType(value: ReturnKeyTypeOptions): this.type = set("returnKeyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rightIcon(value: IconNode): this.type = set("rightIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rightIconContainerStyle(value: StyleProp[ViewStyle]): this.type = set("rightIconContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def rightIconContainerStyleNull: this.type = set("rightIconContainerStyle", null)
      
      @scala.inline
      def rightIconReactElement(value: ReactElement): this.type = set("rightIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def secureTextEntry(value: Boolean): this.type = set("secureTextEntry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectTextOnFocus(value: Boolean): this.type = set("selectTextOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selection(value: Start): this.type = set("selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectionColor(value: ColorValue): this.type = set("selectionColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def selectionState(value: DocumentSelectionState): this.type = set("selectionState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def showSoftInputOnFocus(value: Boolean): this.type = set("showSoftInputOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def spellCheck(value: Boolean): this.type = set("spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: StyleProp[TextStyle]): this.type = set("style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def styleNull: this.type = set("style", null)
      
      @scala.inline
      def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def textAlignVertical(value: typingsSlinky.reactNative.reactNativeStrings.auto | top | bottom | center): this.type = set("textAlignVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def textBreakStrategy(
        value: typingsSlinky.reactNative.reactNativeStrings.simple | typingsSlinky.reactNative.reactNativeStrings.highQuality | typingsSlinky.reactNative.reactNativeStrings.balanced
      ): this.type = set("textBreakStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def textContentType(
        value: typingsSlinky.reactNative.reactNativeStrings.none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
      ): this.type = set("textContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tvParallaxMagnification(value: Double): this.type = set("tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tvParallaxShiftDistanceX(value: Double): this.type = set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tvParallaxShiftDistanceY(value: Double): this.type = set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def tvParallaxTiltAngle(value: Double): this.type = set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def underlineColorAndroid(value: ColorValue): this.type = set("underlineColorAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Input.type): typingsSlinky.reactNativeElements.components.ListItem.Input.Builder = new typingsSlinky.reactNativeElements.components.ListItem.Input.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: InputProps): typingsSlinky.reactNativeElements.components.ListItem.Input.Builder = new typingsSlinky.reactNativeElements.components.ListItem.Input.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Subtitle {
    
    @JSImport("react-native-elements", "ListItem.Subtitle")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Subtitle.type): SharedBuilder_TextPropsrightbooleanunde_8502100 = new SharedBuilder_TextPropsrightbooleanunde_8502100(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TextPropsrightbooleanunde): SharedBuilder_TextPropsrightbooleanunde_8502100 = new SharedBuilder_TextPropsrightbooleanunde_8502100(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Title {
    
    @JSImport("react-native-elements", "ListItem.Title")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Title.type): SharedBuilder_TextPropsrightbooleanunde_8502100 = new SharedBuilder_TextPropsrightbooleanunde_8502100(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TextPropsrightbooleanunde): SharedBuilder_TextPropsrightbooleanunde_8502100 = new SharedBuilder_TextPropsrightbooleanunde_8502100(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-elements", "ListItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeElements.mod.ListItem] {
    
    @scala.inline
    def Component(value: ReactComponentClass[js.Object]): this.type = set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ComponentComponentClass(value: ReactComponentClass[js.Object]): this.type = set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ComponentFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ViewComponent(value: ReactComponentClass[js.Object]): this.type = set("ViewComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ViewComponentComponentClass(value: ReactComponentClass[js.Object]): this.type = set("ViewComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ViewComponentFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("ViewComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityActions(value: js.Array[AccessibilityActionInfo]): this.type = set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityActionsVarargs(value: AccessibilityActionInfo*): this.type = set("accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def accessibilityComponentType(
      value: typingsSlinky.reactNative.reactNativeStrings.none | typingsSlinky.reactNative.reactNativeStrings.button | typingsSlinky.reactNative.reactNativeStrings.radiobutton_checked | typingsSlinky.reactNative.reactNativeStrings.radiobutton_unchecked
    ): this.type = set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityElementsHidden(value: Boolean): this.type = set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityHint(value: String): this.type = set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityIgnoresInvertColors(value: Boolean): this.type = set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityLiveRegion(
      value: typingsSlinky.reactNative.reactNativeStrings.none | typingsSlinky.reactNative.reactNativeStrings.polite | typingsSlinky.reactNative.reactNativeStrings.assertive
    ): this.type = set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityRole(value: AccessibilityRole): this.type = set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityState(value: AccessibilityState): this.type = set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): this.type = set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def accessibilityTraitsVarargs(value: AccessibilityTrait*): this.type = set("accessibilityTraits", js.Array(value :_*))
    
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
    def checkmark(value: Boolean | PartialIconProps | ReactElement): this.type = set("checkmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkmarkReactElement(value: ReactElement): this.type = set("checkmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def chevron(value: Boolean | PartialIconProps | ReactElement): this.type = set("chevron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def chevronReactElement(value: ReactElement): this.type = set("chevron", value.asInstanceOf[js.Any])
    
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
    def disabledNull: this.type = set("disabled", null)
    
    @scala.inline
    def disabledStyle(value: StyleProp[ViewStyle]): this.type = set("disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledStyleNull: this.type = set("disabledStyle", null)
    
    @scala.inline
    def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hitSlop(value: Insets): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def importantForAccessibility(
      value: typingsSlinky.reactNative.reactNativeStrings.auto | typingsSlinky.reactNative.reactNativeStrings.yes | typingsSlinky.reactNative.reactNativeStrings.no | typingsSlinky.reactNative.reactNativeStrings.`no-hide-descendants`
    ): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def input(value: InputProps): this.type = set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftAvatar(value: PartialAvatarProps | ReactElement): this.type = set("leftAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftAvatarReactElement(value: ReactElement): this.type = set("leftAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftElement(value: ReactElement): this.type = set("leftElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftIcon(value: PartialIconProps | ReactElement): this.type = set("leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftIconReactElement(value: ReactElement): this.type = set("leftIcon", value.asInstanceOf[js.Any])
    
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
    def onLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
    
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
    def rightAvatar(value: PartialAvatarProps | ReactElement): this.type = set("rightAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightAvatarReactElement(value: ReactElement): this.type = set("rightAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightContentContainerStyle(value: StyleProp[ViewStyle]): this.type = set("rightContentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightContentContainerStyleNull: this.type = set("rightContentContainerStyle", null)
    
    @scala.inline
    def rightElement(value: ReactElement): this.type = set("rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightIcon(value: PartialIconProps | ReactElement): this.type = set("rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightIconReactElement(value: ReactElement): this.type = set("rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightSubtitle(value: String | ReactElement): this.type = set("rightSubtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightSubtitleProps(value: TextProperties): this.type = set("rightSubtitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightSubtitleReactElement(value: ReactElement): this.type = set("rightSubtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightSubtitleStyle(value: StyleProp[TextStyle]): this.type = set("rightSubtitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightSubtitleStyleNull: this.type = set("rightSubtitleStyle", null)
    
    @scala.inline
    def rightTitle(value: String | ReactElement): this.type = set("rightTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightTitleProps(value: TextProperties): this.type = set("rightTitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightTitleReactElement(value: ReactElement): this.type = set("rightTitle", value.asInstanceOf[js.Any])
    
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
    def subtitle(value: String | ReactElement): this.type = set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subtitleProps(value: TextProperties): this.type = set("subtitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subtitleReactElement(value: ReactElement): this.type = set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subtitleStyle(value: StyleProp[TextStyle]): this.type = set("subtitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subtitleStyleNull: this.type = set("subtitleStyle", null)
    
    @scala.inline
    def switch(value: SwitchProperties): this.type = set("switch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String | ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleProps(value: TextProperties): this.type = set("titleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleStyle(value: StyleProp[TextStyle]): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleStyleNull: this.type = set("titleStyle", null)
    
    @scala.inline
    def topDivider(value: Boolean): this.type = set("topDivider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchSoundDisabled(value: Boolean): this.type = set("touchSoundDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchSoundDisabledNull: this.type = set("touchSoundDisabled", null)
    
    @scala.inline
    def tvParallaxProperties(value: TVParallaxProperties): this.type = set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def underlayColor(value: ColorValue): this.type = set("underlayColor", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ListItem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
