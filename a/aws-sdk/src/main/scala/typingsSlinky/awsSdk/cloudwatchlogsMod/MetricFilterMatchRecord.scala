package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricFilterMatchRecord extends js.Object {
  /**
    * The raw event data.
    */
  var eventMessage: js.UndefOr[EventMessage] = js.native
  /**
    * The event number.
    */
  var eventNumber: js.UndefOr[EventNumber] = js.native
  /**
    * The values extracted from the event data by the filter.
    */
  var extractedValues: js.UndefOr[ExtractedValues] = js.native
}

object MetricFilterMatchRecord {
  @scala.inline
  def apply(): MetricFilterMatchRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricFilterMatchRecord]
  }
  @scala.inline
  implicit class MetricFilterMatchRecordOps[Self <: MetricFilterMatchRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventMessage(value: EventMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withEventNumber(value: EventNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withExtractedValues(value: ExtractedValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtractedValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractedValues")(js.undefined)
        ret
    }
  }
  
}

