package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GistsGetRevisionResponseHistoryItem extends js.Object {
  var change_status: GistsGetRevisionResponseHistoryItemChangeStatus = js.native
  var committed_at: String = js.native
  var url: String = js.native
  var user: GistsGetRevisionResponseHistoryItemUser = js.native
  var version: String = js.native
}

object GistsGetRevisionResponseHistoryItem {
  @scala.inline
  def apply(
    change_status: GistsGetRevisionResponseHistoryItemChangeStatus,
    committed_at: String,
    url: String,
    user: GistsGetRevisionResponseHistoryItemUser,
    version: String
  ): GistsGetRevisionResponseHistoryItem = {
    val __obj = js.Dynamic.literal(change_status = change_status.asInstanceOf[js.Any], committed_at = committed_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsGetRevisionResponseHistoryItem]
  }
  @scala.inline
  implicit class GistsGetRevisionResponseHistoryItemOps[Self <: GistsGetRevisionResponseHistoryItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange_status(value: GistsGetRevisionResponseHistoryItemChangeStatus): Self = {
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
    def withUser(value: GistsGetRevisionResponseHistoryItemUser): Self = {
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

