package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An invitation to join a course.
  */
@js.native
trait SchemaInvitation extends StObject {
  
  /**
    * Identifier of the course to invite the user to.
    */
  var courseId: js.UndefOr[String] = js.native
  
  /**
    * Identifier assigned by Classroom.  Read-only.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Role to invite the user to have. Must not be `COURSE_ROLE_UNSPECIFIED`.
    */
  var role: js.UndefOr[String] = js.native
  
  /**
    * Identifier of the invited user.  When specified as a parameter of a
    * request, this identifier can be set to one of the following:  * the
    * numeric identifier for the user * the email address of the user * the
    * string literal `&quot;me&quot;`, indicating the requesting user
    */
  var userId: js.UndefOr[String] = js.native
}
object SchemaInvitation {
  
  @scala.inline
  def apply(): SchemaInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvitation]
  }
  
  @scala.inline
  implicit class SchemaInvitationMutableBuilder[Self <: SchemaInvitation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
