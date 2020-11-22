package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EducationClass extends Entity {
  
  // Class code used by the school to identify the class.
  var classCode: js.UndefOr[NullableOption[String]] = js.native
  
  // Entity who created the class
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // Description of the class.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Name of the class.
  var displayName: js.UndefOr[String] = js.native
  
  // ID of the class from the syncing system.
  var externalId: js.UndefOr[NullableOption[String]] = js.native
  
  // Name of the class in the syncing system.
  var externalName: js.UndefOr[NullableOption[String]] = js.native
  
  // How this class was created. The possible values are: sis, manual, unknownFutureValue.
  var externalSource: js.UndefOr[NullableOption[EducationExternalSource]] = js.native
  
  // The directory group corresponding to this class.
  var group: js.UndefOr[NullableOption[Group]] = js.native
  
  // Mail name for sending email to all members, if this is enabled.
  var mailNickname: js.UndefOr[String] = js.native
  
  // All users in the class. Nullable.
  var members: js.UndefOr[NullableOption[js.Array[EducationUser]]] = js.native
  
  // All schools that this class is associated with. Nullable.
  var schools: js.UndefOr[NullableOption[js.Array[EducationSchool]]] = js.native
  
  // All teachers in the class. Nullable.
  var teachers: js.UndefOr[NullableOption[js.Array[EducationUser]]] = js.native
  
  // Term for this class.
  var term: js.UndefOr[NullableOption[EducationTerm]] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassCode(value: NullableOption[String]): Self = this.set("classCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassCode: Self = this.set("classCode", js.undefined)
    
    @scala.inline
    def setClassCodeNull: Self = this.set("classCode", null)
    
    @scala.inline
    def setCreatedBy(value: NullableOption[IdentitySet]): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    
    @scala.inline
    def setCreatedByNull: Self = this.set("createdBy", null)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setExternalId(value: NullableOption[String]): Self = this.set("externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    
    @scala.inline
    def setExternalIdNull: Self = this.set("externalId", null)
    
    @scala.inline
    def setExternalName(value: NullableOption[String]): Self = this.set("externalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalName: Self = this.set("externalName", js.undefined)
    
    @scala.inline
    def setExternalNameNull: Self = this.set("externalName", null)
    
    @scala.inline
    def setExternalSource(value: NullableOption[EducationExternalSource]): Self = this.set("externalSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalSource: Self = this.set("externalSource", js.undefined)
    
    @scala.inline
    def setExternalSourceNull: Self = this.set("externalSource", null)
    
    @scala.inline
    def setGroup(value: NullableOption[Group]): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setGroupNull: Self = this.set("group", null)
    
    @scala.inline
    def setMailNickname(value: String): Self = this.set("mailNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailNickname: Self = this.set("mailNickname", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: EducationUser*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: NullableOption[js.Array[EducationUser]]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    
    @scala.inline
    def setMembersNull: Self = this.set("members", null)
    
    @scala.inline
    def setSchoolsVarargs(value: EducationSchool*): Self = this.set("schools", js.Array(value :_*))
    
    @scala.inline
    def setSchools(value: NullableOption[js.Array[EducationSchool]]): Self = this.set("schools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchools: Self = this.set("schools", js.undefined)
    
    @scala.inline
    def setSchoolsNull: Self = this.set("schools", null)
    
    @scala.inline
    def setTeachersVarargs(value: EducationUser*): Self = this.set("teachers", js.Array(value :_*))
    
    @scala.inline
    def setTeachers(value: NullableOption[js.Array[EducationUser]]): Self = this.set("teachers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeachers: Self = this.set("teachers", js.undefined)
    
    @scala.inline
    def setTeachersNull: Self = this.set("teachers", null)
    
    @scala.inline
    def setTerm(value: NullableOption[EducationTerm]): Self = this.set("term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerm: Self = this.set("term", js.undefined)
    
    @scala.inline
    def setTermNull: Self = this.set("term", null)
  }
}
