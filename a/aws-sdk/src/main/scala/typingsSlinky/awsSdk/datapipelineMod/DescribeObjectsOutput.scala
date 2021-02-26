package typingsSlinky.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeObjectsOutput extends StObject {
  
  /**
    * Indicates whether there are more results to return.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  
  /**
    * The starting point for the next page of results. To view the next page of results, call DescribeObjects again with this marker value. If the value is null, there are no more results.
    */
  var marker: js.UndefOr[String] = js.native
  
  /**
    * An array of object definitions.
    */
  var pipelineObjects: PipelineObjectList = js.native
}
object DescribeObjectsOutput {
  
  @scala.inline
  def apply(pipelineObjects: PipelineObjectList): DescribeObjectsOutput = {
    val __obj = js.Dynamic.literal(pipelineObjects = pipelineObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeObjectsOutput]
  }
  
  @scala.inline
  implicit class DescribeObjectsOutputMutableBuilder[Self <: DescribeObjectsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasMoreResults(value: Boolean): Self = StObject.set(x, "hasMoreResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMoreResultsUndefined: Self = StObject.set(x, "hasMoreResults", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setPipelineObjects(value: PipelineObjectList): Self = StObject.set(x, "pipelineObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineObjectsVarargs(value: PipelineObject*): Self = StObject.set(x, "pipelineObjects", js.Array(value :_*))
  }
}
