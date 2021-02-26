package typingsSlinky.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsByPipelineRequest extends StObject {
  
  /**
    *  To list jobs in chronological order by the date and time that they were submitted, enter true. To list jobs in reverse chronological order, enter false. 
    */
  var Ascending: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Ascending] = js.native
  
  /**
    *  When Elastic Transcoder returns more than one page of results, use pageToken in subsequent GET requests to get each successive page of results. 
    */
  var PageToken: js.UndefOr[Id] = js.native
  
  /**
    * The ID of the pipeline for which you want to get job information.
    */
  var PipelineId: Id = js.native
}
object ListJobsByPipelineRequest {
  
  @scala.inline
  def apply(PipelineId: Id): ListJobsByPipelineRequest = {
    val __obj = js.Dynamic.literal(PipelineId = PipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsByPipelineRequest]
  }
  
  @scala.inline
  implicit class ListJobsByPipelineRequestMutableBuilder[Self <: ListJobsByPipelineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: Ascending): Self = StObject.set(x, "Ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingUndefined: Self = StObject.set(x, "Ascending", js.undefined)
    
    @scala.inline
    def setPageToken(value: Id): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
    
    @scala.inline
    def setPipelineId(value: Id): Self = StObject.set(x, "PipelineId", value.asInstanceOf[js.Any])
  }
}
