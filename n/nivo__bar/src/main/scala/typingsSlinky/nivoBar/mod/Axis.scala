package typingsSlinky.nivoBar.mod

import typingsSlinky.nivoBar.nivoBarStrings.bottom
import typingsSlinky.nivoBar.nivoBarStrings.end
import typingsSlinky.nivoBar.nivoBarStrings.left
import typingsSlinky.nivoBar.nivoBarStrings.middle
import typingsSlinky.nivoBar.nivoBarStrings.right
import typingsSlinky.nivoBar.nivoBarStrings.start
import typingsSlinky.nivoBar.nivoBarStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  format  :string | @nivo/bar.@nivo/bar.LabelFormatter,   legend  :string,   legendOffset  :number,   legendPosition  :'start' | 'middle' | 'end',   orient  :'top' | 'right' | 'bottom' | 'left',   tickPadding  :number,   tickRotation  :number,   tickSize  :number,   tickValues  :number | std.Array<string> | std.Array<number>}> */
trait Axis extends js.Object {
  var format: js.UndefOr[String | LabelFormatter] = js.undefined
  var legend: js.UndefOr[String] = js.undefined
  var legendOffset: js.UndefOr[Double] = js.undefined
  var legendPosition: js.UndefOr[start | middle | end] = js.undefined
  var orient: js.UndefOr[top | right | bottom | left] = js.undefined
  var tickPadding: js.UndefOr[Double] = js.undefined
  var tickRotation: js.UndefOr[Double] = js.undefined
  var tickSize: js.UndefOr[Double] = js.undefined
  var tickValues: js.UndefOr[Double | (js.Array[Double | String])] = js.undefined
}

object Axis {
  @scala.inline
  def apply(
    format: String | LabelFormatter = null,
    legend: String = null,
    legendOffset: js.UndefOr[Double] = js.undefined,
    legendPosition: start | middle | end = null,
    orient: top | right | bottom | left = null,
    tickPadding: js.UndefOr[Double] = js.undefined,
    tickRotation: js.UndefOr[Double] = js.undefined,
    tickSize: js.UndefOr[Double] = js.undefined,
    tickValues: Double | (js.Array[Double | String]) = null
  ): Axis = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (!js.isUndefined(legendOffset)) __obj.updateDynamic("legendOffset")(legendOffset.get.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (!js.isUndefined(tickPadding)) __obj.updateDynamic("tickPadding")(tickPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickRotation)) __obj.updateDynamic("tickRotation")(tickRotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickSize)) __obj.updateDynamic("tickSize")(tickSize.get.asInstanceOf[js.Any])
    if (tickValues != null) __obj.updateDynamic("tickValues")(tickValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
}

