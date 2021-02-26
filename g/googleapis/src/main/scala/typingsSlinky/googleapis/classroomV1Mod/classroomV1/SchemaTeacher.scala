package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Teacher of a course.
  */
@js.native
trait SchemaTeacher extends StObject {
  
  /**
    * Identifier of the course.  Read-only.
    */
  var courseId: js.UndefOr[String] = js.native
  
  /**
    * Global user information for the teacher.  Read-only.
    */
  var profile: js.UndefOr[SchemaUserProfile] = js.native
  
  /**
    * Identifier of the user.  When specified as a parameter of a request, this
    * identifier can be one of the following:  * the numeric identifier for the
    * user * the email address of the user * the string literal
    * `&quot;me&quot;`, indicating the requesting user
    */
  var userId: js.UndefOr[String] = js.native
}
object SchemaTeacher {
  
  @scala.inline
  def apply(): SchemaTeacher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeacher]
  }
  
  @scala.inline
  implicit class SchemaTeacherMutableBuilder[Self <: SchemaTeacher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    @scala.inline
    def setProfile(value: SchemaUserProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
