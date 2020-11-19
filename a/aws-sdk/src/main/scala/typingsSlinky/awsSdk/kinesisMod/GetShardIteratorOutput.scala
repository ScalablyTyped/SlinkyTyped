package typingsSlinky.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetShardIteratorOutput extends js.Object {
  
  /**
    * The position in the shard from which to start reading data records sequentially. A shard iterator specifies this position using the sequence number of a data record in a shard.
    */
  var ShardIterator: js.UndefOr[typingsSlinky.awsSdk.kinesisMod.ShardIterator] = js.native
}
object GetShardIteratorOutput {
  
  @scala.inline
  def apply(): GetShardIteratorOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetShardIteratorOutput]
  }
  
  @scala.inline
  implicit class GetShardIteratorOutputOps[Self <: GetShardIteratorOutput] (val x: Self) extends AnyVal {
    
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
    def setShardIterator(value: ShardIterator): Self = this.set("ShardIterator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShardIterator: Self = this.set("ShardIterator", js.undefined)
  }
}
