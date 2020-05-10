package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Media extends DomainResource {
  /**
    * Contains extended information for property 'duration'.
    */
  var _duration: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'frames'.
    */
  var _frames: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'height'.
    */
  var _height: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'width'.
    */
  var _width: js.UndefOr[Element] = js.native
  /**
    * Procedure that caused this media to be created
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Body part in media
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.native
  /**
    * Actual Media - reference or data
    */
  var content: Attachment = js.native
  /**
    * Encounter / Episode associated with media
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Observing Device
    */
  var device: js.UndefOr[Reference] = js.native
  /**
    * Length in seconds (audio / video)
    */
  var duration: js.UndefOr[unsignedInt] = js.native
  /**
    * Number of frames if > 1 (photo)
    */
  var frames: js.UndefOr[positiveInt] = js.native
  /**
    * Height of the image in pixels (photo/video)
    */
  var height: js.UndefOr[positiveInt] = js.native
  /**
    * Identifier(s) for the image
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Comments made about the media
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * When Media was collected
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.native
  /**
    * When Media was collected
    */
  var occurrencePeriod: js.UndefOr[Period] = js.native
  /**
    * The person who generated the image
    */
  var operator: js.UndefOr[Reference] = js.native
  /**
    * Why was event performed?
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Who/What this Media is a record of
    */
  var subject: js.UndefOr[Reference] = js.native
  /**
    * The type of acquisition equipment/process
    */
  var subtype: js.UndefOr[CodeableConcept] = js.native
  /**
    * photo | video | audio
    */
  var `type`: code = js.native
  /**
    * Imaging view, e.g. Lateral or Antero-posterior
    */
  var view: js.UndefOr[CodeableConcept] = js.native
  /**
    * Width of the image in pixels (photo/video)
    */
  var width: js.UndefOr[positiveInt] = js.native
}

object Media {
  @scala.inline
  def apply(content: Attachment, `type`: code): Media = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
  @scala.inline
  implicit class MediaOps[Self <: Media] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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
    def with_frames(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_frames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_frames")(js.undefined)
        ret
    }
    @scala.inline
    def with_height(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_height")(js.undefined)
        ret
    }
    @scala.inline
    def with_occurrenceDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_occurrenceDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_occurrenceDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_occurrenceDateTime")(js.undefined)
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
    def with_width(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_width")(js.undefined)
        ret
    }
    @scala.inline
    def withBasedOn(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasedOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basedOn")(js.undefined)
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
    def withContext(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDevice(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: unsignedInt): Self = {
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
    def withFrames(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frames")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
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
    def withOccurrenceDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrenceDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrenceDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOccurrencePeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrencePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrencePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrencePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withOperator(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonCode(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtype(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

