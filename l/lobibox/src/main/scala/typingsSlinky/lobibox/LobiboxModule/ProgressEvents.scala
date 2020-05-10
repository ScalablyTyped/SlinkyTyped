package typingsSlinky.lobibox.LobiboxModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressEvents extends js.Object {
  var progressComplete: js.UndefOr[js.Function1[/* lobibox */ LobiboxStatic, Unit]] = js.native
  var progressUpdated: js.UndefOr[js.Function1[/* lobibox */ LobiboxStatic, Unit]] = js.native
}

object ProgressEvents {
  @scala.inline
  def apply(): ProgressEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressEvents]
  }
  @scala.inline
  implicit class ProgressEventsOps[Self <: ProgressEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProgressComplete(value: /* lobibox */ LobiboxStatic => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProgressComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressUpdated(value: /* lobibox */ LobiboxStatic => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProgressUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressUpdated")(js.undefined)
        ret
    }
  }
  
}

