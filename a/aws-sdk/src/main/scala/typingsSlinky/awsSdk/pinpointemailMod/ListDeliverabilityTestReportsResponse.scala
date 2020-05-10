package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeliverabilityTestReportsResponse extends js.Object {
  /**
    * An object that contains a lists of predictive inbox placement tests that you've performed.
    */
  var DeliverabilityTestReports: typingsSlinky.awsSdk.pinpointemailMod.DeliverabilityTestReports = js.native
  /**
    * A token that indicates that there are additional predictive inbox placement tests to list. To view additional predictive inbox placement tests, issue another request to ListDeliverabilityTestReports, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.NextToken] = js.native
}

object ListDeliverabilityTestReportsResponse {
  @scala.inline
  def apply(DeliverabilityTestReports: DeliverabilityTestReports): ListDeliverabilityTestReportsResponse = {
    val __obj = js.Dynamic.literal(DeliverabilityTestReports = DeliverabilityTestReports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeliverabilityTestReportsResponse]
  }
  @scala.inline
  implicit class ListDeliverabilityTestReportsResponseOps[Self <: ListDeliverabilityTestReportsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeliverabilityTestReports(value: DeliverabilityTestReports): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeliverabilityTestReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

