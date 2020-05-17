package typingsSlinky.googleVisualization.google.visualization

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartBase extends js.Object {
  def getContainer(): Element = js.native
  def getSelection(): js.Array[VisualizationSelectionArray] = js.native
  def setSelection(selection: js.Array[VisualizationSelectionArray]): Unit = js.native
}

object ChartBase {
  @scala.inline
  def apply(
    getContainer: () => Element,
    getSelection: () => js.Array[VisualizationSelectionArray],
    setSelection: js.Array[VisualizationSelectionArray] => Unit
  ): ChartBase = {
    val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction0(getContainer), getSelection = js.Any.fromFunction0(getSelection), setSelection = js.Any.fromFunction1(setSelection))
    __obj.asInstanceOf[ChartBase]
  }
  @scala.inline
  implicit class ChartBaseOps[Self <: ChartBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContainer(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelection(value: () => js.Array[VisualizationSelectionArray]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSelection(value: js.Array[VisualizationSelectionArray] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelection")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

