package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFeatureName extends js.Object {
  var featureName: js.UndefOr[String] = js.native
  var featureRate: js.UndefOr[Double] = js.native
}

object AnonFeatureName {
  @scala.inline
  def apply(): AnonFeatureName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFeatureName]
  }
  @scala.inline
  implicit class AnonFeatureNameOps[Self <: AnonFeatureName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureName")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureRate")(js.undefined)
        ret
    }
  }
  
}

