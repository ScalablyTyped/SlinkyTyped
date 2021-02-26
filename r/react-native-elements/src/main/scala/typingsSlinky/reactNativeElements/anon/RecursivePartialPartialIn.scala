package typingsSlinky.reactNativeElements.anon

import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
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
import typingsSlinky.reactNative.mod.TextInputChangeEventData
import typingsSlinky.reactNative.mod.TextInputContentSizeChangeEventData
import typingsSlinky.reactNative.mod.TextInputEndEditingEventData
import typingsSlinky.reactNative.mod.TextInputFocusEventData
import typingsSlinky.reactNative.mod.TextInputKeyPressEventData
import typingsSlinky.reactNative.mod.TextInputScrollEventData
import typingsSlinky.reactNative.mod.TextInputSelectionChangeEventData
import typingsSlinky.reactNative.mod.TextInputSubmitEditingEventData
import typingsSlinky.reactNative.mod.TextInputTextInputEventData
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.InputProps>> */
@js.native
trait RecursivePartialPartialIn extends StObject {
  
  var InputComponent: js.UndefOr[RecursivePartial[js.UndefOr[ReactComponentClass[_]]]] = js.native
  
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
  
  var focusable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var hasTVPreferredFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var hitSlop: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.native
  
  var importantForAccessibility: js.UndefOr[RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.native
  
  var importantForAutofill: js.UndefOr[
    RecursivePartial[js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants]]
  ] = js.native
  
  var inlineImageLeft: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var inlineImagePadding: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.native
  
  var inputAccessoryViewID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
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
  
  var maxFontSizeMultiplier: js.UndefOr[RecursivePartial[js.UndefOr[Double | Null]]] = js.native
  
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
  
  var onLayout: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]]]
  ] = js.native
  
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
  
  var onTextInput: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputTextInputEventData], Unit]]
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
  
  var passwordRules: js.UndefOr[RecursivePartial[js.UndefOr[String | Null]]] = js.native
  
  var placeholder: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var placeholderTextColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.native
  
  var pointerEvents: js.UndefOr[RecursivePartial[js.UndefOr[`box-none` | none | `box-only` | auto]]] = js.native
  
  var rejectResponderTermination: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | Null]]] = js.native
  
  var removeClippedSubviews: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var renderErrorMessage: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var renderToHardwareTextureAndroid: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var returnKeyLabel: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var returnKeyType: js.UndefOr[RecursivePartial[js.UndefOr[ReturnKeyTypeOptions]]] = js.native
  
  var rightIcon: js.UndefOr[RecursivePartial[js.UndefOr[IconNode]]] = js.native
  
  var rightIconContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var scrollEnabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var secureTextEntry: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var selectTextOnFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var selection: js.UndefOr[RecursivePartial[js.UndefOr[Start]]] = js.native
  
  var selectionColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.native
  
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
  
  var underlineColorAndroid: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.native
  
  var value: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
}
object RecursivePartialPartialIn {
  
  @scala.inline
  def apply(): RecursivePartialPartialIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialIn]
  }
  
  @scala.inline
  implicit class RecursivePartialPartialInMutableBuilder[Self <: RecursivePartialPartialIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityActions(value: RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityComponentType(value: RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: RecursivePartial[js.UndefOr[none | polite | assertive]]): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: RecursivePartial[js.UndefOr[AccessibilityRole]]): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: RecursivePartial[js.UndefOr[AccessibilityState]]): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraits(value: RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityValue(value: RecursivePartial[js.UndefOr[AccessibilityValue]]): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    @scala.inline
    def setAllowFontScaling(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    @scala.inline
    def setAutoCapitalize(value: RecursivePartial[js.UndefOr[none | sentences | words | characters]]): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoCompleteType(
      value: RecursivePartial[
          js.UndefOr[
            `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
          ]
        ]
    ): Self = StObject.set(x, "autoCompleteType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteTypeUndefined: Self = StObject.set(x, "autoCompleteType", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setBlurOnSubmit(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "blurOnSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurOnSubmitUndefined: Self = StObject.set(x, "blurOnSubmit", js.undefined)
    
    @scala.inline
    def setCaretHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "caretHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaretHiddenUndefined: Self = StObject.set(x, "caretHidden", js.undefined)
    
    @scala.inline
    def setClearButtonMode(value: RecursivePartial[js.UndefOr[never | `while-editing` | `unless-editing` | always]]): Self = StObject.set(x, "clearButtonMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearButtonModeUndefined: Self = StObject.set(x, "clearButtonMode", js.undefined)
    
    @scala.inline
    def setClearTextOnFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "clearTextOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearTextOnFocusUndefined: Self = StObject.set(x, "clearTextOnFocus", js.undefined)
    
    @scala.inline
    def setCollapsable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setContextMenuHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "contextMenuHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMenuHiddenUndefined: Self = StObject.set(x, "contextMenuHidden", js.undefined)
    
    @scala.inline
    def setDataDetectorTypes(value: RecursivePartial[js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]]]): Self = StObject.set(x, "dataDetectorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDetectorTypesUndefined: Self = StObject.set(x, "dataDetectorTypes", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDisableFullscreenUI(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "disableFullscreenUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFullscreenUIUndefined: Self = StObject.set(x, "disableFullscreenUI", js.undefined)
    
    @scala.inline
    def setDisabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledInputStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "disabledInputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledInputStyleUndefined: Self = StObject.set(x, "disabledInputStyle", js.undefined)
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEditable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setEnablesReturnKeyAutomatically(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "enablesReturnKeyAutomatically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablesReturnKeyAutomaticallyUndefined: Self = StObject.set(x, "enablesReturnKeyAutomatically", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setErrorProps(value: RecursivePartial[js.UndefOr[TextProps]]): Self = StObject.set(x, "errorProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorPropsUndefined: Self = StObject.set(x, "errorProps", js.undefined)
    
    @scala.inline
    def setErrorStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "errorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStyleUndefined: Self = StObject.set(x, "errorStyle", js.undefined)
    
    @scala.inline
    def setFocusable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHitSlop(value: RecursivePartial[js.UndefOr[Insets]]): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    @scala.inline
    def setImportantForAutofill(
      value: RecursivePartial[js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants]]
    ): Self = StObject.set(x, "importantForAutofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportantForAutofillUndefined: Self = StObject.set(x, "importantForAutofill", js.undefined)
    
    @scala.inline
    def setInlineImageLeft(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "inlineImageLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineImageLeftUndefined: Self = StObject.set(x, "inlineImageLeft", js.undefined)
    
    @scala.inline
    def setInlineImagePadding(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "inlineImagePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineImagePaddingUndefined: Self = StObject.set(x, "inlineImagePadding", js.undefined)
    
    @scala.inline
    def setInputAccessoryViewID(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "inputAccessoryViewID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputAccessoryViewIDUndefined: Self = StObject.set(x, "inputAccessoryViewID", js.undefined)
    
    @scala.inline
    def setInputComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[_]]]): Self = StObject.set(x, "InputComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputComponentUndefined: Self = StObject.set(x, "InputComponent", js.undefined)
    
    @scala.inline
    def setInputContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
    
    @scala.inline
    def setInputStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
    
    @scala.inline
    def setIsTVSelectable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
    
    @scala.inline
    def setKeyboardAppearance(value: RecursivePartial[js.UndefOr[default | light | dark]]): Self = StObject.set(x, "keyboardAppearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardAppearanceUndefined: Self = StObject.set(x, "keyboardAppearance", js.undefined)
    
    @scala.inline
    def setKeyboardType(value: RecursivePartial[js.UndefOr[KeyboardTypeOptions]]): Self = StObject.set(x, "keyboardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardTypeUndefined: Self = StObject.set(x, "keyboardType", js.undefined)
    
    @scala.inline
    def setLabel(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelProps(value: RecursivePartial[js.UndefOr[TextProps]]): Self = StObject.set(x, "labelProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPropsUndefined: Self = StObject.set(x, "labelProps", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLeftIcon(value: RecursivePartial[js.UndefOr[IconNode]]): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIconContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "leftIconContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIconContainerStyleUndefined: Self = StObject.set(x, "leftIconContainerStyle", js.undefined)
    
    @scala.inline
    def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
    
    @scala.inline
    def setMaxFontSizeMultiplier(value: RecursivePartial[js.UndefOr[Double | Null]]): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
    
    @scala.inline
    def setMaxLength(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMultiline(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    
    @scala.inline
    def setNativeID(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    @scala.inline
    def setNeedsOffscreenAlphaCompositing(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
    
    @scala.inline
    def setNumberOfLines(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]]
        ]
    ): Self = StObject.set(x, "onAccessibilityAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onAccessibilityEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onAccessibilityTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnBlur(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputFocusEventData], Unit]]
        ]
    ): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputChangeEventData], Unit]]
        ]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeText(value: RecursivePartial[js.UndefOr[js.Function1[/* text */ String, Unit]]]): Self = StObject.set(x, "onChangeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnContentSizeChange(
      value: RecursivePartial[
          js.UndefOr[
            js.Function1[SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData], Unit]
          ]
        ]
    ): Self = StObject.set(x, "onContentSizeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
    
    @scala.inline
    def setOnEndEditing(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputEndEditingEventData], Unit]]
        ]
    ): Self = StObject.set(x, "onEndEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEndEditingUndefined: Self = StObject.set(x, "onEndEditing", js.undefined)
    
    @scala.inline
    def setOnFocus(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputFocusEventData], Unit]]
        ]
    ): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyPress(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputKeyPressEventData], Unit]]
        ]
    ): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    @scala.inline
    def setOnLayout(value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]]]): Self = StObject.set(x, "onLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onMagicTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponder(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
    ): Self = StObject.set(x, "onMoveShouldSetResponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMoveShouldSetResponderCapture(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
    ): Self = StObject.set(x, "onMoveShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnResponderEnd(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = StObject.set(x, "onResponderEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
    
    @scala.inline
    def setOnResponderGrant(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = StObject.set(x, "onResponderGrant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
    
    @scala.inline
    def setOnResponderMove(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = StObject.set(x, "onResponderMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
    
    @scala.inline
    def setOnResponderReject(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = StObject.set(x, "onResponderReject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
    
    @scala.inline
    def setOnResponderRelease(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = StObject.set(x, "onResponderRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
    
    @scala.inline
    def setOnResponderStart(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = StObject.set(x, "onResponderStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
    
    @scala.inline
    def setOnResponderTerminate(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = StObject.set(x, "onResponderTerminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
    
    @scala.inline
    def setOnResponderTerminationRequest(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
    ): Self = StObject.set(x, "onResponderTerminationRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
    
    @scala.inline
    def setOnScroll(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputScrollEventData], Unit]]
        ]
    ): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    @scala.inline
    def setOnSelectionChange(
      value: RecursivePartial[
          js.UndefOr[
            js.Function1[SyntheticEvent[NodeHandle, TextInputSelectionChangeEventData], Unit]
          ]
        ]
    ): Self = StObject.set(x, "onSelectionChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponder(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
    ): Self = StObject.set(x, "onStartShouldSetResponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStartShouldSetResponderCapture(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
    ): Self = StObject.set(x, "onStartShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnSubmitEditing(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputSubmitEditingEventData], Unit]]
        ]
    ): Self = StObject.set(x, "onSubmitEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSubmitEditingUndefined: Self = StObject.set(x, "onSubmitEditing", js.undefined)
    
    @scala.inline
    def setOnTextInput(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputTextInputEventData], Unit]]
        ]
    ): Self = StObject.set(x, "onTextInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTextInputUndefined: Self = StObject.set(x, "onTextInput", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchEndCapture(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = StObject.set(x, "onTouchEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    @scala.inline
    def setPasswordRules(value: RecursivePartial[js.UndefOr[String | Null]]): Self = StObject.set(x, "passwordRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRulesUndefined: Self = StObject.set(x, "passwordRules", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderTextColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = StObject.set(x, "placeholderTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderTextColorUndefined: Self = StObject.set(x, "placeholderTextColor", js.undefined)
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: RecursivePartial[js.UndefOr[`box-none` | none | `box-only` | auto]]): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    @scala.inline
    def setRejectResponderTermination(value: RecursivePartial[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "rejectResponderTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectResponderTerminationUndefined: Self = StObject.set(x, "rejectResponderTermination", js.undefined)
    
    @scala.inline
    def setRemoveClippedSubviews(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    @scala.inline
    def setRenderErrorMessage(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "renderErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderErrorMessageUndefined: Self = StObject.set(x, "renderErrorMessage", js.undefined)
    
    @scala.inline
    def setRenderToHardwareTextureAndroid(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
    
    @scala.inline
    def setReturnKeyLabel(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "returnKeyLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnKeyLabelUndefined: Self = StObject.set(x, "returnKeyLabel", js.undefined)
    
    @scala.inline
    def setReturnKeyType(value: RecursivePartial[js.UndefOr[ReturnKeyTypeOptions]]): Self = StObject.set(x, "returnKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnKeyTypeUndefined: Self = StObject.set(x, "returnKeyType", js.undefined)
    
    @scala.inline
    def setRightIcon(value: RecursivePartial[js.UndefOr[IconNode]]): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIconContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "rightIconContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIconContainerStyleUndefined: Self = StObject.set(x, "rightIconContainerStyle", js.undefined)
    
    @scala.inline
    def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
    
    @scala.inline
    def setScrollEnabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    @scala.inline
    def setSecureTextEntry(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "secureTextEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureTextEntryUndefined: Self = StObject.set(x, "secureTextEntry", js.undefined)
    
    @scala.inline
    def setSelectTextOnFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "selectTextOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectTextOnFocusUndefined: Self = StObject.set(x, "selectTextOnFocus", js.undefined)
    
    @scala.inline
    def setSelection(value: RecursivePartial[js.UndefOr[Start]]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    @scala.inline
    def setSelectionState(value: RecursivePartial[js.UndefOr[DocumentSelectionState]]): Self = StObject.set(x, "selectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStateUndefined: Self = StObject.set(x, "selectionState", js.undefined)
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    @scala.inline
    def setShouldRasterizeIOS(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
    
    @scala.inline
    def setShowSoftInputOnFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "showSoftInputOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSoftInputOnFocusUndefined: Self = StObject.set(x, "showSoftInputOnFocus", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    @scala.inline
    def setStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTestID(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setTextAlignVertical(value: RecursivePartial[js.UndefOr[auto | top | bottom | center]]): Self = StObject.set(x, "textAlignVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignVerticalUndefined: Self = StObject.set(x, "textAlignVertical", js.undefined)
    
    @scala.inline
    def setTextBreakStrategy(value: RecursivePartial[js.UndefOr[simple | highQuality | balanced]]): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
    
    @scala.inline
    def setTextContentType(
      value: RecursivePartial[
          js.UndefOr[
            none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
          ]
        ]
    ): Self = StObject.set(x, "textContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContentTypeUndefined: Self = StObject.set(x, "textContentType", js.undefined)
    
    @scala.inline
    def setTvParallaxMagnification(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: RecursivePartial[js.UndefOr[TVParallaxProperties]]): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceX(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceY(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
    
    @scala.inline
    def setTvParallaxTiltAngle(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
    
    @scala.inline
    def setUnderlineColorAndroid(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = StObject.set(x, "underlineColorAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineColorAndroidUndefined: Self = StObject.set(x, "underlineColorAndroid", js.undefined)
    
    @scala.inline
    def setValue(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
