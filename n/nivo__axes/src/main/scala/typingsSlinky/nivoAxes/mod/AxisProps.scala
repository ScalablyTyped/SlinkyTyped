package typingsSlinky.nivoAxes.mod

import slinky.core.TagMod
import typingsSlinky.nivoAxes.nivoAxesStrings.bottom
import typingsSlinky.nivoAxes.nivoAxesStrings.end
import typingsSlinky.nivoAxes.nivoAxesStrings.left
import typingsSlinky.nivoAxes.nivoAxesStrings.middle
import typingsSlinky.nivoAxes.nivoAxesStrings.right
import typingsSlinky.nivoAxes.nivoAxesStrings.start
import typingsSlinky.nivoAxes.nivoAxesStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisProps extends js.Object {
  var format: js.UndefOr[String | TickFormatter] = js.undefined
  var legend: js.UndefOr[TagMod[Any]] = js.undefined
  var legendOffset: js.UndefOr[Double] = js.undefined
  var legendPosition: js.UndefOr[start | middle | end] = js.undefined
  var orient: js.UndefOr[top | right | bottom | left] = js.undefined
  var renderTick: js.UndefOr[js.Function1[/* data */ js.Any, TagMod[Any]]] = js.undefined
  var tickPadding: js.UndefOr[Double] = js.undefined
  var tickRotation: js.UndefOr[Double] = js.undefined
  var tickSize: js.UndefOr[Double] = js.undefined
  var tickValues: js.UndefOr[Double | (js.Array[js.Date | Double | String]) | String] = js.undefined
}

object AxisProps {
  @scala.inline
  def apply(
    format: String | TickFormatter = null,
    legend: TagMod[Any] = null,
    legendOffset: Int | Double = null,
    legendPosition: start | middle | end = null,
    orient: top | right | bottom | left = null,
    renderTick: /* data */ js.Any => TagMod[Any] = null,
    tickPadding: Int | Double = null,
    tickRotation: Int | Double = null,
    tickSize: Int | Double = null,
    tickValues: Double | (js.Array[js.Date | Double | String]) | String = null
  ): AxisProps = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (legendOffset != null) __obj.updateDynamic("legendOffset")(legendOffset.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (renderTick != null) __obj.updateDynamic("renderTick")(js.Any.fromFunction1(renderTick))
    if (tickPadding != null) __obj.updateDynamic("tickPadding")(tickPadding.asInstanceOf[js.Any])
    if (tickRotation != null) __obj.updateDynamic("tickRotation")(tickRotation.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (tickValues != null) __obj.updateDynamic("tickValues")(tickValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisProps]
  }
}

