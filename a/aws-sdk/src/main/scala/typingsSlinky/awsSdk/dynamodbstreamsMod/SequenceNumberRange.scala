package typingsSlinky.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceNumberRange extends js.Object {
  /**
    * The last sequence number.
    */
  var EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.native
  /**
    * The first sequence number.
    */
  var StartingSequenceNumber: js.UndefOr[SequenceNumber] = js.native
}

object SequenceNumberRange {
  @scala.inline
  def apply(): SequenceNumberRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceNumberRange]
  }
  @scala.inline
  implicit class SequenceNumberRangeOps[Self <: SequenceNumberRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withStartingSequenceNumber(value: SequenceNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartingSequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingSequenceNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartingSequenceNumber")(js.undefined)
        ret
    }
  }
  
}

