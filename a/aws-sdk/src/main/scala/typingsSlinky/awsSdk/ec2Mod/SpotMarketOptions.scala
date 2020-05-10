package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotMarketOptions extends js.Object {
  /**
    * The required duration for the Spot Instances (also known as Spot blocks), in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360).
    */
  var BlockDurationMinutes: js.UndefOr[Integer] = js.native
  /**
    * The behavior when a Spot Instance is interrupted. The default is terminate.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceInterruptionBehavior] = js.native
  /**
    * The maximum hourly price you're willing to pay for the Spot Instances. The default is the On-Demand price.
    */
  var MaxPrice: js.UndefOr[String] = js.native
  /**
    * The Spot Instance request type. For RunInstances, persistent Spot Instance requests are only supported when InstanceInterruptionBehavior is set to either hibernate or stop.
    */
  var SpotInstanceType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.SpotInstanceType] = js.native
  /**
    * The end date of the request. For a one-time request, the request remains active until all instances launch, the request is canceled, or this date is reached. If the request is persistent, it remains active until it is canceled or this date and time is reached. The default end date is 7 days from the current date.
    */
  var ValidUntil: js.UndefOr[js.Date] = js.native
}

object SpotMarketOptions {
  @scala.inline
  def apply(): SpotMarketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotMarketOptions]
  }
  @scala.inline
  implicit class SpotMarketOptionsOps[Self <: SpotMarketOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockDurationMinutes(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockDurationMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockDurationMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockDurationMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceInterruptionBehavior(value: InstanceInterruptionBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceInterruptionBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceInterruptionBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceInterruptionBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotInstanceType(value: SpotInstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpotInstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withValidUntil(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidUntil")(js.undefined)
        ret
    }
  }
  
}

