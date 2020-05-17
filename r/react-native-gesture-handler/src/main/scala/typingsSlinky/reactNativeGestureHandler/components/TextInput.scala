package typingsSlinky.reactNativeGestureHandler.components

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNative.anon.ReadonlyactionNamestring
import typingsSlinky.reactNative.anon.Start
import typingsSlinky.reactNative.mod.AccessibilityActionInfo
import typingsSlinky.reactNative.mod.AccessibilityRole
import typingsSlinky.reactNative.mod.AccessibilityState
import typingsSlinky.reactNative.mod.AccessibilityStates
import typingsSlinky.reactNative.mod.AccessibilityTrait
import typingsSlinky.reactNative.mod.AccessibilityValue
import typingsSlinky.reactNative.mod.DataDetectorTypes
import typingsSlinky.reactNative.mod.DocumentSelectionState
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
import typingsSlinky.reactNative.mod.TextInputFocusEventData
import typingsSlinky.reactNative.mod.TextInputKeyPressEventData
import typingsSlinky.reactNative.mod.TextInputProperties
import typingsSlinky.reactNative.mod.TextInputScrollEventData
import typingsSlinky.reactNative.mod.TextInputSelectionChangeEventData
import typingsSlinky.reactNative.mod.TextInputSubmitEditingEventData
import typingsSlinky.reactNative.mod.TextStyle
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
import typingsSlinky.reactNative.reactNativeStrings.characters
import typingsSlinky.reactNative.reactNativeStrings.countryName
import typingsSlinky.reactNative.reactNativeStrings.creditCardNumber
import typingsSlinky.reactNative.reactNativeStrings.dark
import typingsSlinky.reactNative.reactNativeStrings.default
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
import typingsSlinky.reactNative.reactNativeStrings.none
import typingsSlinky.reactNative.reactNativeStrings.off
import typingsSlinky.reactNative.reactNativeStrings.oneTimeCode
import typingsSlinky.reactNative.reactNativeStrings.organizationName
import typingsSlinky.reactNative.reactNativeStrings.password
import typingsSlinky.reactNative.reactNativeStrings.polite
import typingsSlinky.reactNative.reactNativeStrings.postalCode
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_checked
import typingsSlinky.reactNative.reactNativeStrings.radiobutton_unchecked
import typingsSlinky.reactNative.reactNativeStrings.sentences
import typingsSlinky.reactNative.reactNativeStrings.simple
import typingsSlinky.reactNative.reactNativeStrings.streetAddressLine1
import typingsSlinky.reactNative.reactNativeStrings.streetAddressLine2
import typingsSlinky.reactNative.reactNativeStrings.sublocality
import typingsSlinky.reactNative.reactNativeStrings.tel
import typingsSlinky.reactNative.reactNativeStrings.telephoneNumber
import typingsSlinky.reactNative.reactNativeStrings.top
import typingsSlinky.reactNative.reactNativeStrings.username
import typingsSlinky.reactNative.reactNativeStrings.words
import typingsSlinky.reactNative.reactNativeStrings.yes
import typingsSlinky.reactNative.reactNativeStrings.yesExcludeDescendants
import typingsSlinky.reactNativeGestureHandler.anon.Bottom
import typingsSlinky.reactNativeGestureHandler.anon.BottomHeight
import typingsSlinky.reactNativeGestureHandler.anon.Height
import typingsSlinky.reactNativeGestureHandler.anon.Left
import typingsSlinky.reactNativeGestureHandler.anon.Right
import typingsSlinky.reactNativeGestureHandler.mod.NativeViewGestureHandlerGestureEvent
import typingsSlinky.reactNativeGestureHandler.mod.NativeViewGestureHandlerProperties
import typingsSlinky.reactNativeGestureHandler.mod.NativeViewGestureHandlerStateChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TextInput {
  @JSImport("react-native-gesture-handler", "TextInput")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeGestureHandler.mod.TextInput] {
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
    def accessibilityStates(value: js.Array[AccessibilityStates]): this.type = set("accessibilityStates", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): this.type = set("accessibilityTraits", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityValue(value: AccessibilityValue): this.type = set("accessibilityValue", value.asInstanceOf[js.Any])
    @scala.inline
    def accessibilityViewIsModal(value: Boolean): this.type = set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    @scala.inline
    def accessible(value: Boolean): this.type = set("accessible", value.asInstanceOf[js.Any])
    @scala.inline
    def allowFontScaling(value: Boolean): this.type = set("allowFontScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def autoCapitalize(value: none | sentences | words | characters): this.type = set("autoCapitalize", value.asInstanceOf[js.Any])
    @scala.inline
    def autoCompleteType(
      value: `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
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
    def contextMenuHidden(value: Boolean): this.type = set("contextMenuHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def dataDetectorTypes(value: DataDetectorTypes | js.Array[DataDetectorTypes]): this.type = set("dataDetectorTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def disableFullscreenUI(value: Boolean): this.type = set("disableFullscreenUI", value.asInstanceOf[js.Any])
    @scala.inline
    def disallowInterruption(value: Boolean): this.type = set("disallowInterruption", value.asInstanceOf[js.Any])
    @scala.inline
    def editable(value: Boolean): this.type = set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def enablesReturnKeyAutomatically(value: Boolean): this.type = set("enablesReturnKeyAutomatically", value.asInstanceOf[js.Any])
    @scala.inline
    def hasTVPreferredFocus(value: Boolean): this.type = set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def hitSlop(value: Double | Bottom | Left | Right | Height | BottomHeight): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def importantForAccessibility(value: auto | yes | no | `no-hide-descendants`): this.type = set("importantForAccessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def importantForAutofill(value: auto | no | noExcludeDescendants | yes | yesExcludeDescendants): this.type = set("importantForAutofill", value.asInstanceOf[js.Any])
    @scala.inline
    def inlineImageLeft(value: String): this.type = set("inlineImageLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def inlineImagePadding(value: Double): this.type = set("inlineImagePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def inputAccessoryViewID(value: String): this.type = set("inputAccessoryViewID", value.asInstanceOf[js.Any])
    @scala.inline
    def isTVSelectable(value: Boolean): this.type = set("isTVSelectable", value.asInstanceOf[js.Any])
    @scala.inline
    def keyboardAppearance(value: default | light | dark): this.type = set("keyboardAppearance", value.asInstanceOf[js.Any])
    @scala.inline
    def keyboardType(value: KeyboardTypeOptions): this.type = set("keyboardType", value.asInstanceOf[js.Any])
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
    def onGestureEvent(value: /* event */ NativeViewGestureHandlerGestureEvent => Unit): this.type = set("onGestureEvent", js.Any.fromFunction1(value))
    @scala.inline
    def onHandlerStateChange(value: /* event */ NativeViewGestureHandlerStateChangeEvent => Unit): this.type = set("onHandlerStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyPress(value: SyntheticEvent[NodeHandle, TextInputKeyPressEventData] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def onLayout(value: /* event */ LayoutChangeEvent => Unit): this.type = set("onLayout", js.Any.fromFunction1(value))
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
    def placeholderTextColor(value: String): this.type = set("placeholderTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def pointerEvents(value: `box-none` | none | `box-only` | auto): this.type = set("pointerEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def rejectResponderTermination(value: Boolean): this.type = set("rejectResponderTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def rejectResponderTerminationNull: this.type = set("rejectResponderTermination", null)
    @scala.inline
    def removeClippedSubviews(value: Boolean): this.type = set("removeClippedSubviews", value.asInstanceOf[js.Any])
    @scala.inline
    def renderToHardwareTextureAndroid(value: Boolean): this.type = set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def returnKeyLabel(value: String): this.type = set("returnKeyLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def returnKeyType(value: ReturnKeyTypeOptions): this.type = set("returnKeyType", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollEnabled(value: Boolean): this.type = set("scrollEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def secureTextEntry(value: Boolean): this.type = set("secureTextEntry", value.asInstanceOf[js.Any])
    @scala.inline
    def selectTextOnFocus(value: Boolean): this.type = set("selectTextOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def selection(value: Start): this.type = set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def selectionColor(value: String): this.type = set("selectionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def selectionState(value: DocumentSelectionState): this.type = set("selectionState", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldActivateOnStart(value: Boolean): this.type = set("shouldActivateOnStart", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldCancelWhenOutside(value: Boolean): this.type = set("shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldRasterizeIOS(value: Boolean): this.type = set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    @scala.inline
    def showSoftInputOnFocus(value: Boolean): this.type = set("showSoftInputOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def simultaneousHandlersRefObject(value: ReactRef[_]): this.type = set("simultaneousHandlers", value.asInstanceOf[js.Any])
    @scala.inline
    def simultaneousHandlersFunction1(value: /* instance */ _ | Null => Unit): this.type = set("simultaneousHandlers", js.Any.fromFunction1(value))
    @scala.inline
    def simultaneousHandlers(value: Ref[_] | js.Array[Ref[_]]): this.type = set("simultaneousHandlers", value.asInstanceOf[js.Any])
    @scala.inline
    def simultaneousHandlersNull: this.type = set("simultaneousHandlers", null)
    @scala.inline
    def spellCheck(value: Boolean): this.type = set("spellCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: StyleProp[TextStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def textAlignVertical(value: auto | top | bottom | center): this.type = set("textAlignVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def textBreakStrategy(value: simple | highQuality | balanced): this.type = set("textBreakStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def textContentType(
      value: none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
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
    def underlineColorAndroid(value: String): this.type = set("underlineColorAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def waitForRefObject(value: ReactRef[_]): this.type = set("waitFor", value.asInstanceOf[js.Any])
    @scala.inline
    def waitForFunction1(value: /* instance */ _ | Null => Unit): this.type = set("waitFor", js.Any.fromFunction1(value))
    @scala.inline
    def waitFor(value: Ref[_] | js.Array[Ref[_]]): this.type = set("waitFor", value.asInstanceOf[js.Any])
    @scala.inline
    def waitForNull: this.type = set("waitFor", null)
  }
  
  def withProps(p: NativeViewGestureHandlerProperties with TextInputProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TextInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

