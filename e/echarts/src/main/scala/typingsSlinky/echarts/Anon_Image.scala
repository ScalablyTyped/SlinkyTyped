package typingsSlinky.echarts

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.echarts.echarts.EChartOption._Color
import typingsSlinky.echarts.echartsStrings.`no-repeat`
import typingsSlinky.echarts.echartsStrings.`repeat-x`
import typingsSlinky.echarts.echartsStrings.`repeat-y`
import typingsSlinky.echarts.echartsStrings.repeat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends _Color {
  /**
    * HTMLImageElement, and HTMLCanvasElement are supported, while string path is not supported
    */
  var image: HTMLImageElement | HTMLCanvasElement
  var repeat: js.UndefOr[
    typingsSlinky.echarts.echartsStrings.repeat | `repeat-x` | `repeat-y` | `no-repeat`
  ] = js.undefined
}

object Anon_Image {
  @scala.inline
  def apply(
    image: HTMLImageElement | HTMLCanvasElement,
    repeat: repeat | `repeat-x` | `repeat-y` | `no-repeat` = null
  ): Anon_Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Image]
  }
}

