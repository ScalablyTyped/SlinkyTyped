package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedQuery extends js.Object {
  /**
    * The database to which the query belongs.
    */
  var Database: DatabaseString = js.native
  /**
    * The query description.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The query name.
    */
  var Name: NameString = js.native
  /**
    * The unique identifier of the query.
    */
  var NamedQueryId: js.UndefOr[typingsSlinky.awsSdk.athenaMod.NamedQueryId] = js.native
  /**
    * The SQL query statements that comprise the query.
    */
  var QueryString: typingsSlinky.awsSdk.athenaMod.QueryString = js.native
  /**
    * The name of the workgroup that contains the named query.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.native
}

object NamedQuery {
  @scala.inline
  def apply(Database: DatabaseString, Name: NameString, QueryString: QueryString): NamedQuery = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedQuery]
  }
  @scala.inline
  implicit class NamedQueryOps[Self <: NamedQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabase(value: DatabaseString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryString(value: QueryString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: DescriptionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedQueryId(value: NamedQueryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedQueryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedQueryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NamedQueryId")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkGroup(value: WorkGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkGroup")(js.undefined)
        ret
    }
  }
  
}

