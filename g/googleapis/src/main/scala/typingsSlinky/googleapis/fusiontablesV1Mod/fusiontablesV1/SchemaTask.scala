package typingsSlinky.googleapis.fusiontablesV1Mod.fusiontablesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the identifier, name, and type of a task in a table.
  */
@js.native
trait SchemaTask extends js.Object {
  
  /**
    * Type of the resource. This is always &quot;fusiontables#task&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * An indication of task progress.
    */
  var progress: js.UndefOr[String] = js.native
  
  /**
    * false while the table is busy with some other task. true if this
    * background task is currently running.
    */
  var started: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifier for the task.
    */
  var taskId: js.UndefOr[String] = js.native
  
  /**
    * Type of background task. One of  DELETE_ROWS Deletes one or more rows
    * from the table. ADD_ROWS &quot;Adds one or more rows to a table. Includes
    * importing data into a new table and importing more rows into an existing
    * table. ADD_COLUMN Adds a new column to the table. CHANGE_TYPE Changes the
    * type of a column.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaTask {
  
  @scala.inline
  def apply(): SchemaTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTask]
  }
  
  @scala.inline
  implicit class SchemaTaskOps[Self <: SchemaTask] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setProgress(value: String): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setStarted(value: Boolean): Self = this.set("started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarted: Self = this.set("started", js.undefined)
    
    @scala.inline
    def setTaskId(value: String): Self = this.set("taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskId: Self = this.set("taskId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
