package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeWeightedDigraph extends js.Object {
  def add(start: Double, end: Double, weight: Double): Unit = js.native
  def e(): Double = js.native
  def v(): Double = js.native
}

object EdgeWeightedDigraph {
  @scala.inline
  def apply(add: (Double, Double, Double) => Unit, e: () => Double, v: () => Double): EdgeWeightedDigraph = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), e = js.Any.fromFunction0(e), v = js.Any.fromFunction0(v))
    __obj.asInstanceOf[EdgeWeightedDigraph]
  }
  @scala.inline
  implicit class EdgeWeightedDigraphOps[Self <: EdgeWeightedDigraph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withE(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withV(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

