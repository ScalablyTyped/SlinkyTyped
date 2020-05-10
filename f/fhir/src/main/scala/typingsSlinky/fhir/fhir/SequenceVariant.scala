package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Variant in sequence
  */
@js.native
trait SequenceVariant extends BackboneElement {
  /**
    * Contains extended information for property 'cigar'.
    */
  var _cigar: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'observedAllele'.
    */
  var _observedAllele: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'referenceAllele'.
    */
  var _referenceAllele: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.native
  /**
    * Extended CIGAR string for aligning the sequence with reference bases
    */
  var cigar: js.UndefOr[String] = js.native
  /**
    * End position of the variant on the reference sequence
    */
  var end: js.UndefOr[integer] = js.native
  /**
    * Allele that was observed
    */
  var observedAllele: js.UndefOr[String] = js.native
  /**
    * Allele in the reference sequence
    */
  var referenceAllele: js.UndefOr[String] = js.native
  /**
    * Start position of the variant on the  reference sequence
    */
  var start: js.UndefOr[integer] = js.native
  /**
    * Pointer to observed variant information
    */
  var variantPointer: js.UndefOr[Reference] = js.native
}

object SequenceVariant {
  @scala.inline
  def apply(): SequenceVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceVariant]
  }
  @scala.inline
  implicit class SequenceVariantOps[Self <: SequenceVariant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_cigar(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cigar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_cigar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cigar")(js.undefined)
        ret
    }
    @scala.inline
    def with_end(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_end")(js.undefined)
        ret
    }
    @scala.inline
    def with_observedAllele(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_observedAllele")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_observedAllele: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_observedAllele")(js.undefined)
        ret
    }
    @scala.inline
    def with_referenceAllele(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_referenceAllele")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_referenceAllele: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_referenceAllele")(js.undefined)
        ret
    }
    @scala.inline
    def with_start(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_start: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_start")(js.undefined)
        ret
    }
    @scala.inline
    def withCigar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cigar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCigar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cigar")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withObservedAllele(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedAllele")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObservedAllele: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedAllele")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceAllele(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceAllele")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceAllele: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceAllele")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withVariantPointer(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantPointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariantPointer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantPointer")(js.undefined)
        ret
    }
  }
  
}

