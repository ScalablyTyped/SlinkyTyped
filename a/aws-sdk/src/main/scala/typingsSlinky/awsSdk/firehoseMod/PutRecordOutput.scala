package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordOutput extends js.Object {
  /**
    * Indicates whether server-side encryption (SSE) was enabled during this operation.
    */
  var Encrypted: js.UndefOr[BooleanObject] = js.native
  /**
    * The ID of the record.
    */
  var RecordId: PutResponseRecordId = js.native
}

object PutRecordOutput {
  @scala.inline
  def apply(RecordId: PutResponseRecordId): PutRecordOutput = {
    val __obj = js.Dynamic.literal(RecordId = RecordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordOutput]
  }
  @scala.inline
  implicit class PutRecordOutputOps[Self <: PutRecordOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordId(value: PutResponseRecordId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncrypted(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(js.undefined)
        ret
    }
  }
  
}

