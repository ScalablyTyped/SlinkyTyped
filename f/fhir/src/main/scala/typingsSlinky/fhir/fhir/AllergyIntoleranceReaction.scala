package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Adverse Reaction Events linked to exposure to substance
  */
@js.native
trait AllergyIntoleranceReaction extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'onset'.
    */
  var _onset: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'severity'.
    */
  var _severity: js.UndefOr[Element] = js.native
  /**
    * Description of the event as a whole
    */
  var description: js.UndefOr[String] = js.native
  /**
    * How the subject was exposed to the substance
    */
  var exposureRoute: js.UndefOr[CodeableConcept] = js.native
  /**
    * Clinical symptoms/signs associated with the Event
    */
  var manifestation: js.Array[CodeableConcept] = js.native
  /**
    * Text about event not captured in other fields
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Date(/time) when manifestations showed
    */
  var onset: js.UndefOr[dateTime] = js.native
  /**
    * mild | moderate | severe (of event as a whole)
    */
  var severity: js.UndefOr[code] = js.native
  /**
    * Specific substance or pharmaceutical product considered to be responsible for event
    */
  var substance: js.UndefOr[CodeableConcept] = js.native
}

object AllergyIntoleranceReaction {
  @scala.inline
  def apply(manifestation: js.Array[CodeableConcept]): AllergyIntoleranceReaction = {
    val __obj = js.Dynamic.literal(manifestation = manifestation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllergyIntoleranceReaction]
  }
  @scala.inline
  implicit class AllergyIntoleranceReactionOps[Self <: AllergyIntoleranceReaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManifestation(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_description(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(js.undefined)
        ret
    }
    @scala.inline
    def with_onset(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_onset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onset")(js.undefined)
        ret
    }
    @scala.inline
    def with_severity(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_severity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_severity")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withExposureRoute(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExposureRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exposureRoute")(js.undefined)
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
    def withOnset(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onset")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstance(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substance")(js.undefined)
        ret
    }
  }
  
}

