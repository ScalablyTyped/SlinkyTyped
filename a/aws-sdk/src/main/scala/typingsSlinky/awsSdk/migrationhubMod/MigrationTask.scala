package typingsSlinky.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MigrationTask extends StObject {
  
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
    */
  var MigrationTaskName: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.MigrationTaskName] = js.native
  
  /**
    * A name that identifies the vendor of the migration tool being used.
    */
  var ProgressUpdateStream: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.ProgressUpdateStream] = js.native
  
  /**
    * Information about the resource that is being migrated. This data will be used to map the task to a resource in the Application Discovery Service repository.
    */
  var ResourceAttributeList: js.UndefOr[LatestResourceAttributeList] = js.native
  
  /**
    * Task object encapsulating task information.
    */
  var Task: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.Task] = js.native
  
  /**
    * The timestamp when the task was gathered.
    */
  var UpdateDateTime: js.UndefOr[js.Date] = js.native
}
object MigrationTask {
  
  @scala.inline
  def apply(): MigrationTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationTask]
  }
  
  @scala.inline
  implicit class MigrationTaskMutableBuilder[Self <: MigrationTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMigrationTaskName(value: MigrationTaskName): Self = StObject.set(x, "MigrationTaskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationTaskNameUndefined: Self = StObject.set(x, "MigrationTaskName", js.undefined)
    
    @scala.inline
    def setProgressUpdateStream(value: ProgressUpdateStream): Self = StObject.set(x, "ProgressUpdateStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUpdateStreamUndefined: Self = StObject.set(x, "ProgressUpdateStream", js.undefined)
    
    @scala.inline
    def setResourceAttributeList(value: LatestResourceAttributeList): Self = StObject.set(x, "ResourceAttributeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAttributeListUndefined: Self = StObject.set(x, "ResourceAttributeList", js.undefined)
    
    @scala.inline
    def setResourceAttributeListVarargs(value: ResourceAttribute*): Self = StObject.set(x, "ResourceAttributeList", js.Array(value :_*))
    
    @scala.inline
    def setTask(value: Task): Self = StObject.set(x, "Task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskUndefined: Self = StObject.set(x, "Task", js.undefined)
    
    @scala.inline
    def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "UpdateDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDateTimeUndefined: Self = StObject.set(x, "UpdateDateTime", js.undefined)
  }
}
