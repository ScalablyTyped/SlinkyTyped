package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistStatus extends js.Object {
  var privacyStatus: js.UndefOr[String] = js.native
}

object PlaylistStatus {
  @scala.inline
  def apply(): PlaylistStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistStatus]
  }
  @scala.inline
  implicit class PlaylistStatusOps[Self <: PlaylistStatus] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutPrivacyStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyStatus")(js.undefined)
        ret
    }
  }
  
}

