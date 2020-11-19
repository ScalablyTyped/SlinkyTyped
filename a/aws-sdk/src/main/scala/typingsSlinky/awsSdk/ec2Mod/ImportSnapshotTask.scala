package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSnapshotTask extends js.Object {
  
  /**
    * A description of the import snapshot task.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The ID of the import snapshot task.
    */
  var ImportTaskId: js.UndefOr[String] = js.native
  
  /**
    * Describes an import snapshot task.
    */
  var SnapshotTaskDetail: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.SnapshotTaskDetail] = js.native
  
  /**
    * The tags for the import snapshot task.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ImportSnapshotTask {
  
  @scala.inline
  def apply(): ImportSnapshotTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportSnapshotTask]
  }
  
  @scala.inline
  implicit class ImportSnapshotTaskOps[Self <: ImportSnapshotTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setImportTaskId(value: String): Self = this.set("ImportTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportTaskId: Self = this.set("ImportTaskId", js.undefined)
    
    @scala.inline
    def setSnapshotTaskDetail(value: SnapshotTaskDetail): Self = this.set("SnapshotTaskDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotTaskDetail: Self = this.set("SnapshotTaskDetail", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
