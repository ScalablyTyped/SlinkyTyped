package typingsSlinky.d3kit.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "CanvasChart")
@js.native
class CanvasChart protected () extends AbstractChart {
  def this(selector: String) = this()
  def this(selector: Element) = this()
  def this(selector: String, options: ChartOptions) = this()
  def this(selector: Element, options: ChartOptions) = this()
  def clear(): this.type = js.native
  def getContext2d(): CanvasRenderingContext2D = js.native
}

/* static members */
@JSImport("d3kit", "CanvasChart")
@js.native
object CanvasChart extends js.Object {
  def getDefaultOptions(): ChartOptions = js.native
}

