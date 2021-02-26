package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointInput extends StObject {
  
  /**
    * An endpoint in customer's account which has enabled DataCaptureConfig enabled.
    */
  var EndpointName: typingsSlinky.awsSdk.sagemakerMod.EndpointName = js.native
  
  /**
    * Path to the filesystem where the endpoint data is available to the container.
    */
  var LocalPath: ProcessingLocalPath = js.native
  
  /**
    * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated 
    */
  var S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType] = js.native
  
  /**
    * Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
    */
  var S3InputMode: js.UndefOr[ProcessingS3InputMode] = js.native
}
object EndpointInput {
  
  @scala.inline
  def apply(EndpointName: EndpointName, LocalPath: ProcessingLocalPath): EndpointInput = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any], LocalPath = LocalPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointInput]
  }
  
  @scala.inline
  implicit class EndpointInputMutableBuilder[Self <: EndpointInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalPath(value: ProcessingLocalPath): Self = StObject.set(x, "LocalPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DataDistributionType(value: ProcessingS3DataDistributionType): Self = StObject.set(x, "S3DataDistributionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DataDistributionTypeUndefined: Self = StObject.set(x, "S3DataDistributionType", js.undefined)
    
    @scala.inline
    def setS3InputMode(value: ProcessingS3InputMode): Self = StObject.set(x, "S3InputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3InputModeUndefined: Self = StObject.set(x, "S3InputMode", js.undefined)
  }
}
