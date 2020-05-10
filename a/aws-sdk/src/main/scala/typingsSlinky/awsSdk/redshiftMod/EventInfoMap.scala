package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventInfoMap extends js.Object {
  /**
    * The category of an Amazon Redshift event.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  /**
    * The description of an Amazon Redshift event.
    */
  var EventDescription: js.UndefOr[String] = js.native
  /**
    * The identifier of an Amazon Redshift event.
    */
  var EventId: js.UndefOr[String] = js.native
  /**
    * The severity of the event. Values: ERROR, INFO
    */
  var Severity: js.UndefOr[String] = js.native
}

object EventInfoMap {
  @scala.inline
  def apply(): EventInfoMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventInfoMap]
  }
  @scala.inline
  implicit class EventInfoMapOps[Self <: EventInfoMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventCategories(value: EventCategoriesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withEventId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventId")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Severity")(js.undefined)
        ret
    }
  }
  
}

