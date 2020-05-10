package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartApplicationRequest extends js.Object {
  /**
    * The name of the application.
    */
  var ApplicationName: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * Identifies the run configuration (start parameters) of a Kinesis Data Analytics application.
    */
  var RunConfiguration: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RunConfiguration = js.native
}

object StartApplicationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, RunConfiguration: RunConfiguration): StartApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], RunConfiguration = RunConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartApplicationRequest]
  }
  @scala.inline
  implicit class StartApplicationRequestOps[Self <: StartApplicationRequest] (val x: Self) extends AnyVal {
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
    def withRunConfiguration(value: RunConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

