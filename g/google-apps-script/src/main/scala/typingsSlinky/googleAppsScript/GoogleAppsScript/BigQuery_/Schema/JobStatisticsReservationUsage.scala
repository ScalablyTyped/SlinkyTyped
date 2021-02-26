package typingsSlinky.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobStatisticsReservationUsage extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var slotMs: js.UndefOr[String] = js.native
}
object JobStatisticsReservationUsage {
  
  @scala.inline
  def apply(): JobStatisticsReservationUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatisticsReservationUsage]
  }
  
  @scala.inline
  implicit class JobStatisticsReservationUsageMutableBuilder[Self <: JobStatisticsReservationUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSlotMs(value: String): Self = StObject.set(x, "slotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotMsUndefined: Self = StObject.set(x, "slotMs", js.undefined)
  }
}
