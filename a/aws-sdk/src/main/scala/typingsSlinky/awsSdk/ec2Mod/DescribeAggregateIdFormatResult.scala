package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAggregateIdFormatResult extends js.Object {
  /**
    * Information about each resource's ID format.
    */
  var Statuses: js.UndefOr[IdFormatList] = js.native
  /**
    * Indicates whether all resource types in the Region are configured to use longer IDs. This value is only true if all users are configured to use longer IDs for all resources types in the Region.
    */
  var UseLongIdsAggregated: js.UndefOr[Boolean] = js.native
}

object DescribeAggregateIdFormatResult {
  @scala.inline
  def apply(): DescribeAggregateIdFormatResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAggregateIdFormatResult]
  }
  @scala.inline
  implicit class DescribeAggregateIdFormatResultOps[Self <: DescribeAggregateIdFormatResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatuses(value: IdFormatList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statuses")(js.undefined)
        ret
    }
    @scala.inline
    def withUseLongIdsAggregated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseLongIdsAggregated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseLongIdsAggregated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseLongIdsAggregated")(js.undefined)
        ret
    }
  }
  
}

