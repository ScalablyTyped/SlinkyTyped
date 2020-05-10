package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A timing schedule that specifies an event that may occur multiple times
  */
@js.native
trait Timing extends Element {
  /**
    * Contains extended information for property 'event'.
    */
  var _event: js.UndefOr[js.Array[Element]] = js.native
  /**
    * BID | TID | QID | AM | PM | QD | QOD | Q4H | Q6H +
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  /**
    * When the event occurs
    */
  var event: js.UndefOr[js.Array[dateTime]] = js.native
  /**
    * When the event is to occur
    */
  var repeat: js.UndefOr[TimingRepeat] = js.native
}

object Timing {
  @scala.inline
  def apply(): Timing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timing]
  }
  @scala.inline
  implicit class TimingOps[Self <: Timing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_event(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_event: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_event")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: js.Array[dateTime]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withRepeat(value: TimingRepeat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat")(js.undefined)
        ret
    }
  }
  
}

