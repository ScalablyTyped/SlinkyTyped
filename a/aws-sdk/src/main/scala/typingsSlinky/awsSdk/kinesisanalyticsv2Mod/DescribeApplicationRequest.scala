package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeApplicationRequest extends js.Object {
  /**
    * The name of the application.
    */
  var ApplicationName: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * Displays verbose information about a Kinesis Data Analytics application, including the application's job plan.
    */
  var IncludeAdditionalDetails: js.UndefOr[BooleanObject] = js.native
}

object DescribeApplicationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName): DescribeApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationRequest]
  }
  @scala.inline
  implicit class DescribeApplicationRequestOps[Self <: DescribeApplicationRequest] (val x: Self) extends AnyVal {
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
    def withIncludeAdditionalDetails(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeAdditionalDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAdditionalDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeAdditionalDetails")(js.undefined)
        ret
    }
  }
  
}

