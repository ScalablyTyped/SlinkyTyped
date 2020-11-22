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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/native", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Container component which holds the navigation state.
    * This should be rendered at the root wrapping the whole app.
    *
    * @param props.initialState Initial state object for the navigation tree.
    * @param props.onStateChange Callback which is called with the latest navigation state when it changes.
    * @param props.children Child elements to render the content.
    * @param props.ref Ref object which refers to the navigation object containing helper methods.
    */
  val BaseNavigationContainer: ForwardRefExoticComponent[NavigationContainerProps with RefAttributes[NavigationContainerRef]] = js.native
  
  /**
    * Context which holds the values for the current navigation tree.
    * Intended for use in SSR. This is not safe to use on the client.
    */
  val CurrentRenderContext: Context[js.UndefOr[Options]] = js.native
  
  val DarkTheme: Theme = js.native
  
  val DefaultTheme: Theme = js.native
  
  def DrawerRouter(hasOpenByDefaultRest: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = js.native
  
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
  val NavigationContainer: ForwardRefExoticComponent[NavigationContainerPropst] = js.native
  
  /**
    * Context which holds the navigation prop for a screen.
    */
  val NavigationContext: Context[
    js.UndefOr[
      NavigationProp[Record[String, js.UndefOr[js.Object]], String, js.Any, js.Any, js.Object]
    ]
  ] = js.native
  
  /**
    * Context which holds the navigation helpers of the parent navigator.
    * Navigators should use this context in their view component.
    */
  val NavigationHelpersContext: Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]] = js.native
  
  /**
    * Context which holds the route prop for a screen.
    */
  val NavigationRouteContext: Context[js.UndefOr[Route[String, js.UndefOr[js.Object]]]] = js.native
  
  val ServerContainer: ForwardRefExoticComponent[ServerContextTypechildren] = js.native
  
  def StackRouter(options: StackRouterOptions): Router[
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | PayloadSource | TargetType | PayloadSourceTarget | SourceTargetType
  ] = js.native
  
  def TabRouter(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | TabActionType
  ] = js.native
  
  def ThemeProvider(hasValueChildren: typingsSlinky.reactNavigationNative.themeProviderMod.Props): ReactElement = js.native
  
  def createNavigatorFactory[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, NavigatorComponent /* <: ReactComponentClass[_] */](Navigator: NavigatorComponent): js.Function0[
    TypedNavigator[
      Record[String, js.UndefOr[js.Object]], 
      State, 
      ScreenOptions, 
      EventMap, 
      NavigatorComponent
    ]
  ] = js.native
  
  def getActionFromState(state: PartialStateNavigationSta): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = js.native
  def getActionFromState(
    state: PartialStateNavigationSta,
    options: typingsSlinky.reactNavigationCore.getActionFromStateMod.Options
  ): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = js.native
  
  def getFocusedRouteNameFromRoute(route: (Partial[Route[String, js.UndefOr[js.Object]]]) with State): js.UndefOr[String] = js.native
  
  def getPathFromState(state: typingsSlinky.reactNavigationCore.getPathFromStateMod.State): String = js.native
  def getPathFromState(
    state: typingsSlinky.reactNavigationCore.getPathFromStateMod.State,
    options: typingsSlinky.reactNavigationCore.getPathFromStateMod.Options
  ): String = js.native
  
  def getStateFromPath(path: String): js.UndefOr[ResultState] = js.native
  def getStateFromPath(path: String, options: typingsSlinky.reactNavigationCore.getStateFromPathMod.Options): js.UndefOr[ResultState] = js.native
  
  def useBackButton(ref: ReactRef[NavigationContainerRef]): Unit = js.native
  
  def useFocusEffect(effect: EffectCallback): Unit = js.native
  
  def useIsFocused(): Boolean = js.native
  
  def useLinkBuilder(): js.Function2[/* name */ String, /* params */ js.UndefOr[js.Object], js.UndefOr[String]] = js.native
  
  def useLinkProps(hasToAction: typingsSlinky.reactNavigationNative.useLinkPropsMod.Props): AccessibilityRole = js.native
  
  def useLinkTo(): js.Function1[/* path */ String, Unit] = js.native
  
  def useLinking(
    ref: ReactRef[NavigationContainerRef],
    hasEnabledConfigGetStateFromPathGetPathFromState: LinkingOptions
  ): GetInitialState = js.native
  
  def useNavigation[T /* <: NavigationProp[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object] */](): T = js.native
  
  def useNavigationBuilder[State /* <: NavigationState[ParamListBase] */, RouterOptions /* <: DefaultRouterOptions[String] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, _] */](
    createRouter: RouterFactory[State, _, RouterOptions],
    options: (DefaultNavigatorOptions[ScreenOptions, ParamListBase]) with RouterOptions
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = js.native
  
  def useNavigationState[T](selector: Selector[T]): T = js.native
  
  def useRoute[T /* <: RouteProp[ParamListBase, String] */](): T = js.native
  
  def useScrollToTop(ref: ReactRef[ScrollableWrapper]): Unit = js.native
  
  def useTheme(): Theme = js.native
  
  /**
    * Base router object that can be used when writing custom routers.
    * This provides few helper methods to handle common actions such as `RESET`.
    */
  @js.native
  object BaseRouter extends js.Object {
    
    def getStateForAction[State /* <: Readonlykeystringindexnum */](state: State, action: CommonNavigationAction): State | PartialState[State] | Null = js.native
    
    def shouldActionChangeFocus(action: CommonNavigationAction): Boolean = js.native
  }
  
  @js.native
  object CommonActions extends js.Object {
    
    def goBack(): Action = js.native
    
    def navigate(name: String): Action = js.native
    def navigate(name: String, params: js.Object): Action = js.native
    def navigate(route: KeyParams): Action = js.native
    def navigate(route: Name): Action = js.native
    
    def reset(): Action = js.native
    def reset(state: ResetState): Action = js.native
    
    def setParams(params: js.Object): Action = js.native
  }
  
  @js.native
  object DrawerActions extends js.Object {
    
    def closeDrawer(): DrawerActionType = js.native
    
    def jumpTo(name: String): TabActionType = js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
    
    def openDrawer(): DrawerActionType = js.native
    
    def toggleDrawer(): DrawerActionType = js.native
  }
  
  @js.native
  class PrivateValueStore[A, B, C] ()
    extends typingsSlinky.reactNavigationCore.typesMod.PrivateValueStore[A, B, C]
  
  @js.native
  object StackActions extends js.Object {
    
    def pop(): StackActionType = js.native
    def pop(count: Double): StackActionType = js.native
    
    def popToTop(): StackActionType = js.native
    
    def push(name: String): StackActionType = js.native
    def push(name: String, params: js.Object): StackActionType = js.native
    
    def replace(name: String): StackActionType = js.native
    def replace(name: String, params: js.Object): StackActionType = js.native
  }
  
  @js.native
  object TabActions extends js.Object {
    
    def jumpTo(name: String): TabActionType = js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
  }
}
