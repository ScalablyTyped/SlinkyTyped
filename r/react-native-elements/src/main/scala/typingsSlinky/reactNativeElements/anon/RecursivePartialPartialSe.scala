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
import typingsSlinky.reactNative.mod.ActivityIndicatorProperties
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.SearchBarProps>> */
@js.native
trait RecursivePartialPartialSe extends js.Object {
  
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
  
  var cancelButtonProps: js.UndefOr[RecursivePartial[js.UndefOr[PartialTouchableOpacityPr]]] = js.native
  
  var cancelButtonTitle: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var cancelIcon: js.UndefOr[RecursivePartial[js.UndefOr[IconNode]]] = js.native
  
  var caretHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var clearButtonMode: js.UndefOr[
    RecursivePartial[js.UndefOr[never | `while-editing` | `unless-editing` | always]]
  ] = js.native
  
  var clearIcon: js.UndefOr[RecursivePartial[js.UndefOr[IconNode]]] = js.native
  
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
  
  var lightTheme: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var loadingProps: js.UndefOr[RecursivePartial[js.UndefOr[ActivityIndicatorProperties]]] = js.native
  
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
  
  var onBlur: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onCancel: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var onChange: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputChangeEventData], Unit]]
    ]
  ] = js.native
  
  var onChangeText: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* text */ String, Unit]]]] = js.native
  
  var onClear: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
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
  
  var onFocus: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  
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
  
  var platform: js.UndefOr[RecursivePartial[js.UndefOr[default | ios | android]]] = js.native
  
  var pointerEvents: js.UndefOr[RecursivePartial[js.UndefOr[`box-none` | none | `box-only` | auto]]] = js.native
  
  var rejectResponderTermination: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | Null]]] = js.native
  
  var removeClippedSubviews: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var renderErrorMessage: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var renderToHardwareTextureAndroid: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var returnKeyLabel: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.native
  
  var returnKeyType: js.UndefOr[RecursivePartial[js.UndefOr[ReturnKeyTypeOptions]]] = js.native
  
  var rightIcon: js.UndefOr[RecursivePartial[js.UndefOr[IconNode]]] = js.native
  
  var rightIconContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  
  var round: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var scrollEnabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var searchIcon: js.UndefOr[RecursivePartial[js.UndefOr[IconNode]]] = js.native
  
  var secureTextEntry: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var selectTextOnFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var selection: js.UndefOr[RecursivePartial[js.UndefOr[Start]]] = js.native
  
  var selectionColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.native
  
  var selectionState: js.UndefOr[RecursivePartial[js.UndefOr[DocumentSelectionState]]] = js.native
  
  var shouldRasterizeIOS: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var showCancel: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
  var showLoading: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  
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
object RecursivePartialPartialSe {
  
  @scala.inline
  def apply(): RecursivePartialPartialSe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialSe]
  }
  
  @scala.inline
  implicit class RecursivePartialPartialSeOps[Self <: RecursivePartialPartialSe] (val x: Self) extends AnyVal {
    
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
    def setInputComponent(value: RecursivePartial[js.UndefOr[ReactComponentClass[_]]]): Self = this.set("InputComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputComponent: Self = this.set("InputComponent", js.undefined)
    
    @scala.inline
    def setAccessibilityActions(value: RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]): Self = this.set("accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityActions: Self = this.set("accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityComponentType(value: RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]): Self = this.set("accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityComponentType: Self = this.set("accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityElementsHidden: Self = this.set("accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityHint: Self = this.set("accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityIgnoresInvertColors: Self = this.set("accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: RecursivePartial[js.UndefOr[none | polite | assertive]]): Self = this.set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityLiveRegion: Self = this.set("accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: RecursivePartial[js.UndefOr[AccessibilityRole]]): Self = this.set("accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityRole: Self = this.set("accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: RecursivePartial[js.UndefOr[AccessibilityState]]): Self = this.set("accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityState: Self = this.set("accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraits(value: RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]): Self = this.set("accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityTraits: Self = this.set("accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityValue(value: RecursivePartial[js.UndefOr[AccessibilityValue]]): Self = this.set("accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityValue: Self = this.set("accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibilityViewIsModal: Self = this.set("accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    
    @scala.inline
    def setAllowFontScaling(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFontScaling: Self = this.set("allowFontScaling", js.undefined)
    
    @scala.inline
    def setAutoCapitalize(value: RecursivePartial[js.UndefOr[none | sentences | words | characters]]): Self = this.set("autoCapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCapitalize: Self = this.set("autoCapitalize", js.undefined)
    
    @scala.inline
    def setAutoCompleteType(
      value: RecursivePartial[
          js.UndefOr[
            `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
          ]
        ]
    ): Self = this.set("autoCompleteType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCompleteType: Self = this.set("autoCompleteType", js.undefined)
    
    @scala.inline
    def setAutoCorrect(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setBlurOnSubmit(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("blurOnSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurOnSubmit: Self = this.set("blurOnSubmit", js.undefined)
    
    @scala.inline
    def setCancelButtonProps(value: RecursivePartial[js.UndefOr[PartialTouchableOpacityPr]]): Self = this.set("cancelButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonProps: Self = this.set("cancelButtonProps", js.undefined)
    
    @scala.inline
    def setCancelButtonTitle(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("cancelButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButtonTitle: Self = this.set("cancelButtonTitle", js.undefined)
    
    @scala.inline
    def setCancelIcon(value: RecursivePartial[js.UndefOr[IconNode]]): Self = this.set("cancelIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelIcon: Self = this.set("cancelIcon", js.undefined)
    
    @scala.inline
    def setCaretHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("caretHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaretHidden: Self = this.set("caretHidden", js.undefined)
    
    @scala.inline
    def setClearButtonMode(value: RecursivePartial[js.UndefOr[never | `while-editing` | `unless-editing` | always]]): Self = this.set("clearButtonMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearButtonMode: Self = this.set("clearButtonMode", js.undefined)
    
    @scala.inline
    def setClearIcon(value: RecursivePartial[js.UndefOr[IconNode]]): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    
    @scala.inline
    def setClearTextOnFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("clearTextOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearTextOnFocus: Self = this.set("clearTextOnFocus", js.undefined)
    
    @scala.inline
    def setCollapsable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("collapsable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsable: Self = this.set("collapsable", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setContextMenuHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("contextMenuHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenuHidden: Self = this.set("contextMenuHidden", js.undefined)
    
    @scala.inline
    def setDataDetectorTypes(value: RecursivePartial[js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]]]): Self = this.set("dataDetectorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataDetectorTypes: Self = this.set("dataDetectorTypes", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDisableFullscreenUI(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("disableFullscreenUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFullscreenUI: Self = this.set("disableFullscreenUI", js.undefined)
    
    @scala.inline
    def setDisabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledInputStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("disabledInputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledInputStyle: Self = this.set("disabledInputStyle", js.undefined)
    
    @scala.inline
    def setEditable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setEnablesReturnKeyAutomatically(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("enablesReturnKeyAutomatically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablesReturnKeyAutomatically: Self = this.set("enablesReturnKeyAutomatically", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setErrorProps(value: RecursivePartial[js.UndefOr[TextProps]]): Self = this.set("errorProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorProps: Self = this.set("errorProps", js.undefined)
    
    @scala.inline
    def setErrorStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("errorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorStyle: Self = this.set("errorStyle", js.undefined)
    
    @scala.inline
    def setFocusable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTVPreferredFocus: Self = this.set("hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHitSlop(value: RecursivePartial[js.UndefOr[Insets]]): Self = this.set("hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitSlop: Self = this.set("hitSlop", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    
    @scala.inline
    def setImportantForAutofill(
      value: RecursivePartial[js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants]]
    ): Self = this.set("importantForAutofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportantForAutofill: Self = this.set("importantForAutofill", js.undefined)
    
    @scala.inline
    def setInlineImageLeft(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("inlineImageLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineImageLeft: Self = this.set("inlineImageLeft", js.undefined)
    
    @scala.inline
    def setInlineImagePadding(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("inlineImagePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineImagePadding: Self = this.set("inlineImagePadding", js.undefined)
    
    @scala.inline
    def setInputAccessoryViewID(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("inputAccessoryViewID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputAccessoryViewID: Self = this.set("inputAccessoryViewID", js.undefined)
    
    @scala.inline
    def setInputContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("inputContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputContainerStyle: Self = this.set("inputContainerStyle", js.undefined)
    
    @scala.inline
    def setInputStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    
    @scala.inline
    def setIsTVSelectable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("isTVSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTVSelectable: Self = this.set("isTVSelectable", js.undefined)
    
    @scala.inline
    def setKeyboardAppearance(value: RecursivePartial[js.UndefOr[default | light | dark]]): Self = this.set("keyboardAppearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardAppearance: Self = this.set("keyboardAppearance", js.undefined)
    
    @scala.inline
    def setKeyboardType(value: RecursivePartial[js.UndefOr[KeyboardTypeOptions]]): Self = this.set("keyboardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardType: Self = this.set("keyboardType", js.undefined)
    
    @scala.inline
    def setLabel(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelProps(value: RecursivePartial[js.UndefOr[TextProps]]): Self = this.set("labelProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelProps: Self = this.set("labelProps", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    
    @scala.inline
    def setLeftIcon(value: RecursivePartial[js.UndefOr[IconNode]]): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftIcon: Self = this.set("leftIcon", js.undefined)
    
    @scala.inline
    def setLeftIconContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("leftIconContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftIconContainerStyle: Self = this.set("leftIconContainerStyle", js.undefined)
    
    @scala.inline
    def setLightTheme(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("lightTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightTheme: Self = this.set("lightTheme", js.undefined)
    
    @scala.inline
    def setLoadingProps(value: RecursivePartial[js.UndefOr[ActivityIndicatorProperties]]): Self = this.set("loadingProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingProps: Self = this.set("loadingProps", js.undefined)
    
    @scala.inline
    def setMaxFontSizeMultiplier(value: RecursivePartial[js.UndefOr[Double | Null]]): Self = this.set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFontSizeMultiplier: Self = this.set("maxFontSizeMultiplier", js.undefined)
    
    @scala.inline
    def setMaxLength(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMultiline(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    
    @scala.inline
    def setNativeID(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeID: Self = this.set("nativeID", js.undefined)
    
    @scala.inline
    def setNeedsOffscreenAlphaCompositing(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedsOffscreenAlphaCompositing: Self = this.set("needsOffscreenAlphaCompositing", js.undefined)
    
    @scala.inline
    def setNumberOfLines(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("numberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfLines: Self = this.set("numberOfLines", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, ReadonlyactionNamestring], Unit]]
        ]
    ): Self = this.set("onAccessibilityAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAccessibilityAction: Self = this.set("onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onAccessibilityEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAccessibilityEscape: Self = this.set("onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onAccessibilityTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAccessibilityTap: Self = this.set("onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnBlur(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnCancel(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputChangeEventData], Unit]]
        ]
    ): Self = this.set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnChangeText(value: RecursivePartial[js.UndefOr[js.Function1[/* text */ String, Unit]]]): Self = this.set("onChangeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnChangeText: Self = this.set("onChangeText", js.undefined)
    
    @scala.inline
    def setOnClear(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
    
    @scala.inline
    def setOnContentSizeChange(
      value: RecursivePartial[
          js.UndefOr[
            js.Function1[SyntheticEvent[NodeHandle, TextInputContentSizeChangeEventData], Unit]
          ]
        ]
    ): Self = this.set("onContentSizeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnContentSizeChange: Self = this.set("onContentSizeChange", js.undefined)
    
    @scala.inline
    def setOnEndEditing(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputEndEditingEventData], Unit]]
        ]
    ): Self = this.set("onEndEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEndEditing: Self = this.set("onEndEditing", js.undefined)
    
    @scala.inline
    def setOnFocus(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyPress(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputKeyPressEventData], Unit]]
        ]
    ): Self = this.set("onKeyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOnLayout(value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, Layout], Unit]]]): Self = this.set("onLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onMagicTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMagicTap: Self = this.set("onMagicTap", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponder(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
    ): Self = this.set("onMoveShouldSetResponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMoveShouldSetResponder: Self = this.set("onMoveShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnMoveShouldSetResponderCapture(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
    ): Self = this.set("onMoveShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnMoveShouldSetResponderCapture: Self = this.set("onMoveShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnResponderEnd(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onResponderEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponderEnd: Self = this.set("onResponderEnd", js.undefined)
    
    @scala.inline
    def setOnResponderGrant(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onResponderGrant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponderGrant: Self = this.set("onResponderGrant", js.undefined)
    
    @scala.inline
    def setOnResponderMove(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onResponderMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponderMove: Self = this.set("onResponderMove", js.undefined)
    
    @scala.inline
    def setOnResponderReject(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onResponderReject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponderReject: Self = this.set("onResponderReject", js.undefined)
    
    @scala.inline
    def setOnResponderRelease(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onResponderRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponderRelease: Self = this.set("onResponderRelease", js.undefined)
    
    @scala.inline
    def setOnResponderStart(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onResponderStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponderStart: Self = this.set("onResponderStart", js.undefined)
    
    @scala.inline
    def setOnResponderTerminate(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onResponderTerminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponderTerminate: Self = this.set("onResponderTerminate", js.undefined)
    
    @scala.inline
    def setOnResponderTerminationRequest(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
    ): Self = this.set("onResponderTerminationRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResponderTerminationRequest: Self = this.set("onResponderTerminationRequest", js.undefined)
    
    @scala.inline
    def setOnScroll(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputScrollEventData], Unit]]
        ]
    ): Self = this.set("onScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnSelectionChange(
      value: RecursivePartial[
          js.UndefOr[
            js.Function1[SyntheticEvent[NodeHandle, TextInputSelectionChangeEventData], Unit]
          ]
        ]
    ): Self = this.set("onSelectionChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelectionChange: Self = this.set("onSelectionChange", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponder(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
    ): Self = this.set("onStartShouldSetResponder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStartShouldSetResponder: Self = this.set("onStartShouldSetResponder", js.undefined)
    
    @scala.inline
    def setOnStartShouldSetResponderCapture(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Boolean]]]
    ): Self = this.set("onStartShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnStartShouldSetResponderCapture: Self = this.set("onStartShouldSetResponderCapture", js.undefined)
    
    @scala.inline
    def setOnSubmitEditing(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputSubmitEditingEventData], Unit]]
        ]
    ): Self = this.set("onSubmitEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSubmitEditing: Self = this.set("onSubmitEditing", js.undefined)
    
    @scala.inline
    def setOnTextInput(
      value: RecursivePartial[
          js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, TextInputTextInputEventData], Unit]]
        ]
    ): Self = this.set("onTextInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTextInput: Self = this.set("onTextInput", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchCancel: Self = this.set("onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchEndCapture(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchEndCapture: Self = this.set("onTouchEndCapture", js.undefined)
    
    @scala.inline
    def setOnTouchMove(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(
      value: RecursivePartial[js.UndefOr[js.Function1[SyntheticEvent[NodeHandle, NativeTouchEvent], Unit]]]
    ): Self = this.set("onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setPasswordRules(value: RecursivePartial[js.UndefOr[String | Null]]): Self = this.set("passwordRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRules: Self = this.set("passwordRules", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPlaceholderTextColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = this.set("placeholderTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderTextColor: Self = this.set("placeholderTextColor", js.undefined)
    
    @scala.inline
    def setPlatform(value: RecursivePartial[js.UndefOr[default | ios | android]]): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: RecursivePartial[js.UndefOr[`box-none` | none | `box-only` | auto]]): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    
    @scala.inline
    def setRejectResponderTermination(value: RecursivePartial[js.UndefOr[Boolean | Null]]): Self = this.set("rejectResponderTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectResponderTermination: Self = this.set("rejectResponderTermination", js.undefined)
    
    @scala.inline
    def setRemoveClippedSubviews(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("removeClippedSubviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveClippedSubviews: Self = this.set("removeClippedSubviews", js.undefined)
    
    @scala.inline
    def setRenderErrorMessage(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("renderErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderErrorMessage: Self = this.set("renderErrorMessage", js.undefined)
    
    @scala.inline
    def setRenderToHardwareTextureAndroid(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderToHardwareTextureAndroid: Self = this.set("renderToHardwareTextureAndroid", js.undefined)
    
    @scala.inline
    def setReturnKeyLabel(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("returnKeyLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnKeyLabel: Self = this.set("returnKeyLabel", js.undefined)
    
    @scala.inline
    def setReturnKeyType(value: RecursivePartial[js.UndefOr[ReturnKeyTypeOptions]]): Self = this.set("returnKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnKeyType: Self = this.set("returnKeyType", js.undefined)
    
    @scala.inline
    def setRightIcon(value: RecursivePartial[js.UndefOr[IconNode]]): Self = this.set("rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightIcon: Self = this.set("rightIcon", js.undefined)
    
    @scala.inline
    def setRightIconContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("rightIconContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightIconContainerStyle: Self = this.set("rightIconContainerStyle", js.undefined)
    
    @scala.inline
    def setRound(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    
    @scala.inline
    def setScrollEnabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("scrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollEnabled: Self = this.set("scrollEnabled", js.undefined)
    
    @scala.inline
    def setSearchIcon(value: RecursivePartial[js.UndefOr[IconNode]]): Self = this.set("searchIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchIcon: Self = this.set("searchIcon", js.undefined)
    
    @scala.inline
    def setSecureTextEntry(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("secureTextEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureTextEntry: Self = this.set("secureTextEntry", js.undefined)
    
    @scala.inline
    def setSelectTextOnFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("selectTextOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectTextOnFocus: Self = this.set("selectTextOnFocus", js.undefined)
    
    @scala.inline
    def setSelection(value: RecursivePartial[js.UndefOr[Start]]): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    
    @scala.inline
    def setSelectionColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = this.set("selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionColor: Self = this.set("selectionColor", js.undefined)
    
    @scala.inline
    def setSelectionState(value: RecursivePartial[js.UndefOr[DocumentSelectionState]]): Self = this.set("selectionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionState: Self = this.set("selectionState", js.undefined)
    
    @scala.inline
    def setShouldRasterizeIOS(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldRasterizeIOS: Self = this.set("shouldRasterizeIOS", js.undefined)
    
    @scala.inline
    def setShowCancel(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("showCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCancel: Self = this.set("showCancel", js.undefined)
    
    @scala.inline
    def setShowLoading(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("showLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLoading: Self = this.set("showLoading", js.undefined)
    
    @scala.inline
    def setShowSoftInputOnFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("showSoftInputOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSoftInputOnFocus: Self = this.set("showSoftInputOnFocus", js.undefined)
    
    @scala.inline
    def setSpellCheck(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    
    @scala.inline
    def setStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTestID(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    
    @scala.inline
    def setTextAlignVertical(value: RecursivePartial[js.UndefOr[auto | top | bottom | center]]): Self = this.set("textAlignVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlignVertical: Self = this.set("textAlignVertical", js.undefined)
    
    @scala.inline
    def setTextBreakStrategy(value: RecursivePartial[js.UndefOr[simple | highQuality | balanced]]): Self = this.set("textBreakStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBreakStrategy: Self = this.set("textBreakStrategy", js.undefined)
    
    @scala.inline
    def setTextContentType(
      value: RecursivePartial[
          js.UndefOr[
            none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
          ]
        ]
    ): Self = this.set("textContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextContentType: Self = this.set("textContentType", js.undefined)
    
    @scala.inline
    def setTvParallaxMagnification(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxMagnification: Self = this.set("tvParallaxMagnification", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: RecursivePartial[js.UndefOr[TVParallaxProperties]]): Self = this.set("tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxProperties: Self = this.set("tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceX(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxShiftDistanceX: Self = this.set("tvParallaxShiftDistanceX", js.undefined)
    
    @scala.inline
    def setTvParallaxShiftDistanceY(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxShiftDistanceY: Self = this.set("tvParallaxShiftDistanceY", js.undefined)
    
    @scala.inline
    def setTvParallaxTiltAngle(value: RecursivePartial[js.UndefOr[Double]]): Self = this.set("tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTvParallaxTiltAngle: Self = this.set("tvParallaxTiltAngle", js.undefined)
    
    @scala.inline
    def setUnderlineColorAndroid(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = this.set("underlineColorAndroid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineColorAndroid: Self = this.set("underlineColorAndroid", js.undefined)
    
    @scala.inline
    def setValue(value: RecursivePartial[js.UndefOr[String]]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
