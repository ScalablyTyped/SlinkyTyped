package typingsSlinky.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParticleEmitterBounds extends StObject {
  
  /**
    * The height of the rectangle.
    */
  var height: Double = js.native
  
  /**
    * The width of the rectangle.
    */
  var width: Double = js.native
  
  /**
    * The left edge of the rectangle.
    */
  var x: Double = js.native
  
  /**
    * The top edge of the rectangle.
    */
  var y: Double = js.native
}
object ParticleEmitterBounds {
  
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): ParticleEmitterBounds = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterBounds]
  }
  
  @scala.inline
  implicit class ParticleEmitterBoundsMutableBuilder[Self <: ParticleEmitterBounds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
