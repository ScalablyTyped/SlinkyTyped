package typingsSlinky.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visitor[N /* <: Node */] extends js.Object {
  def onDetail(root: N, state: js.Any): Unit = js.native
  def onEnd(root: N, state: js.Any): Unit = js.native
  def onStart(root: N, state: js.Any): Unit = js.native
  def onSummary(root: N, state: js.Any): Unit = js.native
  def onSummaryEnd(root: N, state: js.Any): Unit = js.native
}

object Visitor {
  @scala.inline
  def apply[N](
    onDetail: (N, js.Any) => Unit,
    onEnd: (N, js.Any) => Unit,
    onStart: (N, js.Any) => Unit,
    onSummary: (N, js.Any) => Unit,
    onSummaryEnd: (N, js.Any) => Unit
  ): Visitor[N] = {
    val __obj = js.Dynamic.literal(onDetail = js.Any.fromFunction2(onDetail), onEnd = js.Any.fromFunction2(onEnd), onStart = js.Any.fromFunction2(onStart), onSummary = js.Any.fromFunction2(onSummary), onSummaryEnd = js.Any.fromFunction2(onSummaryEnd))
    __obj.asInstanceOf[Visitor[N]]
  }
  @scala.inline
  implicit class VisitorOps[Self[n] <: Visitor[n], N] (val x: Self[N]) extends AnyVal {
    @scala.inline
    def duplicate: Self[N] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[N]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[N] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[N] with Other]
    @scala.inline
    def withOnDetail(value: (N, js.Any) => Unit): Self[N] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDetail")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnEnd(value: (N, js.Any) => Unit): Self[N] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnStart(value: (N, js.Any) => Unit): Self[N] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnSummary(value: (N, js.Any) => Unit): Self[N] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSummary")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnSummaryEnd(value: (N, js.Any) => Unit): Self[N] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSummaryEnd")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

