package typingsSlinky.bizcharts.mod

import typingsSlinky.bizcharts.bizchartsStrings.x
import typingsSlinky.bizcharts.bizchartsStrings.y
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoordProps
  extends Props[js.Any] {
  var endAngle: js.UndefOr[Double] = js.native
  var innerRadius: js.UndefOr[Double] = js.native
  var radius: js.UndefOr[Double] = js.native
  var reflect: js.UndefOr[x | y] = js.native
  var rotate: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var startAngle: js.UndefOr[Double] = js.native
  var transpose: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[CoordType] = js.native
}

object CoordProps {
  @scala.inline
  def apply(): CoordProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordProps]
  }
  @scala.inline
  implicit class CoordPropsOps[Self <: CoordProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(js.undefined)
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
    def withReflect(value: typingsSlinky.bizcharts.bizchartsStrings.x | y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReflect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflect")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withTranspose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranspose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpose")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CoordType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

