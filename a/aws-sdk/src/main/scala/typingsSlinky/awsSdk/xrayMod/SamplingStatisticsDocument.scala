package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingStatisticsDocument extends js.Object {
  /**
    * The number of requests recorded with borrowed reservoir quota.
    */
  var BorrowCount: js.UndefOr[typingsSlinky.awsSdk.xrayMod.BorrowCount] = js.native
  /**
    * A unique identifier for the service in hexadecimal.
    */
  var ClientID: typingsSlinky.awsSdk.xrayMod.ClientID = js.native
  /**
    * The number of requests that matched the rule.
    */
  var RequestCount: typingsSlinky.awsSdk.xrayMod.RequestCount = js.native
  /**
    * The name of the sampling rule.
    */
  var RuleName: typingsSlinky.awsSdk.xrayMod.RuleName = js.native
  /**
    * The number of requests recorded.
    */
  var SampledCount: typingsSlinky.awsSdk.xrayMod.SampledCount = js.native
  /**
    * The current time.
    */
  var Timestamp: js.Date = js.native
}

object SamplingStatisticsDocument {
  @scala.inline
  def apply(
    ClientID: ClientID,
    RequestCount: RequestCount,
    RuleName: RuleName,
    SampledCount: SampledCount,
    Timestamp: js.Date
  ): SamplingStatisticsDocument = {
    val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], RequestCount = RequestCount.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SampledCount = SampledCount.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingStatisticsDocument]
  }
  @scala.inline
  implicit class SamplingStatisticsDocumentOps[Self <: SamplingStatisticsDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientID(value: ClientID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestCount(value: RequestCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleName(value: RuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSampledCount(value: SampledCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampledCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorrowCount(value: BorrowCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorrowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorrowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorrowCount")(js.undefined)
        ret
    }
  }
  
}

