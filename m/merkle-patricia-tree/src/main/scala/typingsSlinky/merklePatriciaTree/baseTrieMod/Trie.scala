package typingsSlinky.merklePatriciaTree.baseTrieMod

import typingsSlinky.abstractLeveldown.mod.AbstractIterator
import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import typingsSlinky.levelup.mod.LevelUp
import typingsSlinky.merklePatriciaTree.dbMod.BatchDBOp
import typingsSlinky.merklePatriciaTree.dbMod.DB
import typingsSlinky.merklePatriciaTree.readStreamMod.TrieReadStream
import typingsSlinky.merklePatriciaTree.trieNodeMod.EmbeddedNode
import typingsSlinky.merklePatriciaTree.trieNodeMod.Nibbles
import typingsSlinky.merklePatriciaTree.trieNodeMod.TrieNode
import typingsSlinky.node.Buffer
import typingsSlinky.semaphoreAsyncAwait.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("merkle-patricia-tree/dist/baseTrie", "Trie")
@js.native
class Trie () extends js.Object {
  def this(db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]) = this()
  def this(db: js.UndefOr[scala.Nothing], root: Buffer) = this()
  def this(db: Null, root: Buffer) = this()
  def this(db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]], root: Buffer) = this()
  
  var EMPTY_TRIE_ROOT: Buffer = js.native
  
  /**
    * Creates the initial node from an empty tree.
    * @private
    */
  def _createInitialNode(key: Buffer, value: Buffer): js.Promise[Unit] = js.native
  
  /**
    * Deletes a node.
    * @private
    */
  def _deleteNode(k: Buffer, stack: js.Array[TrieNode]): js.Promise[Unit] = js.native
  
  def _findDbNodes(onFound: FoundNode): js.Promise[Unit] = js.native
  
  /**
    * Finds all nodes that store k,v values.
    * @private
    */
  def _findValueNodes(onFound: FoundNode): js.Promise[Unit] = js.native
  
  /**
    * Formats node to be saved by `levelup.batch`.
    * @private
    * @param {TrieNode} node - the node to format.
    * @param {Boolean} topLevel - if the node is at the top level.
    * @param {BatchDBOp[]} opStack - the opStack to push the node's data.
    * @param {Boolean} remove - whether to remove the node (only used for CheckpointTrie).
    * @returns The node's hash used as the key or the rawNode.
    */
  def _formatNode(node: TrieNode, topLevel: Boolean, opStack: js.Array[BatchDBOp]): Buffer | (js.Array[EmbeddedNode | Null]) = js.native
  def _formatNode(node: TrieNode, topLevel: Boolean, opStack: js.Array[BatchDBOp], remove: Boolean): Buffer | (js.Array[EmbeddedNode | Null]) = js.native
  
  def _lookupNode(node: js.Array[Buffer]): js.Promise[TrieNode | Null] = js.native
  /**
    * Retrieves a node from db by hash.
    * @private
    */
  def _lookupNode(node: Buffer): js.Promise[TrieNode | Null] = js.native
  
  /**
    * Writes a single node to db.
    * @private
    */
  def _putNode(node: TrieNode): js.Promise[Unit] = js.native
  
  var _root: js.Any = js.native
  
  /**
    * Saves a stack.
    * @private
    * @param {Nibbles} key - the key. Should follow the stack
    * @param {Array} stack - a stack of nodes to the value given by the key
    * @param {Array} opStack - a stack of levelup operations to commit at the end of this funciton
    */
  def _saveStack(key: Nibbles, stack: js.Array[TrieNode], opStack: js.Array[BatchDBOp]): js.Promise[Unit] = js.native
  
  /**
    * Updates a node.
    * @private
    * @param {Buffer} key
    * @param {Buffer} value
    * @param {Nibbles} keyRemainder
    * @param {TrieNode[]} stack
    */
  def _updateNode(k: Buffer, value: Buffer, keyRemainder: Nibbles, stack: js.Array[TrieNode]): js.Promise[Unit] = js.native
  
  /**
    * Walks a trie until finished.
    * @private
    * @param {Buffer} root
    * @param {Function} onNode - callback to call when a node is found
    * @returns Resolves when finished walking trie.
    */
  def _walkTrie(root: Buffer, onNode: FoundNode): js.Promise[Unit] = js.native
  
  /**
    * The given hash of operations (key additions or deletions) are executed on the DB
    * @example
    * const ops = [
    *    { type: 'del', key: Buffer.from('father') }
    *  , { type: 'put', key: Buffer.from('name'), value: Buffer.from('Yuri Irsenovich Kim') }
    *  , { type: 'put', key: Buffer.from('dob'), value: Buffer.from('16 February 1941') }
    *  , { type: 'put', key: Buffer.from('spouse'), value: Buffer.from('Kim Young-sook') }
    *  , { type: 'put', key: Buffer.from('occupation'), value: Buffer.from('Clown') }
    * ]
    * await trie.batch(ops)
    * @param {Array} ops
    */
  def batch(ops: js.Array[BatchDBOp]): js.Promise[Unit] = js.native
  
  /**
    * Checks if a given root exists.
    */
  def checkRoot(root: Buffer): js.Promise[Boolean] = js.native
  
  /**
    * Creates a new trie backed by the same db.
    */
  def copy(): Trie = js.native
  
  /**
    * The `data` event is given an `Object` that has two properties; the `key` and the `value`. Both should be Buffers.
    * @return {stream.Readable} Returns a [stream](https://nodejs.org/dist/latest-v12.x/docs/api/stream.html#stream_class_stream_readable) of the contents of the `trie`
    */
  def createReadStream(): TrieReadStream = js.native
  
  var db: DB = js.native
  
  /**
    * Deletes a value given a `key`.
    * @param {Buffer} key
    */
  def del(key: Buffer): js.Promise[Unit] = js.native
  
  /**
    * Tries to find a path to the node for the given key.
    * It returns a `stack` of nodes to the closet node.
    * @param {Buffer} key - the search key
    */
  def findPath(key: Buffer): js.Promise[Path] = js.native
  
  /**
    * Gets a value given a `key`
    * @param {Buffer} key - the key to search for
    * @returns A Promise that resolves to `Buffer` if a value was found or `null` if no value was found.
    */
  def get(key: Buffer): js.Promise[Buffer | Null] = js.native
  
  var lock: default = js.native
  
  /**
    * Stores a given `value` at the given `key`.
    * @param {Buffer} key
    * @param {Buffer} value
    */
  def put(key: Buffer, value: Buffer): js.Promise[Unit] = js.native
  
  def root: Buffer = js.native
  def root_=(value: Buffer): Unit = js.native
  
  def setRoot(): Unit = js.native
  def setRoot(value: Buffer): Unit = js.native
}
/* static members */
@JSImport("merkle-patricia-tree/dist/baseTrie", "Trie")
@js.native
object Trie extends js.Object {
  
  /**
    * Creates a proof from a trie and key that can be verified using [[Trie.verifyProof]].
    * @param {Trie} trie
    * @param {Buffer} key
    */
  def createProof(trie: Trie, key: Buffer): js.Promise[Proof] = js.native
  
  /**
    * Saves the nodes from a proof into the trie. If no trie is provided a new one wil be instantiated.
    * @param {Proof} proof
    * @param {Trie} trie
    */
  def fromProof(proof: Proof): js.Promise[Trie] = js.native
  def fromProof(proof: Proof, trie: Trie): js.Promise[Trie] = js.native
  
  /**
    * prove has been renamed to [[Trie.createProof]].
    * @deprecated
    * @param {Trie} trie
    * @param {Buffer} key
    */
  def prove(trie: Trie, key: Buffer): js.Promise[Proof] = js.native
  
  /**
    * Verifies a proof.
    * @param {Buffer} rootHash
    * @param {Buffer} key
    * @param {Proof} proof
    * @throws If proof is found to be invalid.
    * @returns The value from the key.
    */
  def verifyProof(rootHash: Buffer, key: Buffer, proof: Proof): js.Promise[Buffer | Null] = js.native
}
