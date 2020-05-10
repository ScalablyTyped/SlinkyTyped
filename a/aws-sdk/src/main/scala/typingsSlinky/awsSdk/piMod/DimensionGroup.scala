package typingsSlinky.awsSdk.piMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionGroup extends js.Object {
  /**
    * A list of specific dimensions from a dimension group. If this parameter is not present, then it signifies that all of the dimensions in the group were requested, or are present in the response. Valid values for elements in the Dimensions array are:   db.user.id   db.user.name   db.host.id   db.host.name   db.sql.id   db.sql.db_id   db.sql.statement   db.sql.tokenized_id   db.sql_tokenized.id   db.sql_tokenized.db_id   db.sql_tokenized.statement   db.wait_event.name   db.wait_event.type   db.wait_event_type.name  
    */
  var Dimensions: js.UndefOr[StringList] = js.native
  /**
    * The name of the dimension group. Valid values are:    db.user     db.host     db.sql     db.sql_tokenized     db.wait_event     db.wait_event_type   
    */
  var Group: String = js.native
  /**
    * The maximum number of items to fetch for this dimension group.
    */
  var Limit: js.UndefOr[typingsSlinky.awsSdk.piMod.Limit] = js.native
}

object DimensionGroup {
  @scala.inline
  def apply(Group: String): DimensionGroup = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionGroup]
  }
  @scala.inline
  implicit class DimensionGroupOps[Self <: DimensionGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensions(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
        ret
    }
  }
  
}

