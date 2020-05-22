package typingsSlinky.googleVisualization.global.google.visualization

import org.scalajs.dom.raw.Element
import typingsSlinky.googleVisualization.google.visualization.VisualizationSelectionArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.ChartBase")
@js.native
abstract class ChartBase protected ()
  extends typingsSlinky.googleVisualization.google.visualization.ChartBase {
  def this(element: Element) = this()
  /* CompleteClass */
  override def getContainer(): Element = js.native
  /* CompleteClass */
  override def getSelection(): js.Array[VisualizationSelectionArray] = js.native
  /* CompleteClass */
  override def setSelection(selection: js.Array[VisualizationSelectionArray]): Unit = js.native
}

