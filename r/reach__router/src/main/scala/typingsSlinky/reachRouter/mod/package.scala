package typingsSlinky.reachRouter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type HistoryListener = js.Function1[/* parameter */ typingsSlinky.reachRouter.mod.HistoryListenerParameter, scala.Unit]
  
  type HistoryLocation = typingsSlinky.reachRouter.mod.WindowLocation[typingsSlinky.history.mod.LocationState] with typingsSlinky.reachRouter.anon.State
  
  type HistoryUnsubscribe = js.Function0[scala.Unit]
  
  @scala.inline
  def Link[TState](
    // TODO: Define this as ...params: Parameters<Link<TState>> when only TypeScript >= 3.1 support is needed.
  props: typingsSlinky.react.mod.PropsWithoutRef[typingsSlinky.reachRouter.mod.LinkProps[TState]] with typingsSlinky.react.mod.RefAttributes[org.scalajs.dom.raw.HTMLAnchorElement]
  ): typingsSlinky.std.ReturnType[typingsSlinky.reachRouter.mod.Link[TState]] = typingsSlinky.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Link")(props.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.std.ReturnType[typingsSlinky.reachRouter.mod.Link[TState]]]
  type Link[TState] = typingsSlinky.react.mod.ForwardRefExoticComponent[
    typingsSlinky.react.mod.PropsWithoutRef[typingsSlinky.reachRouter.mod.LinkProps[TState]] with typingsSlinky.react.mod.RefAttributes[org.scalajs.dom.raw.HTMLAnchorElement]
  ]
  
  type LocationProviderRenderFn = js.Function1[
    /* context */ typingsSlinky.reachRouter.mod.LocationContext, 
    slinky.core.facade.ReactElement
  ]
  
  type MatchRenderFn[TParams] = js.Function1[
    /* props */ typingsSlinky.reachRouter.mod.MatchRenderProps[TParams], 
    slinky.core.facade.ReactElement
  ]
  
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type RouteComponentProps[TParams] = typingsSlinky.std.Partial[TParams] with typingsSlinky.reachRouter.anon.Default
  
  type WindowLocation[S] = org.scalajs.dom.raw.Location with typingsSlinky.history.mod.Location[S]
  
  @scala.inline
  def createHistory(source: typingsSlinky.reachRouter.mod.HistorySource): typingsSlinky.reachRouter.mod.History = typingsSlinky.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createHistory")(source.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reachRouter.mod.History]
  
  @scala.inline
  def createMemorySource(initialPath: java.lang.String): typingsSlinky.reachRouter.mod.HistorySource = typingsSlinky.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createMemorySource")(initialPath.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.reachRouter.mod.HistorySource]
  
  @scala.inline
  def globalHistory: typingsSlinky.reachRouter.mod.History = typingsSlinky.reachRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("globalHistory").asInstanceOf[typingsSlinky.reachRouter.mod.History]
  
  @scala.inline
  def isRedirect(error: js.Any): /* is @reach/router.@reach/router.RedirectRequest */ scala.Boolean = typingsSlinky.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isRedirect")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @reach/router.@reach/router.RedirectRequest */ scala.Boolean]
  
  @scala.inline
  def navigate: typingsSlinky.reachRouter.mod.NavigateFn = typingsSlinky.reachRouter.mod.^.asInstanceOf[js.Dynamic].selectDynamic("navigate").asInstanceOf[typingsSlinky.reachRouter.mod.NavigateFn]
  
  @scala.inline
  def redirectTo(uri: java.lang.String): scala.Unit = typingsSlinky.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("redirectTo")(uri.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def useLocation(): typingsSlinky.reachRouter.mod.WindowLocation[typingsSlinky.history.mod.LocationState] = typingsSlinky.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useLocation")().asInstanceOf[typingsSlinky.reachRouter.mod.WindowLocation[typingsSlinky.history.mod.LocationState]]
  
  @scala.inline
  def useMatch(pathname: java.lang.String): scala.Null | typingsSlinky.reachRouter.anon.Dictparam = typingsSlinky.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useMatch")(pathname.asInstanceOf[js.Any]).asInstanceOf[scala.Null | typingsSlinky.reachRouter.anon.Dictparam]
  
  @scala.inline
  def useNavigate(): typingsSlinky.reachRouter.mod.NavigateFn = typingsSlinky.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useNavigate")().asInstanceOf[typingsSlinky.reachRouter.mod.NavigateFn]
  
  @scala.inline
  def useParams(): js.Any = typingsSlinky.reachRouter.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useParams")().asInstanceOf[js.Any]
}
