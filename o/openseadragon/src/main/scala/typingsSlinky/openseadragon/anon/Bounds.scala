package typingsSlinky.openseadragon.anon

import typingsSlinky.openseadragon.mod.Point
import typingsSlinky.openseadragon.mod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bounds extends StObject {
  
  var bounds: js.UndefOr[Rect] = js.native
  
  var compositeOperation: js.UndefOr[String] = js.native
  
  var opacity: Double = js.native
  
  var scale: js.UndefOr[Double] = js.native
  
  var translate: js.UndefOr[Point] = js.native
}
object Bounds {
  
  @scala.inline
  def apply(opacity: Double): Bounds = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  
  @scala.inline
  implicit class BoundsMutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: Rect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setCompositeOperation(value: String): Self = StObject.set(x, "compositeOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeOperationUndefined: Self = StObject.set(x, "compositeOperation", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setTranslate(value: Point): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
  }
}
