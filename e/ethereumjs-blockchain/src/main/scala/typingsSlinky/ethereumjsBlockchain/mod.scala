package typingsSlinky.ethereumjsBlockchain

import typingsSlinky.ethereumjsBlockchain.anon.Genesis
import typingsSlinky.ethereumjsBlockchain.anon.Key
import typingsSlinky.ethereumjsUtil.mod.BN
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethereumjs-blockchain", JSImport.Default)
  @js.native
  /**
    * Creates new Blockchain object
    *
    * @param opts - An object with the options that this constructor takes. See [[BlockchainOptions]].
    */
  class default () extends Blockchain {
    def this(opts: BlockchainOptions) = this()
  }
  
  type Block = js.Any
  
  @js.native
  trait Blockchain extends BlockchainInterface {
    
    /**
      * Executes multiple db operations in a single batch call
      *
      * @hidden
      */
    def _batchDbOps(dbOps: js.Any, cb: js.Any): Unit = js.native
    
    /**
      * @hidden
      */
    var _common: typingsSlinky.ethereumjsCommon.mod.default = js.native
    
    def _delBlock(blockHash: js.Any, cb: js.Any): Unit = js.native
    /**
      * @hidden
      */
    def _delBlock(blockHash: Buffer, cb: js.Any): Unit = js.native
    
    /**
      * @hidden
      */
    def _delChild(hash: Buffer, number: BN, headHash: Buffer, ops: js.Any, cb: js.Any): js.Any = js.native
    
    /**
      * Delete canonical number assignments for specified number and above
      *
      * @hidden
      */
    def _deleteStaleAssignments(number: BN, headHash: Buffer, ops: js.Any, cb: js.Any): Unit = js.native
    
    /**
      * @hidden
      */
    var _genesis: js.Any = js.native
    
    def _getBlock(blockTag: Double, cb: js.Any): Unit = js.native
    def _getBlock(blockTag: BN, cb: js.Any): Unit = js.native
    /**
      * @hidden
      */
    def _getBlock(blockTag: Buffer, cb: js.Any): Unit = js.native
    
    /**
      * Gets a header by number. Header must be in the canonical chain
      *
      * @hidden
      */
    def _getCanonicalHeader(number: BN, cb: js.Any): Unit = js.native
    
    /**
      * Gets a header by hash and number. Header can exist outside the canonical chain
      *
      * @hidden
      */
    def _getHeader(hash: Buffer, number: js.Any): Unit = js.native
    def _getHeader(hash: Buffer, number: js.Any, cb: js.Any): Unit = js.native
    
    /**
      * Gets total difficulty for a block specified by hash and number
      *
      * @hidden
      */
    def _getTd(hash: js.Any, number: js.Any): Unit = js.native
    def _getTd(hash: js.Any, number: js.Any, cb: js.Any): Unit = js.native
    
    /**
      * Performs a block hash to block number lookup
      *
      * @hidden
      */
    def _hashToNumber(hash: Buffer, cb: js.Any): Unit = js.native
    
    /**
      * @hidden
      */
    var _headBlock: js.Any = js.native
    
    /**
      * @hidden
      */
    var _headHeader: js.Any = js.native
    
    /**
      * @hidden
      */
    var _heads: js.Any = js.native
    
    /**
      * Fetches the meta info about the blockchain from the db. Meta info contains
      * hashes of the headerchain head, blockchain head, genesis block and iterator
      * heads.
      *
      * @hidden
      */
    def _init(cb: js.Any): Unit = js.native
    
    /**
      * @hidden
      */
    var _initDone: Boolean = js.native
    
    /**
      * @hidden
      */
    var _initLock: js.Any = js.native
    
    /**
      * @hidden
      */
    def _iterator(name: String, func: js.Any, cb: js.Any): js.Any = js.native
    
    /**
      * @hidden
      */
    def _lockUnlock(fn: js.Any, cb: js.Any): Unit = js.native
    
    /**
      * Helper function to lookup a block by either hash only or a hash and number
      *
      * @hidden
      */
    def _lookupByHashNumber(hash: Buffer, number: BN, cb: js.Any, next: js.Any): Unit = js.native
    
    /**
      * Performs a block number to block hash lookup
      *
      * @hidden
      */
    def _numberToHash(number: BN, cb: js.Any): Unit = js.native
    
    /**
      * @hidden
      */
    def _putBlockOrHeader(item: js.Any, cb: js.Any): js.Any = js.native
    def _putBlockOrHeader(item: js.Any, cb: js.Any, isGenesis: Boolean): js.Any = js.native
    
    /**
      * @hidden
      */
    var _putSemaphore: js.Any = js.native
    
    /**
      * Overwrites stale canonical number assignments.
      *
      * @hidden
      */
    def _rebuildCanonical(header: js.Any, ops: js.Any, cb: js.Any): js.Any = js.native
    
    /**
      * @hidden
      */
    def _saveHeadOps(): js.Array[Key] = js.native
    
    /**
      * @hidden
      */
    def _saveHeads(cb: js.Any): Unit = js.native
    
    /**
      * Sets the default genesis block
      *
      * @hidden
      */
    def _setCanonicalGenesisBlock(cb: js.Any): Unit = js.native
    
    /**
      * @hidden
      */
    var _staleHeadBlock: js.Any = js.native
    
    /**
      * @hidden
      */
    var _staleHeads: js.Any = js.native
    
    val _validateBlocks: js.Any = js.native
    
    val _validatePow: js.Any = js.native
    
    var db: js.Any = js.native
    
    var dbManager: typingsSlinky.ethereumjsBlockchain.dbManagerMod.default = js.native
    
    var ethash: js.Any = js.native
    
    def getBlock(blockTag: Double, cb: js.Any): Unit = js.native
    def getBlock(blockTag: BN, cb: js.Any): Unit = js.native
    /**
      * Gets a block by its hash.
      *
      * @param blockTag - The block's hash or number
      * @param cb - The callback. It is given two parameters `err` and the found `block` (an instance of https://github.com/ethereumjs/ethereumjs-block) if any.
      */
    def getBlock(blockTag: Buffer, cb: js.Any): Unit = js.native
    
    def getBlocks(blockId: Double, maxBlocks: Double, skip: Double, reverse: Boolean, cb: js.Any): Unit = js.native
    /**
      * Looks up many blocks relative to blockId
      *
      * @param blockId - The block's hash or number
      * @param maxBlocks - Max number of blocks to return
      * @param skip - Number of blocks to skip apart
      * @param reverse - Fetch blocks in reverse
      * @param cb - The callback. It is given two parameters `err` and the found `blocks` if any.
      */
    def getBlocks(blockId: Buffer, maxBlocks: Double, skip: Double, reverse: Boolean, cb: js.Any): Unit = js.native
    
    /**
      * Returns the specified iterator head.
      *
      * @param name - Optional name of the state root head (default: 'vm')
      * @param cb - The callback. It is given two parameters `err` and the returned `block`
      */
    def getHead(name: js.Any): Unit = js.native
    def getHead(name: js.Any, cb: js.Any): Unit = js.native
    
    /**
      * Returns the latest full block in the canonical chain.
      *
      * @param cb - The callback. It is given two parameters `err` and the returned `block`
      */
    def getLatestBlock(cb: js.Any): Unit = js.native
    
    /**
      * Returns the latest header in the canonical chain.
      *
      * @param cb - The callback. It is given two parameters `err` and the returned `header`
      */
    def getLatestHeader(cb: js.Any): Unit = js.native
    
    /**
      * Returns an object with metadata about the Blockchain. It's defined for backwards compatibility.
      */
    def meta: Genesis = js.native
    
    /**
      * Adds a block to the blockchain.
      *
      * @param block - The block to be added to the blockchain
      * @param cb - The callback. It is given two parameters `err` and the saved `block`
      */
    def putBlock(block: js.Object, cb: js.Any): Unit = js.native
    def putBlock(block: js.Object, cb: js.Any, isGenesis: Boolean): Unit = js.native
    
    /**
      * Adds many blocks to the blockchain.
      *
      * @param blocks - The blocks to be added to the blockchain
      * @param cb - The callback. It is given two parameters `err` and the last of the saved `blocks`
      */
    def putBlocks(blocks: js.Array[_], cb: js.Any): Unit = js.native
    
    /**
      * Puts the genesis block in the database
      *
      * @param genesis - The genesis block to be added
      * @param cb - The callback. It is given two parameters `err` and the saved `block`
      */
    def putGenesis(genesis: js.Any, cb: js.Any): Unit = js.native
    
    /**
      * Adds a header to the blockchain.
      *
      * @param header - The header to be added to the blockchain
      * @param cb - The callback. It is given two parameters `err` and the saved `header`
      */
    def putHeader(header: js.Object, cb: js.Any): Unit = js.native
    
    /**
      * Adds many headers to the blockchain.
      *
      * @param headers - The headers to be added to the blockchain
      * @param cb - The callback. It is given two parameters `err` and the last of the saved `headers`
      */
    def putHeaders(headers: js.Array[_], cb: js.Any): Unit = js.native
    
    /**
      * Given an ordered array, returns to the callback an array of hashes that are not in the blockchain yet.
      *
      * @param hashes - Ordered array of hashes
      * @param cb - The callback. It is given two parameters `err` and hashes found.
      */
    def selectNeededHashes(hashes: js.Array[_], cb: js.Any): Unit = js.native
    
    /**
      * This field is always `true`. It's here only for backwards compatibility.
      *
      * @deprecated
      */
    val validate: Boolean = js.native
  }
  
  @js.native
  trait BlockchainInterface extends StObject {
    
    /**
      * Deletes a block from the blockchain. All child blocks in the chain are deleted and any
      * encountered heads are set to the parent block.
      *
      * @param blockHash - The hash of the block to be deleted
      * @param cb - A callback.
      */
    def delBlock(blockHash: Buffer, cb: js.Any): Unit = js.native
    
    def getBlock(blockTag: Double, cb: js.Function2[/* err */ js.Error | Null, /* block */ js.UndefOr[Block], Unit]): Unit = js.native
    def getBlock(blockTag: BN, cb: js.Function2[/* err */ js.Error | Null, /* block */ js.UndefOr[Block], Unit]): Unit = js.native
    /**
      * Returns a block by its hash or number.
      */
    def getBlock(blockTag: Buffer, cb: js.Function2[/* err */ js.Error | Null, /* block */ js.UndefOr[Block], Unit]): Unit = js.native
    
    /**
      * This method is only here for backwards compatibility. It can be removed once
      * [this PR](https://github.com/ethereumjs/ethereumjs-block/pull/72/files) gets merged, released,
      * and ethereumjs-block is updated here.
      *
      * The method should just call `cb` with `null` as first argument.
      */
    def getDetails(_underscore: String, cb: js.Any): Unit = js.native
    
    /**
      * Iterates through blocks starting at the specified iterator head and calls the onBlock function
      * on each block.
      *
      * @param name - Name of the state root head
      * @param onBlock - Function called on each block with params (block, reorg, cb)
      * @param cb - A callback function
      */
    def iterator(name: String, onBlock: js.Any, cb: js.Any): Unit = js.native
    
    /**
      * Adds a block to the blockchain.
      *
      * @param block - The block to be added to the blockchain.
      * @param cb - The callback. It is given two parameters `err` and the saved `block`
      * @param isGenesis - True if block is the genesis block.
      */
    def putBlock(block: Block, cb: js.Any): Unit = js.native
    def putBlock(block: Block, cb: js.Any, isGenesis: Boolean): Unit = js.native
  }
  
  @js.native
  trait BlockchainOptions extends StObject {
    
    /**
      * The chain id or name. Default: `"mainnet"`.
      */
    var chain: js.UndefOr[String | Double] = js.native
    
    /**
      * An alternative way to specify the chain and hardfork is by passing a Common instance.
      */
    var common: js.UndefOr[typingsSlinky.ethereumjsCommon.mod.default] = js.native
    
    /**
      * Database to store blocks and metadata. Should be a
      * [levelup](https://github.com/rvagg/node-levelup) instance.
      */
    var db: js.UndefOr[js.Any] = js.native
    
    /**
      * Hardfork for the blocks. If `undefined` or `null` is passed, it gets computed based on block
      * numbers.
      */
    var hardfork: js.UndefOr[String | Null] = js.native
    
    /**
      * This the flag indicates if blocks and Proof-of-Work should be validated.
      * This option can't be used in conjunction with `validatePow` nor `validateBlocks`.
      *
      * @deprecated
      */
    var validate: js.UndefOr[Boolean] = js.native
    
    /**
      * This flags indicates if blocks should be validated. See Block#validate for details. If
      * `validate` is provided, this option takes its value. If neither `validate` nor this option are
      * provided, it defaults to `true`.
      */
    var validateBlocks: js.UndefOr[Boolean] = js.native
    
    /**
      * This flags indicates if Proof-of-work should be validated. If `validate` is provided, this
      * option takes its value. If neither `validate` nor this option are provided, it defaults to
      * `true`.
      */
    var validatePow: js.UndefOr[Boolean] = js.native
  }
  object BlockchainOptions {
    
    @scala.inline
    def apply(): BlockchainOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockchainOptions]
    }
    
    @scala.inline
    implicit class BlockchainOptionsMutableBuilder[Self <: BlockchainOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChain(value: String | Double): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
      
      @scala.inline
      def setCommon(value: typingsSlinky.ethereumjsCommon.mod.default): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
      
      @scala.inline
      def setDb(value: js.Any): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      @scala.inline
      def setHardfork(value: String): Self = StObject.set(x, "hardfork", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardforkNull: Self = StObject.set(x, "hardfork", null)
      
      @scala.inline
      def setHardforkUndefined: Self = StObject.set(x, "hardfork", js.undefined)
      
      @scala.inline
      def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateBlocks(value: Boolean): Self = StObject.set(x, "validateBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateBlocksUndefined: Self = StObject.set(x, "validateBlocks", js.undefined)
      
      @scala.inline
      def setValidatePow(value: Boolean): Self = StObject.set(x, "validatePow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatePowUndefined: Self = StObject.set(x, "validatePow", js.undefined)
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
}
