package typingsSlinky.reactSplitPane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitPaneState extends js.Object {
  var active: Boolean = js.native
  var resized: Boolean = js.native
}

object SplitPaneState {
  @scala.inline
  def apply(active: Boolean, resized: Boolean): SplitPaneState = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], resized = resized.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitPaneState]
  }
  @scala.inline
  implicit class SplitPaneStateOps[Self <: SplitPaneState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resized")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

