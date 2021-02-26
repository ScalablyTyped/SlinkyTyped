package typingsSlinky.ethersprojectAbstractProvider

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ethersprojectAbstractProvider.anon.DeferrableTransactionRequ
import typingsSlinky.ethersprojectBignumber.bignumberMod.BigNumberish
import typingsSlinky.ethersprojectBignumber.mod.BigNumber
import typingsSlinky.ethersprojectBytes.mod.BytesLike
import typingsSlinky.ethersprojectNetworks.typesMod.Network
import typingsSlinky.ethersprojectProperties.mod.Description
import typingsSlinky.ethersprojectTransactions.mod.Transaction
import typingsSlinky.ethersprojectWeb.mod.OnceBlockable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/abstract-provider", "BlockForkEvent")
  @js.native
  class BlockForkEvent protected () extends ForkEvent {
    def this(blockHash: String) = this()
    def this(blockHash: String, expiry: Double) = this()
    
    val _isBlockForkEvent: js.UndefOr[Boolean] = js.native
    
    val blockHash: String = js.native
  }
  
  @JSImport("@ethersproject/abstract-provider", "ForkEvent")
  @js.native
  abstract class ForkEvent protected ()
    extends Description[js.Any]
       with _EventType {
    def this(info: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: any[K]}
      */ typingsSlinky.ethersprojectAbstractProvider.ethersprojectAbstractProviderStrings.ForkEvent with TopLevel[js.Any]) = this()
    
    val _isForkEvent: js.UndefOr[Boolean] = js.native
    
    val expiry: Double = js.native
  }
  /* static members */
  object ForkEvent {
    
    @JSImport("@ethersproject/abstract-provider", "ForkEvent.isForkEvent")
    @js.native
    def isForkEvent(value: js.Any): /* is @ethersproject/abstract-provider.@ethersproject/abstract-provider.ForkEvent */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abstract-provider", "Provider")
  @js.native
  abstract class Provider () extends OnceBlockable {
    
    val _isProvider: Boolean = js.native
    
    def addListener(eventName: EventType, listener: Listener): Provider = js.native
    
    def call(transaction: DeferrableTransactionRequ): js.Promise[String] = js.native
    def call(transaction: DeferrableTransactionRequ, blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
    def call(transaction: DeferrableTransactionRequ, blockTag: BlockTag): js.Promise[String] = js.native
    
    def emit(eventName: EventType, args: js.Any*): Boolean = js.native
    
    def estimateGas(transaction: DeferrableTransactionRequ): js.Promise[BigNumber] = js.native
    
    def getBalance(addressOrName: String): js.Promise[BigNumber] = js.native
    def getBalance(addressOrName: String, blockTag: js.Promise[BlockTag]): js.Promise[BigNumber] = js.native
    def getBalance(addressOrName: String, blockTag: BlockTag): js.Promise[BigNumber] = js.native
    def getBalance(addressOrName: js.Promise[String]): js.Promise[BigNumber] = js.native
    def getBalance(addressOrName: js.Promise[String], blockTag: js.Promise[BlockTag]): js.Promise[BigNumber] = js.native
    def getBalance(addressOrName: js.Promise[String], blockTag: BlockTag): js.Promise[BigNumber] = js.native
    
    def getBlock(blockHashOrBlockTag: String): js.Promise[Block] = js.native
    def getBlock(blockHashOrBlockTag: js.Promise[BlockTag | String]): js.Promise[Block] = js.native
    def getBlock(blockHashOrBlockTag: BlockTag): js.Promise[Block] = js.native
    
    def getBlockNumber(): js.Promise[Double] = js.native
    
    def getBlockWithTransactions(blockHashOrBlockTag: String): js.Promise[BlockWithTransactions] = js.native
    def getBlockWithTransactions(blockHashOrBlockTag: js.Promise[BlockTag | String]): js.Promise[BlockWithTransactions] = js.native
    def getBlockWithTransactions(blockHashOrBlockTag: BlockTag): js.Promise[BlockWithTransactions] = js.native
    
    def getCode(addressOrName: String): js.Promise[String] = js.native
    def getCode(addressOrName: String, blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
    def getCode(addressOrName: String, blockTag: BlockTag): js.Promise[String] = js.native
    def getCode(addressOrName: js.Promise[String]): js.Promise[String] = js.native
    def getCode(addressOrName: js.Promise[String], blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
    def getCode(addressOrName: js.Promise[String], blockTag: BlockTag): js.Promise[String] = js.native
    
    def getGasPrice(): js.Promise[BigNumber] = js.native
    
    def getLogs(filter: Filter): js.Promise[js.Array[Log]] = js.native
    
    def getNetwork(): js.Promise[Network] = js.native
    
    def getStorageAt(addressOrName: String, position: js.Promise[BigNumberish]): js.Promise[String] = js.native
    def getStorageAt(addressOrName: String, position: js.Promise[BigNumberish], blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
    def getStorageAt(addressOrName: String, position: js.Promise[BigNumberish], blockTag: BlockTag): js.Promise[String] = js.native
    def getStorageAt(addressOrName: String, position: BigNumberish): js.Promise[String] = js.native
    def getStorageAt(addressOrName: String, position: BigNumberish, blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
    def getStorageAt(addressOrName: String, position: BigNumberish, blockTag: BlockTag): js.Promise[String] = js.native
    def getStorageAt(addressOrName: js.Promise[String], position: js.Promise[BigNumberish]): js.Promise[String] = js.native
    def getStorageAt(
      addressOrName: js.Promise[String],
      position: js.Promise[BigNumberish],
      blockTag: js.Promise[BlockTag]
    ): js.Promise[String] = js.native
    def getStorageAt(addressOrName: js.Promise[String], position: js.Promise[BigNumberish], blockTag: BlockTag): js.Promise[String] = js.native
    def getStorageAt(addressOrName: js.Promise[String], position: BigNumberish): js.Promise[String] = js.native
    def getStorageAt(addressOrName: js.Promise[String], position: BigNumberish, blockTag: js.Promise[BlockTag]): js.Promise[String] = js.native
    def getStorageAt(addressOrName: js.Promise[String], position: BigNumberish, blockTag: BlockTag): js.Promise[String] = js.native
    
    def getTransaction(transactionHash: String): js.Promise[TransactionResponse] = js.native
    
    def getTransactionCount(addressOrName: String): js.Promise[Double] = js.native
    def getTransactionCount(addressOrName: String, blockTag: js.Promise[BlockTag]): js.Promise[Double] = js.native
    def getTransactionCount(addressOrName: String, blockTag: BlockTag): js.Promise[Double] = js.native
    def getTransactionCount(addressOrName: js.Promise[String]): js.Promise[Double] = js.native
    def getTransactionCount(addressOrName: js.Promise[String], blockTag: js.Promise[BlockTag]): js.Promise[Double] = js.native
    def getTransactionCount(addressOrName: js.Promise[String], blockTag: BlockTag): js.Promise[Double] = js.native
    
    def getTransactionReceipt(transactionHash: String): js.Promise[TransactionReceipt] = js.native
    
    def listenerCount(): Double = js.native
    def listenerCount(eventName: EventType): Double = js.native
    
    def listeners(): js.Array[Listener] = js.native
    def listeners(eventName: EventType): js.Array[Listener] = js.native
    
    def lookupAddress(address: String): js.Promise[String] = js.native
    def lookupAddress(address: js.Promise[String]): js.Promise[String] = js.native
    
    def off(eventName: EventType): Provider = js.native
    def off(eventName: EventType, listener: Listener): Provider = js.native
    
    def on(eventName: EventType, listener: Listener): Provider = js.native
    
    def once(eventName: EventType, listener: Listener): Provider = js.native
    
    def removeAllListeners(): Provider = js.native
    def removeAllListeners(eventName: EventType): Provider = js.native
    
    def removeListener(eventName: EventType, listener: Listener): Provider = js.native
    
    def resolveName(name: String): js.Promise[String] = js.native
    def resolveName(name: js.Promise[String]): js.Promise[String] = js.native
    
    def sendTransaction(signedTransaction: String): js.Promise[TransactionResponse] = js.native
    def sendTransaction(signedTransaction: js.Promise[String]): js.Promise[TransactionResponse] = js.native
    
    def waitForTransaction(transactionHash: String): js.Promise[TransactionReceipt] = js.native
    def waitForTransaction(transactionHash: String, confirmations: js.UndefOr[scala.Nothing], timeout: Double): js.Promise[TransactionReceipt] = js.native
    def waitForTransaction(transactionHash: String, confirmations: Double): js.Promise[TransactionReceipt] = js.native
    def waitForTransaction(transactionHash: String, confirmations: Double, timeout: Double): js.Promise[TransactionReceipt] = js.native
  }
  /* static members */
  object Provider {
    
    @JSImport("@ethersproject/abstract-provider", "Provider.isProvider")
    @js.native
    def isProvider(value: js.Any): /* is @ethersproject/abstract-provider.@ethersproject/abstract-provider.Provider */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abstract-provider", "TransactionForkEvent")
  @js.native
  class TransactionForkEvent protected () extends ForkEvent {
    def this(hash: String) = this()
    def this(hash: String, expiry: Double) = this()
    
    val _isTransactionOrderForkEvent: js.UndefOr[Boolean] = js.native
    
    val hash: String = js.native
  }
  
  @JSImport("@ethersproject/abstract-provider", "TransactionOrderForkEvent")
  @js.native
  class TransactionOrderForkEvent protected () extends ForkEvent {
    def this(beforeHash: String, afterHash: String) = this()
    def this(beforeHash: String, afterHash: String, expiry: Double) = this()
    
    val afterHash: String = js.native
    
    val beforeHash: String = js.native
  }
  
  @js.native
  trait Block extends _Block {
    
    var transactions: js.Array[String] = js.native
  }
  object Block {
    
    @scala.inline
    def apply(
      difficulty: Double,
      extraData: String,
      gasLimit: BigNumber,
      gasUsed: BigNumber,
      hash: String,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      timestamp: Double,
      transactions: js.Array[String]
    ): Block = {
      val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    @scala.inline
    implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransactions(value: js.Array[String]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsVarargs(value: String*): Self = StObject.set(x, "transactions", js.Array(value :_*))
    }
  }
  
  type BlockTag = String | Double
  
  @js.native
  trait BlockWithTransactions extends _Block {
    
    var transactions: js.Array[TransactionResponse] = js.native
  }
  object BlockWithTransactions {
    
    @scala.inline
    def apply(
      difficulty: Double,
      extraData: String,
      gasLimit: BigNumber,
      gasUsed: BigNumber,
      hash: String,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      timestamp: Double,
      transactions: js.Array[TransactionResponse]
    ): BlockWithTransactions = {
      val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockWithTransactions]
    }
    
    @scala.inline
    implicit class BlockWithTransactionsMutableBuilder[Self <: BlockWithTransactions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransactions(value: js.Array[TransactionResponse]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsVarargs(value: TransactionResponse*): Self = StObject.set(x, "transactions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait EventFilter extends _EventType {
    
    var address: js.UndefOr[String] = js.native
    
    var topics: js.UndefOr[js.Array[String | js.Array[String]]] = js.native
  }
  object EventFilter {
    
    @scala.inline
    def apply(): EventFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventFilter]
    }
    
    @scala.inline
    implicit class EventFilterMutableBuilder[Self <: EventFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setTopics(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
      
      @scala.inline
      def setTopicsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "topics", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.Array[java.lang.String | js.Array[java.lang.String]]
    - typingsSlinky.ethersprojectAbstractProvider.mod.EventFilter
    - typingsSlinky.ethersprojectAbstractProvider.mod.ForkEvent
  */
  type EventType = _EventType | (js.Array[String | js.Array[String]]) | String
  
  @js.native
  trait Filter extends EventFilter {
    
    var fromBlock: js.UndefOr[BlockTag] = js.native
    
    var toBlock: js.UndefOr[BlockTag] = js.native
  }
  object Filter {
    
    @scala.inline
    def apply(): Filter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromBlock(value: BlockTag): Self = StObject.set(x, "fromBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromBlockUndefined: Self = StObject.set(x, "fromBlock", js.undefined)
      
      @scala.inline
      def setToBlock(value: BlockTag): Self = StObject.set(x, "toBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToBlockUndefined: Self = StObject.set(x, "toBlock", js.undefined)
    }
  }
  
  @js.native
  trait FilterByBlockHash extends EventFilter {
    
    var blockHash: js.UndefOr[String] = js.native
  }
  object FilterByBlockHash {
    
    @scala.inline
    def apply(): FilterByBlockHash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterByBlockHash]
    }
    
    @scala.inline
    implicit class FilterByBlockHashMutableBuilder[Self <: FilterByBlockHash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockHashUndefined: Self = StObject.set(x, "blockHash", js.undefined)
    }
  }
  
  type Listener = js.Function1[/* repeated */ js.Any, Unit]
  
  @js.native
  trait Log extends StObject {
    
    var address: String = js.native
    
    var blockHash: String = js.native
    
    var blockNumber: Double = js.native
    
    var data: String = js.native
    
    var logIndex: Double = js.native
    
    var removed: Boolean = js.native
    
    var topics: js.Array[String] = js.native
    
    var transactionHash: String = js.native
    
    var transactionIndex: Double = js.native
  }
  object Log {
    
    @scala.inline
    def apply(
      address: String,
      blockHash: String,
      blockNumber: Double,
      data: String,
      logIndex: Double,
      removed: Boolean,
      topics: js.Array[String],
      transactionHash: String,
      transactionIndex: Double
    ): Log = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Log]
    }
    
    @scala.inline
    implicit class LogMutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogIndex(value: Double): Self = StObject.set(x, "logIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value :_*))
      
      @scala.inline
      def setTransactionHash(value: String): Self = StObject.set(x, "transactionHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionIndex(value: Double): Self = StObject.set(x, "transactionIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransactionReceipt extends StObject {
    
    var blockHash: String = js.native
    
    var blockNumber: Double = js.native
    
    var byzantium: Boolean = js.native
    
    var confirmations: Double = js.native
    
    var contractAddress: String = js.native
    
    var cumulativeGasUsed: BigNumber = js.native
    
    var from: String = js.native
    
    var gasUsed: BigNumber = js.native
    
    var logs: js.Array[Log] = js.native
    
    var logsBloom: String = js.native
    
    var root: js.UndefOr[String] = js.native
    
    var status: js.UndefOr[Double] = js.native
    
    var to: String = js.native
    
    var transactionHash: String = js.native
    
    var transactionIndex: Double = js.native
  }
  object TransactionReceipt {
    
    @scala.inline
    def apply(
      blockHash: String,
      blockNumber: Double,
      byzantium: Boolean,
      confirmations: Double,
      contractAddress: String,
      cumulativeGasUsed: BigNumber,
      from: String,
      gasUsed: BigNumber,
      logs: js.Array[Log],
      logsBloom: String,
      to: String,
      transactionHash: String,
      transactionIndex: Double
    ): TransactionReceipt = {
      val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], byzantium = byzantium.asInstanceOf[js.Any], confirmations = confirmations.asInstanceOf[js.Any], contractAddress = contractAddress.asInstanceOf[js.Any], cumulativeGasUsed = cumulativeGasUsed.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionReceipt]
    }
    
    @scala.inline
    implicit class TransactionReceiptMutableBuilder[Self <: TransactionReceipt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByzantium(value: Boolean): Self = StObject.set(x, "byzantium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmations(value: Double): Self = StObject.set(x, "confirmations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContractAddress(value: String): Self = StObject.set(x, "contractAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCumulativeGasUsed(value: BigNumber): Self = StObject.set(x, "cumulativeGasUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasUsed(value: BigNumber): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogs(value: js.Array[Log]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogsBloom(value: String): Self = StObject.set(x, "logsBloom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogsVarargs(value: Log*): Self = StObject.set(x, "logs", js.Array(value :_*))
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionHash(value: String): Self = StObject.set(x, "transactionHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionIndex(value: Double): Self = StObject.set(x, "transactionIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransactionRequest extends StObject {
    
    var chainId: js.UndefOr[Double] = js.native
    
    var data: js.UndefOr[BytesLike] = js.native
    
    var from: js.UndefOr[String] = js.native
    
    var gasLimit: js.UndefOr[BigNumberish] = js.native
    
    var gasPrice: js.UndefOr[BigNumberish] = js.native
    
    var nonce: js.UndefOr[BigNumberish] = js.native
    
    var to: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[BigNumberish] = js.native
  }
  object TransactionRequest {
    
    @scala.inline
    def apply(): TransactionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactionRequest]
    }
    
    @scala.inline
    implicit class TransactionRequestMutableBuilder[Self <: TransactionRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      @scala.inline
      def setData(value: BytesLike): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setGasLimit(value: BigNumberish): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasLimitUndefined: Self = StObject.set(x, "gasLimit", js.undefined)
      
      @scala.inline
      def setGasPrice(value: BigNumberish): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
      
      @scala.inline
      def setNonce(value: BigNumberish): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setValue(value: BigNumberish): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait TransactionResponse extends Transaction {
    
    var blockHash: js.UndefOr[String] = js.native
    
    var blockNumber: js.UndefOr[Double] = js.native
    
    var confirmations: Double = js.native
    
    @JSName("from")
    var from_TransactionResponse: String = js.native
    
    @JSName("hash")
    var hash_TransactionResponse: String = js.native
    
    var raw: js.UndefOr[String] = js.native
    
    var timestamp: js.UndefOr[Double] = js.native
    
    def wait(confirmations: Double): js.Promise[TransactionReceipt] = js.native
  }
  
  @js.native
  trait _Block extends StObject {
    
    var difficulty: Double = js.native
    
    var extraData: String = js.native
    
    var gasLimit: BigNumber = js.native
    
    var gasUsed: BigNumber = js.native
    
    var hash: String = js.native
    
    var miner: String = js.native
    
    var nonce: String = js.native
    
    var number: Double = js.native
    
    var parentHash: String = js.native
    
    var timestamp: Double = js.native
  }
  object _Block {
    
    @scala.inline
    def apply(
      difficulty: Double,
      extraData: String,
      gasLimit: BigNumber,
      gasUsed: BigNumber,
      hash: String,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      timestamp: Double
    ): _Block = {
      val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[_Block]
    }
    
    @scala.inline
    implicit class _BlockMutableBuilder[Self <: _Block] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDifficulty(value: Double): Self = StObject.set(x, "difficulty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraData(value: String): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasLimit(value: BigNumber): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasUsed(value: BigNumber): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiner(value: String): Self = StObject.set(x, "miner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentHash(value: String): Self = StObject.set(x, "parentHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait _EventType extends StObject
}
