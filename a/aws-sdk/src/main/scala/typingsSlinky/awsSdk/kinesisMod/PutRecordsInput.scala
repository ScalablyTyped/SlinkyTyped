package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordsInput extends js.Object {
  /**
    * The records associated with the request.
    */
  var Records: PutRecordsRequestEntryList = js.native
  /**
    * The stream name associated with the request.
    */
  var StreamName: typingsSlinky.awsSdk.kinesisMod.StreamName = js.native
}

object PutRecordsInput {
  @scala.inline
  def apply(Records: PutRecordsRequestEntryList, StreamName: StreamName): PutRecordsInput = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordsInput]
  }
  @scala.inline
  implicit class PutRecordsInputOps[Self <: PutRecordsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecords(value: PutRecordsRequestEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamName(value: StreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

