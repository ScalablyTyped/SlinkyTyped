package typingsSlinky.merklePatriciaTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object baseTrieMod {
  
  type FoundNode = js.Function4[
    /* nodeRef */ typingsSlinky.node.Buffer, 
    /* node */ typingsSlinky.merklePatriciaTree.trieNodeMod.TrieNode, 
    /* key */ typingsSlinky.merklePatriciaTree.trieNodeMod.Nibbles, 
    /* walkController */ js.Any, 
    scala.Unit
  ]
  
  type Proof = js.Array[typingsSlinky.node.Buffer]
}
