package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOpsItemRequest extends js.Object {
  /**
    * The ID of the OpsItem that you want to get.
    */
  var OpsItemId: typingsSlinky.awsSdk.ssmMod.OpsItemId = js.native
}

object GetOpsItemRequest {
  @scala.inline
  def apply(OpsItemId: OpsItemId): GetOpsItemRequest = {
    val __obj = js.Dynamic.literal(OpsItemId = OpsItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpsItemRequest]
  }
  @scala.inline
  implicit class GetOpsItemRequestOps[Self <: GetOpsItemRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpsItemId(value: OpsItemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpsItemId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

