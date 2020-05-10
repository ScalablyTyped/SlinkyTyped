package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportMigrationTaskRequest extends js.Object {
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.DryRun] = js.native
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
    */
  var MigrationTaskName: typingsSlinky.awsSdk.migrationhubMod.MigrationTaskName = js.native
  /**
    * The name of the ProgressUpdateStream. &gt;
    */
  var ProgressUpdateStream: typingsSlinky.awsSdk.migrationhubMod.ProgressUpdateStream = js.native
}

object ImportMigrationTaskRequest {
  @scala.inline
  def apply(MigrationTaskName: MigrationTaskName, ProgressUpdateStream: ProgressUpdateStream): ImportMigrationTaskRequest = {
    val __obj = js.Dynamic.literal(MigrationTaskName = MigrationTaskName.asInstanceOf[js.Any], ProgressUpdateStream = ProgressUpdateStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportMigrationTaskRequest]
  }
  @scala.inline
  implicit class ImportMigrationTaskRequestOps[Self <: ImportMigrationTaskRequest] (val x: Self) extends AnyVal {
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
    def withProgressUpdateStream(value: ProgressUpdateStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressUpdateStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: DryRun): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
  }
  
}

