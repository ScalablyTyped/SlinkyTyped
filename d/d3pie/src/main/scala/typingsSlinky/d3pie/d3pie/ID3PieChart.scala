package typingsSlinky.d3pie.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ID3PieChart extends js.Object {
  def closeSegment(index: Unit): Unit = js.native
  def destroy(): Unit = js.native
  def getOpenSegment(): js.Any = js.native
  def openSegment(index: Double): Unit = js.native
  def redraw(): Unit = js.native
  def updateProp(propKey: String, value: js.Any): Unit = js.native
}

object ID3PieChart {
  @scala.inline
  def apply(
    closeSegment: Unit => Unit,
    destroy: () => Unit,
    getOpenSegment: () => js.Any,
    openSegment: Double => Unit,
    redraw: () => Unit,
    updateProp: (String, js.Any) => Unit
  ): ID3PieChart = {
    val __obj = js.Dynamic.literal(closeSegment = js.Any.fromFunction1(closeSegment), destroy = js.Any.fromFunction0(destroy), getOpenSegment = js.Any.fromFunction0(getOpenSegment), openSegment = js.Any.fromFunction1(openSegment), redraw = js.Any.fromFunction0(redraw), updateProp = js.Any.fromFunction2(updateProp))
    __obj.asInstanceOf[ID3PieChart]
  }
  @scala.inline
  implicit class ID3PieChartOps[Self <: ID3PieChart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseSegment(value: Unit => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeSegment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOpenSegment(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpenSegment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpenSegment(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openSegment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRedraw(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redraw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateProp(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateProp")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

