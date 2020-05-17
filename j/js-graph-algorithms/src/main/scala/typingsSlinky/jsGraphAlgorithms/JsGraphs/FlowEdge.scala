package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowEdge extends js.Object {
  var capacity: js.Any = js.native
  var flow: js.Any = js.native
  var label: js.UndefOr[String] = js.native
  var v: js.Any = js.native
  var w: js.Any = js.native
  def addResidualFlowTo(x: Double, deltaFlow: Double): Unit = js.native
  def from(): Double = js.native
  def other(x: Double): Double = js.native
  def residualCapacityTo(x: Double): Double = js.native
  def to(): Double = js.native
}

object FlowEdge {
  @scala.inline
  def apply(
    addResidualFlowTo: (Double, Double) => Unit,
    capacity: js.Any,
    flow: js.Any,
    from: () => Double,
    other: Double => Double,
    residualCapacityTo: Double => Double,
    to: () => Double,
    v: js.Any,
    w: js.Any
  ): FlowEdge = {
    val __obj = js.Dynamic.literal(addResidualFlowTo = js.Any.fromFunction2(addResidualFlowTo), capacity = capacity.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], from = js.Any.fromFunction0(from), other = js.Any.fromFunction1(other), residualCapacityTo = js.Any.fromFunction1(residualCapacityTo), to = js.Any.fromFunction0(to), v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowEdge]
  }
  @scala.inline
  implicit class FlowEdgeOps[Self <: FlowEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddResidualFlowTo(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addResidualFlowTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCapacity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOther(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResidualCapacityTo(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("residualCapacityTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTo(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withV(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withW(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

