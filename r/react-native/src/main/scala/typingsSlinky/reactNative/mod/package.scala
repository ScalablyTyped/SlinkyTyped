package typingsSlinky.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ART = typingsSlinky.reactNative.mod.ARTStatic
  
  type AccessibilityActionEvent = slinky.core.SyntheticEvent[
    typingsSlinky.reactNative.mod.NodeHandle, 
    typingsSlinky.reactNative.anon.ReadonlyactionNamestring
  ]
  
  type AccessibilityAnnouncementEventName = typingsSlinky.reactNative.reactNativeStrings.announcementFinished
  
  type AccessibilityAnnouncementFinishedEventHandler = js.Function1[
    /* event */ typingsSlinky.reactNative.mod.AccessibilityAnnouncementFinishedEvent, 
    scala.Unit
  ]
  
  type AccessibilityChangeEvent = scala.Boolean
  
  type AccessibilityChangeEventHandler = js.Function1[/* event */ typingsSlinky.reactNative.mod.AccessibilityChangeEvent, scala.Unit]
  
  type AccessibilityInfo = typingsSlinky.reactNative.mod.AccessibilityInfoStatic
  
  type AccessibilityProperties = typingsSlinky.reactNative.mod.AccessibilityProps
  
  type AccessibilityPropertiesAndroid = typingsSlinky.reactNative.mod.AccessibilityPropsAndroid
  
  type AccessibilityPropertiesIOS = typingsSlinky.reactNative.mod.AccessibilityPropsIOS
  
  type ActionSheetIOS = typingsSlinky.reactNative.mod.ActionSheetIOSStatic
  
  type ActivityIndicatorComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.ActivityIndicatorProps]
  
  type ActivityIndicatorIOSProperties = typingsSlinky.reactNative.mod.ActivityIndicatorIOSProps
  
  type ActivityIndicatorProperties = typingsSlinky.reactNative.mod.ActivityIndicatorProps
  
  type Alert = typingsSlinky.reactNative.mod.AlertStatic
  
  type AppState = typingsSlinky.reactNative.mod.AppStateStatic
  
  type AsyncStorage = typingsSlinky.reactNative.mod.AsyncStorageStatic
  
  type BackHandler = typingsSlinky.reactNative.mod.BackHandlerStatic
  
  type BackPressEventName = typingsSlinky.reactNative.reactNativeStrings.hardwareBackPress
  
  type ButtonProperties = typingsSlinky.reactNative.mod.ButtonProps
  
  type CameraRoll = typingsSlinky.reactNative.mod.CameraRollStatic
  
  type Clipboard = typingsSlinky.reactNative.mod.ClipboardStatic
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNative.reactNativeStrings.light
    - typingsSlinky.reactNative.reactNativeStrings.dark
    - scala.Null
    - js.UndefOr[scala.Nothing]
  */
  type ColorSchemeName = js.UndefOr[typingsSlinky.reactNative.mod._ColorSchemeName | scala.Null]
  
  type ColorValue = java.lang.String | typingsSlinky.reactNative.mod.OpaqueColorValue
  
  type ComponentProvider = js.Function0[slinky.core.ReactComponentClass[js.Any]]
  
  type Constructor[T] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  
  type DatePickerAndroid = typingsSlinky.reactNative.mod.DatePickerAndroidStatic
  
  type DatePickerIOSComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.DatePickerIOSProps]
  
  type DatePickerIOSProperties = typingsSlinky.reactNative.mod.DatePickerIOSProps
  
  type DrawerLayoutAndroidComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.DrawerLayoutAndroidProps]
  
  type DrawerLayoutAndroidProperties = typingsSlinky.reactNative.mod.DrawerLayoutAndroidProps
  
  type DrawerSlideEvent = slinky.core.SyntheticEvent[
    typingsSlinky.reactNative.mod.NodeHandle, 
    typingsSlinky.reactNative.mod.NativeTouchEvent
  ]
  
  type Easing = typingsSlinky.reactNative.mod.EasingStatic
  
  type EasingFunction = js.Function1[/* value */ scala.Double, scala.Double]
  
  type ErrorHandlerCallback = js.Function2[/* error */ js.Any, /* isFatal */ js.UndefOr[scala.Boolean], scala.Unit]
  
  type Falsy = js.UndefOr[scala.Null | typingsSlinky.reactNative.reactNativeBooleans.`false`]
  
  type FlatListProperties[ItemT] = typingsSlinky.reactNative.mod.FlatListProps[ItemT]
  
  type GestureResponderEvent = slinky.core.SyntheticEvent[
    typingsSlinky.reactNative.mod.NodeHandle, 
    typingsSlinky.reactNative.mod.NativeTouchEvent
  ]
  
  type Handle = scala.Double
  
  type I18nManager = typingsSlinky.reactNative.mod.I18nManagerStatic
  
  type ImageBackgroundComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.ImageBackgroundProps]
  
  type ImageBackgroundProperties = typingsSlinky.reactNative.mod.ImageBackgroundProps
  
  type ImageComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.ImageProps]
  
  type ImageEditor = typingsSlinky.reactNative.mod.ImageEditorStatic
  
  type ImagePickerIOS = typingsSlinky.reactNative.mod.ImagePickerIOSStatic
  
  type ImagePickerResult = js.Tuple3[java.lang.String, scala.Double, scala.Double]
  
  type ImageProperties = typingsSlinky.reactNative.mod.ImageProps
  
  type ImagePropertiesAndroid = typingsSlinky.reactNative.mod.ImagePropsAndroid
  
  type ImagePropertiesIOS = typingsSlinky.reactNative.mod.ImagePropsIOS
  
  type ImagePropertiesSourceOptions = typingsSlinky.reactNative.mod.ImageSourcePropType
  
  type ImageRequireSource = scala.Double
  
  type ImageSourcePropType = typingsSlinky.reactNative.mod.ImageURISource | js.Array[typingsSlinky.reactNative.mod.ImageURISource] | typingsSlinky.reactNative.mod.ImageRequireSource
  
  type ImageStore = typingsSlinky.reactNative.mod.ImageStoreStatic
  
  type InputAccessoryViewProperties = typingsSlinky.reactNative.mod.InputAccessoryViewProps
  
  /**
    * It is a component to solve the common problem of views that need to move out of the way of the virtual keyboard.
    * It can automatically adjust either its position or bottom padding based on the position of the keyboard.
    */
  type KeyboardAvoidingViewComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.KeyboardAvoidingViewProps]
  
  type KeyboardEventListener = js.Function1[/* event */ typingsSlinky.reactNative.mod.KeyboardEvent, scala.Unit]
  
  type KeyboardTypeAndroid = typingsSlinky.reactNative.reactNativeStrings.`visible-password`
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNative.mod.KeyboardType
    - typingsSlinky.reactNative.mod.KeyboardTypeAndroid
    - typingsSlinky.reactNative.mod.KeyboardTypeIOS
  */
  type KeyboardTypeOptions = typingsSlinky.reactNative.mod._KeyboardTypeOptions | typingsSlinky.reactNative.mod.KeyboardTypeAndroid
  
  type LayoutAnimation = typingsSlinky.reactNative.mod.LayoutAnimationStatic
  
  type Linking = typingsSlinky.reactNative.mod.LinkingStatic
  
  type ListRenderItem[ItemT] = js.Function1[
    /* info */ typingsSlinky.reactNative.mod.ListRenderItemInfo[ItemT], 
    slinky.core.facade.ReactElement | scala.Null
  ]
  
  type ListViewComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.ListViewProps]
  
  type ListViewProperties = typingsSlinky.reactNative.mod.ListViewProps
  
  type LogBox = typingsSlinky.reactNative.mod.LogBoxStatic
  
  /**
    * @see https://facebook.github.io/react-native/docs/maskedviewios.html
    */
  type MaskedViewComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.MaskedViewIOSProps]
  
  type MaskedViewIOSProperties = typingsSlinky.reactNative.mod.MaskedViewIOSProps
  
  type MeasureInWindowOnSuccessCallback = js.Function4[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    scala.Unit
  ]
  
  type MeasureLayoutOnSuccessCallback = js.Function4[
    /* left */ scala.Double, 
    /* top */ scala.Double, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    scala.Unit
  ]
  
  type MeasureOnSuccessCallback = js.Function6[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    /* pageX */ scala.Double, 
    /* pageY */ scala.Double, 
    scala.Unit
  ]
  
  type ModalProperties = typingsSlinky.reactNative.mod.ModalProps
  
  type ModalProps = typingsSlinky.reactNative.mod.ModalBaseProps with typingsSlinky.reactNative.mod.ModalPropsIOS with typingsSlinky.reactNative.mod.ModalPropsAndroid
  
  type NativeMethodsMixin = typingsSlinky.reactNative.mod.NativeMethods
  
  type NativeMethodsMixinType = typingsSlinky.reactNative.mod.NativeMethods
  
  /**
    * Interface for NativeModules which allows to augment NativeModules with type informations.
    * See react-native-sensor-manager for example.
    */
  type NativeModulesStatic = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type NativeSyntheticEvent[T] = slinky.core.SyntheticEvent[typingsSlinky.reactNative.mod.NodeHandle, T]
  
  type NavigatorIOSProperties = typingsSlinky.reactNative.mod.NavigatorIOSProps
  
  type NodeHandle = scala.Double
  
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type OpaqueColorValue = js.Symbol
  
  type PanResponder = typingsSlinky.reactNative.mod.PanResponderStatic
  
  type PermissionsAndroid = typingsSlinky.reactNative.mod.PermissionsAndroidStatic
  
  /**
    * @see https://facebook.github.io/react-native/docs/pickerios.html
    * @see PickerIOS.ios.js
    */
  type PickerIOSComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.PickerIOSProps]
  
  type PickerIOSItemProperties = typingsSlinky.reactNative.mod.PickerIOSItemProps
  
  type PickerIOSProperties = typingsSlinky.reactNative.mod.PickerIOSProps
  
  type PickerItemProperties = typingsSlinky.reactNative.mod.PickerItemProps
  
  type PickerProperties = typingsSlinky.reactNative.mod.PickerProps
  
  type PickerPropertiesAndroid = typingsSlinky.reactNative.mod.PickerPropsAndroid
  
  type PickerPropertiesIOS = typingsSlinky.reactNative.mod.PickerPropsIOS
  
  type ProcessedColorValue = scala.Double | typingsSlinky.reactNative.mod.OpaqueColorValue
  
  /**
    * React component that wraps the Android-only `ProgressBar`. This component is used to indicate
    * that the app is loading or there is some activity in the app.
    */
  type ProgressBarAndroidComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.ProgressBarAndroidProps]
  
  type ProgressBarAndroidProperties = typingsSlinky.reactNative.mod.ProgressBarAndroidProps
  
  type ProgressViewIOSComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.ProgressViewIOSProps]
  
  type ProgressViewIOSProperties = typingsSlinky.reactNative.mod.ProgressViewIOSProps
  
  type PushNotificationIOS = typingsSlinky.reactNative.mod.PushNotificationIOSStatic
  
  /**
    * Receive events from native-code
    * Deprecated - subclass NativeEventEmitter to create granular event modules instead of
    * adding all event listeners directly to RCTNativeAppEventEmitter.
    * @see https://github.com/facebook/react-native/blob/0.34-stable\Libraries\EventEmitter\RCTNativeAppEventEmitter.js
    * @see https://facebook.github.io/react-native/docs/native-modules-ios.html#sending-events-to-javascript
    */
  type RCTNativeAppEventEmitter = typingsSlinky.reactNative.mod.DeviceEventEmitterStatic
  
  /**
    * Wrapper around android native recycler view.
    *
    * It simply renders rows passed as children in a separate recycler view cells
    * similarly to how `ScrollView` is doing it. Thanks to the fact that it uses
    * native `RecyclerView` though, rows that are out of sight are going to be
    * automatically detached (similarly on how this would work with
    * `removeClippedSubviews = true` on a `ScrollView.js`).
    *
    * CAUTION: This is an experimental component and should only be used together
    * with javascript implementation of list view (see ListView.js). In order to
    * use it pass this component as `renderScrollComponent` to the list view. For
    * now only horizontal scrolling is supported.
    */
  type RecyclerViewBackedScrollViewComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.RecyclerViewBackedScrollViewProps]
  
  type RecyclerViewBackedScrollViewProperties = typingsSlinky.reactNative.mod.RecyclerViewBackedScrollViewProps
  
  type RecyclerViewBackedScrollViewProps = typingsSlinky.reactNative.mod.ScrollViewProps
  
  /**
    * This component is used inside a ScrollView or ListView to add pull to refresh
    * functionality. When the ScrollView is at `scrollY: 0`, swiping down
    * triggers an `onRefresh` event.
    *
    * __Note:__ `refreshing` is a controlled prop, this is why it needs to be set to true
    * in the `onRefresh` function otherwise the refresh indicator will stop immediately.
    */
  type RefreshControlComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.RefreshControlProps]
  
  type RefreshControlProperties = typingsSlinky.reactNative.mod.RefreshControlProps
  
  type RefreshControlPropertiesAndroid = typingsSlinky.reactNative.mod.RefreshControlPropsAndroid
  
  type RefreshControlPropertiesIOS = typingsSlinky.reactNative.mod.RefreshControlPropsIOS
  
  /** Keep a brand of 'T' so that calls to `StyleSheet.flatten` can take `RegisteredStyle<T>` and return `T`. */
  type RegisteredStyle[T] = scala.Double with typingsSlinky.reactNative.anon.RegisteredStyleBrand[T]
  
  type Runnable = js.Function1[/* appParameters */ js.Any, scala.Unit]
  
  /**
    * Renders nested content and automatically applies paddings reflect the portion of the view
    * that is not covered by navigation bars, tab bars, toolbars, and other ancestor views.
    * Moreover, and most importantly, Safe Area's paddings reflect physical limitation of the screen,
    * such as rounded corners or camera notches (aka sensor housing area on iPhone X).
    */
  type SafeAreaViewComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.ViewProps]
  
  type ScrollResponderEvent = slinky.core.SyntheticEvent[
    typingsSlinky.reactNative.mod.NodeHandle, 
    typingsSlinky.reactNative.mod.NativeTouchEvent
  ]
  
  type ScrollViewComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.ScrollViewProps]
  
  type ScrollViewProperties = typingsSlinky.reactNative.mod.ScrollViewProps
  
  type ScrollViewPropertiesAndroid = typingsSlinky.reactNative.mod.ScrollViewPropsAndroid
  
  type ScrollViewPropertiesIOS = typingsSlinky.reactNative.mod.ScrollViewPropsIOS
  
  type SectionListProperties[ItemT] = typingsSlinky.reactNative.mod.SectionListProps[ItemT]
  
  type SectionListRenderItem[ItemT] = js.Function1[
    /* info */ typingsSlinky.reactNative.mod.SectionListRenderItemInfo[ItemT], 
    slinky.core.facade.ReactElement | scala.Null
  ]
  
  /**
    * Use `SegmentedControlIOS` to render a UISegmentedControl iOS.
    *
    * #### Programmatically changing selected index
    *
    * The selected index can be changed on the fly by assigning the
    * selectIndex prop to a state variable, then changing that variable.
    * Note that the state variable would need to be updated as the user
    * selects a value and changes the index, as shown in the example below.
    *
    * ````
    * <SegmentedControlIOS
    *   values={['One', 'Two']}
    *   selectedIndex={this.state.selectedIndex}
    *   onChange={(event) => {
    *     this.setState({selectedIndex: event.nativeEvent.selectedSegmentIndex});
    *   }}
    * />
    * ````
    */
  type SegmentedControlIOSComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.SegmentedControlIOSProps]
  
  type SegmentedControlIOSProperties = typingsSlinky.reactNative.mod.SegmentedControlIOSProps
  
  type Settings = typingsSlinky.reactNative.mod.SettingsStatic
  
  type Share = typingsSlinky.reactNative.mod.ShareStatic
  
  /**
    * A component used to select a single value from a range of values.
    */
  type SliderComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.SliderProps]
  
  type SliderIOS = typingsSlinky.reactNative.mod.Slider
  
  type SliderProperties = typingsSlinky.reactNative.mod.SliderProps
  
  type SliderPropertiesAndroid = typingsSlinky.reactNative.mod.SliderPropsAndroid
  
  type SliderPropertiesIOS = typingsSlinky.reactNative.mod.SliderPropsIOS
  
  type SnapshotViewIOSComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.SnapshotViewIOSProps]
  
  type SnapshotViewIOSProperties = typingsSlinky.reactNative.mod.SnapshotViewIOSProps
  
  type StatusBarIOS = typingsSlinky.reactNative.mod.StatusBarIOSStatic
  
  type StatusBarIOSStatic = typingsSlinky.reactNative.mod.NativeEventEmitter
  
  type StatusBarProperties = typingsSlinky.reactNative.mod.StatusBarProps
  
  type StatusBarPropertiesAndroid = typingsSlinky.reactNative.mod.StatusBarPropsAndroid
  
  type StatusBarPropertiesIOS = typingsSlinky.reactNative.mod.StatusBarPropsIOS
  
  type StyleProp[T] = T | typingsSlinky.reactNative.mod.RegisteredStyle[T] | (typingsSlinky.reactNative.mod.RecursiveArray[
    T | typingsSlinky.reactNative.mod.RegisteredStyle[T] | typingsSlinky.reactNative.mod.Falsy
  ]) | typingsSlinky.reactNative.mod.Falsy
  
  /**
    * Renders a boolean input.
    *
    * This is a controlled component that requires an `onValueChange` callback that
    * updates the `value` prop in order for the component to reflect user actions.
    * If the `value` prop is not updated, the component will continue to render
    * the supplied `value` prop instead of the expected result of any user actions.
    */
  type SwitchComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.SwitchProps]
  
  type SwitchIOSProperties = typingsSlinky.reactNative.mod.SwitchIOSProps
  
  type SwitchProperties = typingsSlinky.reactNative.mod.SwitchProps
  
  type SwitchPropertiesIOS = typingsSlinky.reactNative.mod.SwitchPropsIOS
  
  type Systrace = typingsSlinky.reactNative.mod.SystraceStatic
  
  type TabBarIOSItemProperties = typingsSlinky.reactNative.mod.TabBarIOSItemProps
  
  type TabBarIOSProperties = typingsSlinky.reactNative.mod.TabBarIOSProps
  
  type Task = js.Function1[/* taskData */ js.Any, js.Promise[scala.Unit]]
  
  type TaskProvider = js.Function0[typingsSlinky.reactNative.mod.Task]
  
  /**
    * A React component for displaying text which supports nesting, styling, and touch handling.
    */
  type TextComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.TextProps]
  
  type TextInputAndroidProperties = typingsSlinky.reactNative.mod.TextInputAndroidProps
  
  /**
    * @see https://facebook.github.io/react-native/docs/textinput.html#methods
    */
  type TextInputComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.TextInputProps]
  
  type TextInputIOSProperties = typingsSlinky.reactNative.mod.TextInputIOSProps
  
  type TextInputProperties = typingsSlinky.reactNative.mod.TextInputProps
  
  type TextProperties = typingsSlinky.reactNative.mod.TextProps
  
  type TextPropertiesAndroid = typingsSlinky.reactNative.mod.TextPropsAndroid
  
  type TextPropertiesIOS = typingsSlinky.reactNative.mod.TextPropsIOS
  
  type TimePickerAndroid = typingsSlinky.reactNative.mod.TimePickerAndroidStatic
  
  type ToastAndroid = typingsSlinky.reactNative.mod.ToastAndroidStatic
  
  /**
    * React component that wraps the Android-only [`Toolbar` widget][0]. A Toolbar can display a logo,
    * navigation icon (e.g. hamburger menu), a title & subtitle and a list of actions. The title and
    * subtitle are expanded so the logo and navigation icons are displayed on the left, title and
    * subtitle in the middle and the actions on the right.
    *
    * If the toolbar has an only child, it will be displayed between the title and actions.
    *
    * Although the Toolbar supports remote images for the logo, navigation and action icons, this
    * should only be used in DEV mode where `require('./some_icon.png')` translates into a packager
    * URL. In release mode you should always use a drawable resource for these icons. Using
    * `require('./some_icon.png')` will do this automatically for you, so as long as you don't
    * explicitly use e.g. `{uri: 'http://...'}`, you will be good.
    *
    * [0]: https://developer.android.com/reference/android/support/v7/widget/Toolbar.html
    */
  type ToolbarAndroidComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.ToolbarAndroidProps]
  
  type ToolbarAndroidProperties = typingsSlinky.reactNative.mod.ToolbarAndroidProps
  
  /**
    * A wrapper for making views respond properly to touches.
    * On press down, the opacity of the wrapped view is decreased,
    * which allows the underlay color to show through, darkening or tinting the view.
    * The underlay comes from adding a view to the view hierarchy,
    * which can sometimes cause unwanted visual artifacts if not used correctly,
    * for example if the backgroundColor of the wrapped view isn't explicitly set to an opaque color.
    *
    * NOTE: TouchableHighlight supports only one child
    * If you wish to have several child components, wrap them in a View.
    *
    * @see https://facebook.github.io/react-native/docs/touchablehighlight.html
    */
  type TouchableHighlightComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.TouchableHighlightProps]
  
  type TouchableHighlightProperties = typingsSlinky.reactNative.mod.TouchableHighlightProps
  
  /**
    * A wrapper for making views respond properly to touches (Android only).
    * On Android this component uses native state drawable to display touch feedback.
    * At the moment it only supports having a single View instance as a child node,
    * as it's implemented by replacing that View with another instance of RCTView node with some additional properties set.
    *
    * Background drawable of native feedback touchable can be customized with background property.
    *
    * @see https://facebook.github.io/react-native/docs/touchablenativefeedback.html#content
    */
  type TouchableNativeFeedbackComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.TouchableNativeFeedbackProps]
  
  type TouchableNativeFeedbackProperties = typingsSlinky.reactNative.mod.TouchableNativeFeedbackProps
  
  /**
    * A wrapper for making views respond properly to touches.
    * On press down, the opacity of the wrapped view is decreased, dimming it.
    * This is done without actually changing the view hierarchy,
    * and in general is easy to add to an app without weird side-effects.
    *
    * @see https://facebook.github.io/react-native/docs/touchableopacity.html
    */
  type TouchableOpacityComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.TouchableOpacityProps]
  
  type TouchableOpacityProperties = typingsSlinky.reactNative.mod.TouchableOpacityProps
  
  /**
    * Do not use unless you have a very good reason.
    * All the elements that respond to press should have a visual feedback when touched.
    * This is one of the primary reason a "web" app doesn't feel "native".
    *
    * @see https://facebook.github.io/react-native/docs/touchablewithoutfeedback.html
    */
  type TouchableWithoutFeedbackComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.TouchableWithoutFeedbackProps]
  
  type TouchableWithoutFeedbackProperties = typingsSlinky.reactNative.mod.TouchableWithoutFeedbackProps
  
  type UIManager = typingsSlinky.reactNative.mod.UIManagerStatic
  
  type Vibration = typingsSlinky.reactNative.mod.VibrationStatic
  
  /**
    * The most fundamental component for building UI, View is a container that supports layout with flexbox, style, some touch handling,
    * and accessibility controls, and is designed to be nested inside other views and to have 0 to many children of any type.
    * View maps directly to the native view equivalent on whatever platform React is running on,
    * whether that is a UIView, <div>, android.view, etc.
    */
  type ViewComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.ViewProps]
  
  type ViewPagerAndroidComponent = slinky.core.ReactComponentClass[typingsSlinky.reactNative.mod.ViewPagerAndroidProps]
  
  type ViewPagerAndroidProperties = typingsSlinky.reactNative.mod.ViewPagerAndroidProps
  
  type ViewProperties = typingsSlinky.reactNative.mod.ViewProps
  
  type ViewPropertiesAndroid = typingsSlinky.reactNative.mod.ViewPropsAndroid
  
  type ViewPropertiesIOS = typingsSlinky.reactNative.mod.ViewPropsIOS
  
  type ViewabilityConfigCallbackPairs = js.Array[typingsSlinky.reactNative.mod.ViewabilityConfigCallbackPair]
  
  type VirtualizedListProperties[ItemT] = typingsSlinky.reactNative.mod.VirtualizedListProps[ItemT]
}
