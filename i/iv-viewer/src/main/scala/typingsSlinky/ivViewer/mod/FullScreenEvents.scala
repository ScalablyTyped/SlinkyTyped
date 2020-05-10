package typingsSlinky.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullScreenEvents extends Events {
  var onCloseBtnClick: js.UndefOr[IVEvent] = js.native
}

object FullScreenEvents {
  @scala.inline
  def apply(): FullScreenEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullScreenEvents]
  }
  @scala.inline
  implicit class FullScreenEventsOps[Self <: FullScreenEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCloseBtnClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseBtnClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCloseBtnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseBtnClick")(js.undefined)
        ret
    }
  }
  
}

