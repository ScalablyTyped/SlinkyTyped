package typingsSlinky.reduxLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEntryObject extends js.Object {
  var action: js.UndefOr[String | Boolean | ActionToString] = js.native
  var error: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.native
  var nextState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
  var prevState: js.UndefOr[js.Function1[/* state */ js.Any, _]] = js.native
  var started: js.UndefOr[Double] = js.native
  var startedTime: js.UndefOr[js.Date] = js.native
  var took: js.UndefOr[Double] = js.native
}

object LogEntryObject {
  @scala.inline
  def apply(): LogEntryObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogEntryObject]
  }
  @scala.inline
  implicit class LogEntryObjectOps[Self <: LogEntryObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionFunction1(value: /* action */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAction(value: String | Boolean | ActionToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* error */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withNextState(value: /* state */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNextState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextState")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevState(value: /* state */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrevState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevState")(js.undefined)
        ret
    }
    @scala.inline
    def withStarted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(js.undefined)
        ret
    }
    @scala.inline
    def withStartedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTook(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("took")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("took")(js.undefined)
        ret
    }
  }
  
}

