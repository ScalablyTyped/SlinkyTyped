package typingsSlinky.googleAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEventAction extends js.Object {
  var eventAction: String = js.native
  var eventCategory: String = js.native
  var eventLabel: js.UndefOr[String] = js.native
  var eventValue: js.UndefOr[Double] = js.native
  var nonInteraction: js.UndefOr[Boolean] = js.native
}

object AnonEventAction {
  @scala.inline
  def apply(eventAction: String, eventCategory: String): AnonEventAction = {
    val __obj = js.Dynamic.literal(eventAction = eventAction.asInstanceOf[js.Any], eventCategory = eventCategory.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEventAction]
  }
  @scala.inline
  implicit class AnonEventActionOps[Self <: AnonEventAction] (val x: Self) extends AnyVal {
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
    def withEventCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventCategory")(value.asInstanceOf[js.Any])
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
    def withEventValue(value: Double): Self = {
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
    @scala.inline
    def withNonInteraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonInteraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonInteraction")(js.undefined)
        ret
    }
  }
  
}

