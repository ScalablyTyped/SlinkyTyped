package typingsSlinky.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FbsearchRepositoryTopsearchFlatResponseRootObject extends js.Object {
  var clear_client_cache: Boolean = js.native
  var has_more: Boolean = js.native
  var list: js.Array[FbsearchRepositoryTopsearchFlatResponseListItem] = js.native
  var rank_token: String = js.native
  var status: String = js.native
}

object FbsearchRepositoryTopsearchFlatResponseRootObject {
  @scala.inline
  def apply(
    clear_client_cache: Boolean,
    has_more: Boolean,
    list: js.Array[FbsearchRepositoryTopsearchFlatResponseListItem],
    rank_token: String,
    status: String
  ): FbsearchRepositoryTopsearchFlatResponseRootObject = {
    val __obj = js.Dynamic.literal(clear_client_cache = clear_client_cache.asInstanceOf[js.Any], has_more = has_more.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbsearchRepositoryTopsearchFlatResponseRootObject]
  }
  @scala.inline
  implicit class FbsearchRepositoryTopsearchFlatResponseRootObjectOps[Self <: FbsearchRepositoryTopsearchFlatResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear_client_cache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear_client_cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_more(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: js.Array[FbsearchRepositoryTopsearchFlatResponseListItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

