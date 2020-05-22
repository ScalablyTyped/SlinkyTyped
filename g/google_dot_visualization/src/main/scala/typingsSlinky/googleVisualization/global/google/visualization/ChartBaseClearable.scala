package typingsSlinky.googleVisualization.global.google.visualization

import org.scalajs.dom.raw.Element
import typingsSlinky.googleVisualization.google.visualization.VisualizationSelectionArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.ChartBaseClearable")
@js.native
abstract class ChartBaseClearable ()
  extends typingsSlinky.googleVisualization.google.visualization.ChartBaseClearable {
  /* CompleteClass */
  override def clearChart(): Unit = js.native
  /* CompleteClass */
  override def getContainer(): Element = js.native
  /* CompleteClass */
  override def getSelection(): js.Array[VisualizationSelectionArray] = js.native
  /* CompleteClass */
  override def setSelection(selection: js.Array[VisualizationSelectionArray]): Unit = js.native
}

