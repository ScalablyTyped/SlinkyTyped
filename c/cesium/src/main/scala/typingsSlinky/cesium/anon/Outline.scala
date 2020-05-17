package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.MaterialProperty
import typingsSlinky.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Outline extends js.Object {
  var extrudedHeight: js.UndefOr[Property] = js.native
  var fill: js.UndefOr[Boolean] = js.native
  var granularity: js.UndefOr[Property] = js.native
  var height: js.UndefOr[Property] = js.native
  var material: js.UndefOr[MaterialProperty | typingsSlinky.cesium.mod.Color] = js.native
  var numberOfVerticalLines: js.UndefOr[Property] = js.native
  var outline: js.UndefOr[Boolean] = js.native
  var outlineColor: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  var outlineWidth: js.UndefOr[Double] = js.native
  var rotation: js.UndefOr[Property] = js.native
  var semiMajorAxis: js.UndefOr[Double] = js.native
  var semiMinorAxis: js.UndefOr[Double] = js.native
  var show: js.UndefOr[Property] = js.native
  var stRotation: js.UndefOr[Property] = js.native
}

object Outline {
  @scala.inline
  def apply(): Outline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outline]
  }
  @scala.inline
  implicit class OutlineOps[Self <: Outline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtrudedHeight(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrudedHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtrudedHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extrudedHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withGranularity(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranularity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("granularity")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMaterial(value: MaterialProperty | typingsSlinky.cesium.mod.Color): Self = {
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
    def withNumberOfVerticalLines(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfVerticalLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfVerticalLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfVerticalLines")(js.undefined)
        ret
    }
    @scala.inline
    def withOutline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineColor(value: typingsSlinky.cesium.mod.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withSemiMajorAxis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semiMajorAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemiMajorAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semiMajorAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withSemiMinorAxis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semiMinorAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemiMinorAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semiMinorAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Property): Self = {
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
    def withStRotation(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stRotation")(js.undefined)
        ret
    }
  }
  
}

