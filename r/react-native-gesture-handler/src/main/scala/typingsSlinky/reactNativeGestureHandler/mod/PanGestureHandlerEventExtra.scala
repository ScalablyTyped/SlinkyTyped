package typingsSlinky.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanGestureHandlerEventExtra extends StObject {
  
  var absoluteX: Double = js.native
  
  var absoluteY: Double = js.native
  
  var translationX: Double = js.native
  
  var translationY: Double = js.native
  
  var velocityX: Double = js.native
  
  var velocityY: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object PanGestureHandlerEventExtra {
  
  @scala.inline
  def apply(
    absoluteX: Double,
    absoluteY: Double,
    translationX: Double,
    translationY: Double,
    velocityX: Double,
    velocityY: Double,
    x: Double,
    y: Double
  ): PanGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanGestureHandlerEventExtra]
  }
  
  @scala.inline
  implicit class PanGestureHandlerEventExtraMutableBuilder[Self <: PanGestureHandlerEventExtra] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsoluteX(value: Double): Self = StObject.set(x, "absoluteX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteY(value: Double): Self = StObject.set(x, "absoluteY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationX(value: Double): Self = StObject.set(x, "translationX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationY(value: Double): Self = StObject.set(x, "translationY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityX(value: Double): Self = StObject.set(x, "velocityX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityY(value: Double): Self = StObject.set(x, "velocityY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
