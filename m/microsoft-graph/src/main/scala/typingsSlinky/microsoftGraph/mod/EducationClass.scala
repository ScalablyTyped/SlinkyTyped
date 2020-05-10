package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EducationClass extends Entity {
  // Class code used by the school to identify the class.
  var classCode: js.UndefOr[String] = js.native
  // Entity who created the class
  var createdBy: js.UndefOr[IdentitySet] = js.native
  // Description of the class.
  var description: js.UndefOr[String] = js.native
  // Name of the class.
  var displayName: js.UndefOr[String] = js.native
  // ID of the class from the syncing system.
  var externalId: js.UndefOr[String] = js.native
  // Name of the class in the syncing system.
  var externalName: js.UndefOr[String] = js.native
  // How this class was created. The possible values are: sis, manual, unknownFutureValue.
  var externalSource: js.UndefOr[EducationExternalSource] = js.native
  // The directory group corresponding to this class.
  var group: js.UndefOr[Group] = js.native
  // Mail name for sending email to all members, if this is enabled.
  var mailNickname: js.UndefOr[String] = js.native
  // All users in the class. Nullable.
  var members: js.UndefOr[js.Array[EducationUser]] = js.native
  // All schools that this class is associated with. Nullable.
  var schools: js.UndefOr[js.Array[EducationSchool]] = js.native
  // All teachers in the class. Nullable.
  var teachers: js.UndefOr[js.Array[EducationUser]] = js.native
  // Term for this class.
  var term: js.UndefOr[EducationTerm] = js.native
}

object EducationClass {
  @scala.inline
  def apply(): EducationClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationClass]
  }
  @scala.inline
  implicit class EducationClassOps[Self <: EducationClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classCode")(js.undefined)
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
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
    def withExternalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalName")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalSource(value: EducationExternalSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalSource")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: Group): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withMailNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailNickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailNickname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailNickname")(js.undefined)
        ret
    }
    @scala.inline
    def withMembers(value: js.Array[EducationUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(js.undefined)
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
    def withTeachers(value: js.Array[EducationUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teachers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeachers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teachers")(js.undefined)
        ret
    }
    @scala.inline
    def withTerm(value: EducationTerm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term")(js.undefined)
        ret
    }
  }
  
}

