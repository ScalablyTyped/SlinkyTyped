package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Corpus specific queries.
  */
@js.native
trait SchemaCorpusQuery extends js.Object {
  /**
    * Details pertaining to Drive holds. If set, corpus must be Drive.
    */
  var driveQuery: js.UndefOr[SchemaHeldDriveQuery] = js.native
  /**
    * Details pertaining to Groups holds. If set, corpus must be Groups.
    */
  var groupsQuery: js.UndefOr[SchemaHeldGroupsQuery] = js.native
  /**
    * Details pertaining to Hangouts Chat holds. If set, corpus must be
    * Hangouts Chat.
    */
  var hangoutsChatQuery: js.UndefOr[SchemaHeldHangoutsChatQuery] = js.native
  /**
    * Details pertaining to mail holds. If set, corpus must be mail.
    */
  var mailQuery: js.UndefOr[SchemaHeldMailQuery] = js.native
}

object SchemaCorpusQuery {
  @scala.inline
  def apply(): SchemaCorpusQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCorpusQuery]
  }
  @scala.inline
  implicit class SchemaCorpusQueryOps[Self <: SchemaCorpusQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriveQuery(value: SchemaHeldDriveQuery): Self = {
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
    def withGroupsQuery(value: SchemaHeldGroupsQuery): Self = {
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
    def withHangoutsChatQuery(value: SchemaHeldHangoutsChatQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hangoutsChatQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHangoutsChatQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hangoutsChatQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withMailQuery(value: SchemaHeldMailQuery): Self = {
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

