package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGooglePlusUserId extends js.Object {
  /**
    * The googlePlusUserId object identifies the Google+ profile ID associated with this channel.
    */
  var googlePlusUserId: String = js.native
  /**
    * The relatedPlaylists object is a map that identifies playlists associated with the channel, such as the channels uploaded videos or favorite videos. You can retrieve any of these playlists using the playlists.list method.
    */
  var relatedPlaylists: AnonFavorites = js.native
}

object AnonGooglePlusUserId {
  @scala.inline
  def apply(googlePlusUserId: String, relatedPlaylists: AnonFavorites): AnonGooglePlusUserId = {
    val __obj = js.Dynamic.literal(googlePlusUserId = googlePlusUserId.asInstanceOf[js.Any], relatedPlaylists = relatedPlaylists.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGooglePlusUserId]
  }
  @scala.inline
  implicit class AnonGooglePlusUserIdOps[Self <: AnonGooglePlusUserId] (val x: Self) extends AnyVal {
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
    def withRelatedPlaylists(value: AnonFavorites): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedPlaylists")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

