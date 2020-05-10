package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a biological sequence
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Sequence extends DomainResource {
  /**
    * Contains extended information for property 'coordinateSystem'.
    */
  var _coordinateSystem: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'observedSeq'.
    */
  var _observedSeq: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'readCoverage'.
    */
  var _readCoverage: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Base number of coordinate system (0 for 0-based numbering or coordinates, inclusive start, exclusive end, 1 for 1-based numbering, inclusive start, inclusive end)
    */
  var coordinateSystem: integer = js.native
  /**
    * The method for sequencing
    */
  var device: js.UndefOr[Reference] = js.native
  /**
    * Unique ID for this particular sequence. This is a FHIR-defined id
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Sequence that was observed
    */
  var observedSeq: js.UndefOr[String] = js.native
  /**
    * Who and/or what this is about
    */
  var patient: js.UndefOr[Reference] = js.native
  /**
    * Who should be responsible for test result
    */
  var performer: js.UndefOr[Reference] = js.native
  /**
    * Pointer to next atomic sequence
    */
  var pointer: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * An set of value as quality of sequence
    */
  var quality: js.UndefOr[js.Array[SequenceQuality]] = js.native
  /**
    * The number of copies of the seqeunce of interest.  (RNASeq)
    */
  var quantity: js.UndefOr[Quantity] = js.native
  /**
    * Average number of reads representing a given nucleotide in the reconstructed sequence
    */
  var readCoverage: js.UndefOr[integer] = js.native
  /**
    * A sequence used as reference
    */
  var referenceSeq: js.UndefOr[SequenceReferenceSeq] = js.native
  /**
    * External repository which contains detailed report related with observedSeq in this resource
    */
  var repository: js.UndefOr[js.Array[SequenceRepository]] = js.native
  /**
    * Specimen used for sequencing
    */
  var specimen: js.UndefOr[Reference] = js.native
  /**
    * aa | dna | rna
    */
  var `type`: js.UndefOr[code] = js.native
  /**
    * Variant in sequence
    */
  var variant: js.UndefOr[js.Array[SequenceVariant]] = js.native
}

object Sequence {
  @scala.inline
  def apply(coordinateSystem: integer): Sequence = {
    val __obj = js.Dynamic.literal(coordinateSystem = coordinateSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sequence]
  }
  @scala.inline
  implicit class SequenceOps[Self <: Sequence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinateSystem(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinateSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_coordinateSystem(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_coordinateSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_coordinateSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_coordinateSystem")(js.undefined)
        ret
    }
    @scala.inline
    def with_observedSeq(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_observedSeq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_observedSeq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_observedSeq")(js.undefined)
        ret
    }
    @scala.inline
    def with_readCoverage(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_readCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_readCoverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_readCoverage")(js.undefined)
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
    def withObservedSeq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedSeq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObservedSeq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedSeq")(js.undefined)
        ret
    }
    @scala.inline
    def withPatient(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patient")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformer(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performer")(js.undefined)
        ret
    }
    @scala.inline
    def withPointer(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: js.Array[SequenceQuality]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withReadCoverage(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readCoverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadCoverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readCoverage")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceSeq(value: SequenceReferenceSeq): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSeq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceSeq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSeq")(js.undefined)
        ret
    }
    @scala.inline
    def withRepository(value: js.Array[SequenceRepository]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepository: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecimen(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specimen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecimen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specimen")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: code): Self = {
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
    @scala.inline
    def withVariant(value: js.Array[SequenceVariant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(js.undefined)
        ret
    }
  }
  
}

