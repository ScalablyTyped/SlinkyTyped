package typingsSlinky.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReprocessingSummary extends StObject {
  
  /**
    * The time the pipeline reprocessing was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The reprocessingId returned by StartPipelineReprocessing.
    */
  var id: js.UndefOr[ReprocessingId] = js.native
  
  /**
    * The status of the pipeline reprocessing.
    */
  var status: js.UndefOr[ReprocessingStatus] = js.native
}
object ReprocessingSummary {
  
  @scala.inline
  def apply(): ReprocessingSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReprocessingSummary]
  }
  
  @scala.inline
  implicit class ReprocessingSummaryMutableBuilder[Self <: ReprocessingSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setId(value: ReprocessingId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setStatus(value: ReprocessingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
