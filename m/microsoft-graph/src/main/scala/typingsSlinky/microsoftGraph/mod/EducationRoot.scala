package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EducationRoot extends Entity {
  // Read-only. Nullable.
  var classes: js.UndefOr[js.Array[EducationClass]] = js.native
  // Read-only. Nullable.
  var me: js.UndefOr[EducationUser] = js.native
  // Read-only. Nullable.
  var schools: js.UndefOr[js.Array[EducationSchool]] = js.native
  // Read-only. Nullable.
  var users: js.UndefOr[js.Array[EducationUser]] = js.native
}

object EducationRoot {
  @scala.inline
  def apply(): EducationRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationRoot]
  }
  @scala.inline
  implicit class EducationRootOps[Self <: EducationRoot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMe(value: EducationUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("me")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("me")(js.undefined)
        ret
    }
    @scala.inline
    def withSchools(value: js.Array[EducationSchool]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schools")(js.undefined)
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

