package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetAccess extends js.Object {
  var domain: js.UndefOr[String] = js.native
  var groupByEmail: js.UndefOr[String] = js.native
  var iamMember: js.UndefOr[String] = js.native
  var role: js.UndefOr[String] = js.native
  var specialGroup: js.UndefOr[String] = js.native
  var userByEmail: js.UndefOr[String] = js.native
  var view: js.UndefOr[TableReference] = js.native
}

object DatasetAccess {
  @scala.inline
  def apply(): DatasetAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetAccess]
  }
  @scala.inline
  implicit class DatasetAccessOps[Self <: DatasetAccess] (val x: Self) extends AnyVal {
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
    def withIamMember(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamMember: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamMember")(js.undefined)
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

