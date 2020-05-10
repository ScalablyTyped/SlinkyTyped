package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import typingsSlinky.googleapis.AnonFavorites
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the content of a channel.
  */
@js.native
trait SchemaChannelContentDetails extends js.Object {
  var relatedPlaylists: js.UndefOr[AnonFavorites] = js.native
}

object SchemaChannelContentDetails {
  @scala.inline
  def apply(): SchemaChannelContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelContentDetails]
  }
  @scala.inline
  implicit class SchemaChannelContentDetailsOps[Self <: SchemaChannelContentDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelatedPlaylists(value: AnonFavorites): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedPlaylists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedPlaylists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedPlaylists")(js.undefined)
        ret
    }
  }
  
}

