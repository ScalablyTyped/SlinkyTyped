package typingsSlinky.reactNavigationNative

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.CElement
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactNative.mod.Text
import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.reactNavigationCore.anon.Descriptors
import typingsSlinky.reactNavigationCore.anon.Options
import typingsSlinky.reactNavigationCore.anon.PartialStateNavigationSta
import typingsSlinky.reactNavigationCore.anon.State
import typingsSlinky.reactNavigationCore.getActionFromStateMod.NavigateAction
import typingsSlinky.reactNavigationCore.getStateFromPathMod.ResultState
import typingsSlinky.reactNavigationCore.typesMod.DefaultNavigatorOptions
import typingsSlinky.reactNavigationCore.typesMod.EventMapBase
import typingsSlinky.reactNavigationCore.typesMod.NavigationContainerProps
import typingsSlinky.reactNavigationCore.typesMod.NavigationContainerRef
import typingsSlinky.reactNavigationCore.typesMod.NavigationHelpers
import typingsSlinky.reactNavigationCore.typesMod.NavigationProp
import typingsSlinky.reactNavigationCore.typesMod.RouteProp
import typingsSlinky.reactNavigationCore.typesMod.TypedNavigator
import typingsSlinky.reactNavigationCore.useFocusEffectMod.EffectCallback
import typingsSlinky.reactNavigationCore.useNavigationStateMod.Selector
import typingsSlinky.reactNavigationNative.anon.AccessibilityRole
import typingsSlinky.reactNavigationNative.anon.GetInitialState
import typingsSlinky.reactNavigationNative.anon.NavigationContainerPropst
import typingsSlinky.reactNavigationNative.anon.ServerContextTypechildren
import typingsSlinky.reactNavigationNative.linkMod.Props
import typingsSlinky.reactNavigationNative.typesMod.LinkingOptions
import typingsSlinky.reactNavigationNative.typesMod.Theme
import typingsSlinky.reactNavigationNative.useScrollToTopMod.ScrollableWrapper
import typingsSlinky.reactNavigationRouters.anon.KeyParams
import typingsSlinky.reactNavigationRouters.anon.Name
import typingsSlinky.reactNavigationRouters.anon.Payload
import typingsSlinky.reactNavigationRouters.anon.PayloadSource
import typingsSlinky.reactNavigationRouters.anon.PayloadSourceTarget
import typingsSlinky.reactNavigationRouters.anon.PayloadSourceTargetType
import typingsSlinky.reactNavigationRouters.anon.Readonlykeystringindexnum
import typingsSlinky.reactNavigationRouters.anon.Source
import typingsSlinky.reactNavigationRouters.anon.SourceTargetType
import typingsSlinky.reactNavigationRouters.anon.TargetType
import typingsSlinky.reactNavigationRouters.anon.Type
import typingsSlinky.reactNavigationRouters.commonActionsMod.Action
import typingsSlinky.reactNavigationRouters.commonActionsMod.ResetState
import typingsSlinky.reactNavigationRouters.drawerRouterMod.DrawerActionType
import typingsSlinky.reactNavigationRouters.drawerRouterMod.DrawerNavigationState
import typingsSlinky.reactNavigationRouters.drawerRouterMod.DrawerRouterOptions
import typingsSlinky.reactNavigationRouters.stackRouterMod.StackActionType
import typingsSlinky.reactNavigationRouters.stackRouterMod.StackNavigationState
import typingsSlinky.reactNavigationRouters.stackRouterMod.StackRouterOptions
import typingsSlinky.reactNavigationRouters.tabRouterMod.TabActionType
import typingsSlinky.reactNavigationRouters.tabRouterMod.TabNavigationState
import typingsSlinky.reactNavigationRouters.tabRouterMod.TabRouterOptions
import typingsSlinky.reactNavigationRouters.typesMod.CommonNavigationAction
import typingsSlinky.reactNavigationRouters.typesMod.DefaultRouterOptions
import typingsSlinky.reactNavigationRouters.typesMod.NavigationState
import typingsSlinky.reactNavigationRouters.typesMod.ParamListBase
import typingsSlinky.reactNavigationRouters.typesMod.PartialState
import typingsSlinky.reactNavigationRouters.typesMod.Route
import typingsSlinky.reactNavigationRouters.typesMod.Router
import typingsSlinky.reactNavigationRouters.typesMod.RouterFactory
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Container component which holds the navigation state.
    * This should be rendered at the root wrapping the whole app.
    *
    * @param props.initialState Initial state object for the navigation tree.
    * @param props.onStateChange Callback which is called with the latest navigation state when it changes.
    * @param props.children Child elements to render the content.
    * @param props.ref Ref object which refers to the navigation object containing helper methods.
    */
  @JSImport("@react-navigation/native", "BaseNavigationContainer")
  @js.native
  val BaseNavigationContainer: ForwardRefExoticComponent[NavigationContainerProps with RefAttributes[NavigationContainerRef]] = js.native
  
  /**
    * Base router object that can be used when writing custom routers.
    * This provides few helper methods to handle common actions such as `RESET`.
    */
  object BaseRouter {
    
    @JSImport("@react-navigation/native", "BaseRouter.getStateForAction")
    @js.native
    def getStateForAction[State /* <: Readonlykeystringindexnum */](state: State, action: CommonNavigationAction): State | PartialState[State] | Null = js.native
    
    @JSImport("@react-navigation/native", "BaseRouter.shouldActionChangeFocus")
    @js.native
    def shouldActionChangeFocus(action: CommonNavigationAction): Boolean = js.native
  }
  
  object CommonActions {
    
    @JSImport("@react-navigation/native", "CommonActions.goBack")
    @js.native
    def goBack(): Action = js.native
    
    @JSImport("@react-navigation/native", "CommonActions.navigate")
    @js.native
    def navigate(name: String): Action = js.native
    @JSImport("@react-navigation/native", "CommonActions.navigate")
    @js.native
    def navigate(name: String, params: js.Object): Action = js.native
    @JSImport("@react-navigation/native", "CommonActions.navigate")
    @js.native
    def navigate(route: KeyParams): Action = js.native
    @JSImport("@react-navigation/native", "CommonActions.navigate")
    @js.native
    def navigate(route: Name): Action = js.native
    
    @JSImport("@react-navigation/native", "CommonActions.reset")
    @js.native
    def reset(): Action = js.native
    @JSImport("@react-navigation/native", "CommonActions.reset")
    @js.native
    def reset(state: ResetState): Action = js.native
    
    @JSImport("@react-navigation/native", "CommonActions.setParams")
    @js.native
    def setParams(params: js.Object): Action = js.native
  }
  
  /**
    * Context which holds the values for the current navigation tree.
    * Intended for use in SSR. This is not safe to use on the client.
    */
  @JSImport("@react-navigation/native", "CurrentRenderContext")
  @js.native
  val CurrentRenderContext: Context[js.UndefOr[Options]] = js.native
  
  @JSImport("@react-navigation/native", "DarkTheme")
  @js.native
  val DarkTheme: Theme = js.native
  
  @JSImport("@react-navigation/native", "DefaultTheme")
  @js.native
  val DefaultTheme: Theme = js.native
  
  object DrawerActions {
    
    @JSImport("@react-navigation/native", "DrawerActions.closeDrawer")
    @js.native
    def closeDrawer(): DrawerActionType = js.native
    
    @JSImport("@react-navigation/native", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("@react-navigation/native", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
    
    @JSImport("@react-navigation/native", "DrawerActions.openDrawer")
    @js.native
    def openDrawer(): DrawerActionType = js.native
    
    @JSImport("@react-navigation/native", "DrawerActions.toggleDrawer")
    @js.native
    def toggleDrawer(): DrawerActionType = js.native
  }
  
  @JSImport("@react-navigation/native", "DrawerRouter")
  @js.native
  def DrawerRouter(hasOpenByDefaultRest: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = js.native
  
  @JSImport("@react-navigation/native", "Link")
  @js.native
  def Link(hasToActionRest: Props): CElement[TextProps, Text] = js.native
  
  /**
    * Container component which holds the navigation state designed for React Native apps.
    * This should be rendered at the root wrapping the whole app.
    *
    * @param props.initialState Initial state object for the navigation tree. When deep link handling is enabled, this will override deep links when specified. Make sure that you don't specify an `initialState` when there's a deep link (`Linking.getInitialURL()`).
    * @param props.onReady Callback which is called after the navigation tree mounts.
    * @param props.onStateChange Callback which is called with the latest navigation state when it changes.
    * @param props.theme Theme object for the navigators.
    * @param props.linking Options for deep linking. Deep link handling is enabled when this prop is provided, unless `linking.enabled` is `false`.
    * @param props.fallback Fallback component to render until we have finished getting initial state when linking is enabled. Defaults to `null`.
    * @param props.documentTitle Options to configure the document title on Web. Updating document title is handled by default unless `documentTitle.enabled` is `false`.
    * @param props.children Child elements to render the content.
    * @param props.ref Ref object which refers to the navigation object containing helper methods.
    */
  @JSImport("@react-navigation/native", "NavigationContainer")
  @js.native
  val NavigationContainer: ForwardRefExoticComponent[NavigationContainerPropst] = js.native
  
  /**
    * Context which holds the navigation prop for a screen.
    */
  @JSImport("@react-navigation/native", "NavigationContext")
  @js.native
  val NavigationContext: Context[
    js.UndefOr[
      NavigationProp[Record[String, js.UndefOr[js.Object]], String, js.Any, js.Any, js.Object]
    ]
  ] = js.native
  
  /**
    * Context which holds the navigation helpers of the parent navigator.
    * Navigators should use this context in their view component.
    */
  @JSImport("@react-navigation/native", "NavigationHelpersContext")
  @js.native
  val NavigationHelpersContext: Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]] = js.native
  
  /**
    * Context which holds the route prop for a screen.
    */
  @JSImport("@react-navigation/native", "NavigationRouteContext")
  @js.native
  val NavigationRouteContext: Context[js.UndefOr[Route[String, js.UndefOr[js.Object]]]] = js.native
  
  @JSImport("@react-navigation/native", "PrivateValueStore")
  @js.native
  class PrivateValueStore[A, B, C] ()
    extends typingsSlinky.reactNavigationCore.mod.PrivateValueStore[A, B, C]
  
  @JSImport("@react-navigation/native", "ServerContainer")
  @js.native
  val ServerContainer: ForwardRefExoticComponent[ServerContextTypechildren] = js.native
  
  object StackActions {
    
    @JSImport("@react-navigation/native", "StackActions.pop")
    @js.native
    def pop(): StackActionType = js.native
    @JSImport("@react-navigation/native", "StackActions.pop")
    @js.native
    def pop(count: Double): StackActionType = js.native
    
    @JSImport("@react-navigation/native", "StackActions.popToTop")
    @js.native
    def popToTop(): StackActionType = js.native
    
    @JSImport("@react-navigation/native", "StackActions.push")
    @js.native
    def push(name: String): StackActionType = js.native
    @JSImport("@react-navigation/native", "StackActions.push")
    @js.native
    def push(name: String, params: js.Object): StackActionType = js.native
    
    @JSImport("@react-navigation/native", "StackActions.replace")
    @js.native
    def replace(name: String): StackActionType = js.native
    @JSImport("@react-navigation/native", "StackActions.replace")
    @js.native
    def replace(name: String, params: js.Object): StackActionType = js.native
  }
  
  @JSImport("@react-navigation/native", "StackRouter")
  @js.native
  def StackRouter(options: StackRouterOptions): Router[
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | PayloadSource | TargetType | PayloadSourceTarget | SourceTargetType
  ] = js.native
  
  object TabActions {
    
    @JSImport("@react-navigation/native", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("@react-navigation/native", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
  }
  
  @JSImport("@react-navigation/native", "TabRouter")
  @js.native
  def TabRouter(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | TabActionType
  ] = js.native
  
  @JSImport("@react-navigation/native", "ThemeProvider")
  @js.native
  def ThemeProvider(hasValueChildren: typingsSlinky.reactNavigationNative.themeProviderMod.Props): ReactElement = js.native
  
  @JSImport("@react-navigation/native", "createNavigatorFactory")
  @js.native
  def createNavigatorFactory[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, NavigatorComponent /* <: ReactComponentClass[_] */](Navigator: NavigatorComponent): js.Function0[
    TypedNavigator[
      Record[String, js.UndefOr[js.Object]], 
      State, 
      ScreenOptions, 
      EventMap, 
      NavigatorComponent
    ]
  ] = js.native
  
  @JSImport("@react-navigation/native", "getActionFromState")
  @js.native
  def getActionFromState(state: PartialStateNavigationSta): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = js.native
  @JSImport("@react-navigation/native", "getActionFromState")
  @js.native
  def getActionFromState(
    state: PartialStateNavigationSta,
    options: typingsSlinky.reactNavigationCore.getActionFromStateMod.Options
  ): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = js.native
  
  @JSImport("@react-navigation/native", "getFocusedRouteNameFromRoute")
  @js.native
  def getFocusedRouteNameFromRoute(route: (Partial[Route[String, js.UndefOr[js.Object]]]) with State): js.UndefOr[String] = js.native
  
  @JSImport("@react-navigation/native", "getPathFromState")
  @js.native
  def getPathFromState(state: typingsSlinky.reactNavigationCore.getPathFromStateMod.State): String = js.native
  @JSImport("@react-navigation/native", "getPathFromState")
  @js.native
  def getPathFromState(
    state: typingsSlinky.reactNavigationCore.getPathFromStateMod.State,
    options: typingsSlinky.reactNavigationCore.getPathFromStateMod.Options
  ): String = js.native
  
  @JSImport("@react-navigation/native", "getStateFromPath")
  @js.native
  def getStateFromPath(path: String): js.UndefOr[ResultState] = js.native
  @JSImport("@react-navigation/native", "getStateFromPath")
  @js.native
  def getStateFromPath(path: String, options: typingsSlinky.reactNavigationCore.getStateFromPathMod.Options): js.UndefOr[ResultState] = js.native
  
  @JSImport("@react-navigation/native", "useBackButton")
  @js.native
  def useBackButton(ref: ReactRef[NavigationContainerRef]): Unit = js.native
  
  @JSImport("@react-navigation/native", "useFocusEffect")
  @js.native
  def useFocusEffect(effect: EffectCallback): Unit = js.native
  
  @JSImport("@react-navigation/native", "useIsFocused")
  @js.native
  def useIsFocused(): Boolean = js.native
  
  @JSImport("@react-navigation/native", "useLinkBuilder")
  @js.native
  def useLinkBuilder(): js.Function2[/* name */ String, /* params */ js.UndefOr[js.Object], js.UndefOr[String]] = js.native
  
  @JSImport("@react-navigation/native", "useLinkProps")
  @js.native
  def useLinkProps(hasToAction: typingsSlinky.reactNavigationNative.useLinkPropsMod.Props): AccessibilityRole = js.native
  
  @JSImport("@react-navigation/native", "useLinkTo")
  @js.native
  def useLinkTo(): js.Function1[/* path */ String, Unit] = js.native
  
  @JSImport("@react-navigation/native", "useLinking")
  @js.native
  def useLinking(
    ref: ReactRef[NavigationContainerRef],
    hasEnabledConfigGetStateFromPathGetPathFromState: LinkingOptions
  ): GetInitialState = js.native
  
  @JSImport("@react-navigation/native", "useNavigation")
  @js.native
  def useNavigation[T /* <: NavigationProp[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object] */](): T = js.native
  
  @JSImport("@react-navigation/native", "useNavigationBuilder")
  @js.native
  def useNavigationBuilder[State /* <: NavigationState[ParamListBase] */, RouterOptions /* <: DefaultRouterOptions[String] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, _] */](
    createRouter: RouterFactory[State, _, RouterOptions],
    options: (DefaultNavigatorOptions[ScreenOptions, ParamListBase]) with RouterOptions
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = js.native
  
  @JSImport("@react-navigation/native", "useNavigationState")
  @js.native
  def useNavigationState[T](selector: Selector[T]): T = js.native
  
  @JSImport("@react-navigation/native", "useRoute")
  @js.native
  def useRoute[T /* <: RouteProp[ParamListBase, String] */](): T = js.native
  
  @JSImport("@react-navigation/native", "useScrollToTop")
  @js.native
  def useScrollToTop(ref: ReactRef[ScrollableWrapper]): Unit = js.native
  
  @JSImport("@react-navigation/native", "useTheme")
  @js.native
  def useTheme(): Theme = js.native
}
