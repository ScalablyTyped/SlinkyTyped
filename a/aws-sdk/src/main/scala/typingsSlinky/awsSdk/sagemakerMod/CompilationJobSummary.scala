package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilationJobSummary extends js.Object {
  /**
    * The time when the model compilation job completed.
    */
  var CompilationEndTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the model compilation job.
    */
  var CompilationJobArn: typingsSlinky.awsSdk.sagemakerMod.CompilationJobArn = js.native
  /**
    * The name of the model compilation job that you want a summary for.
    */
  var CompilationJobName: EntityName = js.native
  /**
    * The status of the model compilation job.
    */
  var CompilationJobStatus: typingsSlinky.awsSdk.sagemakerMod.CompilationJobStatus = js.native
  /**
    * The time when the model compilation job started.
    */
  var CompilationStartTime: js.UndefOr[js.Date] = js.native
  /**
    * The type of device that the model will run on after compilation has completed.
    */
  var CompilationTargetDevice: TargetDevice = js.native
  /**
    * The time when the model compilation job was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The time when the model compilation job was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
}

object CompilationJobSummary {
  @scala.inline
  def apply(
    CompilationJobArn: CompilationJobArn,
    CompilationJobName: EntityName,
    CompilationJobStatus: CompilationJobStatus,
    CompilationTargetDevice: TargetDevice,
    CreationTime: js.Date
  ): CompilationJobSummary = {
    val __obj = js.Dynamic.literal(CompilationJobArn = CompilationJobArn.asInstanceOf[js.Any], CompilationJobName = CompilationJobName.asInstanceOf[js.Any], CompilationJobStatus = CompilationJobStatus.asInstanceOf[js.Any], CompilationTargetDevice = CompilationTargetDevice.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationJobSummary]
  }
  @scala.inline
  implicit class CompilationJobSummaryOps[Self <: CompilationJobSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompilationJobArn(value: CompilationJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompilationJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompilationJobName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompilationJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompilationJobStatus(value: CompilationJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompilationJobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompilationTargetDevice(value: TargetDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompilationTargetDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompilationEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompilationEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompilationEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompilationEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCompilationStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompilationStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompilationStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompilationStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(js.undefined)
        ret
    }
  }
  
}

