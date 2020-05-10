package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Immunization event information
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Immunization extends DomainResource {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'expirationDate'.
    */
  var _expirationDate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'lotNumber'.
    */
  var _lotNumber: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'notGiven'.
    */
  var _notGiven: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'primarySource'.
    */
  var _primarySource: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Vaccination administration date
    */
  var date: js.UndefOr[dateTime] = js.native
  /**
    * Amount of vaccine administered
    */
  var doseQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Encounter administered as part of
    */
  var encounter: js.UndefOr[Reference] = js.native
  /**
    * Vaccine expiration date
    */
  var expirationDate: js.UndefOr[date] = js.native
  /**
    * Administration/non-administration reasons
    */
  var explanation: js.UndefOr[ImmunizationExplanation] = js.native
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Where vaccination occurred
    */
  var location: js.UndefOr[Reference] = js.native
  /**
    * Vaccine lot number
    */
  var lotNumber: js.UndefOr[String] = js.native
  /**
    * Vaccine manufacturer
    */
  var manufacturer: js.UndefOr[Reference] = js.native
  /**
    * Flag for whether immunization was given
    */
  var notGiven: Boolean = js.native
  /**
    * Vaccination notes
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Who was immunized
    */
  var patient: Reference = js.native
  /**
    * Who performed event
    */
  var practitioner: js.UndefOr[js.Array[ImmunizationPractitioner]] = js.native
  /**
    * Indicates context the data was recorded in
    */
  var primarySource: Boolean = js.native
  /**
    * Details of a reaction that follows immunization
    */
  var reaction: js.UndefOr[js.Array[ImmunizationReaction]] = js.native
  /**
    * Indicates the source of a secondarily reported record
    */
  var reportOrigin: js.UndefOr[CodeableConcept] = js.native
  /**
    * How vaccine entered body
    */
  var route: js.UndefOr[CodeableConcept] = js.native
  /**
    * Body site vaccine  was administered
    */
  var site: js.UndefOr[CodeableConcept] = js.native
  /**
    * completed | entered-in-error
    */
  var status: code = js.native
  /**
    * What protocol was followed
    */
  var vaccinationProtocol: js.UndefOr[js.Array[ImmunizationVaccinationProtocol]] = js.native
  /**
    * Vaccine product administered
    */
  var vaccineCode: CodeableConcept = js.native
}

object Immunization {
  @scala.inline
  def apply(
    notGiven: Boolean,
    patient: Reference,
    primarySource: Boolean,
    status: code,
    vaccineCode: CodeableConcept
  ): Immunization = {
    val __obj = js.Dynamic.literal(notGiven = notGiven.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], primarySource = primarySource.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], vaccineCode = vaccineCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immunization]
  }
  @scala.inline
  implicit class ImmunizationOps[Self <: Immunization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotGiven(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notGiven")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatient(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimarySource(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primarySource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVaccineCode(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vaccineCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_date(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_date")(js.undefined)
        ret
    }
    @scala.inline
    def with_expirationDate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_expirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_expirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def with_lotNumber(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lotNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_lotNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lotNumber")(js.undefined)
        ret
    }
    @scala.inline
    def with_notGiven(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_notGiven")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_notGiven: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_notGiven")(js.undefined)
        ret
    }
    @scala.inline
    def with_primarySource(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_primarySource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_primarySource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_primarySource")(js.undefined)
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
    def withDate(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDoseQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doseQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoseQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doseQuantity")(js.undefined)
        ret
    }
    @scala.inline
    def withEncounter(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encounter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encounter")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationDate(value: date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withExplanation(value: ImmunizationExplanation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explanation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplanation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explanation")(js.undefined)
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
    def withLocation(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withLotNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lotNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLotNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lotNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withManufacturer(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(js.undefined)
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
    def withPractitioner(value: js.Array[ImmunizationPractitioner]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("practitioner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPractitioner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("practitioner")(js.undefined)
        ret
    }
    @scala.inline
    def withReaction(value: js.Array[ImmunizationReaction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reaction")(js.undefined)
        ret
    }
    @scala.inline
    def withReportOrigin(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withRoute(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(js.undefined)
        ret
    }
    @scala.inline
    def withSite(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site")(js.undefined)
        ret
    }
    @scala.inline
    def withVaccinationProtocol(value: js.Array[ImmunizationVaccinationProtocol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vaccinationProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVaccinationProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vaccinationProtocol")(js.undefined)
        ret
    }
  }
  
}

