package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Read extends js.Object {
  /**
    * The quality of the read sequence contained in this alignment record
    * (equivalent to QUAL in SAM).
    * `alignedSequence` and `alignedQuality` may be shorter than the full read
    * sequence and quality. This will occur if the alignment is part of a
    * chimeric alignment, or if the read was trimmed. When this occurs, the CIGAR
    * for this read will begin/end with a hard clip operator that will indicate
    * the length of the excised sequence.
    */
  var alignedQuality: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The bases of the read sequence contained in this alignment record,
    * &#42;&#42;without CIGAR operations applied&#42;&#42; (equivalent to SEQ in SAM).
    * `alignedSequence` and `alignedQuality` may be
    * shorter than the full read sequence and quality. This will occur if the
    * alignment is part of a chimeric alignment, or if the read was trimmed. When
    * this occurs, the CIGAR for this read will begin/end with a hard clip
    * operator that will indicate the length of the excised sequence.
    */
  var alignedSequence: js.UndefOr[String] = js.native
  /**
    * The linear alignment for this alignment record. This field is null for
    * unmapped reads.
    */
  var alignment: js.UndefOr[LinearAlignment] = js.native
  /** The fragment is a PCR or optical duplicate (SAM flag 0x400). */
  var duplicateFragment: js.UndefOr[Boolean] = js.native
  /**
    * Whether this read did not pass filters, such as platform or vendor quality
    * controls (SAM flag 0x200).
    */
  var failedVendorQualityChecks: js.UndefOr[Boolean] = js.native
  /** The observed length of the fragment, equivalent to TLEN in SAM. */
  var fragmentLength: js.UndefOr[Double] = js.native
  /** The fragment name. Equivalent to QNAME (query template name) in SAM. */
  var fragmentName: js.UndefOr[String] = js.native
  /**
    * The server-generated read ID, unique across all reads. This is different
    * from the `fragmentName`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A map of additional read alignment information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.native
  /**
    * The mapping of the primary alignment of the
    * `(readNumber+1)%numberReads` read in the fragment. It replaces
    * mate position and mate strand in SAM.
    */
  var nextMatePosition: js.UndefOr[Position] = js.native
  /** The number of reads in the fragment (extension to SAM flag 0x1). */
  var numberReads: js.UndefOr[Double] = js.native
  /**
    * The orientation and the distance between reads from the fragment are
    * consistent with the sequencing protocol (SAM flag 0x2).
    */
  var properPlacement: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the read group this read belongs to. A read belongs to exactly
    * one read group. This is a server-generated ID which is distinct from SAM's
    * RG tag (for that value, see
    * ReadGroup.name).
    */
  var readGroupId: js.UndefOr[String] = js.native
  /**
    * The ID of the read group set this read belongs to. A read belongs to
    * exactly one read group set.
    */
  var readGroupSetId: js.UndefOr[String] = js.native
  /**
    * The read number in sequencing. 0-based and less than numberReads. This
    * field replaces SAM flag 0x40 and 0x80.
    */
  var readNumber: js.UndefOr[Double] = js.native
  /**
    * Whether this alignment is secondary. Equivalent to SAM flag 0x100.
    * A secondary alignment represents an alternative to the primary alignment
    * for this read. Aligners may return secondary alignments if a read can map
    * ambiguously to multiple coordinates in the genome. By convention, each read
    * has one and only one alignment where both `secondaryAlignment`
    * and `supplementaryAlignment` are false.
    */
  var secondaryAlignment: js.UndefOr[Boolean] = js.native
  /**
    * Whether this alignment is supplementary. Equivalent to SAM flag 0x800.
    * Supplementary alignments are used in the representation of a chimeric
    * alignment. In a chimeric alignment, a read is split into multiple
    * linear alignments that map to different reference contigs. The first
    * linear alignment in the read will be designated as the representative
    * alignment; the remaining linear alignments will be designated as
    * supplementary alignments. These alignments may have different mapping
    * quality scores. In each linear alignment in a chimeric alignment, the read
    * will be hard clipped. The `alignedSequence` and
    * `alignedQuality` fields in the alignment record will only
    * represent the bases for its respective linear alignment.
    */
  var supplementaryAlignment: js.UndefOr[Boolean] = js.native
}

object Read {
  @scala.inline
  def apply(): Read = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Read]
  }
  @scala.inline
  implicit class ReadOps[Self <: Read] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignedQuality(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignedQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignedQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignedQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignedSequence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignedSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignedSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignedSequence")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignment(value: LinearAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicateFragment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateFragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicateFragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateFragment")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedVendorQualityChecks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedVendorQualityChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedVendorQualityChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedVendorQualityChecks")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentLength")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentName")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withNextMatePosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMatePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMatePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMatePosition")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberReads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberReads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberReads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberReads")(js.undefined)
        ret
    }
    @scala.inline
    def withProperPlacement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withReadGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withReadGroupSetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readGroupSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadGroupSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readGroupSetId")(js.undefined)
        ret
    }
    @scala.inline
    def withReadNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryAlignment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withSupplementaryAlignment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supplementaryAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupplementaryAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supplementaryAlignment")(js.undefined)
        ret
    }
  }
  
}

