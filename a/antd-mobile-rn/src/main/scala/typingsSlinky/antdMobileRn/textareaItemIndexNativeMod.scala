package typingsSlinky.antdMobileRn

import slinky.core.SyntheticEvent
import typingsSlinky.antdMobileRn.anon.AutoHeight
import typingsSlinky.antdMobileRn.anon.NativeEventContentSize
import typingsSlinky.antdMobileRn.anon.NativeEventContentSizeHeightWidth
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
import typingsSlinky.antdMobileRn.textareaItemPropsTypeMod.TextAreaItemPropsType
import typingsSlinky.antdMobileRn.textareaItemStyleIndexNativeMod.ITextareaItemStyle
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.anon.Layout
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textareaItemIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/textarea-item/index.native", JSImport.Default)
  @js.native
  class default protected () extends TextAreaItem {
    def this(props: TextareaItemNativeProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/textarea-item/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/textarea-item/index.native", "default.defaultProps")
    @js.native
    def defaultProps: AutoHeight = js.native
    @scala.inline
    def defaultProps_=(x: AutoHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TextAreaItem
    extends Component[TextareaItemNativeProps, js.Any, js.Any] {
    
    def onChange(event: NativeEventContentSize): Unit = js.native
    
    def onContentSizeChange(event: NativeEventContentSizeHeightWidth): Unit = js.native
  }
  
  /* Inlined utility-types.utility-types.Omit<react-native.react-native.TextInputProperties, 'onChange' | 'onFocus' | 'onBlur'> */
  @js.native
  trait TextInputProps extends StObject {
    
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
    
    var defaultValue: js.UndefOr[String] = js.native
    
    var disableFullscreenUI: js.UndefOr[Boolean] = js.native
    
    var editable: js.UndefOr[Boolean] = js.native
    
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
    
    var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
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
    
    var onKeyPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputKeyPressEventData], Unit]] = js.native
    
    var onLayout: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]] = js.native
    
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
    
    var placeholder: js.UndefOr[String] = js.native
    
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
    
    var value: js.UndefOr[String] = js.native
  }
  object TextInputProps {
    
    @scala.inline
    def apply(): TextInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextInputProps]
    }
    
    @scala.inline
    implicit class TextInputPropsMutableBuilder[Self <: TextInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      @scala.inline
      def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
      
      @scala.inline
      def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
      
      @scala.inline
      def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      @scala.inline
      def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      @scala.inline
      def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      @scala.inline
      def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      @scala.inline
      def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      @scala.inline
      def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      @scala.inline
      def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      @scala.inline
      def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
      
      @scala.inline
      def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
      
      @scala.inline
      def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      @scala.inline
      def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      @scala.inline
      def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      @scala.inline
      def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: none | sentences | words | characters): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoCompleteType(
        value: `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
      ): Self = StObject.set(x, "autoCompleteType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteTypeUndefined: Self = StObject.set(x, "autoCompleteType", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: Boolean): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBlurOnSubmit(value: Boolean): Self = StObject.set(x, "blurOnSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurOnSubmitUndefined: Self = StObject.set(x, "blurOnSubmit", js.undefined)
      
      @scala.inline
      def setCaretHidden(value: Boolean): Self = StObject.set(x, "caretHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaretHiddenUndefined: Self = StObject.set(x, "caretHidden", js.undefined)
      
      @scala.inline
      def setClearButtonMode(value: never | `while-editing` | `unless-editing` | always): Self = StObject.set(x, "clearButtonMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearButtonModeUndefined: Self = StObject.set(x, "clearButtonMode", js.undefined)
      
      @scala.inline
      def setClearTextOnFocus(value: Boolean): Self = StObject.set(x, "clearTextOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearTextOnFocusUndefined: Self = StObject.set(x, "clearTextOnFocus", js.undefined)
      
      @scala.inline
      def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      @scala.inline
      def setContextMenuHidden(value: Boolean): Self = StObject.set(x, "contextMenuHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuHiddenUndefined: Self = StObject.set(x, "contextMenuHidden", js.undefined)
      
      @scala.inline
      def setDataDetectorTypes(value: DataDetectorTypes | js.Array[DataDetectorTypes]): Self = StObject.set(x, "dataDetectorTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataDetectorTypesUndefined: Self = StObject.set(x, "dataDetectorTypes", js.undefined)
      
      @scala.inline
      def setDataDetectorTypesVarargs(value: DataDetectorTypes*): Self = StObject.set(x, "dataDetectorTypes", js.Array(value :_*))
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisableFullscreenUI(value: Boolean): Self = StObject.set(x, "disableFullscreenUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFullscreenUIUndefined: Self = StObject.set(x, "disableFullscreenUI", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setEnablesReturnKeyAutomatically(value: Boolean): Self = StObject.set(x, "enablesReturnKeyAutomatically", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablesReturnKeyAutomaticallyUndefined: Self = StObject.set(x, "enablesReturnKeyAutomatically", js.undefined)
      
      @scala.inline
      def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      @scala.inline
      def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      @scala.inline
      def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      @scala.inline
      def setImportantForAutofill(value: auto | no | noExcludeDescendants | yes | yesExcludeDescendants): Self = StObject.set(x, "importantForAutofill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportantForAutofillUndefined: Self = StObject.set(x, "importantForAutofill", js.undefined)
      
      @scala.inline
      def setInlineImageLeft(value: String): Self = StObject.set(x, "inlineImageLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineImageLeftUndefined: Self = StObject.set(x, "inlineImageLeft", js.undefined)
      
      @scala.inline
      def setInlineImagePadding(value: Double): Self = StObject.set(x, "inlineImagePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineImagePaddingUndefined: Self = StObject.set(x, "inlineImagePadding", js.undefined)
      
      @scala.inline
      def setInputAccessoryViewID(value: String): Self = StObject.set(x, "inputAccessoryViewID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputAccessoryViewIDUndefined: Self = StObject.set(x, "inputAccessoryViewID", js.undefined)
      
      @scala.inline
      def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
      
      @scala.inline
      def setKeyboardAppearance(value: typingsSlinky.antdMobileRn.antdMobileRnStrings.default | light | dark): Self = StObject.set(x, "keyboardAppearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardAppearanceUndefined: Self = StObject.set(x, "keyboardAppearance", js.undefined)
      
      @scala.inline
      def setKeyboardType(value: KeyboardTypeOptions): Self = StObject.set(x, "keyboardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardTypeUndefined: Self = StObject.set(x, "keyboardType", js.undefined)
      
      @scala.inline
      def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
      
      @scala.inline
      def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      @scala.inline
      def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
      
      @scala.inline
      def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
      
      @scala.inline
      def setOnAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      @scala.inline
      def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      @scala.inline
      def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      @scala.inline
      def setOnChangeText(value: /* text */ String => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
      
      @scala.inline
      def setOnContentSizeChange(value: SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData] => Unit): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
      
      @scala.inline
      def setOnEndEditing(value: SyntheticEvent[NodeHandle, TextInputEndEditingEventData] => Unit): Self = StObject.set(x, "onEndEditing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndEditingUndefined: Self = StObject.set(x, "onEndEditing", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: SyntheticEvent[NodeHandle, TextInputKeyPressEventData] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      @scala.inline
      def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
      
      @scala.inline
      def setOnResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
      
      @scala.inline
      def setOnResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
      
      @scala.inline
      def setOnResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
      
      @scala.inline
      def setOnResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      @scala.inline
      def setOnResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
      
      @scala.inline
      def setOnResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
      
      @scala.inline
      def setOnResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
      
      @scala.inline
      def setOnScroll(value: SyntheticEvent[NodeHandle, TextInputScrollEventData] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSelectionChange(value: SyntheticEvent[NodeHandle, TextInputSelectionChangeEventData] => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnSubmitEditing(value: SyntheticEvent[NodeHandle, TextInputSubmitEditingEventData] => Unit): Self = StObject.set(x, "onSubmitEditing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitEditingUndefined: Self = StObject.set(x, "onSubmitEditing", js.undefined)
      
      @scala.inline
      def setOnTextInput(value: SyntheticEvent[NodeHandle, TextInputTextInputEventData] => Unit): Self = StObject.set(x, "onTextInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTextInputUndefined: Self = StObject.set(x, "onTextInput", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setPasswordRules(value: String): Self = StObject.set(x, "passwordRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordRulesNull: Self = StObject.set(x, "passwordRules", null)
      
      @scala.inline
      def setPasswordRulesUndefined: Self = StObject.set(x, "passwordRules", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderTextColor(value: ColorValue): Self = StObject.set(x, "placeholderTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderTextColorUndefined: Self = StObject.set(x, "placeholderTextColor", js.undefined)
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setRejectResponderTermination(value: Boolean): Self = StObject.set(x, "rejectResponderTermination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectResponderTerminationNull: Self = StObject.set(x, "rejectResponderTermination", null)
      
      @scala.inline
      def setRejectResponderTerminationUndefined: Self = StObject.set(x, "rejectResponderTermination", js.undefined)
      
      @scala.inline
      def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      @scala.inline
      def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
      
      @scala.inline
      def setReturnKeyLabel(value: String): Self = StObject.set(x, "returnKeyLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnKeyLabelUndefined: Self = StObject.set(x, "returnKeyLabel", js.undefined)
      
      @scala.inline
      def setReturnKeyType(value: ReturnKeyTypeOptions): Self = StObject.set(x, "returnKeyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnKeyTypeUndefined: Self = StObject.set(x, "returnKeyType", js.undefined)
      
      @scala.inline
      def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      @scala.inline
      def setSecureTextEntry(value: Boolean): Self = StObject.set(x, "secureTextEntry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureTextEntryUndefined: Self = StObject.set(x, "secureTextEntry", js.undefined)
      
      @scala.inline
      def setSelectTextOnFocus(value: Boolean): Self = StObject.set(x, "selectTextOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectTextOnFocusUndefined: Self = StObject.set(x, "selectTextOnFocus", js.undefined)
      
      @scala.inline
      def setSelection(value: Start): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionColor(value: ColorValue): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
      
      @scala.inline
      def setSelectionState(value: DocumentSelectionState): Self = StObject.set(x, "selectionState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionStateUndefined: Self = StObject.set(x, "selectionState", js.undefined)
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      @scala.inline
      def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
      
      @scala.inline
      def setShowSoftInputOnFocus(value: Boolean): Self = StObject.set(x, "showSoftInputOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSoftInputOnFocusUndefined: Self = StObject.set(x, "showSoftInputOnFocus", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      @scala.inline
      def setTextAlignVertical(value: auto | top | bottom | center): Self = StObject.set(x, "textAlignVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignVerticalUndefined: Self = StObject.set(x, "textAlignVertical", js.undefined)
      
      @scala.inline
      def setTextBreakStrategy(value: simple | highQuality | balanced): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
      
      @scala.inline
      def setTextContentType(
        value: none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
      ): Self = StObject.set(x, "textContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextContentTypeUndefined: Self = StObject.set(x, "textContentType", js.undefined)
      
      @scala.inline
      def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
      
      @scala.inline
      def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
      
      @scala.inline
      def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
      
      @scala.inline
      def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
      
      @scala.inline
      def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
      
      @scala.inline
      def setUnderlineColorAndroid(value: ColorValue): Self = StObject.set(x, "underlineColorAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineColorAndroidUndefined: Self = StObject.set(x, "underlineColorAndroid", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.antdMobileRn.textareaItemIndexNativeMod.TextInputProps because var conflicts: defaultValue, editable, maxLength, placeholder, value. Inlined showSoftInputOnFocus, onResponderTerminationRequest, shouldRasterizeIOS, renderToHardwareTextureAndroid, onTouchStart, scrollEnabled, selectionColor, collapsable, keyboardAppearance, inlineImagePadding, onSubmitEditing, spellCheck, accessibilityLiveRegion, onResponderEnd, autoCompleteType, selection, accessibilityElementsHidden, caretHidden, onMagicTap, autoCorrect, importantForAutofill, accessibilityActions, selectTextOnFocus, nativeID, autoCapitalize, enablesReturnKeyAutomatically, selectionState, onResponderMove, onTextInput, contextMenuHidden, blurOnSubmit, accessible, dataDetectorTypes, allowFontScaling, onLayout, secureTextEntry, passwordRules, accessibilityHint, importantForAccessibility, inlineImageLeft, style, accessibilityViewIsModal, hasTVPreferredFocus, rejectResponderTermination, tvParallaxMagnification, textContentType, pointerEvents, onMoveShouldSetResponder, hitSlop, numberOfLines, autoFocus, onAccessibilityAction, tvParallaxShiftDistanceX, onResponderReject, tvParallaxProperties, disableFullscreenUI, isTVSelectable, underlineColorAndroid, onResponderRelease, returnKeyLabel, onTouchCancel, onAccessibilityEscape, onContentSizeChange, onTouchMove, onTouchEndCapture, focusable, tvParallaxTiltAngle, multiline, onSelectionChange, returnKeyType, testID, accessibilityTraits, clearButtonMode, textBreakStrategy, accessibilityRole, onAccessibilityTap, onResponderGrant, removeClippedSubviews, onTouchEnd, tvParallaxShiftDistanceY, onChangeText, inputAccessoryViewID, keyboardType, needsOffscreenAlphaCompositing, onStartShouldSetResponderCapture, onEndEditing, accessibilityIgnoresInvertColors, onMoveShouldSetResponderCapture, maxFontSizeMultiplier, onScroll, accessibilityLabel, placeholderTextColor, accessibilityComponentType, clearTextOnFocus, accessibilityState, accessibilityValue, onStartShouldSetResponder, textAlignVertical, onResponderTerminate, onResponderStart, onKeyPress */ @js.native
  trait TextareaItemNativeProps extends TextAreaItemPropsType {
    
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
        js.Function1[
          (/* e */ js.Any) | (SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData]), 
          Unit
        ]
      ] = js.native
    
    var onEndEditing: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputEndEditingEventData], Unit]] = js.native
    
    var onKeyPress: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputKeyPressEventData], Unit]] = js.native
    
    var onLayout: js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]] = js.native
    
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
    
    var styles: js.UndefOr[ITextareaItemStyle] = js.native
    
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
  object TextareaItemNativeProps {
    
    @scala.inline
    def apply(): TextareaItemNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextareaItemNativeProps]
    }
    
    @scala.inline
    implicit class TextareaItemNativePropsMutableBuilder[Self <: TextareaItemNativeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      @scala.inline
      def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
      
      @scala.inline
      def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
      
      @scala.inline
      def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      @scala.inline
      def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      @scala.inline
      def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      @scala.inline
      def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      @scala.inline
      def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      @scala.inline
      def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      @scala.inline
      def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      @scala.inline
      def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
      
      @scala.inline
      def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
      
      @scala.inline
      def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      @scala.inline
      def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      @scala.inline
      def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      @scala.inline
      def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: none | sentences | words | characters): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoCompleteType(
        value: `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
      ): Self = StObject.set(x, "autoCompleteType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteTypeUndefined: Self = StObject.set(x, "autoCompleteType", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: Boolean): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBlurOnSubmit(value: Boolean): Self = StObject.set(x, "blurOnSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurOnSubmitUndefined: Self = StObject.set(x, "blurOnSubmit", js.undefined)
      
      @scala.inline
      def setCaretHidden(value: Boolean): Self = StObject.set(x, "caretHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaretHiddenUndefined: Self = StObject.set(x, "caretHidden", js.undefined)
      
      @scala.inline
      def setClearButtonMode(value: never | `while-editing` | `unless-editing` | always): Self = StObject.set(x, "clearButtonMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearButtonModeUndefined: Self = StObject.set(x, "clearButtonMode", js.undefined)
      
      @scala.inline
      def setClearTextOnFocus(value: Boolean): Self = StObject.set(x, "clearTextOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearTextOnFocusUndefined: Self = StObject.set(x, "clearTextOnFocus", js.undefined)
      
      @scala.inline
      def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      @scala.inline
      def setContextMenuHidden(value: Boolean): Self = StObject.set(x, "contextMenuHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuHiddenUndefined: Self = StObject.set(x, "contextMenuHidden", js.undefined)
      
      @scala.inline
      def setDataDetectorTypes(value: DataDetectorTypes | js.Array[DataDetectorTypes]): Self = StObject.set(x, "dataDetectorTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataDetectorTypesUndefined: Self = StObject.set(x, "dataDetectorTypes", js.undefined)
      
      @scala.inline
      def setDataDetectorTypesVarargs(value: DataDetectorTypes*): Self = StObject.set(x, "dataDetectorTypes", js.Array(value :_*))
      
      @scala.inline
      def setDisableFullscreenUI(value: Boolean): Self = StObject.set(x, "disableFullscreenUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFullscreenUIUndefined: Self = StObject.set(x, "disableFullscreenUI", js.undefined)
      
      @scala.inline
      def setEnablesReturnKeyAutomatically(value: Boolean): Self = StObject.set(x, "enablesReturnKeyAutomatically", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablesReturnKeyAutomaticallyUndefined: Self = StObject.set(x, "enablesReturnKeyAutomatically", js.undefined)
      
      @scala.inline
      def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      @scala.inline
      def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      @scala.inline
      def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      @scala.inline
      def setImportantForAutofill(value: auto | no | noExcludeDescendants | yes | yesExcludeDescendants): Self = StObject.set(x, "importantForAutofill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportantForAutofillUndefined: Self = StObject.set(x, "importantForAutofill", js.undefined)
      
      @scala.inline
      def setInlineImageLeft(value: String): Self = StObject.set(x, "inlineImageLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineImageLeftUndefined: Self = StObject.set(x, "inlineImageLeft", js.undefined)
      
      @scala.inline
      def setInlineImagePadding(value: Double): Self = StObject.set(x, "inlineImagePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineImagePaddingUndefined: Self = StObject.set(x, "inlineImagePadding", js.undefined)
      
      @scala.inline
      def setInputAccessoryViewID(value: String): Self = StObject.set(x, "inputAccessoryViewID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputAccessoryViewIDUndefined: Self = StObject.set(x, "inputAccessoryViewID", js.undefined)
      
      @scala.inline
      def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
      
      @scala.inline
      def setKeyboardAppearance(value: typingsSlinky.antdMobileRn.antdMobileRnStrings.default | light | dark): Self = StObject.set(x, "keyboardAppearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardAppearanceUndefined: Self = StObject.set(x, "keyboardAppearance", js.undefined)
      
      @scala.inline
      def setKeyboardType(value: KeyboardTypeOptions): Self = StObject.set(x, "keyboardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardTypeUndefined: Self = StObject.set(x, "keyboardType", js.undefined)
      
      @scala.inline
      def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      @scala.inline
      def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
      
      @scala.inline
      def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
      
      @scala.inline
      def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      @scala.inline
      def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
      
      @scala.inline
      def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
      
      @scala.inline
      def setOnAccessibilityAction(value: SyntheticEvent[NodeHandle, ReadonlyactionNamestring] => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      @scala.inline
      def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      @scala.inline
      def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      @scala.inline
      def setOnChangeText(value: /* text */ String => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
      
      @scala.inline
      def setOnContentSizeChange(
        value: (/* e */ js.Any) | (SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData]) => Unit
      ): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
      
      @scala.inline
      def setOnEndEditing(value: SyntheticEvent[NodeHandle, TextInputEndEditingEventData] => Unit): Self = StObject.set(x, "onEndEditing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndEditingUndefined: Self = StObject.set(x, "onEndEditing", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: SyntheticEvent[NodeHandle, TextInputKeyPressEventData] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnLayout(value: SyntheticEvent[NodeHandle, Layout] => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      @scala.inline
      def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnResponderEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
      
      @scala.inline
      def setOnResponderGrant(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
      
      @scala.inline
      def setOnResponderMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
      
      @scala.inline
      def setOnResponderReject(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
      
      @scala.inline
      def setOnResponderRelease(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      @scala.inline
      def setOnResponderStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
      
      @scala.inline
      def setOnResponderTerminate(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
      
      @scala.inline
      def setOnResponderTerminationRequest(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
      
      @scala.inline
      def setOnScroll(value: SyntheticEvent[NodeHandle, TextInputScrollEventData] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSelectionChange(value: SyntheticEvent[NodeHandle, TextInputSelectionChangeEventData] => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponder(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      @scala.inline
      def setOnSubmitEditing(value: SyntheticEvent[NodeHandle, TextInputSubmitEditingEventData] => Unit): Self = StObject.set(x, "onSubmitEditing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitEditingUndefined: Self = StObject.set(x, "onSubmitEditing", js.undefined)
      
      @scala.inline
      def setOnTextInput(value: SyntheticEvent[NodeHandle, TextInputTextInputEventData] => Unit): Self = StObject.set(x, "onTextInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTextInputUndefined: Self = StObject.set(x, "onTextInput", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndCapture(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setPasswordRules(value: String): Self = StObject.set(x, "passwordRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordRulesNull: Self = StObject.set(x, "passwordRules", null)
      
      @scala.inline
      def setPasswordRulesUndefined: Self = StObject.set(x, "passwordRules", js.undefined)
      
      @scala.inline
      def setPlaceholderTextColor(value: ColorValue): Self = StObject.set(x, "placeholderTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderTextColorUndefined: Self = StObject.set(x, "placeholderTextColor", js.undefined)
      
      @scala.inline
      def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setRejectResponderTermination(value: Boolean): Self = StObject.set(x, "rejectResponderTermination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectResponderTerminationNull: Self = StObject.set(x, "rejectResponderTermination", null)
      
      @scala.inline
      def setRejectResponderTerminationUndefined: Self = StObject.set(x, "rejectResponderTermination", js.undefined)
      
      @scala.inline
      def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      @scala.inline
      def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
      
      @scala.inline
      def setReturnKeyLabel(value: String): Self = StObject.set(x, "returnKeyLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnKeyLabelUndefined: Self = StObject.set(x, "returnKeyLabel", js.undefined)
      
      @scala.inline
      def setReturnKeyType(value: ReturnKeyTypeOptions): Self = StObject.set(x, "returnKeyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnKeyTypeUndefined: Self = StObject.set(x, "returnKeyType", js.undefined)
      
      @scala.inline
      def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      @scala.inline
      def setSecureTextEntry(value: Boolean): Self = StObject.set(x, "secureTextEntry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureTextEntryUndefined: Self = StObject.set(x, "secureTextEntry", js.undefined)
      
      @scala.inline
      def setSelectTextOnFocus(value: Boolean): Self = StObject.set(x, "selectTextOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectTextOnFocusUndefined: Self = StObject.set(x, "selectTextOnFocus", js.undefined)
      
      @scala.inline
      def setSelection(value: Start): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionColor(value: ColorValue): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
      
      @scala.inline
      def setSelectionState(value: DocumentSelectionState): Self = StObject.set(x, "selectionState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionStateUndefined: Self = StObject.set(x, "selectionState", js.undefined)
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      @scala.inline
      def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
      
      @scala.inline
      def setShowSoftInputOnFocus(value: Boolean): Self = StObject.set(x, "showSoftInputOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSoftInputOnFocusUndefined: Self = StObject.set(x, "showSoftInputOnFocus", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: ITextareaItemStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      @scala.inline
      def setTextAlignVertical(value: auto | top | bottom | center): Self = StObject.set(x, "textAlignVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignVerticalUndefined: Self = StObject.set(x, "textAlignVertical", js.undefined)
      
      @scala.inline
      def setTextBreakStrategy(value: simple | highQuality | balanced): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
      
      @scala.inline
      def setTextContentType(
        value: none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
      ): Self = StObject.set(x, "textContentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextContentTypeUndefined: Self = StObject.set(x, "textContentType", js.undefined)
      
      @scala.inline
      def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
      
      @scala.inline
      def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
      
      @scala.inline
      def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
      
      @scala.inline
      def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
      
      @scala.inline
      def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
      
      @scala.inline
      def setUnderlineColorAndroid(value: ColorValue): Self = StObject.set(x, "underlineColorAndroid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineColorAndroidUndefined: Self = StObject.set(x, "underlineColorAndroid", js.undefined)
    }
  }
}
