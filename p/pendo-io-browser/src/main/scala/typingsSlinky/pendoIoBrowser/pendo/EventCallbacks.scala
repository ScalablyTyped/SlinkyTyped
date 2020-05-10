package typingsSlinky.pendoIoBrowser.pendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCallbacks extends js.Object {
  var guidesFailed: js.UndefOr[js.Function0[Unit]] = js.native
  var guidesLoaded: js.UndefOr[js.Function0[Unit]] = js.native
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
}

object EventCallbacks {
  @scala.inline
  def apply(): EventCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventCallbacks]
  }
  @scala.inline
  implicit class EventCallbacksOps[Self <: EventCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGuidesFailed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guidesFailed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGuidesFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guidesFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withGuidesLoaded(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guidesLoaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGuidesLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guidesLoaded")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
  }
  
}

