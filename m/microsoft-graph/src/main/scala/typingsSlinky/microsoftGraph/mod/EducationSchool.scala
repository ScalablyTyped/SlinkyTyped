package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EducationSchool extends EducationOrganization {
  // Address of the school.
  var address: js.UndefOr[PhysicalAddress] = js.native
  // Classes taught at the school. Nullable.
  var classes: js.UndefOr[js.Array[EducationClass]] = js.native
  // Entity who created the school.
  var createdBy: js.UndefOr[IdentitySet] = js.native
  // ID of school in syncing system.
  var externalId: js.UndefOr[String] = js.native
  // ID of principal in syncing system.
  var externalPrincipalId: js.UndefOr[String] = js.native
  var fax: js.UndefOr[String] = js.native
  // Highest grade taught.
  var highestGrade: js.UndefOr[String] = js.native
  // Lowest grade taught.
  var lowestGrade: js.UndefOr[String] = js.native
  // Phone number of school.
  var phone: js.UndefOr[String] = js.native
  // Email address of the principal.
  var principalEmail: js.UndefOr[String] = js.native
  // Name of the principal.
  var principalName: js.UndefOr[String] = js.native
  // School Number.
  var schoolNumber: js.UndefOr[String] = js.native
  // Users in the school. Nullable.
  var users: js.UndefOr[js.Array[EducationUser]] = js.native
}

object EducationSchool {
  @scala.inline
  def apply(): EducationSchool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationSchool]
  }
  @scala.inline
  implicit class EducationSchoolOps[Self <: EducationSchool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: PhysicalAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: js.Array[EducationClass]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedBy(value: IdentitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalId")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalPrincipalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalPrincipalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalPrincipalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalPrincipalId")(js.undefined)
        ret
    }
    @scala.inline
    def withFax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fax")(js.undefined)
        ret
    }
    @scala.inline
    def withHighestGrade(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highestGrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighestGrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highestGrade")(js.undefined)
        ret
    }
    @scala.inline
    def withLowestGrade(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowestGrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowestGrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowestGrade")(js.undefined)
        ret
    }
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipalEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withPrincipalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principalName")(js.undefined)
        ret
    }
    @scala.inline
    def withSchoolNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schoolNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchoolNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schoolNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[EducationUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(js.undefined)
        ret
    }
  }
  
}

