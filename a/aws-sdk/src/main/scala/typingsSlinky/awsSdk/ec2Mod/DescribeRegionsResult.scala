package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRegionsResult extends js.Object {
  /**
    * Information about the Regions.
    */
  var Regions: js.UndefOr[RegionList] = js.native
}

object DescribeRegionsResult {
  @scala.inline
  def apply(): DescribeRegionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRegionsResult]
  }
  @scala.inline
  implicit class DescribeRegionsResultOps[Self <: DescribeRegionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegions(value: RegionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Regions")(js.undefined)
        ret
    }
  }
  
}

