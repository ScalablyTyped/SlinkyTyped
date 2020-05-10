package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUsagePlanRequest extends js.Object {
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.native
  /**
    * [Required] The Id of the to-be-updated usage plan.
    */
  var usagePlanId: String = js.native
}

object UpdateUsagePlanRequest {
  @scala.inline
  def apply(usagePlanId: String): UpdateUsagePlanRequest = {
    val __obj = js.Dynamic.literal(usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUsagePlanRequest]
  }
  @scala.inline
  implicit class UpdateUsagePlanRequestOps[Self <: UpdateUsagePlanRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsagePlanId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usagePlanId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatchOperations(value: ListOfPatchOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patchOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatchOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patchOperations")(js.undefined)
        ret
    }
  }
  
}

