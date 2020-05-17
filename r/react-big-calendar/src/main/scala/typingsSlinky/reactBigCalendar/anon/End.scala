package typingsSlinky.reactBigCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait End[TEvent /* <: js.Object */] extends js.Object {
  var end: js.UndefOr[js.Function1[/* event */ TEvent, js.Date]] = js.native
  var start: js.UndefOr[js.Function1[/* event */ TEvent, js.Date]] = js.native
  var title: js.UndefOr[js.Function1[/* event */ TEvent, String]] = js.native
  var tooltip: js.UndefOr[js.Function1[/* event */ TEvent, String]] = js.native
}

object End {
  @scala.inline
  def apply[TEvent](): End[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[End[TEvent]]
  }
  @scala.inline
  implicit class EndOps[Self[tevent] <: End[tevent], TEvent] (val x: Self[TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEvent] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEvent] with Other]
    @scala.inline
    def withEnd(value: /* event */ TEvent => js.Date): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnd: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* event */ TEvent => js.Date): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStart: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: /* event */ TEvent => String): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTitle: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: /* event */ TEvent => String): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTooltip: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

