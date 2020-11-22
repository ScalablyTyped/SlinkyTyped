package typingsSlinky.ol.triangulationMod

import typingsSlinky.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Triangulation extends js.Object {
  
  /**
    * Calculates extent of the 'source' coordinates from all the triangles.
    */
  def calculateSourceExtent(): Extent = js.native
  
  def getTriangles(): js.Array[Triangle] = js.native
}
object Triangulation {
  
  @scala.inline
  def apply(calculateSourceExtent: () => Extent, getTriangles: () => js.Array[Triangle]): Triangulation = {
    val __obj = js.Dynamic.literal(calculateSourceExtent = js.Any.fromFunction0(calculateSourceExtent), getTriangles = js.Any.fromFunction0(getTriangles))
    __obj.asInstanceOf[Triangulation]
  }
  
  @scala.inline
  implicit class TriangulationOps[Self <: Triangulation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalculateSourceExtent(value: () => Extent): Self = this.set("calculateSourceExtent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTriangles(value: () => js.Array[Triangle]): Self = this.set("getTriangles", js.Any.fromFunction0(value))
  }
}
