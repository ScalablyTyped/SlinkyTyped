package typingsSlinky.instagramPrivateApi.locationFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationFeedResponseMediasItem extends js.Object {
  var media: LocationFeedResponseMedia = js.native
}

object LocationFeedResponseMediasItem {
  @scala.inline
  def apply(media: LocationFeedResponseMedia): LocationFeedResponseMediasItem = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseMediasItem]
  }
  @scala.inline
  implicit class LocationFeedResponseMediasItemOps[Self <: LocationFeedResponseMediasItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMedia(value: LocationFeedResponseMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

