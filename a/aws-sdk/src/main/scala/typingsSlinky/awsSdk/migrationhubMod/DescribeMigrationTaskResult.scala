package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMigrationTaskResult extends js.Object {
  /**
    * Object encapsulating information about the migration task.
    */
  var MigrationTask: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.MigrationTask] = js.native
}

object DescribeMigrationTaskResult {
  @scala.inline
  def apply(): DescribeMigrationTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMigrationTaskResult]
  }
  @scala.inline
  implicit class DescribeMigrationTaskResultOps[Self <: DescribeMigrationTaskResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMigrationTask(value: MigrationTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MigrationTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrationTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MigrationTask")(js.undefined)
        ret
    }
  }
  
}

