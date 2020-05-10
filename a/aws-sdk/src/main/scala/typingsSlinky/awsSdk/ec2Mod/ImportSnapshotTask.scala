package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withImportTaskId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportTaskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportTaskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportTaskId")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotTaskDetail(value: SnapshotTaskDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotTaskDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotTaskDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotTaskDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

