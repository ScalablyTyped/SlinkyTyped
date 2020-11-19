package typingsSlinky.mnemonist.vpTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VPTree[T] extends js.Object {
  
  // Members
  def distance(a: T, b: T): Double = js.native
  // Members
  @JSName("distance")
  var distance_Original: DistanceFunction[T] = js.native
  
  // Methods
  def nearestNeighbors(k: Double, query: T): js.Array[QueryMatch[T]] = js.native
  
  def neighbors(radius: Double, query: T): js.Array[QueryMatch[T]] = js.native
  
  var size: Double = js.native
}
