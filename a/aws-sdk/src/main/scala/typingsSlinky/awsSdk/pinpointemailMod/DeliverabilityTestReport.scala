package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliverabilityTestReport extends js.Object {
  /**
    * The date and time when the predictive inbox placement test was created, in Unix time format.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  /**
    * The status of the predictive inbox placement test. If the status is IN_PROGRESS, then the predictive inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of creating the test. If the status is COMPLETE, then the test is finished, and you can use the GetDeliverabilityTestReport to view the results of the test.
    */
  var DeliverabilityTestStatus: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.DeliverabilityTestStatus] = js.native
  /**
    * The sender address that you specified for the predictive inbox placement test.
    */
  var FromEmailAddress: js.UndefOr[EmailAddress] = js.native
  /**
    * A unique string that identifies the predictive inbox placement test.
    */
  var ReportId: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.ReportId] = js.native
  /**
    * A name that helps you identify a predictive inbox placement test report.
    */
  var ReportName: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.ReportName] = js.native
  /**
    * The subject line for an email that you submitted in a predictive inbox placement test.
    */
  var Subject: js.UndefOr[DeliverabilityTestSubject] = js.native
}

object DeliverabilityTestReport {
  @scala.inline
  def apply(): DeliverabilityTestReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliverabilityTestReport]
  }
  @scala.inline
  implicit class DeliverabilityTestReportOps[Self <: DeliverabilityTestReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliverabilityTestStatus(value: DeliverabilityTestStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliverabilityTestStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliverabilityTestStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliverabilityTestStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withFromEmailAddress(value: EmailAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FromEmailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withReportId(value: ReportId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportId")(js.undefined)
        ret
    }
    @scala.inline
    def withReportName(value: ReportName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportName")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: DeliverabilityTestSubject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(js.undefined)
        ret
    }
  }
  
}

