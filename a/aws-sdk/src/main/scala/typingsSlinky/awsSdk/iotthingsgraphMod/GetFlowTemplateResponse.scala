package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFlowTemplateResponse extends js.Object {
  /**
    * The object that describes the specified workflow.
    */
  var description: js.UndefOr[FlowTemplateDescription] = js.native
}

object GetFlowTemplateResponse {
  @scala.inline
  def apply(): GetFlowTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFlowTemplateResponse]
  }
  @scala.inline
  implicit class GetFlowTemplateResponseOps[Self <: GetFlowTemplateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: FlowTemplateDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

