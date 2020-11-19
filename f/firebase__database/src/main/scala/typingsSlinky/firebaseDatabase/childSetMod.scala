package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.nodeMod.NamedNode
import typingsSlinky.firebaseDatabase.sortedMapMod.SortedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/snap/childSet", JSImport.Namespace)
@js.native
object childSetMod extends js.Object {
  
  def buildChildSet[K, V](childList: js.Array[NamedNode], cmp: js.Function2[/* a */ NamedNode, /* b */ NamedNode, Double]): SortedMap[K, V] = js.native
  def buildChildSet[K, V](
    childList: js.Array[NamedNode],
    cmp: js.Function2[/* a */ NamedNode, /* b */ NamedNode, Double],
    keyFn: js.UndefOr[scala.Nothing],
    mapSortFn: js.Function2[/* a */ K, /* b */ K, Double]
  ): SortedMap[K, V] = js.native
  def buildChildSet[K, V](
    childList: js.Array[NamedNode],
    cmp: js.Function2[/* a */ NamedNode, /* b */ NamedNode, Double],
    keyFn: js.Function1[/* a */ NamedNode, K]
  ): SortedMap[K, V] = js.native
  def buildChildSet[K, V](
    childList: js.Array[NamedNode],
    cmp: js.Function2[/* a */ NamedNode, /* b */ NamedNode, Double],
    keyFn: js.Function1[/* a */ NamedNode, K],
    mapSortFn: js.Function2[/* a */ K, /* b */ K, Double]
  ): SortedMap[K, V] = js.native
}
