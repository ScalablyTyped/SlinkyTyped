package typingsSlinky.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseDatabase.indexMod.Index
import typingsSlinky.firebaseDatabase.nodeMod.NamedNode
import typingsSlinky.firebaseDatabase.nodeMod.Node
import typingsSlinky.firebaseDatabase.sortedMapMod.SortedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/snap/IndexMap", JSImport.Namespace)
@js.native
object indexMapMod extends js.Object {
  
  @js.native
  class IndexMap protected () extends js.Object {
    def this(
      indexes_ : StringDictionary[(SortedMap[NamedNode, Node]) | (/*FallbackType*/ js.Object)],
      indexSet_ : StringDictionary[Index]
    ) = this()
    
    def addIndex(indexDefinition: Index, existingChildren: SortedMap[String, Node]): IndexMap = js.native
    
    /**
      * Ensure that this node is properly tracked in any indexes that we're maintaining
      */
    def addToIndexes(namedNode: NamedNode, existingChildren: SortedMap[String, Node]): IndexMap = js.native
    
    def get(indexKey: String): (SortedMap[NamedNode, Node]) | Null = js.native
    
    def hasIndex(indexDefinition: Index): Boolean = js.native
    
    var indexSet_ : js.Any = js.native
    
    var indexes_ : js.Any = js.native
    
    /**
      * Create a new IndexMap instance with the given value removed
      */
    def removeFromIndexes(namedNode: NamedNode, existingChildren: SortedMap[String, Node]): IndexMap = js.native
  }
  /* static members */
  @js.native
  object IndexMap extends js.Object {
    
    /**
      * The default IndexMap for nodes without a priority
      */
    def Default: IndexMap = js.native
  }
}
