package typingsSlinky.n8tb1tUseScrollPosition.mod

import typingsSlinky.n8tb1tUseScrollPosition.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollProps extends js.Object {
  var currPos: X = js.native
  var prevPos: X = js.native
}

object ScrollProps {
  @scala.inline
  def apply(currPos: X, prevPos: X): ScrollProps = {
    val __obj = js.Dynamic.literal(currPos = currPos.asInstanceOf[js.Any], prevPos = prevPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollProps]
  }
  @scala.inline
  implicit class ScrollPropsOps[Self <: ScrollProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrPos(value: X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevPos(value: X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

