package typingsSlinky.googleAnalytics

import typingsSlinky.googleAnalytics.UniversalAnalytics.HitType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEventCategory extends js.Object {
  var eventAction: String = js.native
   // 'event'
  var eventCategory: String = js.native
  var eventLabel: js.UndefOr[String] = js.native
  var eventValue: js.UndefOr[Double] = js.native
  var hitType: HitType = js.native
  var nonInteraction: js.UndefOr[Boolean] = js.native
}

object AnonEventCategory {
  @scala.inline
  def apply(eventAction: String, eventCategory: String, hitType: HitType): AnonEventCategory = {
    val __obj = js.Dynamic.literal(eventAction = eventAction.asInstanceOf[js.Any], eventCategory = eventCategory.asInstanceOf[js.Any], hitType = hitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEventCategory]
  }
  @scala.inline
  implicit class AnonEventCategoryOps[Self <: AnonEventCategory] (val x: Self) extends AnyVal {
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
    def withHitType(value: HitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitType")(value.asInstanceOf[js.Any])
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

