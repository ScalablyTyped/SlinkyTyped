package typingsSlinky.reactSparklines.mod

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ReactSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesBarsProps extends js.Object {
  var barWidth: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var onMouseMove: js.UndefOr[
    js.Function2[/* p */ Point, /* event */ SyntheticMouseEvent[ReactSVGElement], Unit]
  ] = js.undefined
  var points: js.UndefOr[js.Array[Point]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SparklinesBarsProps {
  @scala.inline
  def apply(
    barWidth: Int | Double = null,
    height: Int | Double = null,
    margin: Int | Double = null,
    onMouseMove: (/* p */ Point, /* event */ SyntheticMouseEvent[ReactSVGElement]) => Unit = null,
    points: js.Array[Point] = null,
    style: CSSProperties = null
  ): SparklinesBarsProps = {
    val __obj = js.Dynamic.literal()
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklinesBarsProps]
  }
}

