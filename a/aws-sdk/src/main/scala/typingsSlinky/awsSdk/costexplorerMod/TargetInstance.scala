package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetInstance extends js.Object {
  /**
    *  The currency code that Amazon Web Services used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    *  Indicates whether or not this recommendation is the defaulted Amazon Web Services recommendation.
    */
  var DefaultTargetInstance: js.UndefOr[GenericBoolean] = js.native
  /**
    *  Expected cost to operate this instance type on a monthly basis.
    */
  var EstimatedMonthlyCost: js.UndefOr[GenericString] = js.native
  /**
    *  Estimated savings resulting from modification, on a monthly basis.
    */
  var EstimatedMonthlySavings: js.UndefOr[GenericString] = js.native
  /**
    *  Expected utilization metrics for target instance type.
    */
  var ExpectedResourceUtilization: js.UndefOr[ResourceUtilization] = js.native
  /**
    *  Details on the target instance type. 
    */
  var ResourceDetails: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.ResourceDetails] = js.native
}

object TargetInstance {
  @scala.inline
  def apply(): TargetInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetInstance]
  }
  @scala.inline
  implicit class TargetInstanceOps[Self <: TargetInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencyCode(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTargetInstance(value: GenericBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultTargetInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTargetInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultTargetInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedMonthlyCost(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedMonthlyCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedMonthlyCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedMonthlyCost")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedMonthlySavings(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedMonthlySavings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedMonthlySavings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedMonthlySavings")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedResourceUtilization(value: ResourceUtilization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpectedResourceUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedResourceUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpectedResourceUtilization")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceDetails(value: ResourceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceDetails")(js.undefined)
        ret
    }
  }
  
}

