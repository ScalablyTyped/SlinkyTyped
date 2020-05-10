package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesFailoverRequest extends js.Object {
  /** Failover Context. */
  var failoverContext: js.UndefOr[FailoverContext] = js.native
}

object InstancesFailoverRequest {
  @scala.inline
  def apply(): InstancesFailoverRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesFailoverRequest]
  }
  @scala.inline
  implicit class InstancesFailoverRequestOps[Self <: InstancesFailoverRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailoverContext(value: FailoverContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failoverContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailoverContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failoverContext")(js.undefined)
        ret
    }
  }
  
}

