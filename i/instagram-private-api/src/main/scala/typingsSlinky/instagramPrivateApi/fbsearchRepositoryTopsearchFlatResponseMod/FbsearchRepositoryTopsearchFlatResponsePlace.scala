package typingsSlinky.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FbsearchRepositoryTopsearchFlatResponsePlace extends js.Object {
  var header_media: FbsearchRepositoryTopsearchFlatResponseHeaderMedia = js.native
  var location: FbsearchRepositoryTopsearchFlatResponseLocation = js.native
  var media_bundles: js.Array[_] = js.native
  var subtitle: String = js.native
  var title: String = js.native
}

object FbsearchRepositoryTopsearchFlatResponsePlace {
  @scala.inline
  def apply(
    header_media: FbsearchRepositoryTopsearchFlatResponseHeaderMedia,
    location: FbsearchRepositoryTopsearchFlatResponseLocation,
    media_bundles: js.Array[_],
    subtitle: String,
    title: String
  ): FbsearchRepositoryTopsearchFlatResponsePlace = {
    val __obj = js.Dynamic.literal(header_media = header_media.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], media_bundles = media_bundles.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponsePlace]
  }
  @scala.inline
  implicit class FbsearchRepositoryTopsearchFlatResponsePlaceOps[Self <: FbsearchRepositoryTopsearchFlatResponsePlace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader_media(value: FbsearchRepositoryTopsearchFlatResponseHeaderMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header_media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: FbsearchRepositoryTopsearchFlatResponseLocation): Self = {
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

