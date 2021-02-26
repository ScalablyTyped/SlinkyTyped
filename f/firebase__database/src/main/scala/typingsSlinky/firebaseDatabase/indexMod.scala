package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.nodeMod.NamedNode
import typingsSlinky.firebaseDatabase.nodeMod.Node
import typingsSlinky.firebaseDatabase.sortedMapMod.Comparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/indexes/Index", "Index")
  @js.native
  abstract class Index () extends StObject {
    
    /**
      * @param {!NamedNode} a
      * @param {!NamedNode} b
      * @return {number}
      */
    def compare(a: NamedNode, b: NamedNode): Double = js.native
    
    /**
      * @return {function(!NamedNode, !NamedNode):number} A standalone comparison function for
      * this index
      */
    def getCompare(): Comparator[NamedNode] = js.native
    
    /**
      * Given a before and after value for a node, determine if the indexed value has changed. Even if they are different,
      * it's possible that the changes are isolated to parts of the snapshot that are not indexed.
      *
      * @param {!Node} oldNode
      * @param {!Node} newNode
      * @return {boolean} True if the portion of the snapshot being indexed changed between oldNode and newNode
      */
    def indexedValueChanged(oldNode: Node, newNode: Node): Boolean = js.native
    
    /**
      * @param {!Node} node
      * @return {boolean}
      */
    def isDefinedOn(node: Node): Boolean = js.native
    
    /**
      * @param {*} indexValue
      * @param {string} name
      * @return {!NamedNode}
      */
    def makePost(indexValue: js.Any, name: String): NamedNode = js.native
    
    /**
      * @return {!NamedNode} a node wrapper that will sort greater than or equal to
      * any other node wrapper, using this index
      */
    def maxPost(): NamedNode = js.native
    
    /**
      * @return {!NamedNode} a node wrapper that will sort equal to or less than
      * any other node wrapper, using this index
      */
    def minPost(): NamedNode = js.native
  }
}
