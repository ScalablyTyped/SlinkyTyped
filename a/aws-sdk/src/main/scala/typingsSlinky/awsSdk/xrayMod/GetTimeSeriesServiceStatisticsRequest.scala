package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTimeSeriesServiceStatisticsRequest extends js.Object {
  /**
    * The end of the time frame for which to aggregate statistics.
    */
  var EndTime: js.Date = js.native
  /**
    * A filter expression defining entities that will be aggregated for statistics. Supports ID, service, and edge functions. If no selector expression is specified, edge statistics are returned. 
    */
  var EntitySelectorExpression: js.UndefOr[typingsSlinky.awsSdk.xrayMod.EntitySelectorExpression] = js.native
  /**
    * The ARN of the group for which to pull statistics from.
    */
  var GroupARN: js.UndefOr[typingsSlinky.awsSdk.xrayMod.GroupARN] = js.native
  /**
    * The case-sensitive name of the group for which to pull statistics from.
    */
  var GroupName: js.UndefOr[typingsSlinky.awsSdk.xrayMod.GroupName] = js.native
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Aggregation period in seconds.
    */
  var Period: js.UndefOr[NullableInteger] = js.native
  /**
    * The start of the time frame for which to aggregate statistics.
    */
  var StartTime: js.Date = js.native
}

object GetTimeSeriesServiceStatisticsRequest {
  @scala.inline
  def apply(EndTime: js.Date, StartTime: js.Date): GetTimeSeriesServiceStatisticsRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTimeSeriesServiceStatisticsRequest]
  }
  @scala.inline
  implicit class GetTimeSeriesServiceStatisticsRequestOps[Self <: GetTimeSeriesServiceStatisticsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntitySelectorExpression(value: EntitySelectorExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntitySelectorExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntitySelectorExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntitySelectorExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupARN(value: GroupARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupARN")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: GroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
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
    @scala.inline
    def withPeriod(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Period")(js.undefined)
        ret
    }
  }
  
}

