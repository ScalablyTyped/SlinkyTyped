package typingsSlinky.echarts.echarts.EChartOption.BasicComponents.CartesianAxis

import typingsSlinky.echarts.anon.Icon
import typingsSlinky.echarts.anon.Opacity
import typingsSlinky.echarts.echarts.EChartOption.LineStyle
import typingsSlinky.echarts.echartsStrings.line
import typingsSlinky.echarts.echartsStrings.none
import typingsSlinky.echarts.echartsStrings.shadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @todo describe
  */
trait Pointer extends js.Object {
  var handle: js.UndefOr[Icon] = js.undefined
  var label: js.UndefOr[PointerLabel] = js.undefined
  var lineStyle: js.UndefOr[LineStyle] = js.undefined
  var shadowStyle: js.UndefOr[Opacity] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var snap: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[Boolean] = js.undefined
  var triggerTooltip: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[line | shadow | none] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var z: js.UndefOr[Double] = js.undefined
}

object Pointer {
  @scala.inline
  def apply(
    handle: Icon = null,
    label: PointerLabel = null,
    lineStyle: LineStyle = null,
    shadowStyle: Opacity = null,
    show: js.UndefOr[Boolean] = js.undefined,
    snap: js.UndefOr[Boolean] = js.undefined,
    status: js.UndefOr[Boolean] = js.undefined,
    triggerTooltip: js.UndefOr[Boolean] = js.undefined,
    `type`: line | shadow | none = null,
    value: js.UndefOr[Double] = js.undefined,
    z: js.UndefOr[Double] = js.undefined
  ): Pointer = {
    val __obj = js.Dynamic.literal()
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (shadowStyle != null) __obj.updateDynamic("shadowStyle")(shadowStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerTooltip)) __obj.updateDynamic("triggerTooltip")(triggerTooltip.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pointer]
  }
}

