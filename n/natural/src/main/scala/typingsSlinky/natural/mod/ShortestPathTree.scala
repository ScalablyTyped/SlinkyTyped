package typingsSlinky.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortestPathTree extends StObject {
  
  def getDistTo(vertex: Double): Double = js.native
  
  def hasDistTo(vertex: Double): Boolean = js.native
  
  def pathTo(vertex: Double): js.Array[Double] = js.native
}
object ShortestPathTree {
  
  @scala.inline
  def apply(getDistTo: Double => Double, hasDistTo: Double => Boolean, pathTo: Double => js.Array[Double]): ShortestPathTree = {
    val __obj = js.Dynamic.literal(getDistTo = js.Any.fromFunction1(getDistTo), hasDistTo = js.Any.fromFunction1(hasDistTo), pathTo = js.Any.fromFunction1(pathTo))
    __obj.asInstanceOf[ShortestPathTree]
  }
  
  @scala.inline
  implicit class ShortestPathTreeMutableBuilder[Self <: ShortestPathTree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDistTo(value: Double => Double): Self = StObject.set(x, "getDistTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasDistTo(value: Double => Boolean): Self = StObject.set(x, "hasDistTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPathTo(value: Double => js.Array[Double]): Self = StObject.set(x, "pathTo", js.Any.fromFunction1(value))
  }
}
