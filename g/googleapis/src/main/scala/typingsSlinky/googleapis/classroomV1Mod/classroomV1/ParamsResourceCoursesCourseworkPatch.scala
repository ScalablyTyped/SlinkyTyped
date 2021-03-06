package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCoursesCourseworkPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Identifier of the course. This identifier can be either the
    * Classroom-assigned identifier or an alias.
    */
  var courseId: js.UndefOr[String] = js.native
  
  /**
    * Identifier of the course work.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCourseWork] = js.native
  
  /**
    * Mask that identifies which fields on the course work to update. This
    * field is required to do an update. The update fails if invalid fields are
    * specified. If a field supports empty values, it can be cleared by
    * specifying it in the update mask and not in the CourseWork object. If a
    * field that does not support empty values is included in the update mask
    * and not set in the CourseWork object, an `INVALID_ARGUMENT` error will be
    * returned.  The following fields may be specified by teachers:  * `title`
    * * `description` * `state` * `due_date` * `due_time` * `max_points` *
    * `scheduled_time` * `submission_modification_mode`
    */
  var updateMask: js.UndefOr[String] = js.native
}
object ParamsResourceCoursesCourseworkPatch {
  
  @scala.inline
  def apply(): ParamsResourceCoursesCourseworkPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesCourseworkPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceCoursesCourseworkPatchMutableBuilder[Self <: ParamsResourceCoursesCourseworkPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaCourseWork): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
