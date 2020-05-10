package typingsSlinky.rmcPullToRefresh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrSt extends js.Object {
  var currSt: String = js.native
  var dragOnEdge: Boolean = js.native
}

object AnonCurrSt {
  @scala.inline
  def apply(currSt: String, dragOnEdge: Boolean): AnonCurrSt = {
    val __obj = js.Dynamic.literal(currSt = currSt.asInstanceOf[js.Any], dragOnEdge = dragOnEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrSt]
  }
  @scala.inline
  implicit class AnonCurrStOps[Self <: AnonCurrSt] (val x: Self) extends AnyVal {
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

