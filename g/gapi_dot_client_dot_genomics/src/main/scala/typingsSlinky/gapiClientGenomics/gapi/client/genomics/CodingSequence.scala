package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodingSequence extends js.Object {
  /**
    * The end of the coding sequence on this annotation's reference sequence,
    * 0-based exclusive. Note that this position is relative to the reference
    * start, and &#42;not&#42; the containing annotation start.
    */
  var end: js.UndefOr[String] = js.native
  /**
    * The start of the coding sequence on this annotation's reference sequence,
    * 0-based inclusive. Note that this position is relative to the reference
    * start, and &#42;not&#42; the containing annotation start.
    */
  var start: js.UndefOr[String] = js.native
}

object CodingSequence {
  @scala.inline
  def apply(): CodingSequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodingSequence]
  }
  @scala.inline
  implicit class CodingSequenceOps[Self <: CodingSequence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: String): Self = {
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
    def withStart(value: String): Self = {
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
  }
  
}

