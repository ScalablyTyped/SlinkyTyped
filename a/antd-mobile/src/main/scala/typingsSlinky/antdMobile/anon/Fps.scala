package typingsSlinky.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fps extends StObject {
  
  var className: String = js.native
  
  var fps: Double = js.native
  
  var leading: Double = js.native
  
  var loop: Boolean = js.native
  
  var text: String = js.native
  
  var trailing: Double = js.native
}
object Fps {
  
  @scala.inline
  def apply(className: String, fps: Double, leading: Double, loop: Boolean, text: String, trailing: Double): Fps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fps]
  }
  
  @scala.inline
  implicit class FpsMutableBuilder[Self <: Fps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailing(value: Double): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
  }
}
