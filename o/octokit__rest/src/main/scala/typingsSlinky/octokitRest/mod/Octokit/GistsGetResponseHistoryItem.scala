package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GistsGetResponseHistoryItem extends js.Object {
  var change_status: GistsGetResponseHistoryItemChangeStatus = js.native
  var committed_at: String = js.native
  var url: String = js.native
  var user: GistsGetResponseHistoryItemUser = js.native
  var version: String = js.native
}

object GistsGetResponseHistoryItem {
  @scala.inline
  def apply(
    change_status: GistsGetResponseHistoryItemChangeStatus,
    committed_at: String,
    url: String,
    user: GistsGetResponseHistoryItemUser,
    version: String
  ): GistsGetResponseHistoryItem = {
    val __obj = js.Dynamic.literal(change_status = change_status.asInstanceOf[js.Any], committed_at = committed_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsGetResponseHistoryItem]
  }
  @scala.inline
  implicit class GistsGetResponseHistoryItemOps[Self <: GistsGetResponseHistoryItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange_status(value: GistsGetResponseHistoryItemChangeStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitted_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committed_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: GistsGetResponseHistoryItemUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

