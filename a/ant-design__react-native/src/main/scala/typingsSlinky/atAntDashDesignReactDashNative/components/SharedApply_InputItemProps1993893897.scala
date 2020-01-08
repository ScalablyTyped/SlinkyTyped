package typingsSlinky.atAntDashDesignReactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atAntDashDesignReactDashNative.AccessibilityActionInfo
import typingsSlinky.atAntDashDesignReactDashNative.PartialInputItemStyle
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
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.bankCard
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.bottom
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.button
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.center
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.characters
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.countryName
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.creditCardNumber
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.dark
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.default
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.digit
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.email
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.emailAddress
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.familyName
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.fullStreetAddress
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.givenName
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.highQuality
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.jobTitle
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.left
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
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.number
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.off
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.oneTimeCode
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.organizationName
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.password
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.phone
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
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.text
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.top
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.username
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.words
import typingsSlinky.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.yes
import typingsSlinky.atAntDashDesignReactDashNative.libInputDashItemMod.InputItemProps
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
import typingsSlinky.reactDashNative.reactDashNativeMod.TextInputSelectionChangeEventData
import typingsSlinky.reactDashNative.reactDashNativeMod.TextInputSubmitEditingEventData
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_InputItemProps1993893897[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: autoFocus, disabled, name, onBlur, onChange, onFocus, onKeyPress, onScroll, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart, placeholder, spellCheck */
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
    blurOnSubmit: js.UndefOr[Boolean] = js.undefined,
    caretHidden: js.UndefOr[Boolean] = js.undefined,
    clear: js.UndefOr[Boolean] = js.undefined,
    clearButtonMode: never | `while-editing` | `unless-editing` | always = null,
    clearTextOnFocus: js.UndefOr[Boolean] = js.undefined,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    contextMenuHidden: js.UndefOr[Boolean] = js.undefined,
    dataDetectorTypes: DataDetectorTypes | js.Array[DataDetectorTypes] = null,
    defaultValue: String = null,
    disableFullscreenUI: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: TagMod[Any] = null,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    inlineImageLeft: String = null,
    inlineImagePadding: Int | Double = null,
    inputAccessoryViewID: String = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    keyboardAppearance: default | light | dark = null,
    keyboardType: KeyboardTypeOptions = null,
    labelNumber: Int | Double = null,
    labelPosition: left | top = null,
    last: js.UndefOr[Boolean] = js.undefined,
    locale: js.Object = null,
    maxFontSizeMultiplier: Int | Double = null,
    maxLength: Int | Double = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    numberOfLines: Int | Double = null,
    onAccessibilityAction: /* event */ AccessibilityActionEvent => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onChangeText: /* text */ String => Unit = null,
    onContentSizeChange: /* e */ NativeSyntheticEvent[TextInputContentSizeChangeEventData] => Unit = null,
    onEndEditing: /* e */ NativeSyntheticEvent[TextInputEndEditingEventData] => Unit = null,
    onErrorClick: /* event */ GestureResponderEvent => Unit = null,
    onExtraClick: /* event */ GestureResponderEvent => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onMoveShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onMoveShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    onResponderEnd: /* event */ GestureResponderEvent => Unit = null,
    onResponderGrant: /* event */ GestureResponderEvent => Unit = null,
    onResponderMove: /* event */ GestureResponderEvent => Unit = null,
    onResponderReject: /* event */ GestureResponderEvent => Unit = null,
    onResponderRelease: /* event */ GestureResponderEvent => Unit = null,
    onResponderStart: /* event */ GestureResponderEvent => Unit = null,
    onResponderTerminate: /* event */ GestureResponderEvent => Unit = null,
    onResponderTerminationRequest: /* event */ GestureResponderEvent => Boolean = null,
    onSelectionChange: /* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData] => Unit = null,
    onStartShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onStartShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    onSubmitEditing: /* e */ NativeSyntheticEvent[TextInputSubmitEditingEventData] => Unit = null,
    onTouchEndCapture: /* event */ GestureResponderEvent => Unit = null,
    onVirtualKeyboardConfirm: /* value */ js.UndefOr[String] => Unit = null,
    placeholderTextColor: String = null,
    pointerEvents: `box-none` | none | `box-only` | auto = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    returnKeyLabel: String = null,
    returnKeyType: ReturnKeyTypeOptions = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    secureTextEntry: js.UndefOr[Boolean] = js.undefined,
    selectTextOnFocus: js.UndefOr[Boolean] = js.undefined,
    selection: Anon_EndStart = null,
    selectionColor: String = null,
    selectionState: DocumentSelectionState = null,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[TextStyle] = null,
    styles: PartialInputItemStyle = null,
    testID: String = null,
    textAlign: left | center = null,
    textAlignVertical: auto | top | bottom | center = null,
    textBreakStrategy: simple | highQuality | balanced = null,
    textContentType: none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode = null,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null,
    `type`: text | bankCard | phone | password | number | digit | KeyboardTypeOptions = null,
    underlineColorAndroid: String = null,
    updatePlaceholder: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
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
    if (!js.isUndefined(blurOnSubmit)) __obj.updateDynamic("blurOnSubmit")(blurOnSubmit.asInstanceOf[js.Any])
    if (!js.isUndefined(caretHidden)) __obj.updateDynamic("caretHidden")(caretHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (clearButtonMode != null) __obj.updateDynamic("clearButtonMode")(clearButtonMode.asInstanceOf[js.Any])
    if (!js.isUndefined(clearTextOnFocus)) __obj.updateDynamic("clearTextOnFocus")(clearTextOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.asInstanceOf[js.Any])
    if (!js.isUndefined(contextMenuHidden)) __obj.updateDynamic("contextMenuHidden")(contextMenuHidden.asInstanceOf[js.Any])
    if (dataDetectorTypes != null) __obj.updateDynamic("dataDetectorTypes")(dataDetectorTypes.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFullscreenUI)) __obj.updateDynamic("disableFullscreenUI")(disableFullscreenUI.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(enablesReturnKeyAutomatically)) __obj.updateDynamic("enablesReturnKeyAutomatically")(enablesReturnKeyAutomatically.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (inlineImageLeft != null) __obj.updateDynamic("inlineImageLeft")(inlineImageLeft.asInstanceOf[js.Any])
    if (inlineImagePadding != null) __obj.updateDynamic("inlineImagePadding")(inlineImagePadding.asInstanceOf[js.Any])
    if (inputAccessoryViewID != null) __obj.updateDynamic("inputAccessoryViewID")(inputAccessoryViewID.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.asInstanceOf[js.Any])
    if (keyboardAppearance != null) __obj.updateDynamic("keyboardAppearance")(keyboardAppearance.asInstanceOf[js.Any])
    if (keyboardType != null) __obj.updateDynamic("keyboardType")(keyboardType.asInstanceOf[js.Any])
    if (labelNumber != null) __obj.updateDynamic("labelNumber")(labelNumber.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxFontSizeMultiplier != null) __obj.updateDynamic("maxFontSizeMultiplier")(maxFontSizeMultiplier.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.asInstanceOf[js.Any])
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1(onChangeText))
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction1(onContentSizeChange))
    if (onEndEditing != null) __obj.updateDynamic("onEndEditing")(js.Any.fromFunction1(onEndEditing))
    if (onErrorClick != null) __obj.updateDynamic("onErrorClick")(js.Any.fromFunction1(onErrorClick))
    if (onExtraClick != null) __obj.updateDynamic("onExtraClick")(js.Any.fromFunction1(onExtraClick))
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
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(onStartShouldSetResponder))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(js.Any.fromFunction1(onSubmitEditing))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onVirtualKeyboardConfirm != null) __obj.updateDynamic("onVirtualKeyboardConfirm")(js.Any.fromFunction1(onVirtualKeyboardConfirm))
    if (placeholderTextColor != null) __obj.updateDynamic("placeholderTextColor")(placeholderTextColor.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
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
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textAlignVertical != null) __obj.updateDynamic("textAlignVertical")(textAlignVertical.asInstanceOf[js.Any])
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    if (textContentType != null) __obj.updateDynamic("textContentType")(textContentType.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (underlineColorAndroid != null) __obj.updateDynamic("underlineColorAndroid")(underlineColorAndroid.asInstanceOf[js.Any])
    if (!js.isUndefined(updatePlaceholder)) __obj.updateDynamic("updatePlaceholder")(updatePlaceholder.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = InputItemProps
}

