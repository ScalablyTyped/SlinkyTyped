package typingsSlinky.atAntDashDesignReactDashNative.libTextareaDashItemMod

import slinky.core.TagMod
import typingsSlinky.atAntDashDesignReactDashNative.AccessibilityActionInfo
import typingsSlinky.atAntDashDesignReactDashNative.PartialTextareaItemStyle
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.URL
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`box-none`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`box-only`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`cc-csc`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`cc-exp-month`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`cc-exp-year`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`cc-exp`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`cc-number`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`no-hide-descendants`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`postal-code`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`street-address`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`unless-editing`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`while-editing`
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.addressCity
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.addressCityAndState
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.addressState
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.always
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.assertive
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.auto
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.balanced
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.bottom
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.button
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.center
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.characters
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.countryName
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.creditCardNumber
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.dark
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.email
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.emailAddress
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.familyName
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.fullStreetAddress
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.givenName
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.highQuality
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.jobTitle
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.light
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.location
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.middleName
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.name
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.namePrefix
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.nameSuffix
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.never
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.newPassword
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.nickname
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.no
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.none
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.off
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.oneTimeCode
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.organizationName
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.password
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.polite
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.postalCode
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.radiobutton_checked
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.radiobutton_unchecked
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.sentences
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.simple
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.streetAddressLine1
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.streetAddressLine2
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.sublocality
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.tel
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.telephoneNumber
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.top
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.username
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.words
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.yes
import typingsSlinky.atAntDashDesignReactDashNative.libTextareaDashItemPropsTypeMod.TextAreaEventHandle
import typingsSlinky.reactDashNative.Anon_EndStart
import typingsSlinky.reactDashNative.reactDashNativeMod.AccessibilityActionEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.AccessibilityRole
import typingsSlinky.reactDashNative.reactDashNativeMod.AccessibilityState
import typingsSlinky.reactDashNative.reactDashNativeMod.AccessibilityStates
import typingsSlinky.reactDashNative.reactDashNativeMod.AccessibilityTrait
import typingsSlinky.reactDashNative.reactDashNativeMod.DataDetectorTypes
import typingsSlinky.reactDashNative.reactDashNativeMod.DocumentSelectionState
import typingsSlinky.reactDashNative.reactDashNativeMod.GestureResponderEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.Insets
import typingsSlinky.reactDashNative.reactDashNativeMod.KeyboardTypeOptions
import typingsSlinky.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.ReturnKeyTypeOptions
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.TVParallaxProperties
import typingsSlinky.reactDashNative.reactDashNativeMod.TextInputContentSizeChangeEventData
import typingsSlinky.reactDashNative.reactDashNativeMod.TextInputEndEditingEventData
import typingsSlinky.reactDashNative.reactDashNativeMod.TextInputKeyPressEventData
import typingsSlinky.reactDashNative.reactDashNativeMod.TextInputScrollEventData
import typingsSlinky.reactDashNative.reactDashNativeMod.TextInputSelectionChangeEventData
import typingsSlinky.reactDashNative.reactDashNativeMod.TextInputSubmitEditingEventData
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @ant-design/react-native.@ant-design/react-native/lib/textarea-item/PropsType.TextAreaItemPropsType */
/* Inlined parent @ant-design/react-native.@ant-design/react-native/lib/textarea-item.TextInputProps */
/* Inlined parent @ant-design/react-native.@ant-design/react-native/lib/style.WithThemeStyles<@ant-design/react-native.@ant-design/react-native/lib/textarea-item/style.TextareaItemStyle> */
@js.native
trait TextareaItemProps extends js.Object {
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
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.native
  var accessible: js.UndefOr[Boolean] = js.native
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  var autoCapitalize: js.UndefOr[none | sentences | words | characters] = js.native
  var autoCompleteType: js.UndefOr[
    `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
  ] = js.native
  var autoCorrect: js.UndefOr[Boolean] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var autoHeight: js.UndefOr[Boolean] = js.native
  var blurOnSubmit: js.UndefOr[Boolean] = js.native
  var caretHidden: js.UndefOr[Boolean] = js.native
  var clear: js.UndefOr[Boolean] = js.native
  var clearButtonMode: js.UndefOr[never | `while-editing` | `unless-editing` | always] = js.native
  var clearTextOnFocus: js.UndefOr[Boolean] = js.native
  var collapsable: js.UndefOr[Boolean] = js.native
  var contextMenuHidden: js.UndefOr[Boolean] = js.native
  var count: js.UndefOr[Double] = js.native
  var dataDetectorTypes: js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]] = js.native
  var defaultValue: js.UndefOr[String] = js.native
  var disableFullscreenUI: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[Boolean] = js.native
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  var hitSlop: js.UndefOr[Insets] = js.native
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
  var inlineImageLeft: js.UndefOr[String] = js.native
  var inlineImagePadding: js.UndefOr[Double] = js.native
  var inputAccessoryViewID: js.UndefOr[String] = js.native
  var isTVSelectable: js.UndefOr[Boolean] = js.native
  var keyboardAppearance: js.UndefOr[
    typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.default | light | dark
  ] = js.native
  var keyboardType: js.UndefOr[KeyboardTypeOptions] = js.native
  var labelNumber: js.UndefOr[Double] = js.native
  var last: js.UndefOr[Boolean] = js.native
  var maxFontSizeMultiplier: js.UndefOr[Double] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var multiline: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var nativeID: js.UndefOr[String] = js.native
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.native
  var numberOfLines: js.UndefOr[Double] = js.native
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.native
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
  var onChange: js.UndefOr[TextAreaEventHandle] = js.native
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
  var onContentSizeChange: js.UndefOr[
    js.Function1[
      (/* e */ js.Any) | (/* e */ NativeSyntheticEvent[TextInputContentSizeChangeEventData]), 
      Unit
    ]
  ] = js.native
  var onEndEditing: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputEndEditingEventData], Unit]] = js.native
  var onErrorClick: js.UndefOr[js.Function0[Unit]] = js.native
  var onKeyPress: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputKeyPressEventData], Unit]] = js.native
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onScroll: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputScrollEventData], Unit]] = js.native
  var onSelectionChange: js.UndefOr[
    js.Function1[/* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData], Unit]
  ] = js.native
  var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
  var onSubmitEditing: js.UndefOr[
    js.Function1[/* e */ NativeSyntheticEvent[TextInputSubmitEditingEventData], Unit]
  ] = js.native
  var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var placeholderTextColor: js.UndefOr[String] = js.native
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.native
  var removeClippedSubviews: js.UndefOr[Boolean] = js.native
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.native
  var returnKeyLabel: js.UndefOr[String] = js.native
  var returnKeyType: js.UndefOr[ReturnKeyTypeOptions] = js.native
  var rows: js.UndefOr[Double] = js.native
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  var secureTextEntry: js.UndefOr[Boolean] = js.native
  var selectTextOnFocus: js.UndefOr[Boolean] = js.native
  var selection: js.UndefOr[Anon_EndStart] = js.native
  var selectionColor: js.UndefOr[String] = js.native
  var selectionState: js.UndefOr[DocumentSelectionState] = js.native
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.native
  var spellCheck: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[StyleProp[TextStyle]] = js.native
  var styles: js.UndefOr[PartialTextareaItemStyle] = js.native
  var testID: js.UndefOr[String] = js.native
  var textAlignVertical: js.UndefOr[auto | top | bottom | center] = js.native
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.native
  var textContentType: js.UndefOr[
    none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
  ] = js.native
  var title: js.UndefOr[TagMod[Any]] = js.native
  var tvParallaxMagnification: js.UndefOr[Double] = js.native
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.native
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.native
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.native
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.native
  var underlineColorAndroid: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

