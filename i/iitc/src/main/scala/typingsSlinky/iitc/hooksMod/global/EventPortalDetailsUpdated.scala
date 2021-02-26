package typingsSlinky.iitc.hooksMod.global

import typingsSlinky.iitc.iitctypesMod.IITC.Portal
import typingsSlinky.iitc.iitctypesMod.IITC.PortalData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventPortalDetailsUpdated extends StObject {
  
  var guid: String = js.native
  
  var portal: Portal = js.native
  
  var portalData: PortalData = js.native
  
  var portalDetails: js.Any = js.native
}
object EventPortalDetailsUpdated {
  
  @scala.inline
  def apply(guid: String, portal: Portal, portalData: PortalData, portalDetails: js.Any): EventPortalDetailsUpdated = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], portal = portal.asInstanceOf[js.Any], portalData = portalData.asInstanceOf[js.Any], portalDetails = portalDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPortalDetailsUpdated]
  }
  
  @scala.inline
  implicit class EventPortalDetailsUpdatedMutableBuilder[Self <: EventPortalDetailsUpdated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortal(value: Portal): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalData(value: PortalData): Self = StObject.set(x, "portalData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalDetails(value: js.Any): Self = StObject.set(x, "portalDetails", value.asInstanceOf[js.Any])
  }
}
