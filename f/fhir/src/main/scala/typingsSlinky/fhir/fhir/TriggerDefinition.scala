package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an expected trigger for a module
  */
@js.native
trait TriggerDefinition extends Element {
  /**
    * Contains extended information for property 'eventName'.
    */
  var _eventName: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'eventTimingDate'.
    */
  var _eventTimingDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'eventTimingDateTime'.
    */
  var _eventTimingDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Triggering data of the event
    */
  var eventData: js.UndefOr[DataRequirement] = js.native
  /**
    * Triggering event name
    */
  var eventName: js.UndefOr[String] = js.native
  /**
    * Timing of the event
    */
  var eventTimingDate: js.UndefOr[date] = js.native
  /**
    * Timing of the event
    */
  var eventTimingDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Timing of the event
    */
  var eventTimingReference: js.UndefOr[Reference] = js.native
  /**
    * Timing of the event
    */
  var eventTimingTiming: js.UndefOr[Timing] = js.native
  /**
    * named-event | periodic | data-added | data-modified | data-removed | data-accessed | data-access-ended
    */
  var `type`: code = js.native
}

object TriggerDefinition {
  @scala.inline
  def apply(`type`: code): TriggerDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerDefinition]
  }
  @scala.inline
  implicit class TriggerDefinitionOps[Self <: TriggerDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_eventName(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_eventName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_eventName")(js.undefined)
        ret
    }
    @scala.inline
    def with_eventTimingDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_eventTimingDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_eventTimingDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_eventTimingDate")(js.undefined)
        ret
    }
    @scala.inline
    def with_eventTimingDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_eventTimingDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_eventTimingDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_eventTimingDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_type(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(js.undefined)
        ret
    }
    @scala.inline
    def withEventData(value: DataRequirement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventData")(js.undefined)
        ret
    }
    @scala.inline
    def withEventName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventName")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTimingDate(value: date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimingDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTimingDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimingDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTimingDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimingDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTimingDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimingDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTimingReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimingReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTimingReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimingReference")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTimingTiming(value: Timing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimingTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTimingTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimingTiming")(js.undefined)
        ret
    }
  }
  
}

