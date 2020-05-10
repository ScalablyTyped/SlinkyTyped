package typingsSlinky.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXAdsForce extends js.Object {
  var xAdsForce: js.UndefOr[Boolean] = js.native
}

object AnonXAdsForce {
  @scala.inline
  def apply(): AnonXAdsForce = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonXAdsForce]
  }
  @scala.inline
  implicit class AnonXAdsForceOps[Self <: AnonXAdsForce] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXAdsForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAdsForce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAdsForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAdsForce")(js.undefined)
        ret
    }
  }
  
}

