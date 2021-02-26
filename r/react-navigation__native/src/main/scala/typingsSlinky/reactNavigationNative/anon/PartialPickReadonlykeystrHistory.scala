package typingsSlinky.reactNavigationNative.anon

import typingsSlinky.reactNavigationNative.reactNavigationNativeBooleans.`true`
import typingsSlinky.reactNavigationRouters.typesMod.PartialRoute
import typingsSlinky.reactNavigationRouters.typesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<std.Readonly<{  key :string,   index :number,   routeNames :std.Array<string>,   history :std.Array<unknown> | undefined,   routes :std.Array<std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & {  state :std.Readonly<any> | @react-navigation/core.@react-navigation/core.PartialState<std.Readonly<any>> | undefined}>,   type :string,   stale :false}>, 'key' | 'index' | 'routeNames' | 'history' | 'type'>> & std.Readonly<{  stale :true | undefined,   routes :std.Array<@react-navigation/core.@react-navigation/core.PartialRoute<@react-navigation/core.@react-navigation/core.Route<string, object | undefined>>>}> & {  state :std.Partial<std.Pick<std.Readonly<{  key :string,   index :number,   routeNames :std.Array<string>,   history :std.Array<unknown> | undefined,   routes :std.Array<std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & {  state :std.Readonly<any> | @react-navigation/core.@react-navigation/core.PartialState<std.Readonly<any>> | undefined}>,   type :string,   stale :false}>, 'key' | 'index' | 'routeNames' | 'history' | 'type'>> & std.Readonly<{  stale :true | undefined,   routes :std.Array<@react-navigation/core.@react-navigation/core.PartialRoute<@react-navigation/core.@react-navigation/core.Route<string, object | undefined>>>}> & any | undefined} */
@js.native
trait PartialPickReadonlykeystrHistory extends StObject {
  
  var history: js.UndefOr[js.Array[_]] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var routeNames: js.UndefOr[js.Array[String]] = js.native
  
  val routes: js.Array[PartialRoute[Route[String, js.UndefOr[js.Object]]]] = js.native
  
  val stale: js.UndefOr[`true`] = js.native
  
  var state: js.UndefOr[PartialPickReadonlykeystr with Readonlystaletrueundefine with js.Any] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object PartialPickReadonlykeystrHistory {
  
  @scala.inline
  def apply(routes: js.Array[PartialRoute[Route[String, js.UndefOr[js.Object]]]]): PartialPickReadonlykeystrHistory = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickReadonlykeystrHistory]
  }
  
  @scala.inline
  implicit class PartialPickReadonlykeystrHistoryMutableBuilder[Self <: PartialPickReadonlykeystrHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistory(value: js.Array[_]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setHistoryVarargs(value: js.Any*): Self = StObject.set(x, "history", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setRouteNames(value: js.Array[String]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteNamesUndefined: Self = StObject.set(x, "routeNames", js.undefined)
    
    @scala.inline
    def setRouteNamesVarargs(value: String*): Self = StObject.set(x, "routeNames", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[PartialRoute[Route[String, js.UndefOr[js.Object]]]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: (PartialRoute[Route[String, js.UndefOr[js.Object]]])*): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    @scala.inline
    def setStale(value: `true`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
    
    @scala.inline
    def setState(value: PartialPickReadonlykeystr with Readonlystaletrueundefine with js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
