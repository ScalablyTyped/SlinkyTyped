package typingsSlinky.reactRouter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  @scala.inline
  def RouterContext: typingsSlinky.react.mod.Context[
    typingsSlinky.reactRouter.mod.RouteComponentProps[
      js.Object, 
      typingsSlinky.reactRouter.mod.StaticContext, 
      typingsSlinky.history.mod.LocationState
    ]
  ] = typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("__RouterContext").asInstanceOf[typingsSlinky.react.mod.Context[
    typingsSlinky.reactRouter.mod.RouteComponentProps[
      js.Object, 
      typingsSlinky.reactRouter.mod.StaticContext, 
      typingsSlinky.history.mod.LocationState
    ]
  ]]
  
  type WithRouterProps[C /* <: slinky.core.ReactComponentClass[_] */] = js.Object | typingsSlinky.reactRouter.anon.WrappedComponentRef[C]
  
  @scala.inline
  def generatePath(pattern: java.lang.String): java.lang.String = typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(pattern.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def generatePath(
    pattern: java.lang.String,
    params: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]
  ): java.lang.String = (typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(pattern.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.matchPath with org.scalablytyped.runtime.TopLevel[js.Any] */](pathname: java.lang.String, props: java.lang.String): typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null = (typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null]
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.matchPath with org.scalablytyped.runtime.TopLevel[js.Any] */](
    pathname: java.lang.String,
    props: java.lang.String,
    parent: typingsSlinky.reactRouter.mod.`match`[Params]
  ): typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null = (typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null]
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.matchPath with org.scalablytyped.runtime.TopLevel[js.Any] */](pathname: java.lang.String, props: js.Array[java.lang.String]): typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null = (typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null]
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.matchPath with org.scalablytyped.runtime.TopLevel[js.Any] */](
    pathname: java.lang.String,
    props: js.Array[java.lang.String],
    parent: typingsSlinky.reactRouter.mod.`match`[Params]
  ): typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null = (typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null]
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.matchPath with org.scalablytyped.runtime.TopLevel[js.Any] */](pathname: java.lang.String, props: typingsSlinky.reactRouter.mod.RouteProps): typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null = (typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null]
  @scala.inline
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.matchPath with org.scalablytyped.runtime.TopLevel[js.Any] */](
    pathname: java.lang.String,
    props: typingsSlinky.reactRouter.mod.RouteProps,
    parent: typingsSlinky.reactRouter.mod.`match`[Params]
  ): typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null = (typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matchPath")(pathname.asInstanceOf[js.Any], props.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null]
  
  @scala.inline
  def useHistory[HistoryLocationState](): typingsSlinky.history.mod.History[HistoryLocationState] = typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useHistory")().asInstanceOf[typingsSlinky.history.mod.History[HistoryLocationState]]
  
  @scala.inline
  def useLocation[S](): typingsSlinky.history.mod.Location[S] = typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[typingsSlinky.history.mod.Location[S]]
  
  @scala.inline
  def useParams[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.useParams with org.scalablytyped.runtime.TopLevel[js.Any] */](): Params = typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[Params]
  
  @scala.inline
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.useRouteMatch with org.scalablytyped.runtime.TopLevel[js.Any] */](): typingsSlinky.reactRouter.mod.`match`[Params] = typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")().asInstanceOf[typingsSlinky.reactRouter.mod.`match`[Params]]
  @scala.inline
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.useRouteMatch with org.scalablytyped.runtime.TopLevel[js.Any] */](path: java.lang.String): typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null = typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null]
  @scala.inline
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.useRouteMatch with org.scalablytyped.runtime.TopLevel[js.Any] */](path: js.Array[java.lang.String]): typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null = typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null]
  @scala.inline
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouter.reactRouterStrings.useRouteMatch with org.scalablytyped.runtime.TopLevel[js.Any] */](path: typingsSlinky.reactRouter.mod.RouteProps): typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null = typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRouteMatch")(path.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reactRouter.mod.`match`[Params] | scala.Null]
  
  @scala.inline
  def withRouter[P /* <: typingsSlinky.reactRouter.mod.RouteComponentProps[
    _, 
    typingsSlinky.reactRouter.mod.StaticContext, 
    typingsSlinky.history.mod.LocationState
  ] */, C /* <: slinky.core.ReactComponentClass[P] */](component: C with slinky.core.ReactComponentClass[P]): (slinky.core.ReactComponentClass[
    (typingsSlinky.reactRouter.mod.Omit[
      P, 
      /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ typingsSlinky.reactRouter.reactRouterStrings.history_ | typingsSlinky.reactRouter.reactRouterStrings.location_ | typingsSlinky.reactRouter.reactRouterStrings.`match` | typingsSlinky.reactRouter.reactRouterStrings.staticContext
    ]) with typingsSlinky.reactRouter.mod.WithRouterProps[C]
  ]) with typingsSlinky.reactRouter.mod.WithRouterStatics[C] = typingsSlinky.reactRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(component.asInstanceOf[js.Any]).asInstanceOf[(slinky.core.ReactComponentClass[
    (typingsSlinky.reactRouter.mod.Omit[
      P, 
      /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ typingsSlinky.reactRouter.reactRouterStrings.history_ | typingsSlinky.reactRouter.reactRouterStrings.location_ | typingsSlinky.reactRouter.reactRouterStrings.`match` | typingsSlinky.reactRouter.reactRouterStrings.staticContext
    ]) with typingsSlinky.reactRouter.mod.WithRouterProps[C]
  ]) with typingsSlinky.reactRouter.mod.WithRouterStatics[C]]
}
