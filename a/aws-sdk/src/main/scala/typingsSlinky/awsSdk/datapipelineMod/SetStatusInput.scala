package typingsSlinky.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetStatusInput extends StObject {
  
  /**
    * The IDs of the objects. The corresponding objects can be either physical or components, but not a mix of both types.
    */
  var objectIds: idList = js.native
  
  /**
    * The ID of the pipeline that contains the objects.
    */
  var pipelineId: id = js.native
  
  /**
    * The status to be set on all the objects specified in objectIds. For components, use PAUSE or RESUME. For instances, use TRY_CANCEL, RERUN, or MARK_FINISHED.
    */
  var status: String = js.native
}
object SetStatusInput {
  
  @scala.inline
  def apply(objectIds: idList, pipelineId: id, status: String): SetStatusInput = {
    val __obj = js.Dynamic.literal(objectIds = objectIds.asInstanceOf[js.Any], pipelineId = pipelineId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStatusInput]
  }
  
  @scala.inline
  implicit class SetStatusInputMutableBuilder[Self <: SetStatusInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectIds(value: idList): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdsVarargs(value: id*): Self = StObject.set(x, "objectIds", js.Array(value :_*))
    
    @scala.inline
    def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
