package typingsSlinky.rmcPullToRefresh.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrSt extends js.Object {
  var currSt: String = js.native
  var dragOnEdge: Boolean = js.native
}

object CurrSt {
  @scala.inline
  def apply(currSt: String, dragOnEdge: Boolean): CurrSt = {
    val __obj = js.Dynamic.literal(currSt = currSt.asInstanceOf[js.Any], dragOnEdge = dragOnEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrSt]
  }
  @scala.inline
  implicit class CurrStOps[Self <: CurrSt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrSt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currSt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragOnEdge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOnEdge")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

