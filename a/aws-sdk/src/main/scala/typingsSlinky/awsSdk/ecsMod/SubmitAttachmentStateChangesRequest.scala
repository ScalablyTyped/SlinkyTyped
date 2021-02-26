package typingsSlinky.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmitAttachmentStateChangesRequest extends StObject {
  
  /**
    * Any attachments associated with the state change request.
    */
  var attachments: AttachmentStateChanges = js.native
  
  /**
    * The short name or full ARN of the cluster that hosts the container instance the attachment belongs to.
    */
  var cluster: js.UndefOr[String] = js.native
}
object SubmitAttachmentStateChangesRequest {
  
  @scala.inline
  def apply(attachments: AttachmentStateChanges): SubmitAttachmentStateChangesRequest = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitAttachmentStateChangesRequest]
  }
  
  @scala.inline
  implicit class SubmitAttachmentStateChangesRequestMutableBuilder[Self <: SubmitAttachmentStateChangesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: AttachmentStateChanges): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsVarargs(value: AttachmentStateChange*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
  }
}
