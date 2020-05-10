package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPlaylistContentDetails extends js.Object {
  /**
    * The number of videos in the playlist.
    */
  var itemCount: js.UndefOr[Double] = js.native
}

object SchemaPlaylistContentDetails {
  @scala.inline
  def apply(): SchemaPlaylistContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistContentDetails]
  }
  @scala.inline
  implicit class SchemaPlaylistContentDetailsOps[Self <: SchemaPlaylistContentDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCount")(js.undefined)
        ret
    }
  }
  
}

