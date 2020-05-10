package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationOutputRequest extends js.Object {
  /**
    * Amazon Kinesis Analytics application name.
    */
  var ApplicationName: typingsSlinky.awsSdk.kinesisanalyticsMod.ApplicationName = js.native
  /**
    * Amazon Kinesis Analytics application version. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned. 
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
  /**
    * The ID of the configuration to delete. Each output configuration that is added to the application, either when the application is created or later using the AddApplicationOutput operation, has a unique ID. You need to provide the ID to uniquely identify the output configuration that you want to delete from the application configuration. You can use the DescribeApplication operation to get the specific OutputId. 
    */
  var OutputId: Id = js.native
}

object DeleteApplicationOutputRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, CurrentApplicationVersionId: ApplicationVersionId, OutputId: Id): DeleteApplicationOutputRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any], OutputId = OutputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationOutputRequest]
  }
  @scala.inline
  implicit class DeleteApplicationOutputRequestOps[Self <: DeleteApplicationOutputRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentApplicationVersionId(value: ApplicationVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentApplicationVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

