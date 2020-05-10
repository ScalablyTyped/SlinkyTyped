package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFavorites extends js.Object {
  var favorites: js.UndefOr[String] = js.native
  var likes: js.UndefOr[String] = js.native
  var uploads: js.UndefOr[String] = js.native
  var watchHistory: js.UndefOr[String] = js.native
  var watchLater: js.UndefOr[String] = js.native
}

object AnonFavorites {
  @scala.inline
  def apply(): AnonFavorites = {
    val __obj = js.Dynamic.literal()
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

