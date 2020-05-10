package typingsSlinky.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSummary extends js.Object {
  /**
    * ARN of the application.
    */
  var ApplicationARN: ResourceARN = js.native
  /**
    * Name of the application.
    */
  var ApplicationName: typingsSlinky.awsSdk.kinesisanalyticsMod.ApplicationName = js.native
  /**
    * Status of the application.
    */
  var ApplicationStatus: typingsSlinky.awsSdk.kinesisanalyticsMod.ApplicationStatus = js.native
}

object ApplicationSummary {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus
  ): ApplicationSummary = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSummary]
  }
  @scala.inline
  implicit class ApplicationSummaryOps[Self <: ApplicationSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationStatus(value: ApplicationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

