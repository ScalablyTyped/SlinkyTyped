package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariantAnnotation extends js.Object {
  /**
    * The alternate allele for this variant. If multiple alternate alleles
    * exist at this location, create a separate variant for each one, as they
    * may represent distinct conditions.
    */
  var alternateBases: js.UndefOr[String] = js.native
  /**
    * Describes the clinical significance of a variant.
    * It is adapted from the ClinVar controlled vocabulary for clinical
    * significance described at:
    * http://www.ncbi.nlm.nih.gov/clinvar/docs/clinsig/
    */
  var clinicalSignificance: js.UndefOr[String] = js.native
  /**
    * The set of conditions associated with this variant.
    * A condition describes the way a variant influences human health.
    */
  var conditions: js.UndefOr[js.Array[ClinicalCondition]] = js.native
  /** Effect of the variant on the coding sequence. */
  var effect: js.UndefOr[String] = js.native
  /**
    * Google annotation ID of the gene affected by this variant. This should
    * be provided when the variant is created.
    */
  var geneId: js.UndefOr[String] = js.native
  /**
    * Google annotation IDs of the transcripts affected by this variant. These
    * should be provided when the variant is created.
    */
  var transcriptIds: js.UndefOr[js.Array[String]] = js.native
  /** Type has been adapted from ClinVar's list of variant types. */
  var `type`: js.UndefOr[String] = js.native
}

object VariantAnnotation {
  @scala.inline
  def apply(): VariantAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariantAnnotation]
  }
  @scala.inline
  implicit class VariantAnnotationOps[Self <: VariantAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternateBases(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateBases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlternateBases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternateBases")(js.undefined)
        ret
    }
    @scala.inline
    def withClinicalSignificance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clinicalSignificance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClinicalSignificance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clinicalSignificance")(js.undefined)
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[ClinicalCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withEffect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geneId")(js.undefined)
        ret
    }
    @scala.inline
    def withTranscriptIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcriptIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscriptIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcriptIds")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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

