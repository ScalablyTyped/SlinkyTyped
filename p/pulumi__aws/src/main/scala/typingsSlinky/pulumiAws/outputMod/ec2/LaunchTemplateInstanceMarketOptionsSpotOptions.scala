package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateInstanceMarketOptionsSpotOptions extends js.Object {
  var blockDurationMinutes: js.UndefOr[Double] = js.native
  var instanceInterruptionBehavior: js.UndefOr[String] = js.native
  var maxPrice: js.UndefOr[String] = js.native
  var spotInstanceType: js.UndefOr[String] = js.native
  var validUntil: String = js.native
}

object LaunchTemplateInstanceMarketOptionsSpotOptions {
  @scala.inline
  def apply(validUntil: String): LaunchTemplateInstanceMarketOptionsSpotOptions = {
    val __obj = js.Dynamic.literal(validUntil = validUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateInstanceMarketOptionsSpotOptions]
  }
  @scala.inline
  implicit class LaunchTemplateInstanceMarketOptionsSpotOptionsOps[Self <: LaunchTemplateInstanceMarketOptionsSpotOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidUntil(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockDurationMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockDurationMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockDurationMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockDurationMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceInterruptionBehavior(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceInterruptionBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceInterruptionBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceInterruptionBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotInstanceType")(js.undefined)
        ret
    }
  }
  
}

