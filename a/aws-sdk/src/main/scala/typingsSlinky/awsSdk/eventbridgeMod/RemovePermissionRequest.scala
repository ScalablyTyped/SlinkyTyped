package typingsSlinky.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovePermissionRequest extends js.Object {
  /**
    * The name of the event bus to revoke permissions for. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[NonPartnerEventBusName] = js.native
  /**
    * The statement ID corresponding to the account that is no longer allowed to put events to the default event bus.
    */
  var StatementId: typingsSlinky.awsSdk.eventbridgeMod.StatementId = js.native
}

object RemovePermissionRequest {
  @scala.inline
  def apply(StatementId: StatementId): RemovePermissionRequest = {
    val __obj = js.Dynamic.literal(StatementId = StatementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePermissionRequest]
  }
  @scala.inline
  implicit class RemovePermissionRequestOps[Self <: RemovePermissionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatementId(value: StatementId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventBusName(value: NonPartnerEventBusName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventBusName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventBusName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventBusName")(js.undefined)
        ret
    }
  }
  
}

