package typingsSlinky.reactNativeElements.anon

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.anon.Start
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityStates
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.ActivityIndicatorProperties
import typingsSlinky.reactNative.mod.DataDetectorTypes
import typingsSlinky.reactNative.mod.DocumentSelectionState
import typingsSlinky.reactNative.mod.Insets
import typingsSlinky.reactNative.mod.KeyboardTypeOptions
import typingsSlinky.reactNative.mod.LayoutChangeEvent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.ReturnKeyTypeOptions
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TVParallaxProperties
import typingsSlinky.reactNative.mod.TextInputChangeEventData
import typingsSlinky.reactNative.mod.TextInputContentSizeChangeEventData
import typingsSlinky.reactNative.mod.TextInputEndEditingEventData
import typingsSlinky.reactNative.mod.TextInputKeyPressEventData
import typingsSlinky.reactNative.mod.TextInputScrollEventData
import typingsSlinky.reactNative.mod.TextInputSelectionChangeEventData
import typingsSlinky.reactNative.mod.TextInputSubmitEditingEventData
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.IconNode
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.URL
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`box-none`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`box-only`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`cc-csc`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`cc-exp-month`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`cc-exp-year`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`cc-exp`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`cc-number`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`postal-code`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`street-address`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`unless-editing`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.`while-editing`
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.addressCity
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.addressCityAndState
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.addressState
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.always
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.android
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.assertive
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.auto
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.balanced
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.bottom
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.button
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.center
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.characters
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.countryName
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.creditCardNumber
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.dark
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.default
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.email
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.emailAddress
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.familyName
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.fullStreetAddress
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.givenName
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.highQuality
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.ios
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.jobTitle
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.light
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.location
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.middleName
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.name
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.namePrefix
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.nameSuffix
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.never
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.newPassword
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.nickname
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.no
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.noExcludeDescendants
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.none
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.off
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.oneTimeCode
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.organizationName
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.password
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.polite
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.postalCode
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.sentences
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.simple
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.streetAddressLine1
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.streetAddressLine2
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.sublocality
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.tel
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.telephoneNumber
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.top
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.username
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.words
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.yes
import typingsSlinky.reactNativeElements.reactNativeElementsStrings.yesExcludeDescendants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.SearchBarProps> */
@js.native
trait PartialSearchBarProps extends js.Object {
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.native
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.native
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.native
  var accessibilityHint: js.UndefOr[String] = js.native
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.native
  var accessibilityLabel: js.UndefOr[String] = js.native
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.native
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.native
  var accessibilityState: js.UndefOr[AccessibilityState] = js.native
  var accessibilityStates: js.UndefOr[js.Array[AccessibilityStates]] = js.native
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.native
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.native
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.native
  var accessible: js.UndefOr[Boolean] = js.native
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  var autoCapitalize: js.UndefOr[none | sentences | words | characters] = js.native
  var autoCompleteType: js.UndefOr[
    `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
  ] = js.native
  var autoCorrect: js.UndefOr[Boolean] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var blurOnSubmit: js.UndefOr[Boolean] = js.native
  var cancelButtonProps: js.UndefOr[PartialTouchableOpacityPr] = js.native
  var cancelButtonTitle: js.UndefOr[String] = js.native
  var cancelIcon: js.UndefOr[IconNode] = js.native
  var caretHidden: js.UndefOr[Boolean] = js.native
  var clearButtonMode: js.UndefOr[never | `while-editing` | `unless-editing` | always] = js.native
  var clearIcon: js.UndefOr[IconNode] = js.native
  var clearTextOnFocus: js.UndefOr[Boolean] = js.native
  var collapsable: js.UndefOr[Boolean] = js.native
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var contextMenuHidden: js.UndefOr[Boolean] = js.native
  var dataDetectorTypes: js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]] = js.native
  var defaultValue: js.UndefOr[String] = js.native
  var disableFullscreenUI: js.UndefOr[Boolean] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.native
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  var hitSlop: js.UndefOr[Insets] = js.native
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
  var importantForAutofill: js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants] = js.native
  var inlineImageLeft: js.UndefOr[String] = js.native
  var inlineImagePadding: js.UndefOr[Double] = js.native
  var inputAccessoryViewID: js.UndefOr[String] = js.native
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var isTVSelectable: js.UndefOr[Boolean] = js.native
  var keyboardAppearance: js.UndefOr[default | light | dark] = js.native
  var keyboardType: js.UndefOr[KeyboardTypeOptions] = js.native
  var leftIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var lightTheme: js.UndefOr[Boolean] = js.native
  var loadingProps: js.UndefOr[ActivityIndicatorProperties] = js.native
  var maxFontSizeMultiplier: js.UndefOr[Double] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var multiline: js.UndefOr[Boolean] = js.native
  var nativeID: js.UndefOr[String] = js.native
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.native
  var numberOfLines: js.UndefOr[Double] = js.native
  var onAccessibilityAction: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]] = js.native
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputChangeEventData], Unit]] = js.native
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
  var onClear: js.UndefOr[js.Function0[Unit]] = js.native
  var onContentSizeChange: js.UndefOr[
    js.Function1[SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData], Unit]
  ] = js.native
  var onEndEditing: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputEndEditingEventData], Unit]] = js.native
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
  var onKeyPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputKeyPressEventData], Unit]] = js.native
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  var onResponderEnd: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderGrant: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderMove: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderReject: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderRelease: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderStart: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderTerminate: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onResponderTerminationRequest: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  var onScroll: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputScrollEventData], Unit]] = js.native
  var onSelectionChange: js.UndefOr[
    js.Function1[SyntheticEvent[NodeHandle, TextInputSelectionChangeEventData], Unit]
  ] = js.native
  var onStartShouldSetResponder: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.native
  var onSubmitEditing: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputSubmitEditingEventData], Unit]] = js.native
  var onTouchCancel: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onTouchEnd: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onTouchEndCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onTouchMove: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var onTouchStart: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  var passwordRules: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var placeholderTextColor: js.UndefOr[String] = js.native
  var platform: js.UndefOr[default | ios | android] = js.native
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.native
  var rejectResponderTermination: js.UndefOr[Boolean] = js.native
  var removeClippedSubviews: js.UndefOr[Boolean] = js.native
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.native
  var returnKeyLabel: js.UndefOr[String] = js.native
  var returnKeyType: js.UndefOr[ReturnKeyTypeOptions] = js.native
  var rightIconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var round: js.UndefOr[Boolean] = js.native
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  var searchIcon: js.UndefOr[IconNode] = js.native
  var secureTextEntry: js.UndefOr[Boolean] = js.native
  var selectTextOnFocus: js.UndefOr[Boolean] = js.native
  var selection: js.UndefOr[Start] = js.native
  var selectionColor: js.UndefOr[String] = js.native
  var selectionState: js.UndefOr[DocumentSelectionState] = js.native
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.native
  var showCancel: js.UndefOr[Boolean] = js.native
  var showLoading: js.UndefOr[Boolean] = js.native
  var showSoftInputOnFocus: js.UndefOr[Boolean] = js.native
  var spellCheck: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[StyleProp[TextStyle]] = js.native
  var testID: js.UndefOr[String] = js.native
  var textAlignVertical: js.UndefOr[auto | top | bottom | center] = js.native
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.native
  var textContentType: js.UndefOr[
    none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
  ] = js.native
  var tvParallaxMagnification: js.UndefOr[Double] = js.native
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.native
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.native
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.native
  var underlineColorAndroid: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object PartialSearchBarProps {
  @scala.inline
  def apply(): PartialSearchBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSearchBarProps]
  }
  @scala.inline
  implicit class PartialSearchBarPropsOps[Self <: PartialSearchBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityActions")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityComponentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityComponentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityComponentType")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityElementsHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityElementsHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityElementsHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityElementsHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityHint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityHint")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityIgnoresInvertColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityIgnoresInvertColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityIgnoresInvertColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityIgnoresInvertColors")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityLiveRegion(value: none | polite | assertive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLiveRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityLiveRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityLiveRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityRole(value: AccessibilityRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityRole")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityState(value: AccessibilityState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityState")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityStates(value: js.Array[AccessibilityStates]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityStates")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityTraits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityTraits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityTraits")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityValue(value: AccessibilityValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityValue")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessibilityViewIsModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityViewIsModal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibilityViewIsModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibilityViewIsModal")(js.undefined)
        ret
    }
    @scala.inline
    def withAccessible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessible")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFontScaling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFontScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFontScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFontScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCapitalize(value: none | sentences | words | characters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCapitalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCapitalize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCompleteType(
      value: `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCompleteType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCompleteType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCompleteType")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCorrect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCorrect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurOnSubmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurOnSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurOnSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButtonProps(value: PartialTouchableOpacityPr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButtonTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelIcon(value: IconNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withCaretHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaretHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withClearButtonMode(value: never | `while-editing` | `unless-editing` | always): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearButtonMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonMode")(js.undefined)
        ret
    }
    @scala.inline
    def withClearIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearIcon(value: IconNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withClearTextOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTextOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearTextOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTextOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsable")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(null)
        ret
    }
    @scala.inline
    def withContextMenuHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withDataDetectorTypes(value: DataDetectorTypes | js.Array[DataDetectorTypes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDetectorTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataDetectorTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDetectorTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFullscreenUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFullscreenUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFullscreenUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFullscreenUI")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablesReturnKeyAutomatically(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablesReturnKeyAutomatically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablesReturnKeyAutomatically: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablesReturnKeyAutomatically")(js.undefined)
        ret
    }
    @scala.inline
    def withHasTVPreferredFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTVPreferredFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasTVPreferredFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasTVPreferredFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withHitSlop(value: Insets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitSlop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitSlop")(js.undefined)
        ret
    }
    @scala.inline
    def withImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importantForAccessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportantForAccessibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importantForAccessibility")(js.undefined)
        ret
    }
    @scala.inline
    def withImportantForAutofill(value: auto | no | noExcludeDescendants | yes | yesExcludeDescendants): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importantForAutofill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportantForAutofill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importantForAutofill")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineImageLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineImageLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineImageLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineImageLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineImagePadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineImagePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineImagePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineImagePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withInputAccessoryViewID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAccessoryViewID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputAccessoryViewID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAccessoryViewID")(js.undefined)
        ret
    }
    @scala.inline
    def withInputContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInputContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputContainerStyle")(null)
        ret
    }
    @scala.inline
    def withInputStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withInputStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(null)
        ret
    }
    @scala.inline
    def withIsTVSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTVSelectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTVSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTVSelectable")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardAppearance(value: default | light | dark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardAppearance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardAppearance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardAppearance")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardType(value: KeyboardTypeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardType")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftIconContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIconContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftIconContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIconContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftIconContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIconContainerStyle")(null)
        ret
    }
    @scala.inline
    def withLightTheme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingProps(value: ActivityIndicatorProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFontSizeMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSizeMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFontSizeMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFontSizeMultiplier")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeID")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedsOffscreenAlphaCompositing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsOffscreenAlphaCompositing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedsOffscreenAlphaCompositing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsOffscreenAlphaCompositing")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLines")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAccessibilityAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityAction")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccessibilityEscape(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAccessibilityEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccessibilityTap(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAccessibilityTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: SyntheticEvent[NodeHandle, TextInputChangeEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeText(value: /* text */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClear")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContentSizeChange(value: SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentSizeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContentSizeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentSizeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEndEditing(value: SyntheticEvent[NodeHandle, TextInputEndEditingEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndEditing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEndEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: SyntheticEvent[NodeHandle, TextInputKeyPressEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMagicTap(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMagicTap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMagicTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMagicTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMoveShouldSetResponder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMoveShouldSetResponderCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponderCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderGrant")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderGrant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderGrant")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderReject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderReject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderReject")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderRelease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderTerminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResponderTerminationRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminationRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: SyntheticEvent[NodeHandle, TextInputScrollEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChange(value: SyntheticEvent[NodeHandle, TextInputSelectionChangeEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStartShouldSetResponder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStartShouldSetResponderCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponderCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmitEditing(value: SyntheticEvent[NodeHandle, TextInputSubmitEditingEventData] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitEditing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmitEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordRules(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRules")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: default | ios | android): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerEvents(value: `box-none` | none | `box-only` | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectResponderTermination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectResponderTermination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectResponderTermination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectResponderTermination")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveClippedSubviews(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClippedSubviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveClippedSubviews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeClippedSubviews")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderToHardwareTextureAndroid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToHardwareTextureAndroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderToHardwareTextureAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToHardwareTextureAndroid")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnKeyLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnKeyLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnKeyLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnKeyLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnKeyType(value: ReturnKeyTypeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnKeyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnKeyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnKeyType")(js.undefined)
        ret
    }
    @scala.inline
    def withRightIconContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIconContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightIconContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIconContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRightIconContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIconContainerStyle")(null)
        ret
    }
    @scala.inline
    def withRound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchIcon(value: IconNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureTextEntry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureTextEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureTextEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureTextEntry")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectTextOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectTextOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectTextOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectTextOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: Start): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionState(value: DocumentSelectionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionState")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldRasterizeIOS(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRasterizeIOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldRasterizeIOS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRasterizeIOS")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSoftInputOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSoftInputOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSoftInputOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSoftInputOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withTestID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testID")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlignVertical(value: auto | top | bottom | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlignVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlignVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withTextBreakStrategy(value: simple | highQuality | balanced): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBreakStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextBreakStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBreakStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withTextContentType(
      value: none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxMagnification(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxMagnification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxMagnification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxMagnification")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxProperties(value: TVParallaxProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxShiftDistanceX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxShiftDistanceX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceX")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxShiftDistanceY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxShiftDistanceY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxShiftDistanceY")(js.undefined)
        ret
    }
    @scala.inline
    def withTvParallaxTiltAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxTiltAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTvParallaxTiltAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tvParallaxTiltAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineColorAndroid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineColorAndroid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineColorAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineColorAndroid")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

