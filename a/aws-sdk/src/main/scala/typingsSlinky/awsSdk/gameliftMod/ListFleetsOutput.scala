package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFleetsOutput extends js.Object {
  /**
    * Set of fleet IDs matching the list request. You can retrieve additional information about all returned fleets by passing this result set to a call to DescribeFleetAttributes, DescribeFleetCapacity, or DescribeFleetUtilization.
    */
  var FleetIds: js.UndefOr[FleetIdList] = js.native
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object ListFleetsOutput {
  @scala.inline
  def apply(): ListFleetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFleetsOutput]
  }
  @scala.inline
  implicit class ListFleetsOutputOps[Self <: ListFleetsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetIds(value: FleetIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NonZeroAndMaxString): Self = {
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

