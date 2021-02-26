package typingsSlinky.athenajs.mod

import typingsSlinky.athenajs.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationObject extends StObject {
  
  var frameDuration: js.UndefOr[Double] = js.native
  
  var frames: js.Array[Height] = js.native
  
  var loop: js.UndefOr[Double] = js.native
  
  var speed: js.UndefOr[Double] = js.native
}
object AnimationObject {
  
  @scala.inline
  def apply(frames: js.Array[Height]): AnimationObject = {
    val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationObject]
  }
  
  @scala.inline
  implicit class AnimationObjectMutableBuilder[Self <: AnimationObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameDuration(value: Double): Self = StObject.set(x, "frameDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameDurationUndefined: Self = StObject.set(x, "frameDuration", js.undefined)
    
    @scala.inline
    def setFrames(value: js.Array[Height]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesVarargs(value: Height*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    @scala.inline
    def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
