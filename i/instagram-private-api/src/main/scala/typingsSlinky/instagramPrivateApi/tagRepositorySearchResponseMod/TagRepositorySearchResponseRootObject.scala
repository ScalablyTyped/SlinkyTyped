package typingsSlinky.instagramPrivateApi.tagRepositorySearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagRepositorySearchResponseRootObject extends js.Object {
  var has_more: Boolean = js.native
  var rank_token: String = js.native
  var results: js.Array[TagRepositorySearchResponseResultsItem] = js.native
  var status: String = js.native
}

object TagRepositorySearchResponseRootObject {
  @scala.inline
  def apply(
    has_more: Boolean,
    rank_token: String,
    results: js.Array[TagRepositorySearchResponseResultsItem],
    status: String
  ): TagRepositorySearchResponseRootObject = {
    val __obj = js.Dynamic.literal(has_more = has_more.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagRepositorySearchResponseRootObject]
  }
  @scala.inline
  implicit class TagRepositorySearchResponseRootObjectOps[Self <: TagRepositorySearchResponseRootObject] (val x: Self) extends AnyVal {
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
    def withRank_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[TagRepositorySearchResponseResultsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
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

