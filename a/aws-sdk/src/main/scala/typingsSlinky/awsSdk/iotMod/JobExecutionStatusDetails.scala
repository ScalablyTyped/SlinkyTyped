package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobExecutionStatusDetails extends StObject {
  
  /**
    * The job execution status.
    */
  var detailsMap: js.UndefOr[DetailsMap] = js.native
}
object JobExecutionStatusDetails {
  
  @scala.inline
  def apply(): JobExecutionStatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionStatusDetails]
  }
  
  @scala.inline
  implicit class JobExecutionStatusDetailsMutableBuilder[Self <: JobExecutionStatusDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetailsMap(value: DetailsMap): Self = StObject.set(x, "detailsMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsMapUndefined: Self = StObject.set(x, "detailsMap", js.undefined)
  }
}
