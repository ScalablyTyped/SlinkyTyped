package typingsSlinky.dva

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ReactComponentClass
import typingsSlinky.dva.anon.ReadonlyBrowserRouterProp
import typingsSlinky.dva.anon.ReadonlyHashRouterProps
import typingsSlinky.dva.dvaStrings.history
import typingsSlinky.dva.dvaStrings.location
import typingsSlinky.dva.dvaStrings.staticContext
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactRouter.mod.MemoryRouterProps
import typingsSlinky.reactRouter.mod.Omit
import typingsSlinky.reactRouter.mod.PromptProps
import typingsSlinky.reactRouter.mod.RedirectProps
import typingsSlinky.reactRouter.mod.RouteComponentProps
import typingsSlinky.reactRouter.mod.RouteProps
import typingsSlinky.reactRouter.mod.RouterProps
import typingsSlinky.reactRouter.mod.StaticContext
import typingsSlinky.reactRouter.mod.StaticRouterProps
import typingsSlinky.reactRouter.mod.SwitchProps
import typingsSlinky.reactRouter.mod.WithRouterProps
import typingsSlinky.reactRouter.mod.WithRouterStatics
import typingsSlinky.reactRouter.mod.`match`
import typingsSlinky.reactRouterDom.anon.ReadonlyMemoryRouterProps
import typingsSlinky.reactRouterDom.anon.ReadonlyPromptProps
import typingsSlinky.reactRouterDom.anon.ReadonlyRedirectProps
import typingsSlinky.reactRouterDom.anon.ReadonlyRouterProps
import typingsSlinky.reactRouterDom.anon.ReadonlyStaticRouterProps
import typingsSlinky.reactRouterDom.anon.ReadonlySwitchProps
import typingsSlinky.reactRouterDom.mod.BrowserRouterProps
import typingsSlinky.reactRouterDom.mod.HashRouterProps
import typingsSlinky.reactRouterDom.mod.NavLinkProps
import typingsSlinky.reactRouterRedux.mod.ConnectedRouterProps
import typingsSlinky.reactRouterRedux.mod.RouterAction
import typingsSlinky.reactRouterRedux.mod.RouterState
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.std.Parameters
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  @JSImport("dva/router", "BrowserRouter")
  @js.native
  class BrowserRouter protected ()
    extends typingsSlinky.reactRouterDom.mod.BrowserRouter {
    def this(props: ReadonlyBrowserRouterProp) = this()
    def this(props: BrowserRouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BrowserRouterProps, context: js.Any) = this()
  }
  
  @JSImport("dva/router", "HashRouter")
  @js.native
  class HashRouter protected ()
    extends typingsSlinky.reactRouterDom.mod.HashRouter {
    def this(props: ReadonlyHashRouterProps) = this()
    def this(props: HashRouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HashRouterProps, context: js.Any) = this()
  }
  
  @JSImport("dva/router", "Link")
  @js.native
  def Link[S](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<Link<S>> is not an array type */ params: Parameters[typingsSlinky.reactRouterDom.mod.Link[S]]
  ): ReturnType[typingsSlinky.reactRouterDom.mod.Link[S]] = js.native
  
  @JSImport("dva/router", "MemoryRouter")
  @js.native
  class MemoryRouter protected ()
    extends typingsSlinky.reactRouterDom.mod.MemoryRouter {
    def this(props: MemoryRouterProps) = this()
    def this(props: ReadonlyMemoryRouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MemoryRouterProps, context: js.Any) = this()
  }
  
  @JSImport("dva/router", "NavLink")
  @js.native
  def NavLink[S](
    // TODO: Define this as ...params: Parameters<NavLink<S>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[NavLinkProps[S]] with RefAttributes[HTMLAnchorElement]
  ): ReturnType[typingsSlinky.reactRouterDom.mod.NavLink[S]] = js.native
  
  @JSImport("dva/router", "Prompt")
  @js.native
  class Prompt protected ()
    extends typingsSlinky.reactRouterDom.mod.Prompt {
    def this(props: PromptProps) = this()
    def this(props: ReadonlyPromptProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PromptProps, context: js.Any) = this()
  }
  
  @JSImport("dva/router", "Redirect")
  @js.native
  class Redirect protected ()
    extends typingsSlinky.reactRouterDom.mod.Redirect {
    def this(props: RedirectProps) = this()
    def this(props: ReadonlyRedirectProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RedirectProps, context: js.Any) = this()
  }
  
  @JSImport("dva/router", "Route")
  @js.native
  class Route[T /* <: RouteProps */] protected ()
    extends typingsSlinky.reactRouterDom.mod.Route[T] {
    def this(props: T) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: T, context: js.Any) = this()
  }
  
  @JSImport("dva/router", "Router")
  @js.native
  class Router protected ()
    extends typingsSlinky.reactRouterDom.mod.Router {
    def this(props: RouterProps) = this()
    def this(props: ReadonlyRouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RouterProps, context: js.Any) = this()
  }
  
  @JSImport("dva/router", "StaticRouter")
  @js.native
  class StaticRouter protected ()
    extends typingsSlinky.reactRouterDom.mod.StaticRouter {
    def this(props: StaticRouterProps) = this()
    def this(props: ReadonlyStaticRouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StaticRouterProps, context: js.Any) = this()
  }
  
  @JSImport("dva/router", "Switch")
  @js.native
  class Switch protected ()
    extends typingsSlinky.reactRouterDom.mod.Switch {
    def this(props: SwitchProps) = this()
    def this(props: ReadonlySwitchProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SwitchProps, context: js.Any) = this()
  }
  
  @JSImport("dva/router", "generatePath")
  @js.native
  def generatePath(pattern: String): String = js.native
  @JSImport("dva/router", "generatePath")
  @js.native
  def generatePath(pattern: String, params: StringDictionary[js.UndefOr[String | Double | Boolean]]): String = js.native
  
  @JSImport("dva/router", "matchPath")
  @js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: String): `match`[Params] | Null = js.native
  @JSImport("dva/router", "matchPath")
  @js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = js.native
  @JSImport("dva/router", "matchPath")
  @js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: js.Array[String]): `match`[Params] | Null = js.native
  @JSImport("dva/router", "matchPath")
  @js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: js.Array[String], parent: `match`[Params]): `match`[Params] | Null = js.native
  @JSImport("dva/router", "matchPath")
  @js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: RouteProps): `match`[Params] | Null = js.native
  @JSImport("dva/router", "matchPath")
  @js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = js.native
  
  object routerRedux {
    
    @JSImport("dva/router", "routerRedux.CALL_HISTORY_METHOD")
    @js.native
    val CALL_HISTORY_METHOD: /* "@@router/CALL_HISTORY_METHOD" */ String = js.native
    
    @JSImport("dva/router", "routerRedux.ConnectedRouter")
    @js.native
    class ConnectedRouter[State] protected ()
      extends typingsSlinky.reactRouterRedux.mod.ConnectedRouter[State] {
      def this(props: ConnectedRouterProps[State]) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: ConnectedRouterProps[State], context: js.Any) = this()
    }
    
    @JSImport("dva/router", "routerRedux.LOCATION_CHANGE")
    @js.native
    val LOCATION_CHANGE: /* "@@router/LOCATION_CHANGE" */ String = js.native
    
    @JSImport("dva/router", "routerRedux.createMatchSelector")
    @js.native
    def createMatchSelector(path: String): js.Function1[/* state */ typingsSlinky.reactRouterRedux.anon.Router, `match`[js.Object] | Null] = js.native
    
    @JSImport("dva/router", "routerRedux.go")
    @js.native
    def go(n: Double): RouterAction = js.native
    
    @JSImport("dva/router", "routerRedux.goBack")
    @js.native
    def goBack(): RouterAction = js.native
    
    @JSImport("dva/router", "routerRedux.goForward")
    @js.native
    def goForward(): RouterAction = js.native
    
    @JSImport("dva/router", "routerRedux.push")
    @js.native
    def push(location: LocationDescriptor[LocationState]): RouterAction = js.native
    @JSImport("dva/router", "routerRedux.push")
    @js.native
    def push(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = js.native
    
    @JSImport("dva/router", "routerRedux.replace")
    @js.native
    def replace(location: LocationDescriptor[LocationState]): RouterAction = js.native
    @JSImport("dva/router", "routerRedux.replace")
    @js.native
    def replace(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = js.native
    
    object routerActions {
      
      @JSImport("dva/router", "routerRedux.routerActions")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("dva/router", "routerRedux.routerActions.go")
      @js.native
      def go: js.Function1[/* n */ Double, RouterAction] = js.native
      
      @JSImport("dva/router", "routerRedux.routerActions.goBack")
      @js.native
      def goBack: js.Function0[RouterAction] = js.native
      @scala.inline
      def goBack_=(x: js.Function0[RouterAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("goBack")(x.asInstanceOf[js.Any])
      
      @JSImport("dva/router", "routerRedux.routerActions.goForward")
      @js.native
      def goForward: js.Function0[RouterAction] = js.native
      @scala.inline
      def goForward_=(x: js.Function0[RouterAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("goForward")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def go_=(x: js.Function1[/* n */ Double, RouterAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("go")(x.asInstanceOf[js.Any])
      
      @JSImport("dva/router", "routerRedux.routerActions.push")
      @js.native
      def push: js.Function2[
            /* location */ LocationDescriptor[LocationState], 
            /* state */ js.UndefOr[LocationState], 
            RouterAction
          ] = js.native
      @scala.inline
      def push_=(
        x: js.Function2[
              /* location */ LocationDescriptor[LocationState], 
              /* state */ js.UndefOr[LocationState], 
              RouterAction
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("push")(x.asInstanceOf[js.Any])
      
      @JSImport("dva/router", "routerRedux.routerActions.replace")
      @js.native
      def replace: js.Function2[
            /* location */ LocationDescriptor[LocationState], 
            /* state */ js.UndefOr[LocationState], 
            RouterAction
          ] = js.native
      @scala.inline
      def replace_=(
        x: js.Function2[
              /* location */ LocationDescriptor[LocationState], 
              /* state */ js.UndefOr[LocationState], 
              RouterAction
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replace")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("dva/router", "routerRedux.routerMiddleware")
    @js.native
    def routerMiddleware(history: History[LocationState]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
    
    @JSImport("dva/router", "routerRedux.routerReducer")
    @js.native
    val routerReducer: Reducer[RouterState, AnyAction] = js.native
  }
  
  @JSImport("dva/router", "useHistory")
  @js.native
  def useHistory[HistoryLocationState](): History[HistoryLocationState] = js.native
  
  @JSImport("dva/router", "useLocation")
  @js.native
  def useLocation[S](): Location[S] = js.native
  
  @JSImport("dva/router", "useParams")
  @js.native
  def useParams[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.useParams with TopLevel[js.Any] */](): Params = js.native
  
  @JSImport("dva/router", "useRouteMatch")
  @js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.useRouteMatch with TopLevel[js.Any] */](): `match`[Params] = js.native
  @JSImport("dva/router", "useRouteMatch")
  @js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.useRouteMatch with TopLevel[js.Any] */](path: String): `match`[Params] | Null = js.native
  @JSImport("dva/router", "useRouteMatch")
  @js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.useRouteMatch with TopLevel[js.Any] */](path: js.Array[String]): `match`[Params] | Null = js.native
  @JSImport("dva/router", "useRouteMatch")
  @js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.useRouteMatch with TopLevel[js.Any] */](path: RouteProps): `match`[Params] | Null = js.native
  
  @JSImport("dva/router", "withRouter")
  @js.native
  def withRouter[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ReactComponentClass[P] */](component: C with ReactComponentClass[P]): (ReactComponentClass[
    (Omit[
      P, 
      /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ history | location | typingsSlinky.dva.dvaStrings.`match` | staticContext
    ]) with WithRouterProps[C]
  ]) with WithRouterStatics[C] = js.native
}
