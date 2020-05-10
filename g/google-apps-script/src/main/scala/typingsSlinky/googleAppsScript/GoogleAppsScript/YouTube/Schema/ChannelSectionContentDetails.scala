package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSectionContentDetails extends js.Object {
  var channels: js.UndefOr[js.Array[String]] = js.native
  var playlists: js.UndefOr[js.Array[String]] = js.native
}

object ChannelSectionContentDetails {
  @scala.inline
  def apply(): ChannelSectionContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSectionContentDetails]
  }
  @scala.inline
  implicit class ChannelSectionContentDetailsOps[Self <: ChannelSectionContentDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannels(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaylists(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaylists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playlists")(js.undefined)
        ret
    }
  }
  
}

