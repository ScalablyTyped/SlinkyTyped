package typingsSlinky.nivoGeo

import typingsSlinky.nivoGeo.mod.ChoroplethBoundFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFeatureChoroplethBoundFeature extends js.Object {
  var feature: ChoroplethBoundFeature = js.native
}

object AnonFeatureChoroplethBoundFeature {
  @scala.inline
  def apply(feature: ChoroplethBoundFeature): AnonFeatureChoroplethBoundFeature = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeatureChoroplethBoundFeature]
  }
  @scala.inline
  implicit class AnonFeatureChoroplethBoundFeatureOps[Self <: AnonFeatureChoroplethBoundFeature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeature(value: ChoroplethBoundFeature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

