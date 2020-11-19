package typingsSlinky.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJournalKinesisStreamRequest extends js.Object {
  
  /**
    * The name of the ledger.
    */
  var LedgerName: typingsSlinky.awsSdk.qldbMod.LedgerName = js.native
  
  /**
    * The unique ID that QLDB assigns to each QLDB journal stream.
    */
  var StreamId: UniqueId = js.native
}
object DescribeJournalKinesisStreamRequest {
  
  @scala.inline
  def apply(LedgerName: LedgerName, StreamId: UniqueId): DescribeJournalKinesisStreamRequest = {
    val __obj = js.Dynamic.literal(LedgerName = LedgerName.asInstanceOf[js.Any], StreamId = StreamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJournalKinesisStreamRequest]
  }
  
  @scala.inline
  implicit class DescribeJournalKinesisStreamRequestOps[Self <: DescribeJournalKinesisStreamRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLedgerName(value: LedgerName): Self = this.set("LedgerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: UniqueId): Self = this.set("StreamId", value.asInstanceOf[js.Any])
  }
}
