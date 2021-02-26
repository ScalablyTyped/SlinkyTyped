package typingsSlinky.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CourseWorkMaterial extends StObject {
  
  /** Absolute link to this course work material in the Classroom web UI. This is only populated if `state` is `PUBLISHED`. Read-only. */
  var alternateLink: js.UndefOr[String] = js.native
  
  /** Assignee mode of the course work material. If unspecified, the default value is `ALL_STUDENTS`. */
  var assigneeMode: js.UndefOr[String] = js.native
  
  /** Identifier of the course. Read-only. */
  var courseId: js.UndefOr[String] = js.native
  
  /** Timestamp when this course work material was created. Read-only. */
  var creationTime: js.UndefOr[String] = js.native
  
  /** Identifier for the user that created the course work material. Read-only. */
  var creatorUserId: js.UndefOr[String] = js.native
  
  /** Optional description of this course work material. The text must be a valid UTF-8 string containing no more than 30,000 characters. */
  var description: js.UndefOr[String] = js.native
  
  /** Classroom-assigned identifier of this course work material, unique per course. Read-only. */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifiers of students with access to the course work material. This field is set only if `assigneeMode` is `INDIVIDUAL_STUDENTS`. If the `assigneeMode` is `INDIVIDUAL_STUDENTS`,
    * then only students specified in this field can see the course work material.
    */
  var individualStudentsOptions: js.UndefOr[IndividualStudentsOptions] = js.native
  
  /** Additional materials. A course work material must have no more than 20 material items. */
  var materials: js.UndefOr[js.Array[Material]] = js.native
  
  /** Optional timestamp when this course work material is scheduled to be published. */
  var scheduledTime: js.UndefOr[String] = js.native
  
  /** Status of this course work material. If unspecified, the default state is `DRAFT`. */
  var state: js.UndefOr[String] = js.native
  
  /** Title of this course work material. The title must be a valid UTF-8 string containing between 1 and 3000 characters. */
  var title: js.UndefOr[String] = js.native
  
  /** Identifier for the topic that this course work material is associated with. Must match an existing topic in the course. */
  var topicId: js.UndefOr[String] = js.native
  
  /** Timestamp of the most recent change to this course work material. Read-only. */
  var updateTime: js.UndefOr[String] = js.native
}
object CourseWorkMaterial {
  
  @scala.inline
  def apply(): CourseWorkMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CourseWorkMaterial]
  }
  
  @scala.inline
  implicit class CourseWorkMaterialMutableBuilder[Self <: CourseWorkMaterial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    @scala.inline
    def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
    
    @scala.inline
    def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setCreatorUserId(value: String): Self = StObject.set(x, "creatorUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorUserIdUndefined: Self = StObject.set(x, "creatorUserId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIndividualStudentsOptions(value: IndividualStudentsOptions): Self = StObject.set(x, "individualStudentsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndividualStudentsOptionsUndefined: Self = StObject.set(x, "individualStudentsOptions", js.undefined)
    
    @scala.inline
    def setMaterials(value: js.Array[Material]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    @scala.inline
    def setMaterialsVarargs(value: Material*): Self = StObject.set(x, "materials", js.Array(value :_*))
    
    @scala.inline
    def setScheduledTime(value: String): Self = StObject.set(x, "scheduledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledTimeUndefined: Self = StObject.set(x, "scheduledTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTopicId(value: String): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
