package typingsSlinky.reduxRouter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.history.mod.Pathname
import typingsSlinky.react.mod.Context
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
import typingsSlinky.reduxRouter.actionCreatorsMod.ReduxRouterAction
import typingsSlinky.reduxRouter.anon.ReadonlyMemoryRouterProps
import typingsSlinky.reduxRouter.anon.ReadonlyPromptProps
import typingsSlinky.reduxRouter.anon.ReadonlyRedirectProps
import typingsSlinky.reduxRouter.anon.ReadonlyRouterProps
import typingsSlinky.reduxRouter.anon.ReadonlyStaticRouterProps
import typingsSlinky.reduxRouter.anon.ReadonlySwitchProps
import typingsSlinky.reduxRouter.reduxRouterStrings.history
import typingsSlinky.reduxRouter.reduxRouterStrings.location
import typingsSlinky.reduxRouter.reduxRouterStrings.staticContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ReduxRouter {
    
    @JSImport("redux-router", "ReduxRouter.MemoryRouter")
    @js.native
    class MemoryRouter protected ()
      extends typingsSlinky.reduxRouter.reduxRouterMod.default.MemoryRouter {
      def this(props: MemoryRouterProps) = this()
      def this(props: ReadonlyMemoryRouterProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: MemoryRouterProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router", "ReduxRouter.Prompt")
    @js.native
    class Prompt protected ()
      extends typingsSlinky.reduxRouter.reduxRouterMod.default.Prompt {
      def this(props: PromptProps) = this()
      def this(props: ReadonlyPromptProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: PromptProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router", "ReduxRouter.Redirect")
    @js.native
    class Redirect protected ()
      extends typingsSlinky.reduxRouter.reduxRouterMod.default.Redirect {
      def this(props: RedirectProps) = this()
      def this(props: ReadonlyRedirectProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: RedirectProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router", "ReduxRouter.Route")
    @js.native
    class Route[T /* <: RouteProps */] protected ()
      extends typingsSlinky.reduxRouter.reduxRouterMod.default.Route[T] {
      def this(props: T) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: T, context: js.Any) = this()
    }
    
    @JSImport("redux-router", "ReduxRouter.Router")
    @js.native
    class Router protected ()
      extends typingsSlinky.reduxRouter.reduxRouterMod.default.Router {
      def this(props: RouterProps) = this()
      def this(props: ReadonlyRouterProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: RouterProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router", "ReduxRouter.__RouterContext")
    @js.native
    val RouterContext: Context[RouteComponentProps[js.Object, StaticContext, LocationState]] = js.native
    
    @JSImport("redux-router", "ReduxRouter.StaticRouter")
    @js.native
    class StaticRouter protected ()
      extends typingsSlinky.reduxRouter.reduxRouterMod.default.StaticRouter {
      def this(props: StaticRouterProps) = this()
      def this(props: ReadonlyStaticRouterProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: StaticRouterProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router", "ReduxRouter.Switch")
    @js.native
    class Switch protected ()
      extends typingsSlinky.reduxRouter.reduxRouterMod.default.Switch {
      def this(props: SwitchProps) = this()
      def this(props: ReadonlySwitchProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: SwitchProps, context: js.Any) = this()
    }
    
    @JSImport("redux-router", "ReduxRouter.generatePath")
    @js.native
    def generatePath(pattern: String): String = js.native
    @JSImport("redux-router", "ReduxRouter.generatePath")
    @js.native
    def generatePath(pattern: String, params: StringDictionary[js.UndefOr[String | Double | Boolean]]): String = js.native
    
    @JSImport("redux-router", "ReduxRouter.matchPath")
    @js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: String): `match`[Params] | Null = js.native
    @JSImport("redux-router", "ReduxRouter.matchPath")
    @js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = js.native
    @JSImport("redux-router", "ReduxRouter.matchPath")
    @js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: js.Array[String]): `match`[Params] | Null = js.native
    @JSImport("redux-router", "ReduxRouter.matchPath")
    @js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: js.Array[String], parent: `match`[Params]): `match`[Params] | Null = js.native
    @JSImport("redux-router", "ReduxRouter.matchPath")
    @js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: RouteProps): `match`[Params] | Null = js.native
    @JSImport("redux-router", "ReduxRouter.matchPath")
    @js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = js.native
    
    @JSImport("redux-router", "ReduxRouter.useHistory")
    @js.native
    def useHistory[HistoryLocationState](): History[HistoryLocationState] = js.native
    
    @JSImport("redux-router", "ReduxRouter.useLocation")
    @js.native
    def useLocation[S](): Location[S] = js.native
    
    @JSImport("redux-router", "ReduxRouter.useParams")
    @js.native
    def useParams[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.useParams with TopLevel[js.Any] */](): Params = js.native
    
    @JSImport("redux-router", "ReduxRouter.useRouteMatch")
    @js.native
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.useRouteMatch with TopLevel[js.Any] */](): `match`[Params] = js.native
    @JSImport("redux-router", "ReduxRouter.useRouteMatch")
    @js.native
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.useRouteMatch with TopLevel[js.Any] */](path: String): `match`[Params] | Null = js.native
    @JSImport("redux-router", "ReduxRouter.useRouteMatch")
    @js.native
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.useRouteMatch with TopLevel[js.Any] */](path: js.Array[String]): `match`[Params] | Null = js.native
    @JSImport("redux-router", "ReduxRouter.useRouteMatch")
    @js.native
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.useRouteMatch with TopLevel[js.Any] */](path: RouteProps): `match`[Params] | Null = js.native
    
    @JSImport("redux-router", "ReduxRouter.withRouter")
    @js.native
    def withRouter[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ReactComponentClass[P] */](component: C with ReactComponentClass[P]): (ReactComponentClass[
        (Omit[
          P, 
          /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ history | location | typingsSlinky.reduxRouter.reduxRouterStrings.`match` | staticContext
        ]) with WithRouterProps[C]
      ]) with WithRouterStatics[C] = js.native
  }
  
  @JSImport("redux-router", "go")
  @js.native
  def go(args: js.Object*): ReduxRouterAction = js.native
  
  @JSImport("redux-router", "goBack")
  @js.native
  def goBack(args: js.Object*): ReduxRouterAction = js.native
  
  @JSImport("redux-router", "goForward")
  @js.native
  def goForward(args: js.Object*): ReduxRouterAction = js.native
  
  @JSImport("redux-router", "historyAPI")
  @js.native
  def historyAPI(method: js.Any): js.Function1[/* repeated */ js.Object, ReduxRouterAction] = js.native
  
  @JSImport("redux-router", "isActive")
  @js.native
  def isActive(pathname: Pathname): Boolean = js.native
  @JSImport("redux-router", "isActive")
  @js.native
  def isActive(pathname: Pathname, query: js.UndefOr[scala.Nothing], indexOnly: Boolean): Boolean = js.native
  @JSImport("redux-router", "isActive")
  @js.native
  def isActive(
    pathname: Pathname,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.Query */ js.Any
  ): Boolean = js.native
  @JSImport("redux-router", "isActive")
  @js.native
  def isActive(
    pathname: Pathname,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.Query */ js.Any,
    indexOnly: Boolean
  ): Boolean = js.native
  
  @JSImport("redux-router", "push")
  @js.native
  def push(args: js.Object*): ReduxRouterAction = js.native
  
  @JSImport("redux-router", "pushState")
  @js.native
  def pushState(args: js.Object*): ReduxRouterAction = js.native
  
  @JSImport("redux-router", "reduxReactRouter")
  @js.native
  val reduxReactRouter: js.Any = js.native
  
  @JSImport("redux-router", "replace")
  @js.native
  def replace(args: js.Object*): ReduxRouterAction = js.native
  
  @JSImport("redux-router", "replaceState")
  @js.native
  def replaceState(args: js.Object*): ReduxRouterAction = js.native
  
  @JSImport("redux-router", "routerStateReducer")
  @js.native
  def routerStateReducer(state: js.Any, action: js.Any): js.Any = js.native
  
  @JSImport("redux-router", "setState")
  @js.native
  def setState(args: js.Object*): ReduxRouterAction = js.native
}
