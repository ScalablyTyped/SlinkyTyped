package typingsSlinky.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchRevokePermissionsResponse extends js.Object {
  /**
    * A list of failures to revoke permissions to the resources.
    */
  var Failures: js.UndefOr[BatchPermissionsFailureList] = js.native
}

object BatchRevokePermissionsResponse {
  @scala.inline
  def apply(): BatchRevokePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRevokePermissionsResponse]
  }
  @scala.inline
  implicit class BatchRevokePermissionsResponseOps[Self <: BatchRevokePermissionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailures(value: BatchPermissionsFailureList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Failures")(js.undefined)
        ret
    }
  }
  
}

