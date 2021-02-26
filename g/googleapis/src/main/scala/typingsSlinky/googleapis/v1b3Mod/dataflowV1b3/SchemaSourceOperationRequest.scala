package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A work item that represents the different operations that can be performed
  * on a user-defined Source specification.
  */
@js.native
trait SchemaSourceOperationRequest extends StObject {
  
  /**
    * Information about a request to get metadata about a source.
    */
  var getMetadata: js.UndefOr[SchemaSourceGetMetadataRequest] = js.native
  
  /**
    * User-provided name of the Read instruction for this source.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * System-defined name for the Read instruction for this source in the
    * original workflow graph.
    */
  var originalName: js.UndefOr[String] = js.native
  
  /**
    * Information about a request to split a source.
    */
  var split: js.UndefOr[SchemaSourceSplitRequest] = js.native
  
  /**
    * System-defined name of the stage containing the source operation. Unique
    * across the workflow.
    */
  var stageName: js.UndefOr[String] = js.native
  
  /**
    * System-defined name of the Read instruction for this source. Unique
    * across the workflow.
    */
  var systemName: js.UndefOr[String] = js.native
}
object SchemaSourceOperationRequest {
  
  @scala.inline
  def apply(): SchemaSourceOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceOperationRequest]
  }
  
  @scala.inline
  implicit class SchemaSourceOperationRequestMutableBuilder[Self <: SchemaSourceOperationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMetadata(value: SchemaSourceGetMetadataRequest): Self = StObject.set(x, "getMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMetadataUndefined: Self = StObject.set(x, "getMetadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    @scala.inline
    def setSplit(value: SchemaSourceSplitRequest): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    
    @scala.inline
    def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    @scala.inline
    def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
  }
}
