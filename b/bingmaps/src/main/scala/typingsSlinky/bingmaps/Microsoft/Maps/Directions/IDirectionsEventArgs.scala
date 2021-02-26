package typingsSlinky.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDirectionsEventArgs extends StObject {
  
  /** The calculated route (or routes, if the route mode is transit). */
  var route: js.Array[IRoute] = js.native
  
  /** The route summary (or summaries) of the route(s) defined in the route property. */
  var routeSummary: js.Array[IRouteSummary] = js.native
}
object IDirectionsEventArgs {
  
  @scala.inline
  def apply(route: js.Array[IRoute], routeSummary: js.Array[IRouteSummary]): IDirectionsEventArgs = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], routeSummary = routeSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectionsEventArgs]
  }
  
  @scala.inline
  implicit class IDirectionsEventArgsMutableBuilder[Self <: IDirectionsEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoute(value: js.Array[IRoute]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteSummary(value: js.Array[IRouteSummary]): Self = StObject.set(x, "routeSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteSummaryVarargs(value: IRouteSummary*): Self = StObject.set(x, "routeSummary", js.Array(value :_*))
    
    @scala.inline
    def setRouteVarargs(value: IRoute*): Self = StObject.set(x, "route", js.Array(value :_*))
  }
}
