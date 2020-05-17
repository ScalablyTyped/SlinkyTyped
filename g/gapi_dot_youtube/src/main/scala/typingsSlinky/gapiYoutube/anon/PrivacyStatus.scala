package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivacyStatus extends js.Object {
  /**
    * The playlists privacy status.
    */
  var privacyStatus: String = js.native
}

object PrivacyStatus {
  @scala.inline
  def apply(privacyStatus: String): PrivacyStatus = {
    val __obj = js.Dynamic.literal(privacyStatus = privacyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivacyStatus]
  }
  @scala.inline
  implicit class PrivacyStatusOps[Self <: PrivacyStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrivacyStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

