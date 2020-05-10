package typingsSlinky.instagramPrivateApi.directRepositoryRankedRecipientsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectRepositoryRankedRecipientsResponseRankedRecipientsItem extends js.Object {
  var thread: js.UndefOr[DirectRepositoryRankedRecipientsResponseThread] = js.native
  var user: js.UndefOr[DirectRepositoryRankedRecipientsResponseUser] = js.native
}

object DirectRepositoryRankedRecipientsResponseRankedRecipientsItem {
  @scala.inline
  def apply(): DirectRepositoryRankedRecipientsResponseRankedRecipientsItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectRepositoryRankedRecipientsResponseRankedRecipientsItem]
  }
  @scala.inline
  implicit class DirectRepositoryRankedRecipientsResponseRankedRecipientsItemOps[Self <: DirectRepositoryRankedRecipientsResponseRankedRecipientsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThread(value: DirectRepositoryRankedRecipientsResponseThread): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThread: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: DirectRepositoryRankedRecipientsResponseUser): Self = {
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

