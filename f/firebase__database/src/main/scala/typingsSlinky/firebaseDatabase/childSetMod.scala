package typingsSlinky.firebaseDatabase

import typingsSlinky.firebaseDatabase.nodeMod.NamedNode
import typingsSlinky.firebaseDatabase.sortedMapMod.SortedMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object childSetMod {
  
  @JSImport("@firebase/database/dist/src/core/snap/childSet", "buildChildSet")
  @js.native
  def buildChildSet[K, V](childList: js.Array[NamedNode], cmp: js.Function2[/* a */ NamedNode, /* b */ NamedNode, Double]): SortedMap[K, V] = js.native
  @JSImport("@firebase/database/dist/src/core/snap/childSet", "buildChildSet")
  @js.native
  def buildChildSet[K, V](
    childList: js.Array[NamedNode],
    cmp: js.Function2[/* a */ NamedNode, /* b */ NamedNode, Double],
    keyFn: js.UndefOr[scala.Nothing],
    mapSortFn: js.Function2[/* a */ K, /* b */ K, Double]
  ): SortedMap[K, V] = js.native
  @JSImport("@firebase/database/dist/src/core/snap/childSet", "buildChildSet")
  @js.native
  def buildChildSet[K, V](
    childList: js.Array[NamedNode],
    cmp: js.Function2[/* a */ NamedNode, /* b */ NamedNode, Double],
    keyFn: js.Function1[/* a */ NamedNode, K]
  ): SortedMap[K, V] = js.native
  @JSImport("@firebase/database/dist/src/core/snap/childSet", "buildChildSet")
  @js.native
  def buildChildSet[K, V](
    childList: js.Array[NamedNode],
    cmp: js.Function2[/* a */ NamedNode, /* b */ NamedNode, Double],
    keyFn: js.Function1[/* a */ NamedNode, K],
    mapSortFn: js.Function2[/* a */ K, /* b */ K, Double]
  ): SortedMap[K, V] = js.native
}
