package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupDetail extends js.Object {
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD. If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%.
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The date/time the instance group was created.
    */
  var CreationDateTime: js.Date = js.native
  /**
    * The date/time the instance group was terminated.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.native
  /**
    * Unique identifier for the instance group.
    */
  var InstanceGroupId: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * Target number of instances to run in the instance group.
    */
  var InstanceRequestCount: Integer = js.native
  /**
    * Instance group role in the cluster
    */
  var InstanceRole: InstanceRoleType = js.native
  /**
    * Actual count of running instances.
    */
  var InstanceRunningCount: Integer = js.native
  /**
    * EC2 instance type.
    */
  var InstanceType: typingsSlinky.awsSdk.emrMod.InstanceType = js.native
  /**
    * Details regarding the state of the instance group.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.native
  /**
    * Market type of the EC2 instances used to create a cluster node.
    */
  var Market: MarketType = js.native
  /**
    * Friendly name for the instance group.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The date/time the instance group was available to the cluster.
    */
  var ReadyDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The date/time the instance group was started.
    */
  var StartDateTime: js.UndefOr[js.Date] = js.native
  /**
    * State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
    */
  var State: InstanceGroupState = js.native
}

object InstanceGroupDetail {
  @scala.inline
  def apply(
    CreationDateTime: js.Date,
    InstanceRequestCount: Integer,
    InstanceRole: InstanceRoleType,
    InstanceRunningCount: Integer,
    InstanceType: InstanceType,
    Market: MarketType,
    State: InstanceGroupState
  ): InstanceGroupDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], InstanceRequestCount = InstanceRequestCount.asInstanceOf[js.Any], InstanceRole = InstanceRole.asInstanceOf[js.Any], InstanceRunningCount = InstanceRunningCount.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], Market = Market.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupDetail]
  }
  @scala.inline
  implicit class InstanceGroupDetailOps[Self <: InstanceGroupDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceRequestCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceRequestCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceRole(value: InstanceRoleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceRunningCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceRunningCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarket(value: MarketType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Market")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: InstanceGroupState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBidPrice(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BidPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BidPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceGroupId(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastStateChangeReason(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastStateChangeReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStateChangeReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastStateChangeReason")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withReadyDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadyDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadyDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadyDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDateTime")(js.undefined)
        ret
    }
  }
  
}

