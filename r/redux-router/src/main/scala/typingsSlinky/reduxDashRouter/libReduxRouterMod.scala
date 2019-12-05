package typingsSlinky.reduxDashRouter

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.history.historyMod.History
import typingsSlinky.history.historyMod.Location
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.Context
import typingsSlinky.reactDashRouter.reactDashRouterMod.MemoryRouterProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.Omit
import typingsSlinky.reactDashRouter.reactDashRouterMod.PromptProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.RedirectProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.RouteComponentProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.RouteProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.RouterProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.StaticContext
import typingsSlinky.reactDashRouter.reactDashRouterMod.StaticRouterProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.SwitchProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.WithRouterProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.WithRouterStatics
import typingsSlinky.reactDashRouter.reactDashRouterMod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-router/lib/ReduxRouter", JSImport.Namespace)
@js.native
object libReduxRouterMod extends js.Object {
  @js.native
  object default extends js.Object {
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
    
    val __RouterContext: Context[RouteComponentProps[js.Object, StaticContext, LocationState]] = js.native
    def generatePath(pattern: String): String = js.native
    def generatePath(pattern: String, params: StringDictionary[js.UndefOr[String | Double | Boolean]]): String = js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxDashRouter.reduxDashRouterStrings.matchPath with js.Any */](pathname: String, props: String): `match`[Params] | Null = js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxDashRouter.reduxDashRouterStrings.matchPath with js.Any */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxDashRouter.reduxDashRouterStrings.matchPath with js.Any */](pathname: String, props: js.Array[String]): `match`[Params] | Null = js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxDashRouter.reduxDashRouterStrings.matchPath with js.Any */](pathname: String, props: js.Array[String], parent: `match`[Params]): `match`[Params] | Null = js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxDashRouter.reduxDashRouterStrings.matchPath with js.Any */](pathname: String, props: RouteProps): `match`[Params] | Null = js.native
    def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxDashRouter.reduxDashRouterStrings.matchPath with js.Any */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = js.native
    def useHistory[HistoryLocationState](): History[HistoryLocationState] = js.native
    def useLocation[S](): Location[S] = js.native
    def useParams[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxDashRouter.reduxDashRouterStrings.useParams with js.Any */](): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ p in keyof Params ]: string}
      */ typingsSlinky.reduxDashRouter.reduxDashRouterStrings.useParams with js.Any = js.native
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxDashRouter.reduxDashRouterStrings.useRouteMatch with js.Any */](): `match`[Params] = js.native
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxDashRouter.reduxDashRouterStrings.useRouteMatch with js.Any */](path: String): `match`[Params] | Null = js.native
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxDashRouter.reduxDashRouterStrings.useRouteMatch with js.Any */](path: js.Array[String]): `match`[Params] | Null = js.native
    def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Params ]:? string}
      */ typingsSlinky.reduxDashRouter.reduxDashRouterStrings.useRouteMatch with js.Any */](path: RouteProps): `match`[Params] | Null = js.native
    def withRouter[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ReactComponentClass[P] */](component: C with ReactComponentClass[P]): (ReactComponentClass[(Omit[P, String]) with WithRouterProps[C]]) with WithRouterStatics[C] = js.native
  }
  
}

