package typingsSlinky.iitc.hooksMod.global

import typingsSlinky.iitc.iitctypesMod.IITC.Portal
import typingsSlinky.iitc.iitctypesMod.IITC.PortalData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventPortalAdded extends StObject {
  
  var portal: Portal = js.native
  
  var previousData: PortalData = js.native
}
object EventPortalAdded {
  
  @scala.inline
  def apply(portal: Portal, previousData: PortalData): EventPortalAdded = {
    val __obj = js.Dynamic.literal(portal = portal.asInstanceOf[js.Any], previousData = previousData.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPortalAdded]
  }
  
  @scala.inline
  implicit class EventPortalAddedMutableBuilder[Self <: EventPortalAdded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPortal(value: Portal): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousData(value: PortalData): Self = StObject.set(x, "previousData", value.asInstanceOf[js.Any])
  }
}
