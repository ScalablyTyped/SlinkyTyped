package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of images produced in single study (one or more series of references images)
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait ImagingStudy extends DomainResource {
  /**
    * Contains extended information for property 'availability'.
    */
  var _availability: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'numberOfInstances'.
    */
  var _numberOfInstances: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'numberOfSeries'.
    */
  var _numberOfSeries: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'started'.
    */
  var _started: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.native
  /**
    * Related workflow identifier ("Accession Number")
    */
  var accession: js.UndefOr[Identifier] = js.native
  /**
    * ONLINE | OFFLINE | NEARLINE | UNAVAILABLE
    */
  var availability: js.UndefOr[code] = js.native
  /**
    * Request fulfilled
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Originating context
    */
  var context: js.UndefOr[Reference] = js.native
  /**
    * Institution-generated description
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Study access endpoint
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Other identifiers for the study
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Who interpreted images
    */
  var interpreter: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * All series modality if actual acquisition modalities
    */
  var modalityList: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * Number of Study Related Instances
    */
  var numberOfInstances: js.UndefOr[unsignedInt] = js.native
  /**
    * Number of Study Related Series
    */
  var numberOfSeries: js.UndefOr[unsignedInt] = js.native
  /**
    * Who the images are of
    */
  var patient: Reference = js.native
  /**
    * The performed procedure code
    */
  var procedureCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * The performed Procedure reference
    */
  var procedureReference: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Why the study was requested
    */
  var reason: js.UndefOr[CodeableConcept] = js.native
  /**
    * Referring physician
    */
  var referrer: js.UndefOr[Reference] = js.native
  /**
    * Each study has one or more series of instances
    */
  var series: js.UndefOr[js.Array[ImagingStudySeries]] = js.native
  /**
    * When the study was started
    */
  var started: js.UndefOr[dateTime] = js.native
  /**
    * Formal DICOM identifier for the study
    */
  var uid: oid = js.native
}

object ImagingStudy {
  @scala.inline
  def apply(patient: Reference, uid: oid): ImagingStudy = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingStudy]
  }
  @scala.inline
  implicit class ImagingStudyOps[Self <: ImagingStudy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPatient(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: oid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_availability(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_availability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_availability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_availability")(js.undefined)
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
    def with_numberOfInstances(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numberOfInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_numberOfInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numberOfInstances")(js.undefined)
        ret
    }
    @scala.inline
    def with_numberOfSeries(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numberOfSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_numberOfSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numberOfSeries")(js.undefined)
        ret
    }
    @scala.inline
    def with_started(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_started: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_started")(js.undefined)
        ret
    }
    @scala.inline
    def with_uid(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_uid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uid")(js.undefined)
        ret
    }
    @scala.inline
    def withAccession(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accession")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailability(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availability")(js.undefined)
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
    def withEndpoint(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
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
    def withInterpreter(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpreter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpreter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpreter")(js.undefined)
        ret
    }
    @scala.inline
    def withModalityList(value: js.Array[Coding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalityList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModalityList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modalityList")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfInstances(value: unsignedInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfSeries(value: unsignedInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withProcedureCode(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procedureCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcedureCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procedureCode")(js.undefined)
        ret
    }
    @scala.inline
    def withProcedureReference(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procedureReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcedureReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procedureReference")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withReferrer(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[ImagingStudySeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withStarted(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(js.undefined)
        ret
    }
  }
  
}

