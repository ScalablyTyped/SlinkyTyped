package typingsSlinky.instagramPrivateApi.fbsearchRepositoryPlacesResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FbsearchRepositoryPlacesResponseRootObject extends js.Object {
  var has_more: Boolean = js.native
  var items: js.Array[FbsearchRepositoryPlacesResponseItemsItem] = js.native
  var rank_token: String = js.native
  var status: String = js.native
}

object FbsearchRepositoryPlacesResponseRootObject {
  @scala.inline
  def apply(
    has_more: Boolean,
    items: js.Array[FbsearchRepositoryPlacesResponseItemsItem],
    rank_token: String,
    status: String
  ): FbsearchRepositoryPlacesResponseRootObject = {
    val __obj = js.Dynamic.literal(has_more = has_more.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbsearchRepositoryPlacesResponseRootObject]
  }
  @scala.inline
  implicit class FbsearchRepositoryPlacesResponseRootObjectOps[Self <: FbsearchRepositoryPlacesResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHas_more(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_more")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[FbsearchRepositoryPlacesResponseItemsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
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

