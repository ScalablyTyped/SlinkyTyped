package typingsSlinky.nivoLine.mod

import typingsSlinky.nivoCore.mod.MotionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineSvgProps
  extends LineProps
     with MotionProps {
  var areaBlendMode: js.UndefOr[String] = js.native
  var enablePointLabel: js.UndefOr[Boolean] = js.native
  var pointLabel: js.UndefOr[String] = js.native
  var pointLabelYOffset: js.UndefOr[Double] = js.native
  var useMesh: js.UndefOr[Boolean] = js.native
}

object LineSvgProps {
  @scala.inline
  def apply(data: js.Array[LineSerieData]): LineSvgProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSvgProps]
  }
  @scala.inline
  implicit class LineSvgPropsOps[Self <: LineSvgProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreaBlendMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaBlendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAreaBlendMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaBlendMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePointLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePointLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePointLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePointLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPointLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withPointLabelYOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointLabelYOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointLabelYOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointLabelYOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMesh(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMesh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMesh")(js.undefined)
        ret
    }
  }
  
}

