package typingsSlinky.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeJournalKinesisStreamRequest extends StObject {
  
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
  implicit class DescribeJournalKinesisStreamRequestMutableBuilder[Self <: DescribeJournalKinesisStreamRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLedgerName(value: LedgerName): Self = StObject.set(x, "LedgerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: UniqueId): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
  }
}
