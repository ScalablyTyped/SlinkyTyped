package typingsSlinky.ethereumProtocol.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogEntry extends js.Object {
  
  var address: String = js.native
  
  var blockHash: String | Null = js.native
  
  var blockNumber: Double | Null = js.native
  
  var data: String = js.native
  
  var logIndex: Double | Null = js.native
  
  var topics: js.Array[String] = js.native
  
  var transactionHash: String = js.native
  
  var transactionIndex: Double | Null = js.native
}
object LogEntry {
  
  @scala.inline
  def apply(address: String, data: String, topics: js.Array[String], transactionHash: String): LogEntry = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntry]
  }
  
  @scala.inline
  implicit class LogEntryOps[Self <: LogEntry] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsVarargs(value: String*): Self = this.set("topics", js.Array(value :_*))
    
    @scala.inline
    def setTopics(value: js.Array[String]): Self = this.set("topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionHash(value: String): Self = this.set("transactionHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockHash(value: String): Self = this.set("blockHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockHashNull: Self = this.set("blockHash", null)
    
    @scala.inline
    def setBlockNumber(value: Double): Self = this.set("blockNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockNumberNull: Self = this.set("blockNumber", null)
    
    @scala.inline
    def setLogIndex(value: Double): Self = this.set("logIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogIndexNull: Self = this.set("logIndex", null)
    
    @scala.inline
    def setTransactionIndex(value: Double): Self = this.set("transactionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIndexNull: Self = this.set("transactionIndex", null)
  }
}
