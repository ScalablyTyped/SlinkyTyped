package typingsSlinky.asymmetrikLeafletD3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HexbinLayerConfig extends js.Object {
  var colorRange: js.UndefOr[js.Array[String]] = js.native
  var colorScaleExtent: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var duration: js.UndefOr[Double] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var pointerEvents: js.UndefOr[String] = js.native
  var radius: js.UndefOr[Double] = js.native
  var radiusRange: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var radiusScaleExtent: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object HexbinLayerConfig {
  @scala.inline
  def apply(): HexbinLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HexbinLayerConfig]
  }
  @scala.inline
  implicit class HexbinLayerConfigOps[Self <: HexbinLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorRange(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRange")(js.undefined)
        ret
    }
    @scala.inline
    def withColorScaleExtent(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScaleExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorScaleExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScaleExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPointerEvents(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointerEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointerEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusRange(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusRange")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusScaleExtent(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusScaleExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusScaleExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusScaleExtent")(js.undefined)
        ret
    }
  }
  
}

