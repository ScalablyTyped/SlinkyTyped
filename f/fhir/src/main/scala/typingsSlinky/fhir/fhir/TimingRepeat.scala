package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When the event is to occur
  */
@js.native
trait TimingRepeat extends Element {
  /**
    * Contains extended information for property 'count'.
    */
  var _count: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'countMax'.
    */
  var _countMax: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'dayOfWeek'.
    */
  var _dayOfWeek: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'duration'.
    */
  var _duration: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'durationMax'.
    */
  var _durationMax: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'durationUnit'.
    */
  var _durationUnit: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'frequency'.
    */
  var _frequency: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'frequencyMax'.
    */
  var _frequencyMax: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'offset'.
    */
  var _offset: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'period'.
    */
  var _period: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'periodMax'.
    */
  var _periodMax: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'periodUnit'.
    */
  var _periodUnit: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'timeOfDay'.
    */
  var _timeOfDay: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'when'.
    */
  var _when: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Length/Range of lengths, or (Start and/or end) limits
    */
  var boundsDuration: js.UndefOr[Duration] = js.native
  /**
    * Length/Range of lengths, or (Start and/or end) limits
    */
  var boundsPeriod: js.UndefOr[Period] = js.native
  /**
    * Length/Range of lengths, or (Start and/or end) limits
    */
  var boundsRange: js.UndefOr[Range] = js.native
  /**
    * Number of times to repeat
    */
  var count: js.UndefOr[integer] = js.native
  /**
    * Maximum number of times to repeat
    */
  var countMax: js.UndefOr[integer] = js.native
  /**
    * mon | tue | wed | thu | fri | sat | sun
    */
  var dayOfWeek: js.UndefOr[js.Array[code]] = js.native
  /**
    * How long when it happens
    */
  var duration: js.UndefOr[decimal] = js.native
  /**
    * How long when it happens (Max)
    */
  var durationMax: js.UndefOr[decimal] = js.native
  /**
    * s | min | h | d | wk | mo | a - unit of time (UCUM)
    */
  var durationUnit: js.UndefOr[code] = js.native
  /**
    * Event occurs frequency times per period
    */
  var frequency: js.UndefOr[integer] = js.native
  /**
    * Event occurs up to frequencyMax times per period
    */
  var frequencyMax: js.UndefOr[integer] = js.native
  /**
    * Minutes from event (before or after)
    */
  var offset: js.UndefOr[unsignedInt] = js.native
  /**
    * Event occurs frequency times per period
    */
  var period: js.UndefOr[decimal] = js.native
  /**
    * Upper limit of period (3-4 hours)
    */
  var periodMax: js.UndefOr[decimal] = js.native
  /**
    * s | min | h | d | wk | mo | a - unit of time (UCUM)
    */
  var periodUnit: js.UndefOr[code] = js.native
  /**
    * Time of day for action
    */
  var timeOfDay: js.UndefOr[js.Array[time]] = js.native
  /**
    * Regular life events the event is tied to
    */
  var when: js.UndefOr[js.Array[code]] = js.native
}

object TimingRepeat {
  @scala.inline
  def apply(): TimingRepeat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimingRepeat]
  }
  @scala.inline
  implicit class TimingRepeatOps[Self <: TimingRepeat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_count(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_count")(js.undefined)
        ret
    }
    @scala.inline
    def with_countMax(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_countMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_countMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_countMax")(js.undefined)
        ret
    }
    @scala.inline
    def with_dayOfWeek(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_dayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def with_duration(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_duration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_duration")(js.undefined)
        ret
    }
    @scala.inline
    def with_durationMax(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_durationMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_durationMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_durationMax")(js.undefined)
        ret
    }
    @scala.inline
    def with_durationUnit(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_durationUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_durationUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_durationUnit")(js.undefined)
        ret
    }
    @scala.inline
    def with_frequency(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_frequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_frequency")(js.undefined)
        ret
    }
    @scala.inline
    def with_frequencyMax(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_frequencyMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_frequencyMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_frequencyMax")(js.undefined)
        ret
    }
    @scala.inline
    def with_offset(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_offset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_offset")(js.undefined)
        ret
    }
    @scala.inline
    def with_period(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_period: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_period")(js.undefined)
        ret
    }
    @scala.inline
    def with_periodMax(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_periodMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_periodMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_periodMax")(js.undefined)
        ret
    }
    @scala.inline
    def with_periodUnit(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_periodUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_periodUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_periodUnit")(js.undefined)
        ret
    }
    @scala.inline
    def with_timeOfDay(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timeOfDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_timeOfDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timeOfDay")(js.undefined)
        ret
    }
    @scala.inline
    def with_when(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_when")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_when: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_when")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundsDuration(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundsDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundsDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundsDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundsPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundsPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundsPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundsPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundsRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundsRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundsRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundsRange")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withCountMax(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countMax")(js.undefined)
        ret
    }
    @scala.inline
    def withDayOfWeek(value: js.Array[code]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationMax(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMax")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationUnit(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequency(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequencyMax(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencyMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequencyMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencyMax")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: unsignedInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriodMax(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodMax")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriodUnit(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOfDay(value: js.Array[time]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOfDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOfDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOfDay")(js.undefined)
        ret
    }
    @scala.inline
    def withWhen(value: js.Array[code]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(js.undefined)
        ret
    }
  }
  
}

