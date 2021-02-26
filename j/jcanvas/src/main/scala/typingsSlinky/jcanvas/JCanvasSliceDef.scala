package typingsSlinky.jcanvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JCanvasSliceDef extends StObject {
  
  /**
    * End angle in degrees from north
    */
  var end: Double = js.native
  
  var fillStyle: String = js.native
  
  var groups: js.UndefOr[js.Array[String]] = js.native
  
  var layer: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  /**
    * Radius in pixels
    */
  var radius: Double = js.native
  
  /**
    * Distance between slices as a fraction of the radius
    */
  var spread: js.UndefOr[Double] = js.native
  
  /**
    * Start angle in degrees from north
    */
  var start: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object JCanvasSliceDef {
  
  @scala.inline
  def apply(end: Double, fillStyle: String, radius: Double, start: Double, x: Double, y: Double): JCanvasSliceDef = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], fillStyle = fillStyle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[JCanvasSliceDef]
  }
  
  @scala.inline
  implicit class JCanvasSliceDefMutableBuilder[Self <: JCanvasSliceDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillStyle(value: String): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setLayer(value: Boolean): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpread(value: Double): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
