package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardSummary extends StObject {
  
  /**
    * The date the dashboard was created, in Unix epoch time.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The dashboard's description.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The ID of the dashboard.
    */
  var id: ID = js.native
  
  /**
    * The date the dashboard was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the dashboard
    */
  var name: Name = js.native
}
object DashboardSummary {
  
  @scala.inline
  def apply(id: ID, name: Name): DashboardSummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardSummary]
  }
  
  @scala.inline
  implicit class DashboardSummaryMutableBuilder[Self <: DashboardSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateDate(value: js.Date): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateDateUndefined: Self = StObject.set(x, "lastUpdateDate", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
