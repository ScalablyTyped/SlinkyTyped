package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationTask extends js.Object {
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
  implicit class MigrationTaskOps[Self <: MigrationTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMigrationTaskName(value: MigrationTaskName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MigrationTaskName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrationTaskName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MigrationTaskName")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressUpdateStream(value: ProgressUpdateStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressUpdateStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressUpdateStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressUpdateStream")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAttributeList(value: LatestResourceAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAttributeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAttributeList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceAttributeList")(js.undefined)
        ret
    }
    @scala.inline
    def withTask(value: Task): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Task")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateDateTime")(js.undefined)
        ret
    }
  }
  
}

