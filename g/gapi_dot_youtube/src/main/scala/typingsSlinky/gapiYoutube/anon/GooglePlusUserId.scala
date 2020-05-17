package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePlusUserId extends js.Object {
  /**
    * The googlePlusUserId object identifies the Google+ profile ID associated with this channel.
    */
  var googlePlusUserId: String = js.native
  /**
    * The relatedPlaylists object is a map that identifies playlists associated with the channel, such as the channels uploaded videos or favorite videos. You can retrieve any of these playlists using the playlists.list method.
    */
  var relatedPlaylists: Favorites = js.native
}

object GooglePlusUserId {
  @scala.inline
  def apply(googlePlusUserId: String, relatedPlaylists: Favorites): GooglePlusUserId = {
    val __obj = js.Dynamic.literal(googlePlusUserId = googlePlusUserId.asInstanceOf[js.Any], relatedPlaylists = relatedPlaylists.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePlusUserId]
  }
  @scala.inline
  implicit class GooglePlusUserIdOps[Self <: GooglePlusUserId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGooglePlusUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePlusUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelatedPlaylists(value: Favorites): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedPlaylists")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

