package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventData extends js.Object {
  var eventAction: js.UndefOr[String] = js.native
  var eventCategory: js.UndefOr[String] = js.native
  var eventCount: js.UndefOr[String] = js.native
  var eventLabel: js.UndefOr[String] = js.native
  var eventValue: js.UndefOr[String] = js.native
}

object EventData {
  @scala.inline
  def apply(): EventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventData]
  }
  @scala.inline
  implicit class EventDataOps[Self <: EventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventAction")(js.undefined)
        ret
    }
    @scala.inline
    def withEventCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withEventCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventCount")(js.undefined)
        ret
    }
    @scala.inline
    def withEventLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withEventValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventValue")(js.undefined)
        ret
    }
  }
  
}

