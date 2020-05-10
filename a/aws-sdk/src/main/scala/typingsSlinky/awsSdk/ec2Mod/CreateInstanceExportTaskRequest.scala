package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstanceExportTaskRequest extends js.Object {
  /**
    * A description for the conversion task or the resource being exported. The maximum length is 255 bytes.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The format and location for an instance export task.
    */
  var ExportToS3Task: js.UndefOr[ExportToS3TaskSpecification] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: typingsSlinky.awsSdk.ec2Mod.InstanceId = js.native
  /**
    * The target virtualization environment.
    */
  var TargetEnvironment: js.UndefOr[ExportEnvironment] = js.native
}

object CreateInstanceExportTaskRequest {
  @scala.inline
  def apply(InstanceId: InstanceId): CreateInstanceExportTaskRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceExportTaskRequest]
  }
  @scala.inline
  implicit class CreateInstanceExportTaskRequestOps[Self <: CreateInstanceExportTaskRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withExportToS3Task(value: ExportToS3TaskSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportToS3Task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportToS3Task: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportToS3Task")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetEnvironment(value: ExportEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetEnvironment")(js.undefined)
        ret
    }
  }
  
}

