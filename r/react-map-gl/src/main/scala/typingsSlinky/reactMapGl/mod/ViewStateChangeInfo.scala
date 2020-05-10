package typingsSlinky.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewStateChangeInfo extends js.Object {
  var viewState: ViewportProps = js.native
}

object ViewStateChangeInfo {
  @scala.inline
  def apply(viewState: ViewportProps): ViewStateChangeInfo = {
    val __obj = js.Dynamic.literal(viewState = viewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewStateChangeInfo]
  }
  @scala.inline
  implicit class ViewStateChangeInfoOps[Self <: ViewStateChangeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withViewState(value: ViewportProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

