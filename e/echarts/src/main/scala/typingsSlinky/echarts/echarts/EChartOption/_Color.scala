package typingsSlinky.echarts.echarts.EChartOption

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.echarts.AnonOffset
import typingsSlinky.echarts.echartsStrings.linear
import typingsSlinky.echarts.echartsStrings.radial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Color extends js.Object

object _Color {
  @scala.inline
  def AnonType(colorStops: js.Array[AnonOffset], `type`: linear, x: Double, x2: Double, y: Double, y2: Double): _Color = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Color]
  }
  @scala.inline
  def AnonX(colorStops: js.Array[AnonOffset], r: Double, `type`: radial, x: Double, y: Double): _Color = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Color]
  }
  @scala.inline
  def AnonImage(image: HTMLImageElement | HTMLCanvasElement): _Color = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Color]
  }
}

