package typingsSlinky.nivoCore.mod

import typingsSlinky.nivoCore.anon.PartialCSSProperties
import typingsSlinky.nivoCore.nivoCoreStrings.x
import typingsSlinky.nivoCore.nivoCoreStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CartesianMarkerProps extends js.Object {
  var axis: x | y
  var legend: js.UndefOr[String] = js.undefined
  var lineStyle: js.UndefOr[PartialCSSProperties] = js.undefined
  var textStyle: js.UndefOr[PartialCSSProperties] = js.undefined
  var value: String | Double | js.Date
}

object CartesianMarkerProps {
  @scala.inline
  def apply(
    axis: x | y,
    value: String | Double | js.Date,
    legend: String = null,
    lineStyle: PartialCSSProperties = null,
    textStyle: PartialCSSProperties = null
  ): CartesianMarkerProps = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartesianMarkerProps]
  }
}

