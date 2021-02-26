package typingsSlinky.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPipelinesOutput extends StObject {
  
  /**
    * Indicates whether there are more results that can be obtained by a subsequent call.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  
  /**
    * The starting point for the next page of results. To view the next page of results, call ListPipelinesOutput again with this marker value. If the value is null, there are no more results.
    */
  var marker: js.UndefOr[String] = js.native
  
  /**
    * The pipeline identifiers. If you require additional information about the pipelines, you can use these identifiers to call DescribePipelines and GetPipelineDefinition.
    */
  var pipelineIdList: pipelineList = js.native
}
object ListPipelinesOutput {
  
  @scala.inline
  def apply(pipelineIdList: pipelineList): ListPipelinesOutput = {
    val __obj = js.Dynamic.literal(pipelineIdList = pipelineIdList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPipelinesOutput]
  }
  
  @scala.inline
  implicit class ListPipelinesOutputMutableBuilder[Self <: ListPipelinesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasMoreResults(value: Boolean): Self = StObject.set(x, "hasMoreResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMoreResultsUndefined: Self = StObject.set(x, "hasMoreResults", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setPipelineIdList(value: pipelineList): Self = StObject.set(x, "pipelineIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineIdListVarargs(value: PipelineIdName*): Self = StObject.set(x, "pipelineIdList", js.Array(value :_*))
  }
}
