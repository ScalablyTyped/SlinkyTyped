package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceNumberRange extends js.Object {
  /**
    * The ending sequence number for the range. Shards that are in the OPEN state have an ending sequence number of null.
    */
  var EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.native
  /**
    * The starting sequence number for the range.
    */
  var StartingSequenceNumber: SequenceNumber = js.native
}

object SequenceNumberRange {
  @scala.inline
  def apply(StartingSequenceNumber: SequenceNumber): SequenceNumberRange = {
    val __obj = js.Dynamic.literal(StartingSequenceNumber = StartingSequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceNumberRange]
  }
  @scala.inline
  implicit class SequenceNumberRangeOps[Self <: SequenceNumberRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartingSequenceNumber(value: SequenceNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartingSequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndingSequenceNumber(value: SequenceNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndingSequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndingSequenceNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndingSequenceNumber")(js.undefined)
        ret
    }
  }
  
}

