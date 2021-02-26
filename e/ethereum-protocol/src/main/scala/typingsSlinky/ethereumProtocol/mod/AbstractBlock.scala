package typingsSlinky.ethereumProtocol.mod

import typingsSlinky.bignumberJs.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractBlock extends StObject {
  
  var difficulty: default = js.native
  
  var extraData: String = js.native
  
  var gasLimit: Double = js.native
  
  var gasUsed: Double = js.native
  
  var hash: String | Null = js.native
  
  var logsBloom: String | Null = js.native
  
  var miner: String = js.native
  
  var nonce: String | Null = js.native
  
  var number: Double | Null = js.native
  
  var parentHash: String = js.native
  
  var sha3Uncles: String = js.native
  
  var size: Double = js.native
  
  var stateRoot: String = js.native
  
  var timestamp: Double = js.native
  
  var totalDifficulty: default = js.native
  
  var transactionsRoot: String = js.native
  
  var uncles: js.Array[String] = js.native
}
object AbstractBlock {
  
  @scala.inline
  def apply(
    difficulty: default,
    extraData: String,
    gasLimit: Double,
    gasUsed: Double,
    miner: String,
    parentHash: String,
    sha3Uncles: String,
    size: Double,
    stateRoot: String,
    timestamp: Double,
    totalDifficulty: default,
    transactionsRoot: String,
    uncles: js.Array[String]
  ): AbstractBlock = {
    val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty.asInstanceOf[js.Any], transactionsRoot = transactionsRoot.asInstanceOf[js.Any], uncles = uncles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractBlock]
  }
  
  @scala.inline
  implicit class AbstractBlockMutableBuilder[Self <: AbstractBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDifficulty(value: default): Self = StObject.set(x, "difficulty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraData(value: String): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasLimit(value: Double): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasUsed(value: Double): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashNull: Self = StObject.set(x, "hash", null)
    
    @scala.inline
    def setLogsBloom(value: String): Self = StObject.set(x, "logsBloom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsBloomNull: Self = StObject.set(x, "logsBloom", null)
    
    @scala.inline
    def setMiner(value: String): Self = StObject.set(x, "miner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceNull: Self = StObject.set(x, "nonce", null)
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberNull: Self = StObject.set(x, "number", null)
    
    @scala.inline
    def setParentHash(value: String): Self = StObject.set(x, "parentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha3Uncles(value: String): Self = StObject.set(x, "sha3Uncles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateRoot(value: String): Self = StObject.set(x, "stateRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalDifficulty(value: default): Self = StObject.set(x, "totalDifficulty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionsRoot(value: String): Self = StObject.set(x, "transactionsRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncles(value: js.Array[String]): Self = StObject.set(x, "uncles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnclesVarargs(value: String*): Self = StObject.set(x, "uncles", js.Array(value :_*))
  }
}
