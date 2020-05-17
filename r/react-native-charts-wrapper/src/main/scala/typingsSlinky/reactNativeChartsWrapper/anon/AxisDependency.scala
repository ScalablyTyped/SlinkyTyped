package typingsSlinky.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisDependency extends js.Object {
  var axisDependency: js.UndefOr[typingsSlinky.reactNativeChartsWrapper.mod.AxisDependency] = js.native
  var scaleX: Double = js.native
  var scaleY: Double = js.native
  var xValue: Double = js.native
  var yValue: Double = js.native
}

object AxisDependency {
  @scala.inline
  def apply(scaleX: Double, scaleY: Double, xValue: Double, yValue: Double): AxisDependency = {
    val __obj = js.Dynamic.literal(scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], xValue = xValue.asInstanceOf[js.Any], yValue = yValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisDependency]
  }
  @scala.inline
  implicit class AxisDependencyOps[Self <: AxisDependency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScaleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAxisDependency(value: typingsSlinky.reactNativeChartsWrapper.mod.AxisDependency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisDependency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisDependency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisDependency")(js.undefined)
        ret
    }
  }
  
}

