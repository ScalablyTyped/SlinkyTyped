package typingsSlinky.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSuccess extends js.Object {
  /**
    * - An empty string if `success` is `true`.
    * - The failure reason if `success` is `false`.
    */
  var reason: String = js.native
  /**
    * The result of republishing or re-subscribing to the stream.
    * - `true`: Success.
    * - `false`: Failure.
    */
  var success: Boolean = js.native
  /** The corresponding uid of the stream being republished or re-subscribed to. */
  var uid: Double | String = js.native
}

object AnonSuccess {
  @scala.inline
  def apply(reason: String, success: Boolean, uid: Double | String): AnonSuccess = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSuccess]
  }
  @scala.inline
  implicit class AnonSuccessOps[Self <: AnonSuccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

