package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationUtilizationGroup extends js.Object {
  /**
    * The attributes for this group of reservations.
    */
  var Attributes: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.Attributes] = js.native
  /**
    * The key for a specific reservation attribute.
    */
  var Key: js.UndefOr[ReservationGroupKey] = js.native
  /**
    * How much you used this group of reservations.
    */
  var Utilization: js.UndefOr[ReservationAggregates] = js.native
  /**
    * The value of a specific reservation attribute.
    */
  var Value: js.UndefOr[ReservationGroupValue] = js.native
}

object ReservationUtilizationGroup {
  @scala.inline
  def apply(): ReservationUtilizationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationUtilizationGroup]
  }
  @scala.inline
  implicit class ReservationUtilizationGroupOps[Self <: ReservationUtilizationGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: ReservationGroupKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(js.undefined)
        ret
    }
    @scala.inline
    def withUtilization(value: ReservationAggregates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utilization")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: ReservationGroupValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

