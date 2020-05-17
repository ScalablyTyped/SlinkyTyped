package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.linear
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.log
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.min
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisLine extends js.Object {
  var axisLine: LineWidth = js.native
  var baselineScaling: min | zero = js.native
  var dataMax: Double = js.native
  var dataMin: Double = js.native
  var majorTick: BaselineColor = js.native
  var max: Double | String = js.native
  var maxSize: String = js.native
  var min: Double | String = js.native
  var minStep: Double = js.native
  var minorStep: Double = js.native
  var minorTick: LineStyle = js.native
  var referenceObjects: js.Array[Categories] = js.native
  var rendered: off | on = js.native
  var scale: log | linear = js.native
  var size: String = js.native
  var step: Double = js.native
  var tickLabel: Rotation = js.native
  var title: String = js.native
  var titleStyle: js.Object = js.native
  var viewportEndGroup: Double | String = js.native
  var viewportMax: Double | String = js.native
  var viewportMin: Double | String = js.native
  var viewportStartGroup: Double | String = js.native
}

object AxisLine {
  @scala.inline
  def apply(
    axisLine: LineWidth,
    baselineScaling: min | zero,
    dataMax: Double,
    dataMin: Double,
    majorTick: BaselineColor,
    max: Double | String,
    maxSize: String,
    min: Double | String,
    minStep: Double,
    minorStep: Double,
    minorTick: LineStyle,
    referenceObjects: js.Array[Categories],
    rendered: off | on,
    scale: log | linear,
    size: String,
    step: Double,
    tickLabel: Rotation,
    title: String,
    titleStyle: js.Object,
    viewportEndGroup: Double | String,
    viewportMax: Double | String,
    viewportMin: Double | String,
    viewportStartGroup: Double | String
  ): AxisLine = {
    val __obj = js.Dynamic.literal(axisLine = axisLine.asInstanceOf[js.Any], baselineScaling = baselineScaling.asInstanceOf[js.Any], dataMax = dataMax.asInstanceOf[js.Any], dataMin = dataMin.asInstanceOf[js.Any], majorTick = majorTick.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minStep = minStep.asInstanceOf[js.Any], minorStep = minorStep.asInstanceOf[js.Any], minorTick = minorTick.asInstanceOf[js.Any], referenceObjects = referenceObjects.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], tickLabel = tickLabel.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any], viewportEndGroup = viewportEndGroup.asInstanceOf[js.Any], viewportMax = viewportMax.asInstanceOf[js.Any], viewportMin = viewportMin.asInstanceOf[js.Any], viewportStartGroup = viewportStartGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLine]
  }
  @scala.inline
  implicit class AxisLineOps[Self <: AxisLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisLine(value: LineWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaselineScaling(value: min | zero): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMajorTick(value: BaselineColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorTick(value: LineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceObjects(value: js.Array[Categories]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRendered(value: off | on): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: log | linear): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickLabel(value: Rotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportEndGroup(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportEndGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportMax(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportMin(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportStartGroup(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportStartGroup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

