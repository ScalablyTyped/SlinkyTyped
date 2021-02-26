package typingsSlinky.d3pie.anon

import typingsSlinky.d3pie.d3pieStrings.back
import typingsSlinky.d3pie.d3pieStrings.bounce
import typingsSlinky.d3pie.d3pieStrings.elastic
import typingsSlinky.d3pie.d3pieStrings.linear
import typingsSlinky.d3pie.d3pieStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Size extends StObject {
  
  var effect: js.UndefOr[none | linear | bounce | elastic | back] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var speed: js.UndefOr[Double] = js.native
}
object Size {
  
  @scala.inline
  def apply(): Size = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffect(value: none | linear | bounce | elastic | back): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
