package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrafficMirrorFiltersResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. The value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about one or more Traffic Mirror filters.
    */
  var TrafficMirrorFilters: js.UndefOr[TrafficMirrorFilterSet] = js.native
}

object DescribeTrafficMirrorFiltersResult {
  @scala.inline
  def apply(): DescribeTrafficMirrorFiltersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrafficMirrorFiltersResult]
  }
  @scala.inline
  implicit class DescribeTrafficMirrorFiltersResultOps[Self <: DescribeTrafficMirrorFiltersResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withTrafficMirrorFilters(value: TrafficMirrorFilterSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficMirrorFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficMirrorFilters")(js.undefined)
        ret
    }
  }
  
}

