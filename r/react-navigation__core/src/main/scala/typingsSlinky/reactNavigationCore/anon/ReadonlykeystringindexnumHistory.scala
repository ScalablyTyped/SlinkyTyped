package typingsSlinky.reactNavigationCore.anon

import typingsSlinky.reactNavigationCore.reactNavigationCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  key :string,   index :number,   routeNames :std.Array<string>,   history :std.Array<unknown> | undefined,   routes :std.Array<std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & {  state :std.Readonly<any> | @react-navigation/routers.@react-navigation/routers.PartialState<std.Readonly<any>> | undefined}>,   type :string,   stale :false}> */
@js.native
trait ReadonlykeystringindexnumHistory extends StObject {
  
  val history: js.UndefOr[js.Array[_]] = js.native
  
  val index: Double = js.native
  
  val key: String = js.native
  
  val routeNames: js.Array[String] = js.native
  
  val routes: js.Array[Key with Params with `0`] = js.native
  
  val stale: `false` = js.native
  
  val `type`: String = js.native
}
object ReadonlykeystringindexnumHistory {
  
  @scala.inline
  def apply(
    index: Double,
    key: String,
    routeNames: js.Array[String],
    routes: js.Array[Key with Params with `0`],
    stale: `false`,
    `type`: String
  ): ReadonlykeystringindexnumHistory = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlykeystringindexnumHistory]
  }
  
  @scala.inline
  implicit class ReadonlykeystringindexnumHistoryMutableBuilder[Self <: ReadonlykeystringindexnumHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistory(value: js.Array[_]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setHistoryVarargs(value: js.Any*): Self = StObject.set(x, "history", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteNames(value: js.Array[String]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteNamesVarargs(value: String*): Self = StObject.set(x, "routeNames", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[Key with Params with `0`]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: (Key with Params with `0`)*): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    @scala.inline
    def setStale(value: `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
