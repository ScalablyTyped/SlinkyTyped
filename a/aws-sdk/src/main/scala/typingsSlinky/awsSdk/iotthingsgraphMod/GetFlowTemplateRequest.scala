package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFlowTemplateRequest extends js.Object {
  /**
    * The ID of the workflow. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:workflow:WORKFLOWNAME 
    */
  var id: Urn = js.native
  /**
    * The number of the workflow revision to retrieve.
    */
  var revisionNumber: js.UndefOr[Version] = js.native
}

object GetFlowTemplateRequest {
  @scala.inline
  def apply(id: Urn): GetFlowTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFlowTemplateRequest]
  }
  @scala.inline
  implicit class GetFlowTemplateRequestOps[Self <: GetFlowTemplateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Urn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevisionNumber(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionNumber")(js.undefined)
        ret
    }
  }
  
}

