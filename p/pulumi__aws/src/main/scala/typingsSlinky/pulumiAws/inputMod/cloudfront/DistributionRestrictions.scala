package typingsSlinky.pulumiAws.inputMod.cloudfront

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionRestrictions extends js.Object {
  var geoRestriction: Input[DistributionRestrictionsGeoRestriction] = js.native
}

object DistributionRestrictions {
  @scala.inline
  def apply(geoRestriction: Input[DistributionRestrictionsGeoRestriction]): DistributionRestrictions = {
    val __obj = js.Dynamic.literal(geoRestriction = geoRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionRestrictions]
  }
  @scala.inline
  implicit class DistributionRestrictionsOps[Self <: DistributionRestrictions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoRestriction(value: Input[DistributionRestrictionsGeoRestriction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoRestriction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

