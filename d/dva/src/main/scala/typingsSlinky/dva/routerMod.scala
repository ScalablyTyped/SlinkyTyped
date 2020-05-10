package typingsSlinky.dva

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ReactComponentClass
import typingsSlinky.dva.dvaStrings.history
import typingsSlinky.dva.dvaStrings.location
import typingsSlinky.dva.dvaStrings.staticContext
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.react.mod.Component
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
import typingsSlinky.reactRouterDom.mod.BrowserRouterProps
import typingsSlinky.reactRouterDom.mod.HashRouterProps
import typingsSlinky.reactRouterDom.mod.LinkProps
import typingsSlinky.reactRouterDom.mod.NavLinkProps
import typingsSlinky.reactRouterRedux.AnonRouter
import typingsSlinky.reactRouterRedux.mod.ConnectedRouterProps
import typingsSlinky.reactRouterRedux.mod.RouterAction
import typingsSlinky.reactRouterRedux.mod.RouterState
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Dispatch
import typingsSlinky.redux.mod.Middleware
import typingsSlinky.redux.mod.Reducer
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dva/router", JSImport.Namespace)
@js.native
object routerMod extends js.Object {
  @js.native
  class BrowserRouter ()
    extends Component[BrowserRouterProps, js.Any, js.Any]
  
  @js.native
  class HashRouter ()
    extends Component[HashRouterProps, js.Any, js.Any]
  
  @js.native
  class MemoryRouter ()
    extends Component[MemoryRouterProps, js.Any, js.Any]
  
  @js.native
  class Prompt ()
    extends Component[PromptProps, js.Any, js.Any]
  
  @js.native
  class Redirect ()
    extends Component[RedirectProps, js.Any, js.Any]
  
  @js.native
  class Route[T /* <: RouteProps */] ()
    extends Component[T, js.Any, js.Any]
  
  @js.native
  class Router ()
    extends Component[RouterProps, js.Any, js.Any]
  
  @js.native
  class StaticRouter ()
    extends Component[StaticRouterProps, js.Any, js.Any]
  
  @js.native
  class Switch ()
    extends Component[SwitchProps, js.Any, js.Any]
  
  def Link[S](
    // TODO: Define this as ...params: Parameters<Link<S>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[LinkProps[S]] with RefAttributes[HTMLAnchorElement]
  ): ReturnType[typingsSlinky.reactRouterDom.mod.Link[S]] = js.native
  def NavLink[S](
    // TODO: Define this as ...params: Parameters<NavLink<S>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[NavLinkProps[S]] with RefAttributes[HTMLAnchorElement]
  ): ReturnType[typingsSlinky.reactRouterDom.mod.NavLink[S]] = js.native
  def generatePath(pattern: String): String = js.native
  def generatePath(pattern: String, params: StringDictionary[js.UndefOr[String | Double | Boolean]]): String = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: String): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: js.Array[String]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: js.Array[String], parent: `match`[Params]): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: RouteProps): `match`[Params] | Null = js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = js.native
  def useHistory[HistoryLocationState](): History[HistoryLocationState] = js.native
  def useLocation[S](): Location[S] = js.native
  def useParams[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.useParams with TopLevel[js.Any] */](): Params = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.useRouteMatch with TopLevel[js.Any] */](): `match`[Params] = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.useRouteMatch with TopLevel[js.Any] */](path: String): `match`[Params] | Null = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.useRouteMatch with TopLevel[js.Any] */](path: js.Array[String]): `match`[Params] | Null = js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.dva.dvaStrings.useRouteMatch with TopLevel[js.Any] */](path: RouteProps): `match`[Params] | Null = js.native
  def withRouter[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ReactComponentClass[P] */](component: C with ReactComponentClass[P]): (ReactComponentClass[
    (Omit[
      P, 
      /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ history | location | typingsSlinky.dva.dvaStrings.`match` | staticContext
    ]) with WithRouterProps[C]
  ]) with WithRouterStatics[C] = js.native
  @js.native
  object routerRedux extends js.Object {
    @js.native
    class ConnectedRouter[State] ()
      extends Component[ConnectedRouterProps[State], js.Object, js.Any]
    
    val CALL_HISTORY_METHOD: /* "@@router/CALL_HISTORY_METHOD" */ String = js.native
    val LOCATION_CHANGE: /* "@@router/LOCATION_CHANGE" */ String = js.native
    val routerReducer: Reducer[RouterState, AnyAction] = js.native
    def createMatchSelector(path: String): js.Function1[/* state */ AnonRouter, `match`[js.Object] | Null] = js.native
    def go(n: Double): RouterAction = js.native
    def goBack(): RouterAction = js.native
    def goForward(): RouterAction = js.native
    def push(location: LocationDescriptor[LocationState]): RouterAction = js.native
    def push(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = js.native
    def replace(location: LocationDescriptor[LocationState]): RouterAction = js.native
    def replace(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = js.native
    def routerMiddleware(history: History[LocationState]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
    @js.native
    object routerActions extends js.Object {
      var go: js.Function1[/* n */ Double, RouterAction] = js.native
      var goBack: js.Function0[RouterAction] = js.native
      var goForward: js.Function0[RouterAction] = js.native
      var push: js.Function2[
            /* location */ LocationDescriptor[LocationState], 
            /* state */ js.UndefOr[LocationState], 
            RouterAction
          ] = js.native
      var replace: js.Function2[
            /* location */ LocationDescriptor[LocationState], 
            /* state */ js.UndefOr[LocationState], 
            RouterAction
          ] = js.native
    }
    
  }
  
}

