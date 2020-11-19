package typingsSlinky.antdMobileRn.inputItemIndexNativeMod

import slinky.core.SyntheticEvent
import typingsSlinky.antdMobileRn.antdMobileRnStrings.URL
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`box-none`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`box-only`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`cc-csc`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`cc-exp-month`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`cc-exp-year`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`cc-exp`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`cc-number`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`no-hide-descendants`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`postal-code`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`street-address`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`unless-editing`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.`while-editing`
import typingsSlinky.antdMobileRn.antdMobileRnStrings.addressCity
import typingsSlinky.antdMobileRn.antdMobileRnStrings.addressCityAndState
import typingsSlinky.antdMobileRn.antdMobileRnStrings.addressState
import typingsSlinky.antdMobileRn.antdMobileRnStrings.always
import typingsSlinky.antdMobileRn.antdMobileRnStrings.assertive
import typingsSlinky.antdMobileRn.antdMobileRnStrings.auto
import typingsSlinky.antdMobileRn.antdMobileRnStrings.balanced
import typingsSlinky.antdMobileRn.antdMobileRnStrings.bottom
import typingsSlinky.antdMobileRn.antdMobileRnStrings.button
import typingsSlinky.antdMobileRn.antdMobileRnStrings.center
import typingsSlinky.antdMobileRn.antdMobileRnStrings.characters
import typingsSlinky.antdMobileRn.antdMobileRnStrings.countryName
import typingsSlinky.antdMobileRn.antdMobileRnStrings.creditCardNumber
import typingsSlinky.antdMobileRn.antdMobileRnStrings.dark
import typingsSlinky.antdMobileRn.antdMobileRnStrings.email
import typingsSlinky.antdMobileRn.antdMobileRnStrings.emailAddress
import typingsSlinky.antdMobileRn.antdMobileRnStrings.familyName
import typingsSlinky.antdMobileRn.antdMobileRnStrings.fullStreetAddress
import typingsSlinky.antdMobileRn.antdMobileRnStrings.givenName
import typingsSlinky.antdMobileRn.antdMobileRnStrings.highQuality
import typingsSlinky.antdMobileRn.antdMobileRnStrings.jobTitle
import typingsSlinky.antdMobileRn.antdMobileRnStrings.light
import typingsSlinky.antdMobileRn.antdMobileRnStrings.location
import typingsSlinky.antdMobileRn.antdMobileRnStrings.middleName
import typingsSlinky.antdMobileRn.antdMobileRnStrings.name
import typingsSlinky.antdMobileRn.antdMobileRnStrings.namePrefix
import typingsSlinky.antdMobileRn.antdMobileRnStrings.nameSuffix
import typingsSlinky.antdMobileRn.antdMobileRnStrings.never
import typingsSlinky.antdMobileRn.antdMobileRnStrings.newPassword
import typingsSlinky.antdMobileRn.antdMobileRnStrings.nickname
import typingsSlinky.antdMobileRn.antdMobileRnStrings.no
import typingsSlinky.antdMobileRn.antdMobileRnStrings.noExcludeDescendants
import typingsSlinky.antdMobileRn.antdMobileRnStrings.none
import typingsSlinky.antdMobileRn.antdMobileRnStrings.off
import typingsSlinky.antdMobileRn.antdMobileRnStrings.oneTimeCode
import typingsSlinky.antdMobileRn.antdMobileRnStrings.organizationName
import typingsSlinky.antdMobileRn.antdMobileRnStrings.password
import typingsSlinky.antdMobileRn.antdMobileRnStrings.polite
import typingsSlinky.antdMobileRn.antdMobileRnStrings.postalCode
import typingsSlinky.antdMobileRn.antdMobileRnStrings.radiobutton_checked
import typingsSlinky.antdMobileRn.antdMobileRnStrings.radiobutton_unchecked
import typingsSlinky.antdMobileRn.antdMobileRnStrings.sentences
import typingsSlinky.antdMobileRn.antdMobileRnStrings.simple
import typingsSlinky.antdMobileRn.antdMobileRnStrings.streetAddressLine1
import typingsSlinky.antdMobileRn.antdMobileRnStrings.streetAddressLine2
import typingsSlinky.antdMobileRn.antdMobileRnStrings.sublocality
import typingsSlinky.antdMobileRn.antdMobileRnStrings.tel
import typingsSlinky.antdMobileRn.antdMobileRnStrings.telephoneNumber
import typingsSlinky.antdMobileRn.antdMobileRnStrings.top
import typingsSlinky.antdMobileRn.antdMobileRnStrings.username
import typingsSlinky.antdMobileRn.antdMobileRnStrings.words
import typingsSlinky.antdMobileRn.antdMobileRnStrings.yes
import typingsSlinky.antdMobileRn.antdMobileRnStrings.yesExcludeDescendants
import typingsSlinky.antdMobileRn.inputItemPropsTypeMod.InputItemPropsType
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.anon.Start
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.ColorValue
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
import typingsSlinky.reactNative.mod.TextInputTextInputEventData
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.antdMobileRn.inputItemIndexNativeMod.TextInputProps because var conflicts: defaultValue, editable, maxLength, placeholder, value. Inlined showSoftInputOnFocus, onResponderTerminationRequest, shouldRasterizeIOS, renderToHardwareTextureAndroid, onTouchStart, scrollEnabled, selectionColor, collapsable, keyboardAppearance, inlineImagePadding, onSubmitEditing, spellCheck, accessibilityLiveRegion, onResponderEnd, autoCompleteType, selection, accessibilityElementsHidden, caretHidden, onMagicTap, autoCorrect, importantForAutofill, accessibilityActions, selectTextOnFocus, nativeID, autoCapitalize, enablesReturnKeyAutomatically, selectionState, onResponderMove, onTextInput, contextMenuHidden, blurOnSubmit, accessible, dataDetectorTypes, allowFontScaling, onLayout, secureTextEntry, passwordRules, accessibilityHint, importantForAccessibility, inlineImageLeft, style, accessibilityViewIsModal, hasTVPreferredFocus, rejectResponderTermination, tvParallaxMagnification, textContentType, pointerEvents, onMoveShouldSetResponder, hitSlop, numberOfLines, autoFocus, onAccessibilityAction, tvParallaxShiftDistanceX, onResponderReject, tvParallaxProperties, disableFullscreenUI, isTVSelectable, underlineColorAndroid, onResponderRelease, returnKeyLabel, onTouchCancel, onAccessibilityEscape, onContentSizeChange, onTouchMove, onTouchEndCapture, focusable, tvParallaxTiltAngle, multiline, onSelectionChange, returnKeyType, testID, accessibilityTraits, clearButtonMode, textBreakStrategy, accessibilityRole, onAccessibilityTap, onResponderGrant, removeClippedSubviews, onTouchEnd, tvParallaxShiftDistanceY, onChangeText, inputAccessoryViewID, keyboardType, needsOffscreenAlphaCompositing, onStartShouldSetResponderCapture, onEndEditing, accessibilityIgnoresInvertColors, onMoveShouldSetResponderCapture, maxFontSizeMultiplier, onScroll, accessibilityLabel, placeholderTextColor, accessibilityComponentType, clearTextOnFocus, accessibilityState, accessibilityValue, onStartShouldSetResponder, textAlignVertical, onResponderTerminate, onResponderStart, onKeyPress */ @js.native
trait InputItemProps extends InputItemPropsType {
  
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.native
  
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.native
  
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.native
  
  var accessibilityHint: js.UndefOr[String] = js.native
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.native
  
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.native
  
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.native
  
  var accessibilityState: js.UndefOr[AccessibilityState] = js.native
  
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
  
  var caretHidden: js.UndefOr[Boolean] = js.native
  
  var clearButtonMode: js.UndefOr[never | `while-editing` | `unless-editing` | always] = js.native
  
  var clearTextOnFocus: js.UndefOr[Boolean] = js.native
  
  var collapsable: js.UndefOr[Boolean] = js.native
  
  var contextMenuHidden: js.UndefOr[Boolean] = js.native
  
  var dataDetectorTypes: js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]] = js.native
  
  var disableFullscreenUI: js.UndefOr[Boolean] = js.native
  
  var enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.native
  
  var focusable: js.UndefOr[Boolean] = js.native
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.native
  
  var hitSlop: js.UndefOr[Insets] = js.native
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
  
  var importantForAutofill: js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants] = js.native
  
  var inlineImageLeft: js.UndefOr[String] = js.native
  
  var inlineImagePadding: js.UndefOr[Double] = js.native
  
  var inputAccessoryViewID: js.UndefOr[String] = js.native
  
  var isTVSelectable: js.UndefOr[Boolean] = js.native
  
  var keyboardAppearance: js.UndefOr[typingsSlinky.antdMobileRn.antdMobileRnStrings.default | light | dark] = js.native
  
  var keyboardType: js.UndefOr[KeyboardTypeOptions] = js.native
  
  var last: js.UndefOr[Boolean] = js.native
  
  var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.native
  
  var multiline: js.UndefOr[Boolean] = js.native
  
  var nativeID: js.UndefOr[String] = js.native
  
  var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.native
  
  var numberOfLines: js.UndefOr[Double] = js.native
  
  var onAccessibilityAction: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]] = js.native
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.native
  
  var onContentSizeChange: js.UndefOr[
    js.Function1[SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData], Unit]
  ] = js.native
  
  var onEndEditing: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputEndEditingEventData], Unit]] = js.native
  
  var onErrorClick: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onExtraClick: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
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
  
  var onTextInput: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputTextInputEventData], Unit]] = js.native
  
  var onTouchCancel: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onTouchEnd: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onTouchEndCapture: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onTouchMove: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var onTouchStart: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]] = js.native
  
  var passwordRules: js.UndefOr[String | Null] = js.native
  
  var placeholderTextColor: js.UndefOr[ColorValue] = js.native
  
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.native
  
  var rejectResponderTermination: js.UndefOr[Boolean | Null] = js.native
  
  var removeClippedSubviews: js.UndefOr[Boolean] = js.native
  
  var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.native
  
  var returnKeyLabel: js.UndefOr[String] = js.native
  
  var returnKeyType: js.UndefOr[ReturnKeyTypeOptions] = js.native
  
  var scrollEnabled: js.UndefOr[Boolean] = js.native
  
  var secureTextEntry: js.UndefOr[Boolean] = js.native
  
  var selectTextOnFocus: js.UndefOr[Boolean] = js.native
  
  var selection: js.UndefOr[Start] = js.native
  
  var selectionColor: js.UndefOr[ColorValue] = js.native
  
  var selectionState: js.UndefOr[DocumentSelectionState] = js.native
  
  var shouldRasterizeIOS: js.UndefOr[Boolean] = js.native
  
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
  
  var underlineColorAndroid: js.UndefOr[ColorValue] = js.native
}
object InputItemProps {
  
  @scala.inline
  def apply(): InputItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputItemProps]
  }
  
  @scala.inline
  implicit class InputItemPropsOps[Self <: InputItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = this.set("accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = this.set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityActions: Self = this.set("accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = this.set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityComponentType: Self = this.set("accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: Boolean): Self = this.set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityElementsHidden: Self = this.set("accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: String): Self = this.set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityHint: Self = this.set("accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: Boolean): Self = this.set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityIgnoresInvertColors: Self = this.set("accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: none | polite | assertive): Self = this.set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLiveRegion: Self = this.set("accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: AccessibilityRole): Self = this.set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityRole: Self = this.set("accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: AccessibilityState): Self = this.set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityState: Self = this.set("accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = this.set("accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = this.set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityTraits: Self = this.set("accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityValue(value: AccessibilityValue): Self = this.set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityValue: Self = this.set("accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: Boolean): Self = this.set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityViewIsModal: Self = this.set("accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: Boolean): Self = this.set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFontScaling: Self = this.set("allowFontScaling", js.undefined)
    
    @scala.inline
    def setAutoCapitalize(value: none | sentences | words | characters): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoCompleteType(
      value: `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
    ): Self = this.set("autoCompleteType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCompleteType: Self = this.set("autoCompleteType", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: Boolean): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setBlurOnSubmit(value: Boolean): Self = this.set("blurOnSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurOnSubmit: Self = this.set("blurOnSubmit", js.undefined)
    
    @scala.inline
    def setCaretHidden(value: Boolean): Self = this.set("caretHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaretHidden: Self = this.set("caretHidden", js.undefined)
    
    @scala.inline
    def setClearButtonMode(value: never | `while-editing` | `unless-editing` | always): Self = this.set("clearButtonMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearButtonMode: Self = this.set("clearButtonMode", js.undefined)
    
    @scala.inline
    def setClearTextOnFocus(value: Boolean): Self = this.set("clearTextOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearTextOnFocus: Self = this.set("clearTextOnFocus", js.undefined)
    
    @scala.inline
    def setCollapsable(value: Boolean): Self = this.set("collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsable: Self = this.set("collapsable", js.undefined)
    
    @scala.inline
    def setContextMenuHidden(value: Boolean): Self = this.set("contextMenuHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenuHidden: Self = this.set("contextMenuHidden", js.undefined)
    
    @scala.inline
    def setDataDetectorTypesVarargs(value: DataDetectorTypes*): Self = this.set("dataDetectorTypes", js.Array(value :_*))
    
    @scala.inline
    def setDataDetectorTypes(value: DataDetectorTypes | js.Array[DataDetectorTypes]): Self = this.set("dataDetectorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataDetectorTypes: Self = this.set("dataDetectorTypes", js.undefined)
    
    @scala.inline
    def setDisableFullscreenUI(value: Boolean): Self = this.set("disableFullscreenUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFullscreenUI: Self = this.set("disableFullscreenUI", js.undefined)
    
    @scala.inline
    def setEnablesReturnKeyAutomatically(value: Boolean): Self = this.set("enablesReturnKeyAutomatically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablesReturnKeyAutomatically: Self = this.set("enablesReturnKeyAutomatically", js.undefined)
    
    @scala.inline
    def setFocusable(value: Boolean): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: Boolean): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHitSlop(value: Insets): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    
    @scala.inline
    def setImportantForAutofill(value: auto | no | noExcludeDescendants | yes | yesExcludeDescendants): Self = this.set("importantForAutofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportantForAutofill: Self = this.set("importantForAutofill", js.undefined)
    
    @scala.inline
    def setInlineImageLeft(value: String): Self = this.set("inlineImageLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineImageLeft: Self = this.set("inlineImageLeft", js.undefined)
    
    @scala.inline
    def setInlineImagePadding(value: Double): Self = this.set("inlineImagePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineImagePadding: Self = this.set("inlineImagePadding", js.undefined)
    
    @scala.inline
    def setInputAccessoryViewID(value: String): Self = this.set("inputAccessoryViewID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputAccessoryViewID: Self = this.set("inputAccessoryViewID", js.undefined)
    
    @scala.inline
    def setIsTVSelectable(value: Boolean): Self = this.set("isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTVSelectable: Self = this.set("isTVSelectable", js.undefined)
    
    @scala.inline
    def setKeyboardAppearance(value: typingsSlinky.antdMobileRn.antdMobileRnStrings.default | light | dark): Self = this.set("keyboardAppearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardAppearance: Self = this.set("keyboardAppearance", js.undefined)
    
    @scala.inline
    def setKeyboardType(value: KeyboardTypeOptions): Self = this.set("keyboardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardType: Self = this.set("keyboardType", js.undefined)
    
    @scala.inline
    def setLast(value: Boolean): Self = this.set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    
    @scala.inline
    def setMaxFontSizeMultiplier(value: Double): Self = this.set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFontSizeMultiplier: Self = this.set("maxFontSizeMultiplier", js.undefined)
    
    @scala.inline
    def setMaxFontSizeMultiplierNull: Self = this.set("maxFontSizeMultiplier", null)
    
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    
    @scala.inline
    def setNativeID(value: String): Self = this.set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeID: Self = this.set("nativeID", js.undefined)
    
    @scala.inline
    def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = this.set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedsOffscreenAlphaCompositing: Self = this.set("needsOffscreenAlphaCompositing", js.undefined)
    
    @scala.inline
    def setNumberOfLines(value: Double): Self = this.set("numberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfLines: Self = this.set("numberOfLines", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): Self = this.set("onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAccessibilityAction: Self = this.set("onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: () => Unit): Self = this.set("onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAccessibilityEscape: Self = this.set("onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: () => Unit): Self = this.set("onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAccessibilityTap: Self = this.set("onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnChangeText(value: /* text */ String => Unit): Self = this.set("onChangeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChangeText: Self = this.set("onChangeText", js.undefined)
    
    @scala.inline
    def setOnContentSizeChange(value: SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData] => Unit): Self = this.set("onContentSizeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentSizeChange: Self = this.set("onContentSizeChange", js.undefined)
    
    @scala.inline
    def setOnEndEditing(value: SyntheticEvent[NodeHandle, TextInputEndEditingEventData] => Unit): Self = this.set("onEndEditing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEndEditing: Self = this.set("onEndEditing", js.undefined)
    
    @scala.inline
    def setOnErrorClick(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onErrorClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnErrorClick: Self = this.set("onErrorClick", js.undefined)
    
    @scala.inline
    def setOnExtraClick(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onExtraClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExtraClick: Self = this.set("onExtraClick", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: SyntheticEvent[NodeHandle, TextInputKeyPressEventData] => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = this.set("onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: () => Unit): Self = this.set("onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMagicTap: Self = this.set("onMagicTap", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = this.set("onMoveShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMoveShouldSetResponder: Self = this.set("onMoveShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = this.set("onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMoveShouldSetResponderCapture: Self = this.set("onMoveShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onResponderEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderEnd: Self = this.set("onResponderEnd", js.undefined)
    
    @scala.inline
    def setOnResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onResponderGrant", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderGrant: Self = this.set("onResponderGrant", js.undefined)
    
    @scala.inline
    def setOnResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onResponderMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderMove: Self = this.set("onResponderMove", js.undefined)
    
    @scala.inline
    def setOnResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onResponderReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderReject: Self = this.set("onResponderReject", js.undefined)
    
    @scala.inline
    def setOnResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onResponderRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderRelease: Self = this.set("onResponderRelease", js.undefined)
    
    @scala.inline
    def setOnResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onResponderStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderStart: Self = this.set("onResponderStart", js.undefined)
    
    @scala.inline
    def setOnResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onResponderTerminate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderTerminate: Self = this.set("onResponderTerminate", js.undefined)
    
    @scala.inline
    def setOnResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = this.set("onResponderTerminationRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponderTerminationRequest: Self = this.set("onResponderTerminationRequest", js.undefined)
    
    @scala.inline
    def setOnScroll(value: SyntheticEvent[NodeHandle, TextInputScrollEventData] => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnSelectionChange(value: SyntheticEvent[NodeHandle, TextInputSelectionChangeEventData] => Unit): Self = this.set("onSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = this.set("onStartShouldSetResponder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStartShouldSetResponder: Self = this.set("onStartShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = this.set("onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStartShouldSetResponderCapture: Self = this.set("onStartShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnSubmitEditing(value: SyntheticEvent[NodeHandle, TextInputSubmitEditingEventData] => Unit): Self = this.set("onSubmitEditing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSubmitEditing: Self = this.set("onSubmitEditing", js.undefined)
    
    @scala.inline
    def setOnTextInput(value: SyntheticEvent[NodeHandle, TextInputTextInputEventData] => Unit): Self = this.set("onTextInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTextInput: Self = this.set("onTextInput", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onTouchCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onTouchEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEndCapture: Self = this.set("onTouchEndCapture", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setPasswordRules(value: String): Self = this.set("passwordRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRules: Self = this.set("passwordRules", js.undefined)
    
    @scala.inline
    def setPasswordRulesNull: Self = this.set("passwordRules", null)
    
    @scala.inline
    def setPlaceholderTextColor(value: ColorValue): Self = this.set("placeholderTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderTextColor: Self = this.set("placeholderTextColor", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    
    @scala.inline
    def setRejectResponderTermination(value: Boolean): Self = this.set("rejectResponderTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectResponderTermination: Self = this.set("rejectResponderTermination", js.undefined)
    
    @scala.inline
    def setRejectResponderTerminationNull: Self = this.set("rejectResponderTermination", null)
    
    @scala.inline
    def setRemoveClippedSubviews(value: Boolean): Self = this.set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveClippedSubviews: Self = this.set("removeClippedSubviews", js.undefined)
    
    @scala.inline
    def setRenderToHardwareTextureAndroid(value: Boolean): Self = this.set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderToHardwareTextureAndroid: Self = this.set("renderToHardwareTextureAndroid", js.undefined)
    
    @scala.inline
    def setReturnKeyLabel(value: String): Self = this.set("returnKeyLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnKeyLabel: Self = this.set("returnKeyLabel", js.undefined)
    
    @scala.inline
    def setReturnKeyType(value: ReturnKeyTypeOptions): Self = this.set("returnKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnKeyType: Self = this.set("returnKeyType", js.undefined)
    
    @scala.inline
    def setScrollEnabled(value: Boolean): Self = this.set("scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollEnabled: Self = this.set("scrollEnabled", js.undefined)
    
    @scala.inline
    def setSecureTextEntry(value: Boolean): Self = this.set("secureTextEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureTextEntry: Self = this.set("secureTextEntry", js.undefined)
    
    @scala.inline
    def setSelectTextOnFocus(value: Boolean): Self = this.set("selectTextOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectTextOnFocus: Self = this.set("selectTextOnFocus", js.undefined)
    
    @scala.inline
    def setSelection(value: Start): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    
    @scala.inline
    def setSelectionColor(value: ColorValue): Self = this.set("selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionColor: Self = this.set("selectionColor", js.undefined)
    
    @scala.inline
    def setSelectionState(value: DocumentSelectionState): Self = this.set("selectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionState: Self = this.set("selectionState", js.undefined)
    
    @scala.inline
    def setShouldRasterizeIOS(value: Boolean): Self = this.set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldRasterizeIOS: Self = this.set("shouldRasterizeIOS", js.undefined)
    
    @scala.inline
    def setShowSoftInputOnFocus(value: Boolean): Self = this.set("showSoftInputOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSoftInputOnFocus: Self = this.set("showSoftInputOnFocus", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: Boolean): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[TextStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    
    @scala.inline
    def setTextAlignVertical(value: auto | top | bottom | center): Self = this.set("textAlignVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlignVertical: Self = this.set("textAlignVertical", js.undefined)
    
    @scala.inline
    def setTextBreakStrategy(value: simple | highQuality | balanced): Self = this.set("textBreakStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBreakStrategy: Self = this.set("textBreakStrategy", js.undefined)
    
    @scala.inline
    def setTextContentType(
      value: none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
    ): Self = this.set("textContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextContentType: Self = this.set("textContentType", js.undefined)
    
    @scala.inline
    def setTvParallaxMagnification(value: Double): Self = this.set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxMagnification: Self = this.set("tvParallaxMagnification", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: TVParallaxProperties): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceX(value: Double): Self = this.set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxShiftDistanceX: Self = this.set("tvParallaxShiftDistanceX", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceY(value: Double): Self = this.set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxShiftDistanceY: Self = this.set("tvParallaxShiftDistanceY", js.undefined)
    
    @scala.inline
    def setTvParallaxTiltAngle(value: Double): Self = this.set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxTiltAngle: Self = this.set("tvParallaxTiltAngle", js.undefined)
    
    @scala.inline
    def setUnderlineColorAndroid(value: ColorValue): Self = this.set("underlineColorAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineColorAndroid: Self = this.set("underlineColorAndroid", js.undefined)
  }
}
