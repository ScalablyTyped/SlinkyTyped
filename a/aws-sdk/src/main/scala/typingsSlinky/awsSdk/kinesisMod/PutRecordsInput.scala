package typingsSlinky.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRecordsInput extends StObject {
  
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
  implicit class PutRecordsInputMutableBuilder[Self <: PutRecordsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecords(value: PutRecordsRequestEntryList): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsVarargs(value: PutRecordsRequestEntry*): Self = StObject.set(x, "Records", js.Array(value :_*))
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
