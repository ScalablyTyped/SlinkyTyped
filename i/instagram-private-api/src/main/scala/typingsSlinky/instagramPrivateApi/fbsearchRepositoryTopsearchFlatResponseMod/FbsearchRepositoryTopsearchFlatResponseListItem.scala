package typingsSlinky.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FbsearchRepositoryTopsearchFlatResponseListItem extends js.Object {
  var hashtag: js.UndefOr[FbsearchRepositoryTopsearchFlatResponseHashtag] = js.native
  var place: js.UndefOr[FbsearchRepositoryTopsearchFlatResponsePlace] = js.native
  var position: Double = js.native
  var user: js.UndefOr[FbsearchRepositoryTopsearchFlatResponseUser] = js.native
}

object FbsearchRepositoryTopsearchFlatResponseListItem {
  @scala.inline
  def apply(position: Double): FbsearchRepositoryTopsearchFlatResponseListItem = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseListItem]
  }
  @scala.inline
  implicit class FbsearchRepositoryTopsearchFlatResponseListItemOps[Self <: FbsearchRepositoryTopsearchFlatResponseListItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashtag(value: FbsearchRepositoryTopsearchFlatResponseHashtag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(js.undefined)
        ret
    }
    @scala.inline
    def withPlace(value: FbsearchRepositoryTopsearchFlatResponsePlace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: FbsearchRepositoryTopsearchFlatResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

