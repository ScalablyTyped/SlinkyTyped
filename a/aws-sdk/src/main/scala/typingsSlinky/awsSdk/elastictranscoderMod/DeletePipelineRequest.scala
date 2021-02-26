package typingsSlinky.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePipelineRequest extends StObject {
  
  /**
    * The identifier of the pipeline that you want to delete.
    */
  var Id: typingsSlinky.awsSdk.elastictranscoderMod.Id = js.native
}
object DeletePipelineRequest {
  
  @scala.inline
  def apply(Id: Id): DeletePipelineRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePipelineRequest]
  }
  
  @scala.inline
  implicit class DeletePipelineRequestMutableBuilder[Self <: DeletePipelineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
