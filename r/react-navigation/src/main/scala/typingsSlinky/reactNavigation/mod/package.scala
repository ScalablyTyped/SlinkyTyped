package typingsSlinky.reactNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def SafeAreaView: slinky.core.ReactComponentClass[typingsSlinky.reactNavigation.mod.SafeAreaViewProps] = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SafeAreaView").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactNavigation.mod.SafeAreaViewProps]]
  
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
  
  @scala.inline
  def NavigationContext: typingsSlinky.react.mod.Context[
    typingsSlinky.reactNavigation.mod.NavigationScreenProp[
      typingsSlinky.reactNavigation.mod.NavigationRoute[typingsSlinky.reactNavigation.mod.NavigationParams], 
      typingsSlinky.reactNavigation.mod.NavigationParams
    ]
  ] = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NavigationContext").asInstanceOf[typingsSlinky.react.mod.Context[
    typingsSlinky.reactNavigation.mod.NavigationScreenProp[
      typingsSlinky.reactNavigation.mod.NavigationRoute[typingsSlinky.reactNavigation.mod.NavigationParams], 
      typingsSlinky.reactNavigation.mod.NavigationParams
    ]
  ]]
  
  type NavigationDispatch = js.Function1[/* action */ typingsSlinky.reactNavigation.mod.NavigationAction, scala.Boolean]
  
  type NavigationEventCallback = js.Function1[/* payload */ typingsSlinky.reactNavigation.mod.NavigationEventPayload, scala.Unit]
  
  @scala.inline
  def NavigationEvents: slinky.core.ReactComponentClass[typingsSlinky.reactNavigation.mod.NavigationEventsProps] = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NavigationEvents").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactNavigation.mod.NavigationEventsProps]]
  
  type NavigationNavigator[Options, NavigationPropType] = (slinky.core.ReactComponentClass[
    typingsSlinky.reactNavigation.mod.NavigationNavigatorProps[Options, js.Object, _]
  ]) with (typingsSlinky.reactNavigation.anon.Router[Options, NavigationPropType])
  
  type NavigationParams = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type NavigationPathsConfig = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  @scala.inline
  def NavigationProvider: slinky.core.ReactComponentClass[typingsSlinky.reactNavigation.anon.Value] = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NavigationProvider").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactNavigation.anon.Value]]
  
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
  ]) with (typingsSlinky.reactNavigation.anon.`1`[Params, ScreenProps])
  
  type NavigationView[Options, State, ScreenProps] = slinky.core.ReactComponentClass[
    ((typingsSlinky.reactNavigation.anon.Descriptors[Options, ScreenProps]) with typingsSlinky.reactNavigation.mod.NavigationInjectedProps[typingsSlinky.reactNavigation.mod.NavigationParams]) | js.Any
  ]
  
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  @scala.inline
  def SceneView: slinky.core.ReactComponentClass[typingsSlinky.reactNavigation.mod.SceneViewProps] = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SceneView").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.reactNavigation.mod.SceneViewProps]]
  
  @scala.inline
  def StackRouter(routeConfigs: typingsSlinky.reactNavigation.mod.NavigationRouteConfigMap[_, _, _]): typingsSlinky.reactNavigation.mod.NavigationRouter[_, _] = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("StackRouter")(routeConfigs.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationRouter[_, _]]
  @scala.inline
  def StackRouter(
    routeConfigs: typingsSlinky.reactNavigation.mod.NavigationRouteConfigMap[_, _, _],
    config: typingsSlinky.reactNavigation.mod.NavigationTabRouterConfig
  ): typingsSlinky.reactNavigation.mod.NavigationRouter[_, _] = (typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("StackRouter")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationRouter[_, _]]
  
  @scala.inline
  def SwitchRouter(routeConfigs: typingsSlinky.reactNavigation.mod.NavigationRouteConfigMap[_, _, _]): typingsSlinky.reactNavigation.mod.NavigationRouter[_, _] = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("SwitchRouter")(routeConfigs.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationRouter[_, _]]
  @scala.inline
  def SwitchRouter(
    routeConfigs: typingsSlinky.reactNavigation.mod.NavigationRouteConfigMap[_, _, _],
    config: typingsSlinky.reactNavigation.mod.NavigationSwitchRouterConfig
  ): typingsSlinky.reactNavigation.mod.NavigationRouter[_, _] = (typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("SwitchRouter")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationRouter[_, _]]
  
  @scala.inline
  def TabRouter(
    routeConfigs: typingsSlinky.reactNavigation.mod.NavigationRouteConfigMap[_, _, _],
    config: typingsSlinky.reactNavigation.mod.NavigationTabRouterConfig
  ): typingsSlinky.reactNavigation.mod.NavigationRouter[_, _] = (typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("TabRouter")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationRouter[_, _]]
  
  @scala.inline
  def ThemeContext: typingsSlinky.react.mod.Context[typingsSlinky.reactNavigation.mod.SupportedThemes] = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ThemeContext").asInstanceOf[typingsSlinky.react.mod.Context[typingsSlinky.reactNavigation.mod.SupportedThemes]]
  
  // Themed components
  type ThemedStatusBarProps = typingsSlinky.react.mod.ComponentProps[typingsSlinky.reactNavigation.anon.TypeofStatusBar]
  
  type ThemedTextInputProps = typingsSlinky.react.mod.ComponentProps[typingsSlinky.reactNavigation.anon.TypeofTextInput]
  
  type ThemedTextProps = typingsSlinky.react.mod.ComponentProps[org.scalablytyped.runtime.Instantiable0[typingsSlinky.reactNative.mod.Text]]
  
  @scala.inline
  def createAppContainer[Options, NavigationPropType](Component: typingsSlinky.reactNavigation.mod.NavigationNavigator[Options, NavigationPropType]): typingsSlinky.reactNavigation.mod.NavigationContainer = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createAppContainer")(Component.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationContainer]
  
  @scala.inline
  def createKeyboardAwareNavigator[Props](Comp: slinky.core.ReactComponentClass[Props], stackConfig: js.Object): slinky.core.ReactComponentClass[Props] = (typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createKeyboardAwareNavigator")(Comp.asInstanceOf[js.Any], stackConfig.asInstanceOf[js.Any])).asInstanceOf[slinky.core.ReactComponentClass[Props]]
  
  @scala.inline
  def createNavigationContainer[Options, NavigationPropType](Component: typingsSlinky.reactNavigation.mod.NavigationNavigator[Options, NavigationPropType]): typingsSlinky.reactNavigation.mod.NavigationContainer = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigationContainer")(Component.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationContainer]
  
  @scala.inline
  def createNavigator[S, Options](
    view: typingsSlinky.reactNavigation.mod.NavigationView[Options, S, _],
    router: typingsSlinky.reactNavigation.mod.NavigationRouter[S, Options]
  ): typingsSlinky.reactNavigation.mod.NavigationNavigator[
    Options, 
    typingsSlinky.reactNavigation.mod.NavigationProp[typingsSlinky.reactNavigation.mod.NavigationState]
  ] = (typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(view.asInstanceOf[js.Any], router.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationNavigator[
    Options, 
    typingsSlinky.reactNavigation.mod.NavigationProp[typingsSlinky.reactNavigation.mod.NavigationState]
  ]]
  @scala.inline
  def createNavigator[S, Options](
    view: typingsSlinky.reactNavigation.mod.NavigationView[Options, S, _],
    router: typingsSlinky.reactNavigation.mod.NavigationRouter[S, Options],
    navigatorConfig: js.UndefOr[scala.Nothing],
    navigatorType: typingsSlinky.reactNavigation.mod.NavigatorType
  ): typingsSlinky.reactNavigation.mod.NavigationNavigator[
    Options, 
    typingsSlinky.reactNavigation.mod.NavigationProp[typingsSlinky.reactNavigation.mod.NavigationState]
  ] = (typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(view.asInstanceOf[js.Any], router.asInstanceOf[js.Any], navigatorConfig.asInstanceOf[js.Any], navigatorType.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationNavigator[
    Options, 
    typingsSlinky.reactNavigation.mod.NavigationProp[typingsSlinky.reactNavigation.mod.NavigationState]
  ]]
  @scala.inline
  def createNavigator[S, Options](
    view: typingsSlinky.reactNavigation.mod.NavigationView[Options, S, _],
    router: typingsSlinky.reactNavigation.mod.NavigationRouter[S, Options],
    navigatorConfig: js.Object
  ): typingsSlinky.reactNavigation.mod.NavigationNavigator[
    Options, 
    typingsSlinky.reactNavigation.mod.NavigationProp[typingsSlinky.reactNavigation.mod.NavigationState]
  ] = (typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(view.asInstanceOf[js.Any], router.asInstanceOf[js.Any], navigatorConfig.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationNavigator[
    Options, 
    typingsSlinky.reactNavigation.mod.NavigationProp[typingsSlinky.reactNavigation.mod.NavigationState]
  ]]
  @scala.inline
  def createNavigator[S, Options](
    view: typingsSlinky.reactNavigation.mod.NavigationView[Options, S, _],
    router: typingsSlinky.reactNavigation.mod.NavigationRouter[S, Options],
    navigatorConfig: js.Object,
    navigatorType: typingsSlinky.reactNavigation.mod.NavigatorType
  ): typingsSlinky.reactNavigation.mod.NavigationNavigator[
    Options, 
    typingsSlinky.reactNavigation.mod.NavigationProp[typingsSlinky.reactNavigation.mod.NavigationState]
  ] = (typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(view.asInstanceOf[js.Any], router.asInstanceOf[js.Any], navigatorConfig.asInstanceOf[js.Any], navigatorType.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationNavigator[
    Options, 
    typingsSlinky.reactNavigation.mod.NavigationProp[typingsSlinky.reactNavigation.mod.NavigationState]
  ]]
  
  @scala.inline
  def createSwitchNavigator(
    routeConfigMap: typingsSlinky.reactNavigation.mod.NavigationRouteConfigMap[
      js.Object, 
      typingsSlinky.reactNavigation.mod.NavigationSwitchProp[
        typingsSlinky.reactNavigation.mod.NavigationRoute[typingsSlinky.reactNavigation.mod.NavigationParams], 
        typingsSlinky.reactNavigation.mod.NavigationParams
      ], 
      _
    ]
  ): typingsSlinky.reactNavigation.mod.NavigationNavigator[
    js.Object, 
    typingsSlinky.reactNavigation.mod.NavigationProp[typingsSlinky.reactNavigation.mod.NavigationState]
  ] = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSwitchNavigator")(routeConfigMap.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationNavigator[
    js.Object, 
    typingsSlinky.reactNavigation.mod.NavigationProp[typingsSlinky.reactNavigation.mod.NavigationState]
  ]]
  @scala.inline
  def createSwitchNavigator(
    routeConfigMap: typingsSlinky.reactNavigation.mod.NavigationRouteConfigMap[
      js.Object, 
      typingsSlinky.reactNavigation.mod.NavigationSwitchProp[
        typingsSlinky.reactNavigation.mod.NavigationRoute[typingsSlinky.reactNavigation.mod.NavigationParams], 
        typingsSlinky.reactNavigation.mod.NavigationParams
      ], 
      _
    ],
    switchConfig: typingsSlinky.reactNavigation.anon.CreateNavigatorConfigNavi
  ): typingsSlinky.reactNavigation.mod.NavigationNavigator[
    js.Object, 
    typingsSlinky.reactNavigation.mod.NavigationProp[typingsSlinky.reactNavigation.mod.NavigationState]
  ] = (typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSwitchNavigator")(routeConfigMap.asInstanceOf[js.Any], switchConfig.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationNavigator[
    js.Object, 
    typingsSlinky.reactNavigation.mod.NavigationProp[typingsSlinky.reactNavigation.mod.NavigationState]
  ]]
  
  @scala.inline
  def getActiveChildNavigationOptions[S](navigation: typingsSlinky.reactNavigation.mod.NavigationProp[S]): typingsSlinky.reactNavigation.mod.NavigationParams = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getActiveChildNavigationOptions")(navigation.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationParams]
  @scala.inline
  def getActiveChildNavigationOptions[S](
    navigation: typingsSlinky.reactNavigation.mod.NavigationProp[S],
    screenProps: js.UndefOr[scala.Nothing],
    theme: typingsSlinky.reactNavigation.mod.SupportedThemes
  ): typingsSlinky.reactNavigation.mod.NavigationParams = (typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getActiveChildNavigationOptions")(navigation.asInstanceOf[js.Any], screenProps.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationParams]
  @scala.inline
  def getActiveChildNavigationOptions[S](navigation: typingsSlinky.reactNavigation.mod.NavigationProp[S], screenProps: js.Any): typingsSlinky.reactNavigation.mod.NavigationParams = (typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getActiveChildNavigationOptions")(navigation.asInstanceOf[js.Any], screenProps.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationParams]
  @scala.inline
  def getActiveChildNavigationOptions[S](
    navigation: typingsSlinky.reactNavigation.mod.NavigationProp[S],
    screenProps: js.Any,
    theme: typingsSlinky.reactNavigation.mod.SupportedThemes
  ): typingsSlinky.reactNavigation.mod.NavigationParams = (typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getActiveChildNavigationOptions")(navigation.asInstanceOf[js.Any], screenProps.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactNavigation.mod.NavigationParams]
  
  @scala.inline
  def useTheme(): typingsSlinky.reactNavigation.mod.SupportedThemes = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[typingsSlinky.reactNavigation.mod.SupportedThemes]
  
  @scala.inline
  def withNavigation[P /* <: typingsSlinky.reactNavigation.mod.NavigationInjectedProps[typingsSlinky.reactNavigation.mod.NavigationParams] */](Component: slinky.core.ReactComponentClass[P]): slinky.core.ReactComponentClass[
    typingsSlinky.reactNavigation.mod.Omit[P, typingsSlinky.reactNavigation.reactNavigationStrings.navigation]
  ] = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigation")(Component.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    typingsSlinky.reactNavigation.mod.Omit[P, typingsSlinky.reactNavigation.reactNavigationStrings.navigation]
  ]]
  @scala.inline
  def withNavigation[P /* <: typingsSlinky.reactNavigation.mod.NavigationInjectedProps[typingsSlinky.reactNavigation.mod.NavigationParams] */, T /* <: slinky.core.ReactComponentClass[P] */](Component: T with slinky.core.ReactComponentClass[P]): slinky.core.ReactComponentClass[
    (typingsSlinky.reactNavigation.mod.Omit[P, typingsSlinky.reactNavigation.reactNavigationStrings.navigation]) with (typingsSlinky.reactNavigation.anon.OnRef[T, P])
  ] = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigation")(Component.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    (typingsSlinky.reactNavigation.mod.Omit[P, typingsSlinky.reactNavigation.reactNavigationStrings.navigation]) with (typingsSlinky.reactNavigation.anon.OnRef[T, P])
  ]]
  
  @scala.inline
  def withNavigationFocus[P /* <: typingsSlinky.reactNavigation.mod.NavigationFocusInjectedProps[typingsSlinky.reactNavigation.mod.NavigationParams] */](Component: slinky.core.ReactComponentClass[P]): slinky.core.ReactComponentClass[
    typingsSlinky.reactNavigation.mod.Omit[
      P, 
      /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ typingsSlinky.reactNavigation.reactNavigationStrings.isFocused | typingsSlinky.reactNavigation.reactNavigationStrings.navigation
    ]
  ] = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigationFocus")(Component.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    typingsSlinky.reactNavigation.mod.Omit[
      P, 
      /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ typingsSlinky.reactNavigation.reactNavigationStrings.isFocused | typingsSlinky.reactNavigation.reactNavigationStrings.navigation
    ]
  ]]
  @scala.inline
  def withNavigationFocus[P /* <: typingsSlinky.reactNavigation.mod.NavigationFocusInjectedProps[typingsSlinky.reactNavigation.mod.NavigationParams] */, T /* <: slinky.core.ReactComponentClass[P] */](Component: T with slinky.core.ReactComponentClass[P]): slinky.core.ReactComponentClass[
    (typingsSlinky.reactNavigation.mod.Omit[
      P, 
      /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ typingsSlinky.reactNavigation.reactNavigationStrings.isFocused | typingsSlinky.reactNavigation.reactNavigationStrings.navigation
    ]) with (typingsSlinky.reactNavigation.anon.`4`[T, P])
  ] = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigationFocus")(Component.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    (typingsSlinky.reactNavigation.mod.Omit[
      P, 
      /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ typingsSlinky.reactNavigation.reactNavigationStrings.isFocused | typingsSlinky.reactNavigation.reactNavigationStrings.navigation
    ]) with (typingsSlinky.reactNavigation.anon.`4`[T, P])
  ]]
  
  @scala.inline
  def withNavigationFocus_TP[T, P](
    Component: slinky.core.ReactComponentClass[T with typingsSlinky.reactNavigation.mod.NavigationFocusInjectedProps[P]]
  ): slinky.core.ReactComponentClass[T with (typingsSlinky.reactNavigation.anon.`5`[T, P])] = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigationFocus")(Component.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[T with (typingsSlinky.reactNavigation.anon.`5`[T, P])]]
  
  @scala.inline
  def withNavigation_TP[T, P](
    Component: slinky.core.ReactComponentClass[T with typingsSlinky.reactNavigation.mod.NavigationInjectedProps[P]]
  ): slinky.core.ReactComponentClass[T with (typingsSlinky.reactNavigation.anon.`3`[T, P])] = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigation")(Component.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[T with (typingsSlinky.reactNavigation.anon.`3`[T, P])]]
  
  @scala.inline
  def withOrientation[P /* <: typingsSlinky.reactNavigation.mod.NavigationOrientationInjectedProps */](Component: slinky.core.ReactComponentClass[P]): slinky.core.ReactComponentClass[
    typingsSlinky.reactNavigation.mod.Omit[P, typingsSlinky.reactNavigation.reactNavigationStrings.isLandscape]
  ] = typingsSlinky.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withOrientation")(Component.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    typingsSlinky.reactNavigation.mod.Omit[P, typingsSlinky.reactNavigation.reactNavigationStrings.isLandscape]
  ]]
}
