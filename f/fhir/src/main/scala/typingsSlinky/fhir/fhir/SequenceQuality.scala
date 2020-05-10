package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An set of value as quality of sequence
  */
@js.native
trait SequenceQuality extends BackboneElement {
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'fScore'.
    */
  var _fScore: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'gtFP'.
    */
  var _gtFP: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'precision'.
    */
  var _precision: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'queryFP'.
    */
  var _queryFP: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'queryTP'.
    */
  var _queryTP: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'recall'.
    */
  var _recall: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'truthFN'.
    */
  var _truthFN: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'truthTP'.
    */
  var _truthTP: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * End position of the sequence
    */
  var end: js.UndefOr[integer] = js.native
  /**
    * F-score
    */
  var fScore: js.UndefOr[decimal] = js.native
  /**
    * False positives where the non-REF alleles in the Truth and Query Call Sets match
    */
  var gtFP: js.UndefOr[decimal] = js.native
  /**
    * Method to get quality
    */
  var method: js.UndefOr[CodeableConcept] = js.native
  /**
    * Precision of comparison
    */
  var precision: js.UndefOr[decimal] = js.native
  /**
    * False positives
    */
  var queryFP: js.UndefOr[decimal] = js.native
  /**
    * True positives from the perspective of the query data
    */
  var queryTP: js.UndefOr[decimal] = js.native
  /**
    * Recall of comparison
    */
  var recall: js.UndefOr[decimal] = js.native
  /**
    * Quality score for the comparison
    */
  var score: js.UndefOr[Quantity] = js.native
  /**
    * Standard sequence for comparison
    */
  var standardSequence: js.UndefOr[CodeableConcept] = js.native
  /**
    * Start position of the sequence
    */
  var start: js.UndefOr[integer] = js.native
  /**
    * False negatives
    */
  var truthFN: js.UndefOr[decimal] = js.native
  /**
    * True positives from the perspective of the truth data
    */
  var truthTP: js.UndefOr[decimal] = js.native
  /**
    * indel | snp | unknown
    */
  var `type`: code = js.native
}

object SequenceQuality {
  @scala.inline
  def apply(`type`: code): SequenceQuality = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceQuality]
  }
  @scala.inline
  implicit class SequenceQualityOps[Self <: SequenceQuality] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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
    def with_fScore(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_fScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_fScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_fScore")(js.undefined)
        ret
    }
    @scala.inline
    def with_gtFP(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gtFP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_gtFP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gtFP")(js.undefined)
        ret
    }
    @scala.inline
    def with_precision(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_precision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_precision")(js.undefined)
        ret
    }
    @scala.inline
    def with_queryFP(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_queryFP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_queryFP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_queryFP")(js.undefined)
        ret
    }
    @scala.inline
    def with_queryTP(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_queryTP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_queryTP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_queryTP")(js.undefined)
        ret
    }
    @scala.inline
    def with_recall(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_recall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_recall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_recall")(js.undefined)
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
    def with_truthFN(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_truthFN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_truthFN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_truthFN")(js.undefined)
        ret
    }
    @scala.inline
    def with_truthTP(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_truthTP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_truthTP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_truthTP")(js.undefined)
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
    def withFScore(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fScore")(js.undefined)
        ret
    }
    @scala.inline
    def withGtFP(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gtFP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGtFP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gtFP")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryFP(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryFP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFP")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryTP(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryTP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryTP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryTP")(js.undefined)
        ret
    }
    @scala.inline
    def withRecall(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recall")(js.undefined)
        ret
    }
    @scala.inline
    def withScore(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardSequence(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardSequence")(js.undefined)
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
    def withTruthFN(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truthFN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruthFN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truthFN")(js.undefined)
        ret
    }
    @scala.inline
    def withTruthTP(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truthTP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruthTP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truthTP")(js.undefined)
        ret
    }
  }
  
}

