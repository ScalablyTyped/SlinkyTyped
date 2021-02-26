package typingsSlinky.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRecordsInput extends StObject {
  
  /**
    * The maximum number of records to return. Specify a value of up to 10,000. If you specify a value that is greater than 10,000, GetRecords throws InvalidArgumentException. The default value is 10,000.
    */
  var Limit: js.UndefOr[GetRecordsInputLimit] = js.native
  
  /**
    * The position in the shard from which you want to start sequentially reading data records. A shard iterator specifies this position using the sequence number of a data record in the shard.
    */
  var ShardIterator: typingsSlinky.awsSdk.kinesisMod.ShardIterator = js.native
}
object GetRecordsInput {
  
  @scala.inline
  def apply(ShardIterator: ShardIterator): GetRecordsInput = {
    val __obj = js.Dynamic.literal(ShardIterator = ShardIterator.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecordsInput]
  }
  
  @scala.inline
  implicit class GetRecordsInputMutableBuilder[Self <: GetRecordsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: GetRecordsInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setShardIterator(value: ShardIterator): Self = StObject.set(x, "ShardIterator", value.asInstanceOf[js.Any])
  }
}
