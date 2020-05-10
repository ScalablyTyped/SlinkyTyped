package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateInstanceMarketOptionSpotOption extends js.Object {
  var blockDurationMinutes: Double = js.native
  var instanceInterruptionBehavior: String = js.native
  var maxPrice: String = js.native
  var spotInstanceType: String = js.native
  var validUntil: String = js.native
}

object GetLaunchTemplateInstanceMarketOptionSpotOption {
  @scala.inline
  def apply(
    blockDurationMinutes: Double,
    instanceInterruptionBehavior: String,
    maxPrice: String,
    spotInstanceType: String,
    validUntil: String
  ): GetLaunchTemplateInstanceMarketOptionSpotOption = {
    val __obj = js.Dynamic.literal(blockDurationMinutes = blockDurationMinutes.asInstanceOf[js.Any], instanceInterruptionBehavior = instanceInterruptionBehavior.asInstanceOf[js.Any], maxPrice = maxPrice.asInstanceOf[js.Any], spotInstanceType = spotInstanceType.asInstanceOf[js.Any], validUntil = validUntil.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateInstanceMarketOptionSpotOption]
  }
  @scala.inline
  implicit class GetLaunchTemplateInstanceMarketOptionSpotOptionOps[Self <: GetLaunchTemplateInstanceMarketOptionSpotOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockDurationMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockDurationMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceInterruptionBehavior(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceInterruptionBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpotInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidUntil(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validUntil")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

