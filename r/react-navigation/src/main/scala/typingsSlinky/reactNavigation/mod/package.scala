package typingsSlinky.reactNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimatedValue = js.Any
  type CreateNavigatorConfig[NavigatorConfig, RouterConfig, Options, NavigationScreenPropType] = NavigatorConfig with RouterConfig with (typingsSlinky.reactNavigation.anon.DefaultNavigationOptions[Options, NavigationScreenPropType])
  type InferProps[T /* <: slinky.core.ReactComponentClass[_] */] = js.Any
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNavigation.mod.NavigationInitAction
    - typingsSlinky.reactNavigation.mod.NavigationStackAction
    - typingsSlinky.reactNavigation.mod.NavigationTabAction
    - typingsSlinky.reactNavigation.mod.NavigationDrawerAction
    - typingsSlinky.reactNavigation.mod.NavigationSwitchAction
    - typingsSlinky.reactNavigation.anon.Type
  */
  type NavigationAction = typingsSlinky.reactNavigation.mod._NavigationAction | typingsSlinky.reactNavigation.mod.NavigationSwitchAction
  type NavigationComponent[Options, NavigationPropType] = (typingsSlinky.reactNavigation.mod.NavigationScreenComponent[Options, NavigationPropType]) | (typingsSlinky.reactNavigation.mod.NavigationNavigator[Options, NavigationPropType])
  type NavigationDispatch = js.Function1[/* action */ typingsSlinky.reactNavigation.mod.NavigationAction, scala.Boolean]
  type NavigationEventCallback = js.Function1[/* payload */ typingsSlinky.reactNavigation.mod.NavigationEventPayload, scala.Unit]
  type NavigationNavigator[Options, NavigationPropType] = (slinky.core.ReactComponentClass[
    typingsSlinky.reactNavigation.mod.NavigationNavigatorProps[Options, js.Object, _]
  ]) with (typingsSlinky.reactNavigation.anon.Router[Options, NavigationPropType])
  type NavigationParams = org.scalablytyped.runtime.StringDictionary[js.Any]
  type NavigationPathsConfig = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type NavigationRoute[Params] = typingsSlinky.reactNavigation.mod.NavigationLeafRoute[Params] | typingsSlinky.reactNavigation.mod.NavigationStateRoute[Params]
  type NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps] = (typingsSlinky.reactNavigation.mod.NavigationComponent[Options, NavigationScreenPropType]) | (((typingsSlinky.reactNavigation.anon.Screen[Options, NavigationScreenPropType]) | (typingsSlinky.reactNavigation.anon.GetScreen[Options, NavigationScreenPropType])) with (typingsSlinky.reactNavigation.anon.Path[Options, NavigationScreenPropType, ScreenProps]))
  type NavigationRouteConfigMap[Options, NavigationScreenPropType, ScreenProps] = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.reactNavigation.mod.NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps]
  ]
  type NavigationScreenComponent[Options, NavigationScreenPropType] = slinky.core.ReactComponentClass[_] with (typingsSlinky.reactNavigation.anon.NavigationOptions[Options, NavigationScreenPropType])
  type NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps] = Options | (js.Function1[
    /* navigationOptionsContainer */ (typingsSlinky.reactNavigation.mod.NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps]) with typingsSlinky.reactNavigation.anon.NavigationOptionsOptions[Options], 
    Options
  ])
  type NavigationScreenOptionsGetter[Options] = js.Function3[
    /* navigation */ typingsSlinky.reactNavigation.mod.NavigationScreenProp[
      typingsSlinky.reactNavigation.mod.NavigationRoute[js.Any], 
      typingsSlinky.reactNavigation.mod.NavigationParams
    ], 
    /* screenProps */ js.Any | scala.Null, 
    /* theme */ typingsSlinky.reactNavigation.mod.SupportedThemes, 
    Options
  ]
  type NavigationStateRoute[NavigationLeafRouteParams] = typingsSlinky.reactNavigation.mod.NavigationLeafRoute[NavigationLeafRouteParams] with typingsSlinky.reactNavigation.mod.NavigationState
  type NavigationSwitchAction = typingsSlinky.reactNavigation.mod.NavigationJumpToAction
  type NavigationSwitchScreenComponent[Params, ScreenProps] = (slinky.core.ReactComponentClass[
    typingsSlinky.reactNavigation.mod.NavigationSwitchScreenProps[Params, ScreenProps]
  ]) with (typingsSlinky.reactNavigation.anon.NavigationOptionsNavigationScreenConfig[Params, ScreenProps])
  type NavigationView[Options, State, ScreenProps] = slinky.core.ReactComponentClass[
    (typingsSlinky.reactNavigation.anon.Descriptors[Options, ScreenProps]) with typingsSlinky.reactNavigation.mod.NavigationInjectedProps[typingsSlinky.reactNavigation.mod.NavigationParams]
  ]
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  // Themed components
  type ThemedStatusBarProps = typingsSlinky.react.mod.ComponentProps[typingsSlinky.reactNavigation.anon.TypeofStatusBar]
  type ThemedTextInputProps = typingsSlinky.react.mod.ComponentProps[typingsSlinky.reactNavigation.anon.TypeofTextInput]
  type ThemedTextProps = typingsSlinky.react.mod.ComponentProps[org.scalablytyped.runtime.Instantiable0[typingsSlinky.reactNative.mod.Text]]
}
