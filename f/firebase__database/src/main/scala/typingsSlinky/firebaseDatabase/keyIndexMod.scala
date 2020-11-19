package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.childrenNodeMod.ChildrenNode
import typingsSlinky.firebaseDatabase.indexMod.Index
import typingsSlinky.firebaseDatabase.nodeMod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/snap/indexes/KeyIndex", JSImport.Namespace)
@js.native
object keyIndexMod extends js.Object {
  
  val KEY_INDEX: KeyIndex = js.native
  
  @js.native
  class KeyIndex () extends Index {
    
    /**
      * @param {*} indexValue
      * @param {string} name
      * @return {!NamedNode}
      */
    def makePost(indexValue: String, name: String): NamedNode = js.native
  }
  /* static members */
  @js.native
  object KeyIndex extends js.Object {
    
    def __EMPTY_NODE: ChildrenNode = js.native
    def __EMPTY_NODE_=(`val`: ChildrenNode): Unit = js.native
  }
}
