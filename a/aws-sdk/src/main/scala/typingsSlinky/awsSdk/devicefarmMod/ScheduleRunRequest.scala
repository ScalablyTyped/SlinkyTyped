package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleRunRequest extends js.Object {
  /**
    * The ARN of an application package to run tests against, created with CreateUpload. See ListUploads.
    */
  var appArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * Information about the settings for the run to be scheduled.
    */
  var configuration: js.UndefOr[ScheduleRunConfiguration] = js.native
  /**
    * The ARN of the device pool for the run to be scheduled.
    */
  var devicePoolArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The filter criteria used to dynamically select a set of devices for a test run and the maximum number of devices to be included in the run. Either  devicePoolArn  or  deviceSelectionConfiguration  is required in a request.
    */
  var deviceSelectionConfiguration: js.UndefOr[DeviceSelectionConfiguration] = js.native
  /**
    * Specifies configuration information about a test run, such as the execution timeout (in minutes).
    */
  var executionConfiguration: js.UndefOr[ExecutionConfiguration] = js.native
  /**
    * The name for the run to be scheduled.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The ARN of the project for the run to be scheduled.
    */
  var projectArn: AmazonResourceName = js.native
  /**
    * Information about the test for the run to be scheduled.
    */
  var test: ScheduleRunTest = js.native
}

object ScheduleRunRequest {
  @scala.inline
  def apply(projectArn: AmazonResourceName, test: ScheduleRunTest): ScheduleRunRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleRunRequest]
  }
  @scala.inline
  implicit class ScheduleRunRequestOps[Self <: ScheduleRunRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: ScheduleRunTest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appArn")(js.undefined)
        ret
    }
    @scala.inline
    def withConfiguration(value: ScheduleRunConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDevicePoolArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePoolArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevicePoolArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devicePoolArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceSelectionConfiguration(value: DeviceSelectionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSelectionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceSelectionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSelectionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionConfiguration(value: ExecutionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

