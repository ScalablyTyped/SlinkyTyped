package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFavorites extends js.Object {
  /**
    * The ID of the playlist that contains the channels favorite videos.
    */
  var favorites: String = js.native
  /**
    * The ID of the playlist that contains the channels liked videos.
    */
  var likes: String = js.native
  /**
    * The ID of the playlist that contains the channels uploaded videos.
    */
  var uploads: String = js.native
  /**
    * The ID of the playlist that contains the channels watch history.
    */
  var watchHistory: String = js.native
  /**
    * The ID of the channels watch later playlist.
    */
  var watchLater: String = js.native
}

object AnonFavorites {
  @scala.inline
  def apply(favorites: String, likes: String, uploads: String, watchHistory: String, watchLater: String): AnonFavorites = {
    val __obj = js.Dynamic.literal(favorites = favorites.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], uploads = uploads.asInstanceOf[js.Any], watchHistory = watchHistory.asInstanceOf[js.Any], watchLater = watchLater.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFavorites]
  }
  @scala.inline
  implicit class AnonFavoritesOps[Self <: AnonFavorites] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFavorites(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favorites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLikes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploads(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchHistory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchLater(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchLater")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

