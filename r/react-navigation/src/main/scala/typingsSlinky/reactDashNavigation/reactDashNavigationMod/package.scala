package typingsSlinky.reactDashNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNavigationMod {
  import org.scalablytyped.runtime.Instantiable0
  import org.scalablytyped.runtime.StringDictionary
  import slinky.core.ReactComponentClass
  import typingsSlinky.react.reactMod.ComponentProps
  import typingsSlinky.reactDashNative.reactDashNativeMod.Text
  import typingsSlinky.reactDashNavigation.Anon_DefaultNavigationOptions
  import typingsSlinky.reactDashNavigation.Anon_Descriptors
  import typingsSlinky.reactDashNavigation.Anon_GetScreen
  import typingsSlinky.reactDashNavigation.Anon_JumpTo
  import typingsSlinky.reactDashNavigation.Anon_Key
  import typingsSlinky.reactDashNavigation.Anon_NavigationOptions
  import typingsSlinky.reactDashNavigation.Anon_NavigationOptionsNavigationParams
  import typingsSlinky.reactDashNavigation.Anon_NavigationOptionsOptions
  import typingsSlinky.reactDashNavigation.Anon_NavigationOptionsRouter
  import typingsSlinky.reactDashNavigation.Anon_Screen
  import typingsSlinky.reactDashNavigation.TypeofClassStatusBar
  import typingsSlinky.reactDashNavigation.TypeofClassTextInput
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type AnimatedValue = js.Any
  type CreateNavigatorConfig[NavigatorConfig, RouterConfig, Options, NavigationScreenPropType] = NavigatorConfig with RouterConfig with (Anon_DefaultNavigationOptions[Options, NavigationScreenPropType])
  type InferProps[T /* <: ReactComponentClass[_] */] = js.Any
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashNavigation.reactDashNavigationMod.NavigationInitAction
    - typings.reactDashNavigation.reactDashNavigationMod.NavigationStackAction
    - typings.reactDashNavigation.reactDashNavigationMod.NavigationTabAction
    - typings.reactDashNavigation.reactDashNavigationMod.NavigationDrawerAction
    - typings.reactDashNavigation.reactDashNavigationMod.NavigationSwitchAction
    - typings.reactDashNavigation.Anon_CHILDACTION
  */
  type NavigationAction = _NavigationAction | NavigationSwitchAction
  type NavigationComponent[Options, NavigationPropType] = (NavigationScreenComponent[Options, NavigationPropType]) | (NavigationNavigator[Options, NavigationPropType])
  type NavigationDispatch = js.Function1[/* action */ NavigationAction, Boolean]
  type NavigationEventCallback = js.Function1[/* payload */ NavigationEventPayload, Unit]
  type NavigationNavigator[Options, NavigationPropType] = (ReactComponentClass[NavigationNavigatorProps[Options, js.Object, _]]) with (Anon_NavigationOptionsRouter[Options, NavigationPropType])
  type NavigationParams = StringDictionary[js.Any]
  type NavigationPathsConfig = StringDictionary[String]
  type NavigationRoute[Params] = NavigationLeafRoute[Params] | NavigationStateRoute[Params]
  type NavigationRouteConfig[Options, NavigationScreenPropType] = (NavigationComponent[Options, NavigationScreenPropType]) | (((Anon_Screen[Options, NavigationScreenPropType]) | (Anon_GetScreen[Options, NavigationScreenPropType])) with (Anon_Key[Options, NavigationScreenPropType]))
  type NavigationRouteConfigMap[Options, NavigationScreenPropType] = StringDictionary[NavigationRouteConfig[Options, NavigationScreenPropType]]
  type NavigationScreenComponent[Options, NavigationScreenPropType] = ReactComponentClass[_] with (Anon_NavigationOptions[Options, NavigationScreenPropType])
  type NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps] = Options | (js.Function1[
    /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps]) with Anon_NavigationOptionsOptions[Options], 
    Options
  ])
  type NavigationScreenOptionsGetter[Options] = js.Function3[
    /* navigation */ NavigationScreenProp[NavigationRoute[js.Any], NavigationParams], 
    /* screenProps */ js.Any | Null, 
    /* theme */ SupportedThemes, 
    Options
  ]
  type NavigationStateRoute[NavigationLeafRouteParams] = NavigationLeafRoute[NavigationLeafRouteParams] with NavigationState
  type NavigationSwitchAction = NavigationJumpToAction
  type NavigationSwitchProp[State, Params] = (NavigationScreenProp[State, Params]) with Anon_JumpTo
  type NavigationSwitchScreenComponent[Params, ScreenProps] = (ReactComponentClass[NavigationSwitchScreenProps[Params, ScreenProps]]) with (Anon_NavigationOptionsNavigationParams[Params, ScreenProps])
  type NavigationView[Options, State, ScreenProps] = ReactComponentClass[
    (Anon_Descriptors[Options, ScreenProps]) with NavigationInjectedProps[NavigationParams]
  ]
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  // Themed components
  type ThemedStatusBarProps = ComponentProps[TypeofClassStatusBar]
  type ThemedTextInputProps = ComponentProps[TypeofClassTextInput]
  type ThemedTextProps = ComponentProps[Instantiable0[Text]]
}
