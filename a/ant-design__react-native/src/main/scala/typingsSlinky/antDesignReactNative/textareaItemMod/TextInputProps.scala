package typingsSlinky.antDesignReactNative.textareaItemMod

import slinky.core.SyntheticEvent
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.URL
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`box-none`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`box-only`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`cc-csc`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`cc-exp-month`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`cc-exp-year`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`cc-exp`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`cc-number`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`no-hide-descendants`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`postal-code`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`street-address`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`unless-editing`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.`while-editing`
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.addressCity
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.addressCityAndState
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.addressState
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.always
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.assertive
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.auto
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.balanced
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.button
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.center
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.characters
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.countryName
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.creditCardNumber
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.dark
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.email
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.emailAddress
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.familyName
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.fullStreetAddress
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.givenName
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.highQuality
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.jobTitle
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.light
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.location
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.middleName
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.name
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.namePrefix
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.nameSuffix
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.never
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.newPassword
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.nickname
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.no
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.noExcludeDescendants
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.none
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.off
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.oneTimeCode
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.organizationName
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.password
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.polite
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.postalCode
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.radiobutton_checked
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.radiobutton_unchecked
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.sentences
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.simple
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.streetAddressLine1
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.streetAddressLine2
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.sublocality
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.tel
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.telephoneNumber
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.top
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.username
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.words
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.yes
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.yesExcludeDescendants
import typingsSlinky.reactNative.AnonStart
import typingsSlinky.reactNative.ReadonlyactionNamestring
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityStates
import typingsSlinky.reactNative.mod.AccessibilityTrait
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
import typingsSlinky.reactNative.mod.TextInputContentSizeChangeEventData
import typingsSlinky.reactNative.mod.TextInputEndEditingEventData
import typingsSlinky.reactNative.mod.TextInputKeyPressEventData
import typingsSlinky.reactNative.mod.TextInputScrollEventData
import typingsSlinky.reactNative.mod.TextInputSelectionChangeEventData
import typingsSlinky.reactNative.mod.TextInputSubmitEditingEventData
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined utility-types.utility-types.Omit<react-native.react-native.TextInputProperties, 'onChange' | 'onFocus' | 'onBlur'> */
trait TextInputProps extends js.Object {
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.undefined
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  var accessibilityHint: js.UndefOr[String] = js.undefined
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  var accessibilityStates: js.UndefOr[js.Array[AccessibilityStates]] = js.undefined
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.undefined
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  var accessible: js.UndefOr[Boolean] = js.undefined
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  var autoCapitalize: js.UndefOr[none | sentences | words | characters] = js.undefined
  var autoCompleteType: js.UndefOr[
    `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
  ] = js.undefined
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var blurOnSubmit: js.UndefOr[Boolean] = js.undefined
  var caretHidden: js.UndefOr[Boolean] = js.undefined
  var clearButtonMode: js.UndefOr[never | `while-editing` | `unless-editing` | always] = js.undefined
  var clearTextOnFocus: js.UndefOr[Boolean] = js.undefined
  var collapsable: js.UndefOr[Boolean] = js.undefined
  var contextMenuHidden: js.UndefOr[Boolean] = js.undefined
  var dataDetectorTypes: js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var disableFullscreenUI: js.UndefOr[Boolean] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  var hitSlop: js.UndefOr[Insets] = js.undefined
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  var importantForAutofill: js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants] = js.undefined
  var inlineImageLeft: js.UndefOr[String] = js.undefined
  var inlineImagePadding: js.UndefOr[Double] = js.undefined
  var inputAccessoryViewID: js.UndefOr[String] = js.undefined
  var isTVSelectable: js.UndefOr[Boolean] = js.undefined
  var keyboardAppearance: js.UndefOr[
    typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.default | light | dark
  ] = js.undefined
  var keyboardType: js.UndefOr[KeyboardTypeOptions] = js.undefined
  var maxFontSizeMultiplier: js.UndefOr[Double] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var multiline: js.UndefOr[Boolean] = js.undefined
  var nativeID: js.UndefOr[String] = js.undefined
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
  var numberOfLines: js.UndefOr[Double] = js.undefined
  var onAccessibilityAction: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]] = js.undefined
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  var onContentSizeChange: js.UndefOr[
    js.Function1[SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData], Unit]
  ] = js.undefined
  var onEndEditing: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputEndEditingEventData], Unit]] = js.undefined
  var onKeyPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputKeyPressEventData], Unit]] = js.undefined
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onMoveShouldSetResponder: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.undefined
  var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.undefined
  var onResponderEnd: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.undefined
  var onResponderGrant: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.undefined
  var onResponderMove: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.undefined
  var onResponderReject: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.undefined
  var onResponderRelease: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.undefined
  var onResponderStart: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.undefined
  var onResponderTerminate: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.undefined
  var onResponderTerminationRequest: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.undefined
  var onScroll: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputScrollEventData], Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[
    js.Function1[SyntheticEvent[NodeHandle, TextInputSelectionChangeEventData], Unit]
  ] = js.undefined
  var onStartShouldSetResponder: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.undefined
  var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]] = js.undefined
  var onSubmitEditing: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputSubmitEditingEventData], Unit]] = js.undefined
  var onTouchCancel: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.undefined
  var onTouchEndCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.undefined
  var onTouchMove: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.undefined
  var passwordRules: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var placeholderTextColor: js.UndefOr[String] = js.undefined
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
  var rejectResponderTermination: js.UndefOr[Boolean] = js.undefined
  var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
  var returnKeyLabel: js.UndefOr[String] = js.undefined
  var returnKeyType: js.UndefOr[ReturnKeyTypeOptions] = js.undefined
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  var secureTextEntry: js.UndefOr[Boolean] = js.undefined
  var selectTextOnFocus: js.UndefOr[Boolean] = js.undefined
  var selection: js.UndefOr[AnonStart] = js.undefined
  var selectionColor: js.UndefOr[String] = js.undefined
  var selectionState: js.UndefOr[DocumentSelectionState] = js.undefined
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var textAlignVertical: js.UndefOr[auto | top | bottom | center] = js.undefined
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.undefined
  var textContentType: js.UndefOr[
    none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
  ] = js.undefined
  var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
  var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
  var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
  var underlineColorAndroid: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TextInputProps {
  @scala.inline
  def apply(
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    autoCapitalize: none | sentences | words | characters = null,
    autoCompleteType: `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off = null,
    autoCorrect: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    blurOnSubmit: js.UndefOr[Boolean] = js.undefined,
    caretHidden: js.UndefOr[Boolean] = js.undefined,
    clearButtonMode: never | `while-editing` | `unless-editing` | always = null,
    clearTextOnFocus: js.UndefOr[Boolean] = js.undefined,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    contextMenuHidden: js.UndefOr[Boolean] = js.undefined,
    dataDetectorTypes: DataDetectorTypes | js.Array[DataDetectorTypes] = null,
    defaultValue: String = null,
    disableFullscreenUI: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    importantForAutofill: auto | no | noExcludeDescendants | yes | yesExcludeDescendants = null,
    inlineImageLeft: String = null,
    inlineImagePadding: Int | Double = null,
    inputAccessoryViewID: String = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    keyboardAppearance: typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.default | light | dark = null,
    keyboardType: KeyboardTypeOptions = null,
    maxFontSizeMultiplier: Int | Double = null,
    maxLength: Int | Double = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    numberOfLines: Int | Double = null,
    onAccessibilityAction: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit = null,
    onAccessibilityEscape: () => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onChangeText: /* text */ String => Unit = null,
    onContentSizeChange: SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData] => Unit = null,
    onEndEditing: SyntheticEvent[NodeHandle, TextInputEndEditingEventData] => Unit = null,
    onKeyPress: SyntheticEvent[NodeHandle, TextInputKeyPressEventData] => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onMoveShouldSetResponder: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onMoveShouldSetResponderCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onResponderEnd: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderGrant: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderMove: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderReject: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderRelease: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderStart: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderTerminate: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onResponderTerminationRequest: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onScroll: SyntheticEvent[NodeHandle, TextInputScrollEventData] => Unit = null,
    onSelectionChange: SyntheticEvent[NodeHandle, TextInputSelectionChangeEventData] => Unit = null,
    onStartShouldSetResponder: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onStartShouldSetResponderCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean = null,
    onSubmitEditing: SyntheticEvent[NodeHandle, TextInputSubmitEditingEventData] => Unit = null,
    onTouchCancel: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchEnd: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchEndCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchMove: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchStart: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    passwordRules: String = null,
    placeholder: String = null,
    placeholderTextColor: String = null,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    rejectResponderTermination: js.UndefOr[Boolean] = js.undefined,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    returnKeyLabel: String = null,
    returnKeyType: ReturnKeyTypeOptions = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    secureTextEntry: js.UndefOr[Boolean] = js.undefined,
    selectTextOnFocus: js.UndefOr[Boolean] = js.undefined,
    selection: AnonStart = null,
    selectionColor: String = null,
    selectionState: DocumentSelectionState = null,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[TextStyle] = null,
    testID: String = null,
    textAlignVertical: auto | top | bottom | center = null,
    textBreakStrategy: simple | highQuality | balanced = null,
    textContentType: none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode = null,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null,
    underlineColorAndroid: String = null,
    value: String = null
  ): TextInputProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCompleteType != null) __obj.updateDynamic("autoCompleteType")(autoCompleteType.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(blurOnSubmit)) __obj.updateDynamic("blurOnSubmit")(blurOnSubmit.asInstanceOf[js.Any])
    if (!js.isUndefined(caretHidden)) __obj.updateDynamic("caretHidden")(caretHidden.asInstanceOf[js.Any])
    if (clearButtonMode != null) __obj.updateDynamic("clearButtonMode")(clearButtonMode.asInstanceOf[js.Any])
    if (!js.isUndefined(clearTextOnFocus)) __obj.updateDynamic("clearTextOnFocus")(clearTextOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (!js.isUndefined(contextMenuHidden)) __obj.updateDynamic("contextMenuHidden")(contextMenuHidden.asInstanceOf[js.Any])
    if (dataDetectorTypes != null) __obj.updateDynamic("dataDetectorTypes")(dataDetectorTypes.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFullscreenUI)) __obj.updateDynamic("disableFullscreenUI")(disableFullscreenUI.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(enablesReturnKeyAutomatically)) __obj.updateDynamic("enablesReturnKeyAutomatically")(enablesReturnKeyAutomatically.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (importantForAutofill != null) __obj.updateDynamic("importantForAutofill")(importantForAutofill.asInstanceOf[js.Any])
    if (inlineImageLeft != null) __obj.updateDynamic("inlineImageLeft")(inlineImageLeft.asInstanceOf[js.Any])
    if (inlineImagePadding != null) __obj.updateDynamic("inlineImagePadding")(inlineImagePadding.asInstanceOf[js.Any])
    if (inputAccessoryViewID != null) __obj.updateDynamic("inputAccessoryViewID")(inputAccessoryViewID.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (keyboardAppearance != null) __obj.updateDynamic("keyboardAppearance")(keyboardAppearance.asInstanceOf[js.Any])
    if (keyboardType != null) __obj.updateDynamic("keyboardType")(keyboardType.asInstanceOf[js.Any])
    if (maxFontSizeMultiplier != null) __obj.updateDynamic("maxFontSizeMultiplier")(maxFontSizeMultiplier.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(onAccessibilityEscape))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1(onChangeText))
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction1(onContentSizeChange))
    if (onEndEditing != null) __obj.updateDynamic("onEndEditing")(js.Any.fromFunction1(onEndEditing))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1(onResponderEnd))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1(onResponderGrant))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1(onResponderMove))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1(onResponderReject))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1(onResponderRelease))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1(onResponderStart))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1(onResponderTerminate))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(onResponderTerminationRequest))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(onStartShouldSetResponder))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(js.Any.fromFunction1(onSubmitEditing))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (passwordRules != null) __obj.updateDynamic("passwordRules")(passwordRules.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placeholderTextColor != null) __obj.updateDynamic("placeholderTextColor")(placeholderTextColor.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectResponderTermination)) __obj.updateDynamic("rejectResponderTermination")(rejectResponderTermination.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.asInstanceOf[js.Any])
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.asInstanceOf[js.Any])
    if (returnKeyLabel != null) __obj.updateDynamic("returnKeyLabel")(returnKeyLabel.asInstanceOf[js.Any])
    if (returnKeyType != null) __obj.updateDynamic("returnKeyType")(returnKeyType.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(secureTextEntry)) __obj.updateDynamic("secureTextEntry")(secureTextEntry.asInstanceOf[js.Any])
    if (!js.isUndefined(selectTextOnFocus)) __obj.updateDynamic("selectTextOnFocus")(selectTextOnFocus.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor.asInstanceOf[js.Any])
    if (selectionState != null) __obj.updateDynamic("selectionState")(selectionState.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (textAlignVertical != null) __obj.updateDynamic("textAlignVertical")(textAlignVertical.asInstanceOf[js.Any])
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    if (textContentType != null) __obj.updateDynamic("textContentType")(textContentType.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    if (underlineColorAndroid != null) __obj.updateDynamic("underlineColorAndroid")(underlineColorAndroid.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputProps]
  }
}

