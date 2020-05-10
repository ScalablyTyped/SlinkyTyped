package typingsSlinky.babylonWalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait miscVisitors[V] extends js.Object {
  var Noop: js.UndefOr[V] = js.native
  var ParenthesizedExpression: js.UndefOr[V] = js.native
}

object miscVisitors {
  @scala.inline
  def apply[V](): miscVisitors[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[miscVisitors[V]]
  }
  @scala.inline
  implicit class miscVisitorsOps[Self[v] <: miscVisitors[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withNoop(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Noop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoop: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Noop")(js.undefined)
        ret
    }
    @scala.inline
    def withParenthesizedExpression(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParenthesizedExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParenthesizedExpression: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParenthesizedExpression")(js.undefined)
        ret
    }
  }
  
}

