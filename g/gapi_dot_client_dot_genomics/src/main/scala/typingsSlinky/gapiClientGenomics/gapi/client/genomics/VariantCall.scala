package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariantCall extends js.Object {
  /** The ID of the call set this variant call belongs to. */
  var callSetId: js.UndefOr[String] = js.native
  /** The name of the call set this variant call belongs to. */
  var callSetName: js.UndefOr[String] = js.native
  /**
    * The genotype of this variant call. Each value represents either the value
    * of the `referenceBases` field or a 1-based index into
    * `alternateBases`. If a variant had a `referenceBases`
    * value of `T` and an `alternateBases`
    * value of `["A", "C"]`, and the `genotype` was
    * `[2, 1]`, that would mean the call
    * represented the heterozygous value `CA` for this variant.
    * If the `genotype` was instead `[0, 1]`, the
    * represented value would be `TA`. Ordering of the
    * genotype values is important if the `phaseset` is present.
    * If a genotype is not called (that is, a `.` is present in the
    * GT string) -1 is returned.
    */
  var genotype: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The genotype likelihoods for this variant call. Each array entry
    * represents how likely a specific genotype is for this call. The value
    * ordering is defined by the GL tag in the VCF spec.
    * If Phred-scaled genotype likelihood scores (PL) are available and
    * log10(P) genotype likelihood scores (GL) are not, PL scores are converted
    * to GL scores.  If both are available, PL scores are stored in `info`.
    */
  var genotypeLikelihood: js.UndefOr[js.Array[Double]] = js.native
  /**
    * A map of additional variant call information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.native
  /**
    * If this field is present, this variant call's genotype ordering implies
    * the phase of the bases and is consistent with any other variant calls in
    * the same reference sequence which have the same phaseset value.
    * When importing data from VCF, if the genotype data was phased but no
    * phase set was specified this field will be set to `&#42;`.
    */
  var phaseset: js.UndefOr[String] = js.native
}

object VariantCall {
  @scala.inline
  def apply(): VariantCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariantCall]
  }
  @scala.inline
  implicit class VariantCallOps[Self <: VariantCall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallSetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callSetId")(js.undefined)
        ret
    }
    @scala.inline
    def withCallSetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callSetName")(js.undefined)
        ret
    }
    @scala.inline
    def withGenotype(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genotype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenotype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genotype")(js.undefined)
        ret
    }
    @scala.inline
    def withGenotypeLikelihood(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genotypeLikelihood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenotypeLikelihood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genotypeLikelihood")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: Record[String, js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withPhaseset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhaseset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phaseset")(js.undefined)
        ret
    }
  }
  
}

