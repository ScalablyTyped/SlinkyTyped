package typingsSlinky.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameAnimationEvent extends StObject {
  
  var animation: typingsSlinky.plotlyJs.anon.Frame = js.native
  
  var frame: Frame = js.native
  
  var name: String = js.native
}
object FrameAnimationEvent {
  
  @scala.inline
  def apply(animation: typingsSlinky.plotlyJs.anon.Frame, frame: Frame, name: String): FrameAnimationEvent = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameAnimationEvent]
  }
  
  @scala.inline
  implicit class FrameAnimationEventMutableBuilder[Self <: FrameAnimationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: typingsSlinky.plotlyJs.anon.Frame): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
