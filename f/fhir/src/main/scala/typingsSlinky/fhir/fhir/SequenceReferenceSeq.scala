package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A sequence used as reference
  */
@js.native
trait SequenceReferenceSeq extends BackboneElement {
  /**
    * Contains extended information for property 'genomeBuild'.
    */
  var _genomeBuild: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'referenceSeqString'.
    */
  var _referenceSeqString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'strand'.
    */
  var _strand: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'windowEnd'.
    */
  var _windowEnd: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'windowStart'.
    */
  var _windowStart: js.UndefOr[Element] = js.native
  /**
    * Chromosome containing genetic finding
    */
  var chromosome: js.UndefOr[CodeableConcept] = js.native
  /**
    * The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'
    */
  var genomeBuild: js.UndefOr[String] = js.native
  /**
    * Reference identifier
    */
  var referenceSeqId: js.UndefOr[CodeableConcept] = js.native
  /**
    * A Pointer to another Sequence entity as reference sequence
    */
  var referenceSeqPointer: js.UndefOr[Reference] = js.native
  /**
    * A string to represent reference sequence
    */
  var referenceSeqString: js.UndefOr[String] = js.native
  /**
    * Directionality of DNA ( +1/-1)
    */
  var strand: js.UndefOr[integer] = js.native
  /**
    * End position of the window on the reference sequence
    */
  var windowEnd: integer = js.native
  /**
    * Start position of the window on the  reference sequence
    */
  var windowStart: integer = js.native
}

object SequenceReferenceSeq {
  @scala.inline
  def apply(windowEnd: integer, windowStart: integer): SequenceReferenceSeq = {
    val __obj = js.Dynamic.literal(windowEnd = windowEnd.asInstanceOf[js.Any], windowStart = windowStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceReferenceSeq]
  }
  @scala.inline
  implicit class SequenceReferenceSeqOps[Self <: SequenceReferenceSeq] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWindowEnd(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowStart(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_genomeBuild(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_genomeBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_genomeBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_genomeBuild")(js.undefined)
        ret
    }
    @scala.inline
    def with_referenceSeqString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_referenceSeqString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_referenceSeqString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_referenceSeqString")(js.undefined)
        ret
    }
    @scala.inline
    def with_strand(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_strand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_strand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_strand")(js.undefined)
        ret
    }
    @scala.inline
    def with_windowEnd(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_windowEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_windowEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_windowEnd")(js.undefined)
        ret
    }
    @scala.inline
    def with_windowStart(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_windowStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_windowStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_windowStart")(js.undefined)
        ret
    }
    @scala.inline
    def withChromosome(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromosome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromosome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromosome")(js.undefined)
        ret
    }
    @scala.inline
    def withGenomeBuild(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genomeBuild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenomeBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genomeBuild")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceSeqId(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSeqId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceSeqId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSeqId")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceSeqPointer(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSeqPointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceSeqPointer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSeqPointer")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceSeqString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSeqString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceSeqString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSeqString")(js.undefined)
        ret
    }
    @scala.inline
    def withStrand(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strand")(js.undefined)
        ret
    }
  }
  
}

