package typingsSlinky.merklePatriciaTree

import typingsSlinky.abstractLeveldown.mod.AbstractIterator
import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import typingsSlinky.levelup.mod.LevelUp
import typingsSlinky.merklePatriciaTree.baseTrieMod.Proof
import typingsSlinky.merklePatriciaTree.baseTrieMod.Trie
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("merkle-patricia-tree", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class BaseTrie () extends Trie {
    def this(db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]) = this()
    def this(db: js.UndefOr[scala.Nothing], root: Buffer) = this()
    def this(db: Null, root: Buffer) = this()
    def this(db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]], root: Buffer) = this()
  }
  /* static members */
  @js.native
  object BaseTrie extends js.Object {
    
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
  
  @js.native
  class CheckpointTrie protected ()
    extends typingsSlinky.merklePatriciaTree.checkpointTrieMod.CheckpointTrie {
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any) = this()
  }
  
  @js.native
  class SecureTrie protected ()
    extends typingsSlinky.merklePatriciaTree.secureMod.SecureTrie {
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any) = this()
  }
  /* static members */
  @js.native
  object SecureTrie extends js.Object {
    
    /**
      * Creates a proof that can be verified using [[SecureTrie.verifyProof]].
      * @param {Trie} trie
      * @param {Buffer} key
      */
    def createProof(trie: typingsSlinky.merklePatriciaTree.secureMod.SecureTrie, key: Buffer): js.Promise[Proof] = js.native
    
    /**
      * prove has been renamed to [[SecureTrie.createProof]].
      * @deprecated
      * @param {Trie} trie
      * @param {Buffer} key
      */
    def prove(trie: typingsSlinky.merklePatriciaTree.secureMod.SecureTrie, key: Buffer): js.Promise[Proof] = js.native
    
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
}
