package typingsSlinky.mnemonist.vpTreeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist/vp-tree", JSImport.Default)
@js.native
class default[T] protected () extends VPTree[T] {
  // Constructor
  def this(distance: DistanceFunction[T], items: js.Iterable[T]) = this()
}
/* static members */
@JSImport("mnemonist/vp-tree", JSImport.Default)
@js.native
object default extends js.Object {
  
  def from[I](iterable: StringDictionary[I], distance: DistanceFunction[I]): VPTree[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I], distance: DistanceFunction[I]): VPTree[I] = js.native
}
