package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersInTransitInfo extends StObject {
  
  /**
    * Last updated time for in transit.
    */
  var updatedTime: js.UndefOr[String] = js.native
}
object GoogleActionsV2OrdersInTransitInfo {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersInTransitInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersInTransitInfo]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersInTransitInfoMutableBuilder[Self <: GoogleActionsV2OrdersInTransitInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdatedTime(value: String): Self = StObject.set(x, "updatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedTimeUndefined: Self = StObject.set(x, "updatedTime", js.undefined)
  }
}
