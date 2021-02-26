package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.Archivedownloadurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsListWorkflowRunArtifactsResponseData extends StObject {
  
  var artifacts: js.Array[Archivedownloadurl] = js.native
  
  var total_count: Double = js.native
}
object ActionsListWorkflowRunArtifactsResponseData {
  
  @scala.inline
  def apply(artifacts: js.Array[Archivedownloadurl], total_count: Double): ActionsListWorkflowRunArtifactsResponseData = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListWorkflowRunArtifactsResponseData]
  }
  
  @scala.inline
  implicit class ActionsListWorkflowRunArtifactsResponseDataMutableBuilder[Self <: ActionsListWorkflowRunArtifactsResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifacts(value: js.Array[Archivedownloadurl]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsVarargs(value: Archivedownloadurl*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
