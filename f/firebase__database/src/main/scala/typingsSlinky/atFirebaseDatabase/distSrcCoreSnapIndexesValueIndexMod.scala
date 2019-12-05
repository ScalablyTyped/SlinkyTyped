package typingsSlinky.atFirebaseDatabase

import typingsSlinky.atFirebaseDatabase.distSrcCoreSnapIndexesIndexMod.Index
import typingsSlinky.atFirebaseDatabase.distSrcCoreSnapIndexesValueIndexMod.ValueIndex
import typingsSlinky.atFirebaseDatabase.distSrcCoreSnapNodeMod.NamedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/snap/indexes/ValueIndex", JSImport.Namespace)
@js.native
object distSrcCoreSnapIndexesValueIndexMod extends js.Object {
  @js.native
  class ValueIndex () extends Index {
    /**
      * @param {*} indexValue
      * @param {string} name
      * @return {!NamedNode}
      */
    def makePost(indexValue: js.Object, name: String): NamedNode = js.native
  }
  
  val VALUE_INDEX: ValueIndex = js.native
}

