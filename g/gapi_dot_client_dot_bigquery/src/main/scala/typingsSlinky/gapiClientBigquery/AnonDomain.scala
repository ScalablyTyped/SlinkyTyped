package typingsSlinky.gapiClientBigquery

import typingsSlinky.gapiClientBigquery.gapi.client.bigquery.TableReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDomain extends js.Object {
  /** [Pick one] A domain to grant access to. Any users signed in with the domain specified will be granted the specified access. Example: "example.com". */
  var domain: js.UndefOr[String] = js.native
  /** [Pick one] An email address of a Google Group to grant access to. */
  var groupByEmail: js.UndefOr[String] = js.native
  /**
    * [Required] Describes the rights granted to the user specified by the other member of the access object. The following string values are supported:
    * READER, WRITER, OWNER.
    */
  var role: js.UndefOr[String] = js.native
  /**
    * [Pick one] A special group to grant access to. Possible values include: projectOwners: Owners of the enclosing project. projectReaders: Readers of the
    * enclosing project. projectWriters: Writers of the enclosing project. allAuthenticatedUsers: All authenticated BigQuery users.
    */
  var specialGroup: js.UndefOr[String] = js.native
  /** [Pick one] An email address of a user to grant access to. For example: fred@example.com. */
  var userByEmail: js.UndefOr[String] = js.native
  /**
    * [Pick one] A view from a different dataset to grant access to. Queries executed against that view will have read access to tables in this dataset. The
    * role field is not required when this field is set. If that view is updated by any user, access to the view needs to be granted again via an update
    * operation.
    */
  var view: js.UndefOr[TableReference] = js.native
}

object AnonDomain {
  @scala.inline
  def apply(): AnonDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDomain]
  }
  @scala.inline
  implicit class AnonDomainOps[Self <: AnonDomain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecialGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecialGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withUserByEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userByEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserByEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userByEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: TableReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

