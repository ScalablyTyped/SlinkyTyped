package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
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
import typingsSlinky.reactNative.mod.TextInputFocusEventData
import typingsSlinky.reactNative.mod.TextInputKeyPressEventData
import typingsSlinky.reactNative.mod.TextInputScrollEventData
import typingsSlinky.reactNative.mod.TextInputSelectionChangeEventData
import typingsSlinky.reactNative.mod.TextInputSubmitEditingEventData
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeElements.mod.IconNode
import typingsSlinky.reactNativeElements.mod.RecursivePartial
import typingsSlinky.reactNativeElements.mod.TextProps
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

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.InputProps>> */
@js.native
trait RecursivePartialPartialIn extends js.Object {
  var accessibilityActions: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.native
  var accessibilityComponentType: js.UndefOr[
    RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]
  ] = js.native
  var accessibilityElementsHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var accessibilityHint: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var accessibilityIgnoresInvertColors: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var accessibilityLabel: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var accessibilityLiveRegion: js.UndefOr[RecursivePartial[js.UndefOr[none | polite | assertive]]] = js.native
  var accessibilityRole: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityRole]]] = js.native
  var accessibilityState: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityState]]] = js.native
  var accessibilityStates: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[AccessibilityStates]]]] = js.native
  var accessibilityTraits: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]] = js.native
  var accessibilityValue: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityValue]]] = js.native
  var accessibilityViewIsModal: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var accessible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var allowFontScaling: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var autoCapitalize: js.UndefOr[RecursivePartial[js.UndefOr[none | sentences | words | characters]]] = js.native
  var autoCompleteType: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
      ]
    ]
  ] = js.native
  var autoCorrect: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var autoFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var blurOnSubmit: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var caretHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var clearButtonMode: js.UndefOr[
    RecursivePartial[js.UndefOr[never | `while-editing` | `unless-editing` | always]]
  ] = js.native
  var clearTextOnFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var collapsable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var contextMenuHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var dataDetectorTypes: js.UndefOr[RecursivePartial[js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]]]] = js.native
  var defaultValue: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var disableFullscreenUI: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var disabledInputStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  var editable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var enablesReturnKeyAutomatically: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var errorMessage: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var errorProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProps]]] = js.native
  var errorStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  var hasTVPreferredFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var hitSlop: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.native
  var importantForAccessibility: js.UndefOr[RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  var importantForAutofill: js.UndefOr[
    RecursivePartial[js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants]]
  ] = js.native
  var inlineImageLeft: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var inlineImagePadding: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var inputAccessoryViewID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var inputComponent: js.UndefOr[RecursivePartial[js.UndefOr[ReactComponentClass[_]]]] = js.native
  var inputContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var inputStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  var isTVSelectable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var keyboardAppearance: js.UndefOr[RecursivePartial[js.UndefOr[default | light | dark]]] = js.native
  var keyboardType: js.UndefOr[RecursivePartial[js.UndefOr[KeyboardTypeOptions]]] = js.native
  var label: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.native
  var labelProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProps]]] = js.native
  var labelStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  var leftIcon: js.UndefOr[RecursivePartial[js.UndefOr[IconNode]]] = js.native
  var leftIconContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var maxFontSizeMultiplier: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var maxLength: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var multiline: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var nativeID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var needsOffscreenAlphaCompositing: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var numberOfLines: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var onAccessibilityAction: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]]
    ]
  ] = js.native
  var onAccessibilityEscape: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onAccessibilityTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onBlur: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputFocusEventData], Unit]]
    ]
  ] = js.native
  var onChange: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputChangeEventData], Unit]]
    ]
  ] = js.native
  var onChangeText: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* text */ String, Unit]]]] = js.native
  var onContentSizeChange: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        js.Function1[SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData], Unit]
      ]
    ]
  ] = js.native
  var onEndEditing: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputEndEditingEventData], Unit]]
    ]
  ] = js.native
  var onFocus: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputFocusEventData], Unit]]
    ]
  ] = js.native
  var onKeyPress: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputKeyPressEventData], Unit]]
    ]
  ] = js.native
  var onLayout: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.native
  var onMagicTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onMoveShouldSetResponder: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
  ] = js.native
  var onMoveShouldSetResponderCapture: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
  ] = js.native
  var onResponderEnd: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onResponderGrant: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onResponderMove: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onResponderReject: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onResponderRelease: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onResponderStart: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onResponderTerminate: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onResponderTerminationRequest: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
  ] = js.native
  var onScroll: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputScrollEventData], Unit]]
    ]
  ] = js.native
  var onSelectionChange: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        js.Function1[SyntheticEvent[NodeHandle, TextInputSelectionChangeEventData], Unit]
      ]
    ]
  ] = js.native
  var onStartShouldSetResponder: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
  ] = js.native
  var onStartShouldSetResponderCapture: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
  ] = js.native
  var onSubmitEditing: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputSubmitEditingEventData], Unit]]
    ]
  ] = js.native
  var onTouchCancel: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onTouchEnd: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onTouchEndCapture: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onTouchMove: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var onTouchStart: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
  ] = js.native
  var passwordRules: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var placeholder: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var placeholderTextColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var pointerEvents: js.UndefOr[RecursivePartial[js.UndefOr[`box-none` | none | `box-only` | auto]]] = js.native
  var rejectResponderTermination: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var removeClippedSubviews: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var renderToHardwareTextureAndroid: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var returnKeyLabel: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var returnKeyType: js.UndefOr[RecursivePartial[js.UndefOr[ReturnKeyTypeOptions]]] = js.native
  var rightIcon: js.UndefOr[RecursivePartial[js.UndefOr[IconNode]]] = js.native
  var rightIconContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var scrollEnabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var secureTextEntry: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var selectTextOnFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var selection: js.UndefOr[RecursivePartial[js.UndefOr[Start]]] = js.native
  var selectionColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var selectionState: js.UndefOr[RecursivePartial[js.UndefOr[DocumentSelectionState]]] = js.native
  var shouldRasterizeIOS: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var showSoftInputOnFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var spellCheck: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.native
  var testID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var textAlignVertical: js.UndefOr[RecursivePartial[js.UndefOr[auto | top | bottom | center]]] = js.native
  var textBreakStrategy: js.UndefOr[RecursivePartial[js.UndefOr[simple | highQuality | balanced]]] = js.native
  var textContentType: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
      ]
    ]
  ] = js.native
  var tvParallaxMagnification: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var tvParallaxProperties: js.UndefOr[RecursivePartial[js.UndefOr[TVParallaxProperties]]] = js.native
  var tvParallaxShiftDistanceX: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var tvParallaxShiftDistanceY: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var tvParallaxTiltAngle: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  var underlineColorAndroid: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  var value: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
}

object RecursivePartialPartialIn {
  @scala.inline
  def apply(): RecursivePartialPartialIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialIn]
  }
  @scala.inline
  implicit class RecursivePartialPartialInOps[Self <: RecursivePartialPartialIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibilityActions(value: RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]): Self = {
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
    def withAccessibilityComponentType(value: RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]): Self = {
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
    def withAccessibilityElementsHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withAccessibilityHint(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withAccessibilityIgnoresInvertColors(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withAccessibilityLabel(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withAccessibilityLiveRegion(value: RecursivePartial[js.UndefOr[none | polite | assertive]]): Self = {
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
    def withAccessibilityRole(value: RecursivePartial[js.UndefOr[AccessibilityRole]]): Self = {
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
    def withAccessibilityState(value: RecursivePartial[js.UndefOr[AccessibilityState]]): Self = {
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
    def withAccessibilityStates(value: RecursivePartial[js.UndefOr[js.Array[AccessibilityStates]]]): Self = {
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
    def withAccessibilityTraits(value: RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]): Self = {
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
    def withAccessibilityValue(value: RecursivePartial[js.UndefOr[AccessibilityValue]]): Self = {
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
    def withAccessibilityViewIsModal(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withAccessible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withAllowFontScaling(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withAutoCapitalize(value: RecursivePartial[js.UndefOr[none | sentences | words | characters]]): Self = {
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
      value: RecursivePartial[
          js.UndefOr[
            `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
          ]
        ]
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
    def withAutoCorrect(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withAutoFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withBlurOnSubmit(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withCaretHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withClearButtonMode(value: RecursivePartial[js.UndefOr[never | `while-editing` | `unless-editing` | always]]): Self = {
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
    def withClearTextOnFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withCollapsable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
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
    def withContextMenuHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withDataDetectorTypes(value: RecursivePartial[js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]]]): Self = {
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
    def withDefaultValue(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withDisableFullscreenUI(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withDisabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledInputStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledInputStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledInputStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledInputStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withEnablesReturnKeyAutomatically(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withErrorMessage(value: RecursivePartial[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorProps(value: RecursivePartial[js.UndefOr[TextProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorProps")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHasTVPreferredFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withHitSlop(value: RecursivePartial[js.UndefOr[Insets]]): Self = {
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
    def withImportantForAccessibility(value: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]): Self = {
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
    def withImportantForAutofill(
      value: RecursivePartial[js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants]]
    ): Self = {
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
    def withInlineImageLeft(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withInlineImagePadding(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withInputAccessoryViewID(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withInputComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withInputContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
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
    def withInputStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = {
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
    def withIsTVSelectable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withKeyboardAppearance(value: RecursivePartial[js.UndefOr[default | light | dark]]): Self = {
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
    def withKeyboardType(value: RecursivePartial[js.UndefOr[KeyboardTypeOptions]]): Self = {
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
    def withLabel(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelProps(value: RecursivePartial[js.UndefOr[TextProps]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelProps")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftIcon(value: RecursivePartial[js.UndefOr[IconNode]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftIconContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
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
    def withMaxFontSizeMultiplier(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withMaxLength(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withMultiline(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withNativeID(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withNeedsOffscreenAlphaCompositing(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withNumberOfLines(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withOnAccessibilityAction(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAccessibilityAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityAction")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccessibilityEscape(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAccessibilityEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccessibilityTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityTap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAccessibilityTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccessibilityTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputFocusEventData], Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputChangeEventData], Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeText(value: RecursivePartial[js.UndefOr[js.Function1[/* text */ String, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnChangeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContentSizeChange(
      value: RecursivePartial[
          js.UndefOr[
            js.Function1[SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData], Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentSizeChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnContentSizeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentSizeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEndEditing(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputEndEditingEventData], Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnEndEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputFocusEventData], Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputKeyPressEventData], Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLayout(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMagicTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMagicTap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMagicTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMagicTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveShouldSetResponder(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMoveShouldSetResponder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMoveShouldSetResponderCapture(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponderCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnMoveShouldSetResponderCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMoveShouldSetResponderCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderEnd(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponderEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderGrant(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderGrant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponderGrant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderGrant")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderMove(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponderMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderReject(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderReject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponderReject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderReject")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderRelease(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderRelease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponderRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderRelease")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderStart(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponderStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderTerminate(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponderTerminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResponderTerminationRequest(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminationRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResponderTerminationRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponderTerminationRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputScrollEventData], Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChange(
      value: RecursivePartial[
          js.UndefOr[
            js.Function1[SyntheticEvent[NodeHandle, TextInputSelectionChangeEventData], Unit]
          ]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartShouldSetResponder(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStartShouldSetResponder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponder")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartShouldSetResponderCapture(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponderCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnStartShouldSetResponderCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartShouldSetResponderCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmitEditing(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputSubmitEditingEventData], Unit]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSubmitEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchCancel(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEnd(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEndCapture(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchMove(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStart(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordRules(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withPlaceholder(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withPlaceholderTextColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withPointerEvents(value: RecursivePartial[js.UndefOr[`box-none` | none | `box-only` | auto]]): Self = {
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
    def withRejectResponderTermination(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withRemoveClippedSubviews(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withRenderToHardwareTextureAndroid(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withReturnKeyLabel(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withReturnKeyType(value: RecursivePartial[js.UndefOr[ReturnKeyTypeOptions]]): Self = {
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
    def withRightIcon(value: RecursivePartial[js.UndefOr[IconNode]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withRightIconContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = {
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
    def withScrollEnabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withSecureTextEntry(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withSelectTextOnFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withSelection(value: RecursivePartial[js.UndefOr[Start]]): Self = {
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
    def withSelectionColor(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withSelectionState(value: RecursivePartial[js.UndefOr[DocumentSelectionState]]): Self = {
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
    def withShouldRasterizeIOS(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withShowSoftInputOnFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withSpellCheck(value: RecursivePartial[js.UndefOr[Boolean]]): Self = {
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
    def withStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = {
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
    def withTestID(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withTextAlignVertical(value: RecursivePartial[js.UndefOr[auto | top | bottom | center]]): Self = {
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
    def withTextBreakStrategy(value: RecursivePartial[js.UndefOr[simple | highQuality | balanced]]): Self = {
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
      value: RecursivePartial[
          js.UndefOr[
            none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
          ]
        ]
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
    def withTvParallaxMagnification(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withTvParallaxProperties(value: RecursivePartial[js.UndefOr[TVParallaxProperties]]): Self = {
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
    def withTvParallaxShiftDistanceX(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withTvParallaxShiftDistanceY(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withTvParallaxTiltAngle(value: RecursivePartial[js.UndefOr[Double]]): Self = {
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
    def withUnderlineColorAndroid(value: RecursivePartial[js.UndefOr[String]]): Self = {
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
    def withValue(value: RecursivePartial[js.UndefOr[String]]): Self = {
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

