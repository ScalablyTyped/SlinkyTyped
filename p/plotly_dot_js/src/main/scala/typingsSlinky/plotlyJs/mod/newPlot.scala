package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialConfig
import typingsSlinky.plotlyJs.anon.PartialLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plotly.js", "newPlot")
@js.native
object newPlot extends js.Object {
  
  def apply(root: Root, data: js.Array[Data]): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, data: js.Array[Data], layout: js.UndefOr[scala.Nothing], config: PartialConfig): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, data: js.Array[Data], layout: PartialLayout): js.Promise[PlotlyHTMLElement] = js.native
  def apply(root: Root, data: js.Array[Data], layout: PartialLayout, config: PartialConfig): js.Promise[PlotlyHTMLElement] = js.native
}
