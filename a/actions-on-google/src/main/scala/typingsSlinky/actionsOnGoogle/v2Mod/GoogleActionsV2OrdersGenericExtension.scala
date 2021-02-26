package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersGenericExtension extends StObject {
  
  /**
    * Locations associated with the order. Up to 2 locations.
    */
  var locations: js.UndefOr[js.Array[GoogleActionsV2OrdersOrderLocation]] = js.native
  
  /**
    * Time indicator associated with the proposed order.
    */
  var time: js.UndefOr[GoogleActionsV2OrdersTime] = js.native
}
object GoogleActionsV2OrdersGenericExtension {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersGenericExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersGenericExtension]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersGenericExtensionMutableBuilder[Self <: GoogleActionsV2OrdersGenericExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: js.Array[GoogleActionsV2OrdersOrderLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: GoogleActionsV2OrdersOrderLocation*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setTime(value: GoogleActionsV2OrdersTime): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
