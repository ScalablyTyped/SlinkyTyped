package typingsSlinky.awsSdkClientXrayNode.typesSamplingStatisticsDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingStatisticsDocument extends js.Object {
  /**
    * <p>The number of requests recorded with borrowed reservoir quota.</p>
    */
  var BorrowCount: js.UndefOr[Double] = js.native
  /**
    * <p>A unique identifier for the service in hexadecimal.</p>
    */
  var ClientID: String = js.native
  /**
    * <p>The number of requests that matched the rule.</p>
    */
  var RequestCount: Double = js.native
  /**
    * <p>The name of the sampling rule.</p>
    */
  var RuleName: String = js.native
  /**
    * <p>The number of requests recorded.</p>
    */
  var SampledCount: Double = js.native
  /**
    * <p>The current time.</p>
    */
  var Timestamp: js.Date | String | Double = js.native
}

object SamplingStatisticsDocument {
  @scala.inline
  def apply(
    ClientID: String,
    RequestCount: Double,
    RuleName: String,
    SampledCount: Double,
    Timestamp: js.Date | String | Double
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
    def withClientID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSampledCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampledCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestampDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorrowCount(value: Double): Self = {
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

