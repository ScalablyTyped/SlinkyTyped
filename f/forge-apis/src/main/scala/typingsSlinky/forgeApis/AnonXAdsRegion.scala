package typingsSlinky.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXAdsRegion extends js.Object {
  var xAdsRegion: js.UndefOr[String] = js.native
}

object AnonXAdsRegion {
  @scala.inline
  def apply(): AnonXAdsRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonXAdsRegion]
  }
  @scala.inline
  implicit class AnonXAdsRegionOps[Self <: AnonXAdsRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXAdsRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAdsRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAdsRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAdsRegion")(js.undefined)
        ret
    }
  }
  
}

