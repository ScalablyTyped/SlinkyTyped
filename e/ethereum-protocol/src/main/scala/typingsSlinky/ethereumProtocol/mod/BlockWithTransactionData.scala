package typingsSlinky.ethereumProtocol.mod

import typingsSlinky.bignumberJs.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockWithTransactionData extends AbstractBlock {
  
  var transactions: js.Array[Transaction] = js.native
}
object BlockWithTransactionData {
  
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
    transactions: js.Array[Transaction],
    transactionsRoot: String,
    uncles: js.Array[String]
  ): BlockWithTransactionData = {
    val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], transactionsRoot = transactionsRoot.asInstanceOf[js.Any], uncles = uncles.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockWithTransactionData]
  }
  
  @scala.inline
  implicit class BlockWithTransactionDataMutableBuilder[Self <: BlockWithTransactionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransactions(value: js.Array[Transaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionsVarargs(value: Transaction*): Self = StObject.set(x, "transactions", js.Array(value :_*))
  }
}
