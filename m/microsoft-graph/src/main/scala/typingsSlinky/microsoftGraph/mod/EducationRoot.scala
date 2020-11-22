package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EducationRoot extends Entity {
  
  // Read-only. Nullable.
  var classes: js.UndefOr[NullableOption[js.Array[EducationClass]]] = js.native
  
  // Read-only. Nullable.
  var me: js.UndefOr[NullableOption[EducationUser]] = js.native
  
  // Read-only. Nullable.
  var schools: js.UndefOr[NullableOption[js.Array[EducationSchool]]] = js.native
  
  // Read-only. Nullable.
  var users: js.UndefOr[NullableOption[js.Array[EducationUser]]] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassesVarargs(value: EducationClass*): Self = this.set("classes", js.Array(value :_*))
    
    @scala.inline
    def setClasses(value: NullableOption[js.Array[EducationClass]]): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setClassesNull: Self = this.set("classes", null)
    
    @scala.inline
    def setMe(value: NullableOption[EducationUser]): Self = this.set("me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMe: Self = this.set("me", js.undefined)
    
    @scala.inline
    def setMeNull: Self = this.set("me", null)
    
    @scala.inline
    def setSchoolsVarargs(value: EducationSchool*): Self = this.set("schools", js.Array(value :_*))
    
    @scala.inline
    def setSchools(value: NullableOption[js.Array[EducationSchool]]): Self = this.set("schools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchools: Self = this.set("schools", js.undefined)
    
    @scala.inline
    def setSchoolsNull: Self = this.set("schools", null)
    
    @scala.inline
    def setUsersVarargs(value: EducationUser*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: NullableOption[js.Array[EducationUser]]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
    
    @scala.inline
    def setUsersNull: Self = this.set("users", null)
  }
}
