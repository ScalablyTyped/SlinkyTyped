package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transcript extends js.Object {
  /**
    * The range of the coding sequence for this transcript, if any. To determine
    * the exact ranges of coding sequence, intersect this range with those of the
    * exons, if any. If there are any
    * exons, the
    * codingSequence must start
    * and end within them.
    *
    * Note that in some cases, the reference genome will not exactly match the
    * observed mRNA transcript e.g. due to variance in the source genome from
    * reference. In these cases,
    * exon.frame will not necessarily
    * match the expected reference reading frame and coding exon reference bases
    * cannot necessarily be concatenated to produce the original transcript mRNA.
    */
  var codingSequence: js.UndefOr[CodingSequence] = js.native
  /**
    * The <a href="http://en.wikipedia.org/wiki/Exon">exons</a> that compose
    * this transcript. This field should be unset for genomes where transcript
    * splicing does not occur, for example prokaryotes.
    *
    * Introns are regions of the transcript that are not included in the
    * spliced RNA product. Though not explicitly modeled here, intron ranges can
    * be deduced; all regions of this transcript that are not exons are introns.
    *
    * Exonic sequences do not necessarily code for a translational product
    * (amino acids). Only the regions of exons bounded by the
    * codingSequence correspond
    * to coding DNA sequence.
    *
    * Exons are ordered by start position and may not overlap.
    */
  var exons: js.UndefOr[js.Array[Exon]] = js.native
  /** The annotation ID of the gene from which this transcript is transcribed. */
  var geneId: js.UndefOr[String] = js.native
}

object Transcript {
  @scala.inline
  def apply(): Transcript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transcript]
  }
  @scala.inline
  implicit class TranscriptOps[Self <: Transcript] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodingSequence(value: CodingSequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codingSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodingSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codingSequence")(js.undefined)
        ret
    }
    @scala.inline
    def withExons(value: js.Array[Exon]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exons")(js.undefined)
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
  }
  
}

