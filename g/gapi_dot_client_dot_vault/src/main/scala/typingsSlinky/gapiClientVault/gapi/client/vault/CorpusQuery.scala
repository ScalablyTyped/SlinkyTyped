package typingsSlinky.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CorpusQuery extends js.Object {
  /** Details pertaining to Drive holds. If set, corpus must be Drive. */
  var driveQuery: js.UndefOr[HeldDriveQuery] = js.native
  /** Details pertaining to Groups holds. If set, corpus must be Groups. */
  var groupsQuery: js.UndefOr[HeldGroupsQuery] = js.native
  /** Details pertaining to mail holds. If set, corpus must be mail. */
  var mailQuery: js.UndefOr[HeldMailQuery] = js.native
}

object CorpusQuery {
  @scala.inline
  def apply(): CorpusQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CorpusQuery]
  }
  @scala.inline
  implicit class CorpusQueryOps[Self <: CorpusQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriveQuery(value: HeldDriveQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupsQuery(value: HeldGroupsQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupsQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupsQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupsQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withMailQuery(value: HeldMailQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailQuery")(js.undefined)
        ret
    }
  }
  
}

