package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Student work for an assignment.
  */
@js.native
trait SchemaAssignmentSubmission extends StObject {
  
  /**
    * Attachments added by the student. Drive files that correspond to
    * materials with a share mode of STUDENT_COPY may not exist yet if the
    * student has not accessed the assignment in Classroom.  Some attachment
    * metadata is only populated if the requesting user has permission to
    * access it. Identifier and alternate_link fields are always available, but
    * others (e.g. title) may not be.
    */
  var attachments: js.UndefOr[js.Array[SchemaAttachment]] = js.native
}
object SchemaAssignmentSubmission {
  
  @scala.inline
  def apply(): SchemaAssignmentSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssignmentSubmission]
  }
  
  @scala.inline
  implicit class SchemaAssignmentSubmissionMutableBuilder[Self <: SchemaAssignmentSubmission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: js.Array[SchemaAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: SchemaAttachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
  }
}
