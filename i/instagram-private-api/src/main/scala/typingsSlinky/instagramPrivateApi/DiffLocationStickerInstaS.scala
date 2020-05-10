package typingsSlinky.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined utility-types.utility-types.Diff<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.LocationSticker, instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.InstaSticker> */
@js.native
trait DiffLocationStickerInstaS extends js.Object {
  var locationId: String = js.native
}

object DiffLocationStickerInstaS {
  @scala.inline
  def apply(locationId: String): DiffLocationStickerInstaS = {
    val __obj = js.Dynamic.literal(locationId = locationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffLocationStickerInstaS]
  }
  @scala.inline
  implicit class DiffLocationStickerInstaSOps[Self <: DiffLocationStickerInstaS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

