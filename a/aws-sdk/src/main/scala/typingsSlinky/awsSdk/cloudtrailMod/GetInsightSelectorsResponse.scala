package typingsSlinky.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInsightSelectorsResponse extends js.Object {
  /**
    * A JSON string that contains the insight types you want to log on a trail. In this release, only ApiCallRateInsight is supported as an insight type.
    */
  var InsightSelectors: js.UndefOr[typingsSlinky.awsSdk.cloudtrailMod.InsightSelectors] = js.native
  /**
    * The Amazon Resource Name (ARN) of a trail for which you want to get Insights selectors.
    */
  var TrailARN: js.UndefOr[String] = js.native
}

object GetInsightSelectorsResponse {
  @scala.inline
  def apply(): GetInsightSelectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightSelectorsResponse]
  }
  @scala.inline
  implicit class GetInsightSelectorsResponseOps[Self <: GetInsightSelectorsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsightSelectors(value: InsightSelectors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsightSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsightSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsightSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrailARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrailARN")(js.undefined)
        ret
    }
  }
  
}

