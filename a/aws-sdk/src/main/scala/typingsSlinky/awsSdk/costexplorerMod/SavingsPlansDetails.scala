package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansDetails extends js.Object {
  /**
    * A group of instance types that Savings Plans applies to.
    */
  var InstanceFamily: js.UndefOr[GenericString] = js.native
  /**
    * The unique ID used to distinguish Savings Plans from one another.
    */
  var OfferingId: js.UndefOr[GenericString] = js.native
  /**
    * A collection of AWS resources in a geographic area. Each AWS Region is isolated and independent of the other Regions.
    */
  var Region: js.UndefOr[GenericString] = js.native
}

object SavingsPlansDetails {
  @scala.inline
  def apply(): SavingsPlansDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansDetails]
  }
  @scala.inline
  implicit class SavingsPlansDetailsOps[Self <: SavingsPlansDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceFamily(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingId(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfferingId")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(js.undefined)
        ret
    }
  }
  
}

