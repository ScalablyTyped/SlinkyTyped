package typingsSlinky.reduxRouter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.react.mod.Component
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
import typingsSlinky.reduxRouter.reduxRouterStrings.history
import typingsSlinky.reduxRouter.reduxRouterStrings.location
import typingsSlinky.reduxRouter.reduxRouterStrings.staticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-router/lib/ReduxRouter", JSImport.Namespace)
@js.native
object reduxRouterMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    @JSName("__RouterContext")
    val RouterContext: Context[RouteComponentProps[js.Object, StaticContext, LocationState]] = js.native
    
    def generatePath(pattern: String): String = js.native
    def generatePath(pattern: String, params: StringDictionary[js.UndefOr[String | Double | Boolean]]): String = js.native
    
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: String): `match`[Params] | Null = js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: js.Array[String]): `match`[Params] | Null = js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: js.Array[String], parent: `match`[Params]): `match`[Params] | Null = js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: RouteProps): `match`[Params] | Null = js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = js.native
    
    def useHistory[HistoryLocationState](): History[HistoryLocationState] = js.native
    
    def useLocation[S](): Location[S] = js.native
    
    def useParams[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.useParams with TopLevel[js.Any] */](): Params = js.native
    
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.useRouteMatch with TopLevel[js.Any] */](): `match`[Params] = js.native
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.useRouteMatch with TopLevel[js.Any] */](path: String): `match`[Params] | Null = js.native
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.useRouteMatch with TopLevel[js.Any] */](path: js.Array[String]): `match`[Params] | Null = js.native
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxRouter.reduxRouterStrings.useRouteMatch with TopLevel[js.Any] */](path: RouteProps): `match`[Params] | Null = js.native
    
    def withRouter[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ReactComponentClass[P] */](component: C with ReactComponentClass[P]): (ReactComponentClass[
        (Omit[
          P, 
          /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ history | location | typingsSlinky.reduxRouter.reduxRouterStrings.`match` | staticContext
        ]) with WithRouterProps[C]
      ]) with WithRouterStatics[C] = js.native
    
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
  }
}
