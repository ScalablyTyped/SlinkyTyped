package typingsSlinky.fullcalendar.inputTypesMod

import typingsSlinky.jquery.JQuery_.AjaxSettings
import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSourceExtendedInput
  extends AjaxSettings[js.Any]
     with EventOptionsBase {
  var allDayDefault: js.UndefOr[Boolean] = js.native
  var endParam: js.UndefOr[String] = js.native
  var eventDataTransform: js.UndefOr[js.Function1[/* eventData */ js.Any, EventObjectInput]] = js.native
  var events: js.UndefOr[EventSourceSimpleInput] = js.native
  var startParam: js.UndefOr[String] = js.native
}

object EventSourceExtendedInput {
  @scala.inline
  def apply(): EventSourceExtendedInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourceExtendedInput]
  }
  @scala.inline
  implicit class EventSourceExtendedInputOps[Self <: EventSourceExtendedInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllDayDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDayDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withEndParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endParam")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDataTransform(value: /* eventData */ js.Any => EventObjectInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDataTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEventDataTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDataTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withEventsFunction4(
      value: (/* start */ Moment, /* end */ Moment, /* timezone */ String, /* callback */ js.Function1[/* events */ js.Array[EventObjectInput], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withEvents(value: EventSourceSimpleInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withStartParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startParam")(js.undefined)
        ret
    }
  }
  
}

