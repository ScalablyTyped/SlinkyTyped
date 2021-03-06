package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Topic created by a teacher for the course
  */
@js.native
trait SchemaTopic extends StObject {
  
  /**
    * Identifier of the course.  Read-only.
    */
  var courseId: js.UndefOr[String] = js.native
  
  /**
    * The name of the topic, generated by the user. Leading and trailing
    * whitespaces, if any, will be trimmed. Also, multiple consecutive
    * whitespaces will be collapsed into one inside the name. The result must
    * be a non-empty string. Topic names are case sensitive, and must be no
    * longer than 100 characters.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Unique identifier for the topic.  Read-only.
    */
  var topicId: js.UndefOr[String] = js.native
  
  /**
    * The time the topic was last updated by the system.  Read-only.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaTopic {
  
  @scala.inline
  def apply(): SchemaTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTopic]
  }
  
  @scala.inline
  implicit class SchemaTopicMutableBuilder[Self <: SchemaTopic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
