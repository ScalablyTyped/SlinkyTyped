package typingsSlinky.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickUnion extends js.Object {
  var id: js.Any = js.native
  def connected(v: Double, w: Double): Boolean = js.native
  def root(q: Double): Double = js.native
  def union(v: Double, w: Double): Unit = js.native
}

object QuickUnion {
  @scala.inline
  def apply(
    connected: (Double, Double) => Boolean,
    id: js.Any,
    root: Double => Double,
    union: (Double, Double) => Unit
  ): QuickUnion = {
    val __obj = js.Dynamic.literal(connected = js.Any.fromFunction2(connected), id = id.asInstanceOf[js.Any], root = js.Any.fromFunction1(root), union = js.Any.fromFunction2(union))
    __obj.asInstanceOf[QuickUnion]
  }
  @scala.inline
  implicit class QuickUnionOps[Self <: QuickUnion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnected(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnion(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("union")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

