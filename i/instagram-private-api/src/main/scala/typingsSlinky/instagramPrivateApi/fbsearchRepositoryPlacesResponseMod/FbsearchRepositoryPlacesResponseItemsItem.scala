package typingsSlinky.instagramPrivateApi.fbsearchRepositoryPlacesResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FbsearchRepositoryPlacesResponseItemsItem extends js.Object {
  var header_media: FbsearchRepositoryPlacesResponseHeaderMedia = js.native
  var location: FbsearchRepositoryPlacesResponseLocation = js.native
  var media_bundles: js.Array[_] = js.native
  var subtitle: String = js.native
  var title: String = js.native
}

object FbsearchRepositoryPlacesResponseItemsItem {
  @scala.inline
  def apply(
    header_media: FbsearchRepositoryPlacesResponseHeaderMedia,
    location: FbsearchRepositoryPlacesResponseLocation,
    media_bundles: js.Array[_],
    subtitle: String,
    title: String
  ): FbsearchRepositoryPlacesResponseItemsItem = {
    val __obj = js.Dynamic.literal(header_media = header_media.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], media_bundles = media_bundles.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbsearchRepositoryPlacesResponseItemsItem]
  }
  @scala.inline
  implicit class FbsearchRepositoryPlacesResponseItemsItemOps[Self <: FbsearchRepositoryPlacesResponseItemsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader_media(value: FbsearchRepositoryPlacesResponseHeaderMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: FbsearchRepositoryPlacesResponseLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia_bundles(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_bundles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

