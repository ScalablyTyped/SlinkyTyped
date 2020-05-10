package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeliverabilityTestReportResponse extends js.Object {
  /**
    * An object that contains the results of the predictive inbox placement test.
    */
  var DeliverabilityTestReport: typingsSlinky.awsSdk.pinpointemailMod.DeliverabilityTestReport = js.native
  /**
    * An object that describes how the test email was handled by several email providers, including Gmail, Hotmail, Yahoo, AOL, and others.
    */
  var IspPlacements: typingsSlinky.awsSdk.pinpointemailMod.IspPlacements = js.native
  /**
    * An object that contains the message that you sent when you performed this predictive inbox placement test.
    */
  var Message: js.UndefOr[MessageContent] = js.native
  /**
    * An object that specifies how many test messages that were sent during the predictive inbox placement test were delivered to recipients' inboxes, how many were sent to recipients' spam folders, and how many weren't delivered.
    */
  var OverallPlacement: PlacementStatistics = js.native
  /**
    * An array of objects that define the tags (keys and values) that are associated with the predictive inbox placement test.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object GetDeliverabilityTestReportResponse {
  @scala.inline
  def apply(
    DeliverabilityTestReport: DeliverabilityTestReport,
    IspPlacements: IspPlacements,
    OverallPlacement: PlacementStatistics
  ): GetDeliverabilityTestReportResponse = {
    val __obj = js.Dynamic.literal(DeliverabilityTestReport = DeliverabilityTestReport.asInstanceOf[js.Any], IspPlacements = IspPlacements.asInstanceOf[js.Any], OverallPlacement = OverallPlacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeliverabilityTestReportResponse]
  }
  @scala.inline
  implicit class GetDeliverabilityTestReportResponseOps[Self <: GetDeliverabilityTestReportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliverabilityTestReport(value: DeliverabilityTestReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliverabilityTestReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIspPlacements(value: IspPlacements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IspPlacements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverallPlacement(value: PlacementStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverallPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: MessageContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

