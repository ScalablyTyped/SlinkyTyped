package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCardView extends StObject {
  
  var DashboardID: String = js.native
  
  val Events: IEvents = js.native
  
  var Name: String = js.native
}
object IMetadataCardView {
  
  @scala.inline
  def apply(DashboardID: String, Events: IEvents, Name: String): IMetadataCardView = {
    val __obj = js.Dynamic.literal(DashboardID = DashboardID.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardView]
  }
  
  @scala.inline
  implicit class IMetadataCardViewMutableBuilder[Self <: IMetadataCardView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardID(value: String): Self = StObject.set(x, "DashboardID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: IEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
