package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearAlignment extends js.Object {
  /**
    * Represents the local alignment of this sequence (alignment matches, indels,
    * etc) against the reference.
    */
  var cigar: js.UndefOr[js.Array[CigarUnit]] = js.native
  /**
    * The mapping quality of this alignment. Represents how likely
    * the read maps to this position as opposed to other locations.
    *
    * Specifically, this is -10 log10 Pr(mapping position is wrong), rounded to
    * the nearest integer.
    */
  var mappingQuality: js.UndefOr[Double] = js.native
  /** The position of this alignment. */
  var position: js.UndefOr[Position] = js.native
}

object LinearAlignment {
  @scala.inline
  def apply(): LinearAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearAlignment]
  }
  @scala.inline
  implicit class LinearAlignmentOps[Self <: LinearAlignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCigar(value: js.Array[CigarUnit]): Self = {
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
    def withMappingQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappingQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMappingQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappingQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

