package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClientYoutube.AnonFavorites
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelContentDetails extends js.Object {
  var relatedPlaylists: js.UndefOr[AnonFavorites] = js.native
}

object ChannelContentDetails {
  @scala.inline
  def apply(): ChannelContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelContentDetails]
  }
  @scala.inline
  implicit class ChannelContentDetailsOps[Self <: ChannelContentDetails] (val x: Self) extends AnyVal {
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

