package typingsSlinky.reactNativeTextInputMask.mod

import slinky.core.SyntheticEvent
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
import typingsSlinky.reactNative.mod.TextInputAndroidProps
import typingsSlinky.reactNative.mod.TextInputFocusEventData
import typingsSlinky.reactNative.mod.TextInputIOSProps
import typingsSlinky.reactNative.mod.TextInputKeyPressEventData
import typingsSlinky.reactNative.mod.TextInputScrollEventData
import typingsSlinky.reactNative.mod.TextInputSelectionChangeEventData
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNative.reactNativeStrings.URL
import typingsSlinky.reactNative.reactNativeStrings.`box-none`
import typingsSlinky.reactNative.reactNativeStrings.`box-only`
import typingsSlinky.reactNative.reactNativeStrings.`cc-csc`
import typingsSlinky.reactNative.reactNativeStrings.`cc-exp-month`
import typingsSlinky.reactNative.reactNativeStrings.`cc-exp-year`
import typingsSlinky.reactNative.reactNativeStrings.`cc-exp`
import typingsSlinky.reactNative.reactNativeStrings.`cc-number`
import typingsSlinky.reactNative.reactNativeStrings.`no-hide-descendants`
import typingsSlinky.reactNative.reactNativeStrings.`postal-code`
import typingsSlinky.reactNative.reactNativeStrings.`street-address`
import typingsSlinky.reactNative.reactNativeStrings.`unless-editing`
import typingsSlinky.reactNative.reactNativeStrings.`while-editing`
import typingsSlinky.reactNative.reactNativeStrings.addressCity
import typingsSlinky.reactNative.reactNativeStrings.addressCityAndState
import typingsSlinky.reactNative.reactNativeStrings.addressState
import typingsSlinky.reactNative.reactNativeStrings.always
import typingsSlinky.reactNative.reactNativeStrings.assertive
import typingsSlinky.reactNative.reactNativeStrings.auto
import typingsSlinky.reactNative.reactNativeStrings.balanced
import typingsSlinky.reactNative.reactNativeStrings.bottom
import typingsSlinky.reactNative.reactNativeStrings.button
import typingsSlinky.reactNative.reactNativeStrings.center
import typingsSlinky.reactNative.reactNativeStrings.countryName
import typingsSlinky.reactNative.reactNativeStrings.creditCardNumber
import typingsSlinky.reactNative.reactNativeStrings.dark
import typingsSlinky.reactNative.reactNativeStrings.email
import typingsSlinky.reactNative.reactNativeStrings.emailAddress
import typingsSlinky.reactNative.reactNativeStrings.familyName
import typingsSlinky.reactNative.reactNativeStrings.fullStreetAddress
import typingsSlinky.reactNative.reactNativeStrings.givenName
import typingsSlinky.reactNative.reactNativeStrings.highQuality
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
import typingsSlinky.reactNative.reactNativeStrings.no
import typingsSlinky.reactNative.reactNativeStrings.noExcludeDescendants
import typingsSlinky.reactNative.reactNativeStrings.off
import typingsSlinky.reactNative.reactNativeStrings.oneTimeCode
import typingsSlinky.reactNative.reactNativeStrings.organizationName
import typingsSlinky.reactNative.reactNativeStrings.password
import typingsSlinky.reactNative.reactNativeStrings.polite
import typingsSlinky.reactNative.reactNativeStrings.postalCode
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_checked
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsSlinky.reactNative.reactNativeStrings.simple
import typingsSlinky.reactNative.reactNativeStrings.streetAddressLine1
import typingsSlinky.reactNative.reactNativeStrings.streetAddressLine2
import typingsSlinky.reactNative.reactNativeStrings.sublocality
import typingsSlinky.reactNative.reactNativeStrings.tel
import typingsSlinky.reactNative.reactNativeStrings.telephoneNumber
import typingsSlinky.reactNative.reactNativeStrings.top
import typingsSlinky.reactNative.reactNativeStrings.username
import typingsSlinky.reactNative.reactNativeStrings.yes
import typingsSlinky.reactNative.reactNativeStrings.yesExcludeDescendants
import typingsSlinky.reactNativeTextInputMask.AnonEnd
import typingsSlinky.reactNativeTextInputMask.AnonNativeEvent
import typingsSlinky.reactNativeTextInputMask.AnonNativeEventAnonContentSizeAnonHeight
import typingsSlinky.reactNativeTextInputMask.AnonNativeEventAnonText
import typingsSlinky.reactNativeTextInputMask.reactNativeTextInputMaskStrings.characters
import typingsSlinky.reactNativeTextInputMask.reactNativeTextInputMaskStrings.none
import typingsSlinky.reactNativeTextInputMask.reactNativeTextInputMaskStrings.sentences
import typingsSlinky.reactNativeTextInputMask.reactNativeTextInputMaskStrings.words
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInputMaskProps
  extends ViewProps
     with TextInputIOSProps
     with TextInputAndroidProps {
  // Export standard TextInputProps from here on.
  // Workaround for not being able to override onChangeText
  // Copied from React-Native types version: 0.55
  /**
    * Specifies whether fonts should scale to respect Text Size accessibility settings.
    * The default is `true`.
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  /**
    * Can tell TextInput to automatically capitalize certain characters.
    *      characters: all characters,
    *      words: first letter of each word
    *      sentences: first letter of each sentence (default)
    *      none: don't auto capitalize anything
    *
    * https://facebook.github.io/react-native/docs/textinput.html#autocapitalize
    */
  var autoCapitalize: js.UndefOr[none | sentences | words | characters] = js.undefined
  /**
    * If false, disables auto-correct.
    * The default value is true.
    */
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, focuses the input on componentDidMount.
    * The default value is false.
    */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the text field will blur when submitted.
    * The default value is true.
    */
  var blurOnSubmit: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, caret is hidden. The default value is false.
    */
  var caretHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Provides an initial value that will change when the user starts typing.
    * Useful for simple use-cases where you don't want to deal with listening to events
    * and updating the value prop to keep the controlled state in sync.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  /**
    * If false, text is not editable. The default value is true.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to connect to an InputAccessoryView. Not part of react-natives documentation, but present in examples and
    * code.
    * See https://facebook.github.io/react-native/docs/inputaccessoryview.html for more information.
    */
  var inputAccessoryViewID: js.UndefOr[String] = js.undefined
  /**
    * enum("default", 'numeric', 'email-address', "ascii-capable", 'numbers-and-punctuation', 'url', 'number-pad', 'phone-pad', 'name-phone-pad',
    * 'decimal-pad', 'twitter', 'web-search', 'visible-password')
    * Determines which keyboard to open, e.g.numeric.
    * The following values work across platforms: - default - numeric - email-address - phone-pad
    * The following values work on iOS: - ascii-capable - numbers-and-punctuation - url - number-pad - name-phone-pad - decimal-pad - twitter - web-search
    * The following values work on Android: - visible-password
    */
  var keyboardType: js.UndefOr[KeyboardTypeOptions] = js.undefined
  var mask: js.UndefOr[String] = js.undefined
  var maskDefaultValue: js.UndefOr[Boolean] = js.undefined
  /**
    * Limits the maximum number of characters that can be entered.
    * Use this instead of implementing the logic in JS to avoid flicker.
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * If true, the text input can be multiple lines. The default value is false.
    */
  var multiline: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback that is called when the text input is blurred
    */
  var onBlur: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputFocusEventData], Unit]] = js.undefined
  /**
    * Callback that is called when the text input's text changes.
    */
  var onChange: js.UndefOr[js.Function1[/* event */ AnonNativeEvent, Unit]] = js.undefined
  var onChangeText: onChangeTextCallback
  /**
    * Callback that is called when the text input's content size changes.
    * This will be called with
    * `{ nativeEvent: { contentSize: { width, height } } }`.
    *
    * Only called for multiline text inputs.
    */
  var onContentSizeChange: js.UndefOr[js.Function1[/* event */ AnonNativeEventAnonContentSizeAnonHeight, Unit]] = js.undefined
  /**
    * Callback that is called when text input ends.
    */
  var onEndEditing: js.UndefOr[js.Function1[/* event */ AnonNativeEventAnonText, Unit]] = js.undefined
  /**
    * Callback that is called when the text input is focused
    */
  var onFocus: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputFocusEventData], Unit]] = js.undefined
  /**
    * Callback that is called when a key is pressed.
    * This will be called with
    *  `{ nativeEvent: { key: keyValue } }`
    * where keyValue is 'Enter' or 'Backspace' for respective keys and the typed-in character otherwise including ' ' for space.
    *
    * Fires before onChange callbacks.
    * Note: on Android only the inputs from soft keyboard are handled, not the hardware keyboard inputs.
    */
  var onKeyPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputKeyPressEventData], Unit]] = js.undefined
  /**
    * Invoked on content scroll with
    *  `{ nativeEvent: { contentOffset: { x, y } } }`.
    *
    * May also contain other properties from ScrollEvent but on Android contentSize is not provided for performance reasons.
    */
  var onScroll: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputScrollEventData], Unit]] = js.undefined
  /**
    * Callback that is called when the text input selection is changed.
    */
  var onSelectionChange: js.UndefOr[
    js.Function1[SyntheticEvent[NodeHandle, TextInputSelectionChangeEventData], Unit]
  ] = js.undefined
  /**
    * Callback that is called when the text input's submit button is pressed.
    */
  var onSubmitEditing: js.UndefOr[js.Function1[/* event */ AnonNativeEventAnonText, Unit]] = js.undefined
  /**
    * The string that will be rendered before text input has been entered
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * The text color of the placeholder string
    */
  var placeholderTextColor: js.UndefOr[String] = js.undefined
  /**
    * enum('default', 'go', 'google', 'join', 'next', 'route', 'search', 'send', 'yahoo', 'done', 'emergency-call')
    * Determines how the return key should look.
    */
  var returnKeyType: js.UndefOr[ReturnKeyTypeOptions] = js.undefined
  /**
    * If true, the text input obscures the text entered so that sensitive text like passwords stay secure.
    * The default value is false.
    */
  var secureTextEntry: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, all text will automatically be selected on focus
    */
  var selectTextOnFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * The start and end of the text input's selection. Set start and end to
    * the same value to position the cursor.
    */
  var selection: js.UndefOr[AnonEnd] = js.undefined
  /**
    * The highlight (and cursor on ios) color of the text input
    */
  var selectionColor: js.UndefOr[String] = js.undefined
  /**
    * Styles
    */
  @JSName("style")
  var style_TextInputMaskProps: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * The value to show for the text input. TextInput is a controlled component,
    * which means the native value will be forced to match this value prop if provided.
    * For most uses this works great, but in some cases this may cause flickering - one common cause is preventing edits by keeping value the same.
    * In addition to simply setting the same value, either set editable={false},
    * or set/update maxLength to prevent unwanted edits without flicker.
    */
  var value: js.UndefOr[String] = js.undefined
}

object TextInputMaskProps {
  @scala.inline
  def apply(
    onChangeText: (/* formatted */ String, /* extracted */ js.UndefOr[String]) => Unit,
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: typingsSlinky.reactNative.reactNativeStrings.none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: typingsSlinky.reactNative.reactNativeStrings.none | polite | assertive = null,
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
    keyboardAppearance: typingsSlinky.reactNative.reactNativeStrings.default | light | dark = null,
    keyboardType: KeyboardTypeOptions = null,
    mask: String = null,
    maskDefaultValue: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    numberOfLines: Int | Double = null,
    onAccessibilityAction: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit = null,
    onAccessibilityEscape: () => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onBlur: SyntheticEvent[NodeHandle, TextInputFocusEventData] => Unit = null,
    onChange: /* event */ AnonNativeEvent => Unit = null,
    onContentSizeChange: /* event */ AnonNativeEventAnonContentSizeAnonHeight => Unit = null,
    onEndEditing: /* event */ AnonNativeEventAnonText => Unit = null,
    onFocus: SyntheticEvent[NodeHandle, TextInputFocusEventData] => Unit = null,
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
    onSubmitEditing: /* event */ AnonNativeEventAnonText => Unit = null,
    onTouchCancel: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchEnd: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchEndCapture: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchMove: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    onTouchStart: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit = null,
    passwordRules: String = null,
    placeholder: String = null,
    placeholderTextColor: String = null,
    pointerEvents: `box-none` | typingsSlinky.reactNative.reactNativeStrings.none | `box-only` | auto = null,
    rejectResponderTermination: js.UndefOr[Boolean] = js.undefined,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    returnKeyLabel: String = null,
    returnKeyType: ReturnKeyTypeOptions = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    secureTextEntry: js.UndefOr[Boolean] = js.undefined,
    selectTextOnFocus: js.UndefOr[Boolean] = js.undefined,
    selection: AnonEnd = null,
    selectionColor: String = null,
    selectionState: DocumentSelectionState = null,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[TextStyle] = null,
    testID: String = null,
    textAlignVertical: auto | top | bottom | center = null,
    textBreakStrategy: simple | highQuality | balanced = null,
    textContentType: typingsSlinky.reactNative.reactNativeStrings.none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode = null,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null,
    underlineColorAndroid: String = null,
    value: String = null
  ): TextInputMaskProps = {
    val __obj = js.Dynamic.literal(onChangeText = js.Any.fromFunction2(onChangeText))
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
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskDefaultValue)) __obj.updateDynamic("maskDefaultValue")(maskDefaultValue.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(onAccessibilityEscape))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction1(onContentSizeChange))
    if (onEndEditing != null) __obj.updateDynamic("onEndEditing")(js.Any.fromFunction1(onEndEditing))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
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
    __obj.asInstanceOf[TextInputMaskProps]
  }
}

