package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClampToGround extends js.Object {
  var clampToGround: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  var markerColor: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  var markerSize: js.UndefOr[Double] = js.native
  var markerSymbol: js.UndefOr[String] = js.native
  var sourceUri: js.UndefOr[String] = js.native
  var stroke: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
}

object ClampToGround {
  @scala.inline
  def apply(): ClampToGround = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClampToGround]
  }
  @scala.inline
  implicit class ClampToGroundOps[Self <: ClampToGround] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClampToGround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clampToGround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClampToGround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clampToGround")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: typingsSlinky.cesium.mod.Color): Self = {
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
    def withMarkerColor(value: typingsSlinky.cesium.mod.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUri")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: typingsSlinky.cesium.mod.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
  }
  
}

