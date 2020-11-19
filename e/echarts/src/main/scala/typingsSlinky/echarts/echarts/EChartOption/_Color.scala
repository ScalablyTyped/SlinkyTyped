package typingsSlinky.echarts.echarts.EChartOption

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.echarts.anon.Offset
import typingsSlinky.echarts.echartsStrings.linear
import typingsSlinky.echarts.echartsStrings.radial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Color extends js.Object
object _Color {
  
  @scala.inline
  def Type(colorStops: js.Array[Offset], `type`: linear, x: Double, x2: Double, y: Double, y2: Double): _Color = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Color]
  }
  
  @scala.inline
  def X(colorStops: js.Array[Offset], r: Double, `type`: radial, x: Double, y: Double): _Color = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Color]
  }
  
  @scala.inline
  def Image(image: HTMLImageElement | HTMLCanvasElement): _Color = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Color]
  }
}
