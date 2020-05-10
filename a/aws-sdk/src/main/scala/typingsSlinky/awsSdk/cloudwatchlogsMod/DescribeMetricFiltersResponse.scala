package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMetricFiltersResponse extends js.Object {
  /**
    * The metric filters.
    */
  var metricFilters: js.UndefOr[MetricFilters] = js.native
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeMetricFiltersResponse {
  @scala.inline
  def apply(): DescribeMetricFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMetricFiltersResponse]
  }
  @scala.inline
  implicit class DescribeMetricFiltersResponseOps[Self <: DescribeMetricFiltersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricFilters(value: MetricFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

