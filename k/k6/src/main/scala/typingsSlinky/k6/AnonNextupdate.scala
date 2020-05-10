package typingsSlinky.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNextupdate extends js.Object {
  /** When response will be refreshed with the CA in millisecond Unix time. */
  var next_update: Double = js.native
  /** When response signed by responder in millisecond Unix time. */
  var produced_at: Double = js.native
  /** Certificate revocation reason. One of `OCSP_REASON_*` constants. */
  var revocation_reason: String = js.native
  /** When certificate was revoked in millisecond Unix time. */
  var revoked_at: Double = js.native
  /** Certificate status. One of `OCSP_STATUS_*` constants. */
  var status: String = js.native
  /** When indicated status was known correct in millisecond Unix time. */
  var this_update: Double = js.native
}

object AnonNextupdate {
  @scala.inline
  def apply(
    next_update: Double,
    produced_at: Double,
    revocation_reason: String,
    revoked_at: Double,
    status: String,
    this_update: Double
  ): AnonNextupdate = {
    val __obj = js.Dynamic.literal(next_update = next_update.asInstanceOf[js.Any], produced_at = produced_at.asInstanceOf[js.Any], revocation_reason = revocation_reason.asInstanceOf[js.Any], revoked_at = revoked_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], this_update = this_update.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNextupdate]
  }
  @scala.inline
  implicit class AnonNextupdateOps[Self <: AnonNextupdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNext_update(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduced_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("produced_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevocation_reason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revocation_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevoked_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revoked_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThis_update(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("this_update")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

