package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Record of use of a device
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait DeviceUseStatement extends DomainResource {
  /**
    * Contains extended information for property 'recordedOn'.
    */
  var _recordedOn: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'timingDateTime'.
    */
  var _timingDateTime: js.UndefOr[Element] = js.native
  /**
    * Target body site
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.native
  /**
    * Reference to device used
    */
  var device: Reference = js.native
  /**
    * External identifier for this record
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Why device was used
    */
  var indication: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Addition details (comments, instructions)
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * When statement was recorded
    */
  var recordedOn: js.UndefOr[dateTime] = js.native
  /**
    * Who made the statement
    */
  var source: js.UndefOr[Reference] = js.native
  /**
    * active | completed | entered-in-error +
    */
  var status: code = js.native
  /**
    * Patient using device
    */
  var subject: Reference = js.native
  /**
    * How often  the device was used
    */
  var timingDateTime: js.UndefOr[dateTime] = js.native
  /**
    * How often  the device was used
    */
  var timingPeriod: js.UndefOr[Period] = js.native
  /**
    * How often  the device was used
    */
  var timingTiming: js.UndefOr[Timing] = js.native
  /**
    * Period device was used
    */
  var whenUsed: js.UndefOr[Period] = js.native
}

object DeviceUseStatement {
  @scala.inline
  def apply(device: Reference, status: code, subject: Reference): DeviceUseStatement = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceUseStatement]
  }
  @scala.inline
  implicit class DeviceUseStatementOps[Self <: DeviceUseStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevice(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_recordedOn(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_recordedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_recordedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_recordedOn")(js.undefined)
        ret
    }
    @scala.inline
    def with_status(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(js.undefined)
        ret
    }
    @scala.inline
    def with_timingDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timingDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_timingDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timingDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withBodySite(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodySite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodySite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodySite")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: js.Array[Identifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withIndication(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indication")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: js.Array[Annotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordedOn(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordedOn")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withTimingTiming(value: Timing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimingTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timingTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withWhenUsed(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhenUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whenUsed")(js.undefined)
        ret
    }
  }
  
}

