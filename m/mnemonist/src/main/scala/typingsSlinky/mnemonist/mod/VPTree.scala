package typingsSlinky.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mnemonist.vpTreeMod.DistanceFunction
import typingsSlinky.mnemonist.vpTreeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "VPTree")
@js.native
class VPTree[T] protected () extends default[T] {
  // Constructor
  def this(distance: DistanceFunction[T], items: js.Iterable[T]) = this()
}
/* static members */
@JSImport("mnemonist", "VPTree")
@js.native
object VPTree extends js.Object {
  
  def from[I](iterable: StringDictionary[I], distance: DistanceFunction[I]): typingsSlinky.mnemonist.vpTreeMod.VPTree[I] = js.native
  // Statics
  def from[I](iterable: js.Iterable[I], distance: DistanceFunction[I]): typingsSlinky.mnemonist.vpTreeMod.VPTree[I] = js.native
}
