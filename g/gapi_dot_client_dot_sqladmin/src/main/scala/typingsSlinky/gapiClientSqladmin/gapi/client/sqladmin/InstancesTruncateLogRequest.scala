package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesTruncateLogRequest extends js.Object {
  /** Contains details about the truncate log operation. */
  var truncateLogContext: js.UndefOr[TruncateLogContext] = js.native
}

object InstancesTruncateLogRequest {
  @scala.inline
  def apply(): InstancesTruncateLogRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesTruncateLogRequest]
  }
  @scala.inline
  implicit class InstancesTruncateLogRequestOps[Self <: InstancesTruncateLogRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTruncateLogContext(value: TruncateLogContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateLogContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncateLogContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateLogContext")(js.undefined)
        ret
    }
  }
  
}

