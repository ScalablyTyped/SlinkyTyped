package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sample for analysis
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Specimen extends DomainResource {
  /**
    * Contains extended information for property 'receivedTime'.
    */
  var _receivedTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Identifier assigned by the lab
    */
  var accessionIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * Collection details
    */
  var collection: js.UndefOr[SpecimenCollection] = js.native
  /**
    * Direct container of specimen (tube/slide, etc.)
    */
  var container: js.UndefOr[js.Array[SpecimenContainer]] = js.native
  /**
    * External Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Comments
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * Specimen from which this specimen originated
    */
  var parent: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Processing and processing step details
    */
  var processing: js.UndefOr[js.Array[SpecimenProcessing]] = js.native
  /**
    * The time when specimen was received for processing
    */
  var receivedTime: js.UndefOr[dateTime] = js.native
  /**
    * Why the specimen was collected
    */
  var request: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * available | unavailable | unsatisfactory | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  /**
    * Where the specimen came from. This may be from the patient(s) or from the environment or a device
    */
  var subject: Reference = js.native
  /**
    * Kind of material that forms the specimen
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object Specimen {
  @scala.inline
  def apply(subject: Reference): Specimen = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Specimen]
  }
  @scala.inline
  implicit class SpecimenOps[Self <: Specimen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubject(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_receivedTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_receivedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_receivedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_receivedTime")(js.undefined)
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
    def withAccessionIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessionIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessionIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessionIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withCollection(value: SpecimenCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: js.Array[SpecimenContainer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
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
    def withParent(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessing(value: js.Array[SpecimenProcessing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processing")(js.undefined)
        ret
    }
    @scala.inline
    def withReceivedTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceivedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

