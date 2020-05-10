package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitAttachmentStateChangesRequest extends js.Object {
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
  implicit class SubmitAttachmentStateChangesRequestOps[Self <: SubmitAttachmentStateChangesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachments(value: AttachmentStateChanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCluster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCluster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluster")(js.undefined)
        ret
    }
  }
  
}

