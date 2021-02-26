package typingsSlinky.merklePatriciaTree

import typingsSlinky.merklePatriciaTree.baseTrieMod.Trie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scratchReadStreamMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @JSImport("merkle-patricia-tree/dist/scratchReadStream", "ScratchReadStream")
  @js.native
  class ScratchReadStream protected () extends StObject {
    def this(trie: Trie) = this()
    
    def _read(): js.Promise[Unit] = js.native
    
    var _started: js.Any = js.native
    
    var trie: js.Any = js.native
  }
}
