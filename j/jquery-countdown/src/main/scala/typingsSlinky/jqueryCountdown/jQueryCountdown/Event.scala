package typingsSlinky.jqueryCountdown.jQueryCountdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event
  extends typingsSlinky.jquery.JQuery.Event {
  /**
    * Passed away the final date?
    */
  var elapsed: Boolean = js.native
  /**
    * The parsed final date native object
    */
  var finalDate: js.Date = js.native
  var offset: OffsetEvent = js.native
  /**
    * The formatter function
    */
  def strftime(format: String): String = js.native
}

object Event {
  @scala.inline
  def apply(
    elapsed: Boolean,
    finalDate: js.Date,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    offset: OffsetEvent,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    strftime: String => String,
    timeStamp: Double,
    `type`: String
  ): Event = {
    val __obj = js.Dynamic.literal(elapsed = elapsed.asInstanceOf[js.Any], finalDate = finalDate.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), offset = offset.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), strftime = js.Any.fromFunction1(strftime), timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: OffsetEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrftime(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strftime")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

