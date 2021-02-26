package typingsSlinky.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a suggested task identified in an item. Read mode only.
  *
  * The list of tasks suggested in an email message is returned in the `taskSuggestions` property of the {@link Office.Entities | Entities} object
  * that is returned when the `getEntities` or `getEntitiesByType` method is called on the active item.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
  */
@js.native
trait TaskSuggestion extends StObject {
  
  /**
    * Gets the users that should be assigned a suggested task.
    */
  var assignees: js.Array[EmailUser] = js.native
  
  /**
    * Gets the text of an item that was identified as a task suggestion.
    */
  var taskString: String = js.native
}
object TaskSuggestion {
  
  @scala.inline
  def apply(assignees: js.Array[EmailUser], taskString: String): TaskSuggestion = {
    val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any], taskString = taskString.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskSuggestion]
  }
  
  @scala.inline
  implicit class TaskSuggestionMutableBuilder[Self <: TaskSuggestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignees(value: js.Array[EmailUser]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneesVarargs(value: EmailUser*): Self = StObject.set(x, "assignees", js.Array(value :_*))
    
    @scala.inline
    def setTaskString(value: String): Self = StObject.set(x, "taskString", value.asInstanceOf[js.Any])
  }
}
