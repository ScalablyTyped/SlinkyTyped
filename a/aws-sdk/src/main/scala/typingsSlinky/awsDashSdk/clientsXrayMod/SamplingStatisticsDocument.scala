package typingsSlinky.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingStatisticsDocument extends js.Object {
  /**
    * The number of requests recorded with borrowed reservoir quota.
    */
  var BorrowCount: js.UndefOr[typingsSlinky.awsDashSdk.clientsXrayMod.BorrowCount] = js.native
  /**
    * A unique identifier for the service in hexadecimal.
    */
  var ClientID: typingsSlinky.awsDashSdk.clientsXrayMod.ClientID = js.native
  /**
    * The number of requests that matched the rule.
    */
  var RequestCount: typingsSlinky.awsDashSdk.clientsXrayMod.RequestCount = js.native
  /**
    * The name of the sampling rule.
    */
  var RuleName: typingsSlinky.awsDashSdk.clientsXrayMod.RuleName = js.native
  /**
    * The number of requests recorded.
    */
  var SampledCount: typingsSlinky.awsDashSdk.clientsXrayMod.SampledCount = js.native
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
    Timestamp: js.Date,
    BorrowCount: Int | scala.Double = null
  ): SamplingStatisticsDocument = {
    val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], RequestCount = RequestCount.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SampledCount = SampledCount.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    if (BorrowCount != null) __obj.updateDynamic("BorrowCount")(BorrowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingStatisticsDocument]
  }
}

