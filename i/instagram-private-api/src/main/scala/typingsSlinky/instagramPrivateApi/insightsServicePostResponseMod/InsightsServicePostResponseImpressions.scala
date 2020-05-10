package typingsSlinky.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServicePostResponseImpressions extends js.Object {
  var surfaces: InsightsServicePostResponseSurfaces = js.native
  var value: Double = js.native
}

object InsightsServicePostResponseImpressions {
  @scala.inline
  def apply(surfaces: InsightsServicePostResponseSurfaces, value: Double): InsightsServicePostResponseImpressions = {
    val __obj = js.Dynamic.literal(surfaces = surfaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseImpressions]
  }
  @scala.inline
  implicit class InsightsServicePostResponseImpressionsOps[Self <: InsightsServicePostResponseImpressions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSurfaces(value: InsightsServicePostResponseSurfaces): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

