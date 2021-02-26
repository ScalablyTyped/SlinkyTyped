package typingsSlinky.ethereumjsVm

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateManagerMod {
  
  @JSImport("ethereumjs-vm/dist/state/stateManager", JSImport.Default)
  @js.native
  /**
    * Instantiate the StateManager interface.
    */
  class default () extends StateManager {
    def this(opts: StateManagerOpts) = this()
  }
  
  @js.native
  trait StateManager extends StObject {
    
    var _cache: typingsSlinky.ethereumjsVm.cacheMod.default = js.native
    
    var _checkpointCount: Double = js.native
    
    /**
      * Clears the original storage cache. Refer to [[getOriginalContractStorage]]
      * for more explanation.
      * @ignore
      */
    def _clearOriginalStorageCache(): Unit = js.native
    
    var _common: typingsSlinky.ethereumjsCommon.mod.default = js.native
    
    /**
      * Gets the storage trie for an account from the storage
      * cache or does a lookup.
      * @private
      */
    def _getStorageTrie(address: Buffer, cb: js.Any): Unit = js.native
    
    /**
      * Creates a storage trie from the primary storage trie
      * for an account and saves this in the storage cache.
      * @private
      */
    def _lookupStorageTrie(address: Buffer, cb: js.Any): Unit = js.native
    
    /**
      * Modifies the storage trie of an account
      * @private
      * @param address -  Address of the account whose storage is to be modified
      * @param modifyTrie - Function to modify the storage trie of the account
      */
    def _modifyContractStorage(address: Buffer, modifyTrie: js.Any, cb: js.Any): Unit = js.native
    
    var _originalStorageCache: Map[String, Map[String, Buffer]] = js.native
    
    var _storageTries: js.Any = js.native
    
    var _touched: Set[String] = js.native
    
    var _touchedStack: js.Array[Set[String]] = js.native
    
    var _trie: js.Any = js.native
    
    /**
      * Callback for `accountIsEmpty` method
      * @callback accountIsEmpty~callback
      * @param {Error} error an error that may have happened or `null`
      * @param {Boolean} empty True if the account is empty false otherwise
      */
    /**
      * Checks if the `account` corresponding to `address` is empty as defined in
      * EIP-161 (https://eips.ethereum.org/EIPS/eip-161).
      * @param address - Address to check
      * @param {accountIsEmpty~callback} cb
      */
    def accountIsEmpty(address: Buffer, cb: js.Any): Unit = js.native
    
    /**
      * Checkpoints the current state of the StateManager instance.
      * State changes that follow can then be committed by calling
      * `commit` or `reverted` by calling rollback.
      * @param cb - Callback function
      */
    def checkpoint(cb: js.Any): Unit = js.native
    
    /**
      * Removes accounts form the state trie that have been touched,
      * as defined in EIP-161 (https://eips.ethereum.org/EIPS/eip-161).
      * @param cb - Callback function
      */
    def cleanupTouchedAccounts(cb: js.Any): Unit = js.native
    
    /**
      * Clears all storage entries for the account corresponding to `address`.
      * @param address -  Address to clear the storage of
      * @param cb - Callback function
      */
    def clearContractStorage(address: Buffer, cb: js.Any): Unit = js.native
    
    /**
      * Commits the current change-set to the instance since the
      * last call to checkpoint.
      * @param cb - Callback function
      */
    def commit(cb: js.Any): Unit = js.native
    
    /**
      * Copies the current instance of the `StateManager`
      * at the last fully committed point, i.e. as if all current
      * checkpoints were reverted.
      */
    def copy(): StateManager = js.native
    
    /**
      * Callback for `dumpStorage` method
      * @callback dumpStorage~callback
      * @param {Error} error an error that may have happened or `null`
      * @param {Object} accountState The state of the account as an `Object` map.
      * Keys are are the storage keys, values are the storage values as strings.
      * Both are represented as hex strings without the `0x` prefix.
      */
    /**
      * Dumps the the storage values for an `account` specified by `address`.
      * @param address - The address of the `account` to return storage for
      * @param {dumpStorage~callback} cb
      */
    def dumpStorage(address: Buffer, cb: js.Any): Unit = js.native
    
    /**
      * Generates a canonical genesis state on the instance based on the
      * configured chain parameters. Will error if there are uncommitted
      * checkpoints on the instance.
      * @param cb - Callback function
      */
    def generateCanonicalGenesis(cb: js.Any): Unit = js.native
    
    /**
      * Initializes the provided genesis state into the state trie
      * @param initState - Object (address -> balance)
      * @param cb - Callback function
      */
    def generateGenesis(initState: js.Any, cb: js.Any): js.Any = js.native
    
    /**
      * Callback for `getAccount` method.
      * @callback getAccount~callback
      * @param error - an error that may have happened or `null`
      * @param account - An [`ethereumjs-account`](https://github.com/ethereumjs/ethereumjs-account)
      * instance corresponding to the provided `address`
      */
    /**
      * Gets the [`ethereumjs-account`](https://github.com/ethereumjs/ethereumjs-account)
      * associated with `address`. Returns an empty account if the account does not exist.
      * @param address - Address of the `account` to get
      * @param {getAccount~callback} cb
      */
    def getAccount(address: Buffer, cb: js.Any): Unit = js.native
    
    /**
      * Callback for `getContractCode` method
      * @callback getContractCode~callback
      * @param error - an error that may have happened or `null`
      * @param code - The code corresponding to the provided address.
      * Returns an empty `Buffer` if the account has no associated code.
      */
    /**
      * Gets the code corresponding to the provided `address`.
      * @param address - Address to get the `code` for
      * @param {getContractCode~callback} cb
      */
    def getContractCode(address: Buffer, cb: js.Any): Unit = js.native
    
    /**
      * Callback for `getContractStorage` method
      * @callback getContractStorage~callback
      * @param {Error} error an error that may have happened or `null`
      * @param {Buffer} storageValue The storage value for the account
      * corresponding to the provided address at the provided key.
      * If this does not exists an empty `Buffer` is returned
      */
    /**
      * Gets the storage value associated with the provided `address` and `key`. This method returns
      * the shortest representation of the stored value.
      * @param address -  Address of the account to get the storage for
      * @param key - Key in the account's storage to get the value for. Must be 32 bytes long.
      * @param {getContractCode~callback} cb.
      */
    def getContractStorage(address: Buffer, key: Buffer, cb: js.Any): Unit = js.native
    
    /**
      * Caches the storage value associated with the provided `address` and `key`
      * on first invocation, and returns the cached (original) value from then
      * onwards. This is used to get the original value of a storage slot for
      * computing gas costs according to EIP-1283.
      * @param address - Address of the account to get the storage for
      * @param key - Key in the account's storage to get the value for. Must be 32 bytes long.
      */
    def getOriginalContractStorage(address: Buffer, key: Buffer, cb: js.Any): Unit = js.native
    
    /**
      * Callback for `getStateRoot` method
      * @callback getStateRoot~callback
      * @param {Error} error an error that may have happened or `null`.
      * Will be an error if the un-committed checkpoints on the instance.
      * @param {Buffer} stateRoot The state-root of the `StateManager`
      */
    /**
      * Gets the state-root of the Merkle-Patricia trie representation
      * of the state of this StateManager. Will error if there are uncommitted
      * checkpoints on the instance.
      * @param {getStateRoot~callback} cb
      */
    def getStateRoot(cb: js.Any): Unit = js.native
    
    /**
      * Callback for `hasGenesisState` method
      * @callback hasGenesisState~callback
      * @param {Error} error an error that may have happened or `null`
      * @param {Boolean} hasGenesisState Whether the storage trie contains the
      * canonical genesis state for the configured chain parameters.
      */
    /**
      * Checks whether the current instance has the canonical genesis state
      * for the configured chain parameters.
      * @param {hasGenesisState~callback} cb
      */
    def hasGenesisState(cb: js.Any): Unit = js.native
    
    /**
      * Saves an [`ethereumjs-account`](https://github.com/ethereumjs/ethereumjs-account)
      * into state under the provided `address`.
      * @param address - Address under which to store `account`
      * @param account - The [`ethereumjs-account`](https://github.com/ethereumjs/ethereumjs-account) to store
      * @param cb - Callback function
      */
    def putAccount(address: Buffer, account: typingsSlinky.ethereumjsAccount.mod.default, cb: js.Any): Unit = js.native
    
    /**
      * Adds `value` to the state trie as code, and sets `codeHash` on the account
      * corresponding to `address` to reference this.
      * @param address - Address of the `account` to add the `code` for
      * @param value - The value of the `code`
      * @param cb - Callback function
      */
    def putContractCode(address: Buffer, value: Buffer, cb: js.Any): Unit = js.native
    
    /**
      * Adds value to the state trie for the `account`
      * corresponding to `address` at the provided `key`.
      * @param address -  Address to set a storage value for
      * @param key - Key to set the value at. Must be 32 bytes long.
      * @param value - Value to set at `key` for account corresponding to `address`
      * @param cb - Callback function
      */
    def putContractStorage(address: Buffer, key: Buffer, value: Buffer, cb: js.Any): Unit = js.native
    
    /**
      * Reverts the current change-set to the instance since the
      * last call to checkpoint.
      * @param cb - Callback function
      */
    def revert(cb: js.Any): Unit = js.native
    
    /**
      * Sets the state of the instance to that represented
      * by the provided `stateRoot`. Will error if there are uncommitted
      * checkpoints on the instance or if the state root does not exist in
      * the state trie.
      * @param stateRoot - The state-root to reset the instance to
      * @param cb - Callback function
      */
    def setStateRoot(stateRoot: Buffer, cb: js.Any): Unit = js.native
    
    /**
      * Marks an account as touched, according to the definition
      * in [EIP-158](https://eips.ethereum.org/EIPS/eip-158).
      * This happens when the account is triggered for a state-changing
      * event. Touched accounts that are empty will be cleared
      * at the end of the tx.
      */
    def touchAccount(address: Buffer): Unit = js.native
  }
  object StateManager {
    
    @scala.inline
    def apply(
      _cache: typingsSlinky.ethereumjsVm.cacheMod.default,
      _checkpointCount: Double,
      _clearOriginalStorageCache: () => Unit,
      _common: typingsSlinky.ethereumjsCommon.mod.default,
      _getStorageTrie: (Buffer, js.Any) => Unit,
      _lookupStorageTrie: (Buffer, js.Any) => Unit,
      _modifyContractStorage: (Buffer, js.Any, js.Any) => Unit,
      _originalStorageCache: Map[String, Map[String, Buffer]],
      _storageTries: js.Any,
      _touched: Set[String],
      _touchedStack: js.Array[Set[String]],
      _trie: js.Any,
      accountIsEmpty: (Buffer, js.Any) => Unit,
      checkpoint: js.Any => Unit,
      cleanupTouchedAccounts: js.Any => Unit,
      clearContractStorage: (Buffer, js.Any) => Unit,
      commit: js.Any => Unit,
      copy: () => StateManager,
      dumpStorage: (Buffer, js.Any) => Unit,
      generateCanonicalGenesis: js.Any => Unit,
      generateGenesis: (js.Any, js.Any) => js.Any,
      getAccount: (Buffer, js.Any) => Unit,
      getContractCode: (Buffer, js.Any) => Unit,
      getContractStorage: (Buffer, Buffer, js.Any) => Unit,
      getOriginalContractStorage: (Buffer, Buffer, js.Any) => Unit,
      getStateRoot: js.Any => Unit,
      hasGenesisState: js.Any => Unit,
      putAccount: (Buffer, typingsSlinky.ethereumjsAccount.mod.default, js.Any) => Unit,
      putContractCode: (Buffer, Buffer, js.Any) => Unit,
      putContractStorage: (Buffer, Buffer, Buffer, js.Any) => Unit,
      revert: js.Any => Unit,
      setStateRoot: (Buffer, js.Any) => Unit,
      touchAccount: Buffer => Unit
    ): StateManager = {
      val __obj = js.Dynamic.literal(_cache = _cache.asInstanceOf[js.Any], _checkpointCount = _checkpointCount.asInstanceOf[js.Any], _clearOriginalStorageCache = js.Any.fromFunction0(_clearOriginalStorageCache), _common = _common.asInstanceOf[js.Any], _getStorageTrie = js.Any.fromFunction2(_getStorageTrie), _lookupStorageTrie = js.Any.fromFunction2(_lookupStorageTrie), _modifyContractStorage = js.Any.fromFunction3(_modifyContractStorage), _originalStorageCache = _originalStorageCache.asInstanceOf[js.Any], _storageTries = _storageTries.asInstanceOf[js.Any], _touched = _touched.asInstanceOf[js.Any], _touchedStack = _touchedStack.asInstanceOf[js.Any], _trie = _trie.asInstanceOf[js.Any], accountIsEmpty = js.Any.fromFunction2(accountIsEmpty), checkpoint = js.Any.fromFunction1(checkpoint), cleanupTouchedAccounts = js.Any.fromFunction1(cleanupTouchedAccounts), clearContractStorage = js.Any.fromFunction2(clearContractStorage), commit = js.Any.fromFunction1(commit), copy = js.Any.fromFunction0(copy), dumpStorage = js.Any.fromFunction2(dumpStorage), generateCanonicalGenesis = js.Any.fromFunction1(generateCanonicalGenesis), generateGenesis = js.Any.fromFunction2(generateGenesis), getAccount = js.Any.fromFunction2(getAccount), getContractCode = js.Any.fromFunction2(getContractCode), getContractStorage = js.Any.fromFunction3(getContractStorage), getOriginalContractStorage = js.Any.fromFunction3(getOriginalContractStorage), getStateRoot = js.Any.fromFunction1(getStateRoot), hasGenesisState = js.Any.fromFunction1(hasGenesisState), putAccount = js.Any.fromFunction3(putAccount), putContractCode = js.Any.fromFunction3(putContractCode), putContractStorage = js.Any.fromFunction4(putContractStorage), revert = js.Any.fromFunction1(revert), setStateRoot = js.Any.fromFunction2(setStateRoot), touchAccount = js.Any.fromFunction1(touchAccount))
      __obj.asInstanceOf[StateManager]
    }
    
    @scala.inline
    implicit class StateManagerMutableBuilder[Self <: StateManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountIsEmpty(value: (Buffer, js.Any) => Unit): Self = StObject.set(x, "accountIsEmpty", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCheckpoint(value: js.Any => Unit): Self = StObject.set(x, "checkpoint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCleanupTouchedAccounts(value: js.Any => Unit): Self = StObject.set(x, "cleanupTouchedAccounts", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClearContractStorage(value: (Buffer, js.Any) => Unit): Self = StObject.set(x, "clearContractStorage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCommit(value: js.Any => Unit): Self = StObject.set(x, "commit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCopy(value: () => StateManager): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDumpStorage(value: (Buffer, js.Any) => Unit): Self = StObject.set(x, "dumpStorage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGenerateCanonicalGenesis(value: js.Any => Unit): Self = StObject.set(x, "generateCanonicalGenesis", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenerateGenesis(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "generateGenesis", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetAccount(value: (Buffer, js.Any) => Unit): Self = StObject.set(x, "getAccount", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetContractCode(value: (Buffer, js.Any) => Unit): Self = StObject.set(x, "getContractCode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetContractStorage(value: (Buffer, Buffer, js.Any) => Unit): Self = StObject.set(x, "getContractStorage", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetOriginalContractStorage(value: (Buffer, Buffer, js.Any) => Unit): Self = StObject.set(x, "getOriginalContractStorage", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetStateRoot(value: js.Any => Unit): Self = StObject.set(x, "getStateRoot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasGenesisState(value: js.Any => Unit): Self = StObject.set(x, "hasGenesisState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPutAccount(value: (Buffer, typingsSlinky.ethereumjsAccount.mod.default, js.Any) => Unit): Self = StObject.set(x, "putAccount", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPutContractCode(value: (Buffer, Buffer, js.Any) => Unit): Self = StObject.set(x, "putContractCode", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPutContractStorage(value: (Buffer, Buffer, Buffer, js.Any) => Unit): Self = StObject.set(x, "putContractStorage", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRevert(value: js.Any => Unit): Self = StObject.set(x, "revert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStateRoot(value: (Buffer, js.Any) => Unit): Self = StObject.set(x, "setStateRoot", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchAccount(value: Buffer => Unit): Self = StObject.set(x, "touchAccount", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_cache(value: typingsSlinky.ethereumjsVm.cacheMod.default): Self = StObject.set(x, "_cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_checkpointCount(value: Double): Self = StObject.set(x, "_checkpointCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_clearOriginalStorageCache(value: () => Unit): Self = StObject.set(x, "_clearOriginalStorageCache", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_common(value: typingsSlinky.ethereumjsCommon.mod.default): Self = StObject.set(x, "_common", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_getStorageTrie(value: (Buffer, js.Any) => Unit): Self = StObject.set(x, "_getStorageTrie", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_lookupStorageTrie(value: (Buffer, js.Any) => Unit): Self = StObject.set(x, "_lookupStorageTrie", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_modifyContractStorage(value: (Buffer, js.Any, js.Any) => Unit): Self = StObject.set(x, "_modifyContractStorage", js.Any.fromFunction3(value))
      
      @scala.inline
      def set_originalStorageCache(value: Map[String, Map[String, Buffer]]): Self = StObject.set(x, "_originalStorageCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_storageTries(value: js.Any): Self = StObject.set(x, "_storageTries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_touched(value: Set[String]): Self = StObject.set(x, "_touched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_touchedStack(value: js.Array[Set[String]]): Self = StObject.set(x, "_touchedStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_touchedStackVarargs(value: Set[String]*): Self = StObject.set(x, "_touchedStack", js.Array(value :_*))
      
      @scala.inline
      def set_trie(value: js.Any): Self = StObject.set(x, "_trie", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StateManagerOpts extends StObject {
    
    /**
      * Parameters of the chain ([`Common`](https://github.com/ethereumjs/ethereumjs-common))
      */
    var common: js.UndefOr[typingsSlinky.ethereumjsCommon.mod.default] = js.native
    
    /**
      * A [`merkle-patricia-tree`](https://github.com/ethereumjs/merkle-patricia-tree) instance
      */
    var trie: js.UndefOr[js.Any] = js.native
  }
  object StateManagerOpts {
    
    @scala.inline
    def apply(): StateManagerOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StateManagerOpts]
    }
    
    @scala.inline
    implicit class StateManagerOptsMutableBuilder[Self <: StateManagerOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommon(value: typingsSlinky.ethereumjsCommon.mod.default): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
      
      @scala.inline
      def setTrie(value: js.Any): Self = StObject.set(x, "trie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrieUndefined: Self = StObject.set(x, "trie", js.undefined)
    }
  }
  
  type StorageDump = StringDictionary[String]
}
