package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScalingPoliciesInput extends js.Object {
  /**
    * A unique identifier for a fleet to retrieve scaling policies for. You can use either the fleet ID or ARN value.
    */
  var FleetId: typingsSlinky.awsSdk.gameliftMod.FleetId = js.native
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Scaling policy status to filter results on. A scaling policy is only in force when in an ACTIVE status.    ACTIVE -- The scaling policy is currently in force.    UPDATEREQUESTED -- A request to update the scaling policy has been received.    UPDATING -- A change is being made to the scaling policy.    DELETEREQUESTED -- A request to delete the scaling policy has been received.    DELETING -- The scaling policy is being deleted.    DELETED -- The scaling policy has been deleted.    ERROR -- An error occurred in creating the policy. It should be removed and recreated.  
    */
  var StatusFilter: js.UndefOr[ScalingStatusType] = js.native
}

object DescribeScalingPoliciesInput {
  @scala.inline
  def apply(FleetId: FleetId): DescribeScalingPoliciesInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingPoliciesInput]
  }
  @scala.inline
  implicit class DescribeScalingPoliciesInputOps[Self <: DescribeScalingPoliciesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFleetId(value: FleetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: PositiveInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
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
    @scala.inline
    def withStatusFilter(value: ScalingStatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusFilter")(js.undefined)
        ret
    }
  }
  
}

