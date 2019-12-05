package typingsSlinky.d3kit.d3kitMod

import org.scalajs.dom.raw.Element
import typingsSlinky.d3DashSelection.d3DashSelectionMod.BaseType
import typingsSlinky.d3DashSelection.d3DashSelectionMod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "SvgChart")
@js.native
class SvgChart protected () extends AbstractChart {
  def this(selector: String) = this()
  def this(selector: Element) = this()
  def this(selector: String, options: ChartOptions) = this()
  def this(selector: Element, options: ChartOptions) = this()
  var layers: LayerOrganizer = js.native
  var plate: SvgPlate = js.native
  var rootG: Selection[BaseType, _, BaseType, _] = js.native
  var svg: Selection[BaseType, _, BaseType, _] = js.native
}

