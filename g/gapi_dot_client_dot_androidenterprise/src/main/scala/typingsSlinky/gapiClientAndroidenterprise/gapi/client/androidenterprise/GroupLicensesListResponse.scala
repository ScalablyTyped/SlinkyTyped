package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupLicensesListResponse extends js.Object {
  /** A group license for a product approved for use in the enterprise. */
  var groupLicense: js.UndefOr[js.Array[GroupLicense]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#groupLicensesListResponse". */
  var kind: js.UndefOr[String] = js.native
}

object GroupLicensesListResponse {
  @scala.inline
  def apply(): GroupLicensesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLicensesListResponse]
  }
  @scala.inline
  implicit class GroupLicensesListResponseOps[Self <: GroupLicensesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupLicense(value: js.Array[GroupLicense]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupLicense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupLicense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupLicense")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

