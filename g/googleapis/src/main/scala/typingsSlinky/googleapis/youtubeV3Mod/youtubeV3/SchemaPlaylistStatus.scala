package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPlaylistStatus extends js.Object {
  /**
    * The playlist&#39;s privacy status.
    */
  var privacyStatus: js.UndefOr[String] = js.native
}

object SchemaPlaylistStatus {
  @scala.inline
  def apply(): SchemaPlaylistStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistStatus]
  }
  @scala.inline
  implicit class SchemaPlaylistStatusOps[Self <: SchemaPlaylistStatus] (val x: Self) extends AnyVal {
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

