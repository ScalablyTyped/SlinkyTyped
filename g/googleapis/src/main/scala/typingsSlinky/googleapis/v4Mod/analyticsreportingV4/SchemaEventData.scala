package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents all the details pertaining to an event.
  */
@js.native
trait SchemaEventData extends js.Object {
  /**
    * Type of interaction with the object. Eg: &#39;play&#39;.
    */
  var eventAction: js.UndefOr[String] = js.native
  /**
    * The object on the page that was interacted with. Eg: &#39;Video&#39;.
    */
  var eventCategory: js.UndefOr[String] = js.native
  /**
    * Number of such events in this activity.
    */
  var eventCount: js.UndefOr[String] = js.native
  /**
    * Label attached with the event.
    */
  var eventLabel: js.UndefOr[String] = js.native
  /**
    * Numeric value associated with the event.
    */
  var eventValue: js.UndefOr[String] = js.native
}

object SchemaEventData {
  @scala.inline
  def apply(): SchemaEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventData]
  }
  @scala.inline
  implicit class SchemaEventDataOps[Self <: SchemaEventData] (val x: Self) extends AnyVal {
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

