package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about a channelsection, including playlists and channels.
  */
@js.native
trait SchemaChannelSectionContentDetails extends js.Object {
  /**
    * The channel ids for type multiple_channels.
    */
  var channels: js.UndefOr[js.Array[String]] = js.native
  /**
    * The playlist ids for type single_playlist and multiple_playlists. For
    * singlePlaylist, only one playlistId is allowed.
    */
  var playlists: js.UndefOr[js.Array[String]] = js.native
}

object SchemaChannelSectionContentDetails {
  @scala.inline
  def apply(): SchemaChannelSectionContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelSectionContentDetails]
  }
  @scala.inline
  implicit class SchemaChannelSectionContentDetailsOps[Self <: SchemaChannelSectionContentDetails] (val x: Self) extends AnyVal {
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

