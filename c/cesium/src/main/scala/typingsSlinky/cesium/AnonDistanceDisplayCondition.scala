package typingsSlinky.cesium

import typingsSlinky.cesium.mod.MaterialProperty
import typingsSlinky.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDistanceDisplayCondition extends js.Object {
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  var leadTime: js.UndefOr[Property | Double] = js.native
  var material: js.UndefOr[MaterialProperty] = js.native
  var resolution: js.UndefOr[Property | Double] = js.native
  var show: js.UndefOr[Property | Boolean] = js.native
  var trailTime: js.UndefOr[Property | Double] = js.native
  var width: js.UndefOr[Property | Double] = js.native
}

object AnonDistanceDisplayCondition {
  @scala.inline
  def apply(): AnonDistanceDisplayCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDistanceDisplayCondition]
  }
  @scala.inline
  implicit class AnonDistanceDisplayConditionOps[Self <: AnonDistanceDisplayCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistanceDisplayCondition(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceDisplayCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceDisplayCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceDisplayCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withLeadTime(value: Property | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeadTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMaterial(value: MaterialProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaterial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("material")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: Property | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Property | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailTime(value: Property | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailTime")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Property | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

