package typingsSlinky.gapiClientYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Favorites extends js.Object {
  /**
    * The ID of the playlist that contains the channel"s favorite videos. Use the  playlistItems.insert and  playlistItems.delete to add or remove items from
    * that list.
    */
  var favorites: js.UndefOr[String] = js.native
  /**
    * The ID of the playlist that contains the channel"s liked videos. Use the   playlistItems.insert and  playlistItems.delete to add or remove items from
    * that list.
    */
  var likes: js.UndefOr[String] = js.native
  /**
    * The ID of the playlist that contains the channel"s uploaded videos. Use the  videos.insert method to upload new videos and the videos.delete method to
    * delete previously uploaded videos.
    */
  var uploads: js.UndefOr[String] = js.native
  /**
    * The ID of the playlist that contains the channel"s watch history. Use the  playlistItems.insert and  playlistItems.delete to add or remove items from
    * that list.
    */
  var watchHistory: js.UndefOr[String] = js.native
  /**
    * The ID of the playlist that contains the channel"s watch later playlist. Use the playlistItems.insert and  playlistItems.delete to add or remove items
    * from that list.
    */
  var watchLater: js.UndefOr[String] = js.native
}

object Favorites {
  @scala.inline
  def apply(): Favorites = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Favorites]
  }
  @scala.inline
  implicit class FavoritesOps[Self <: Favorites] (val x: Self) extends AnyVal {
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
    def withoutFavorites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favorites")(js.undefined)
        ret
    }
    @scala.inline
    def withLikes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLikes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likes")(js.undefined)
        ret
    }
    @scala.inline
    def withUploads(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploads")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchHistory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withWatchLater(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchLater")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatchLater: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchLater")(js.undefined)
        ret
    }
  }
  
}

