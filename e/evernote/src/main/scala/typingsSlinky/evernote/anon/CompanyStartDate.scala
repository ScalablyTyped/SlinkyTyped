package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompanyStartDate extends js.Object {
  var companyStartDate: js.UndefOr[Timestamp] = js.native
  var department: js.UndefOr[String] = js.native
  var linkedInProfileUrl: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var mobilePhone: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var workPhone: js.UndefOr[String] = js.native
}

object CompanyStartDate {
  @scala.inline
  def apply(): CompanyStartDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompanyStartDate]
  }
  @scala.inline
  implicit class CompanyStartDateOps[Self <: CompanyStartDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanyStartDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyStartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDepartment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("department")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepartment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("department")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedInProfileUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedInProfileUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedInProfileUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedInProfileUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMobilePhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobilePhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobilePhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobilePhone")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workPhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workPhone")(js.undefined)
        ret
    }
  }
  
}

