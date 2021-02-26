package typingsSlinky.rmcNukaCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transform extends StObject {
  
  var WebkitTransform: String = js.native
  
  var left: String = js.native
  
  var msTransform: String = js.native
  
  var position: String = js.native
  
  var top: String = js.native
  
  var transform: String = js.native
}
object Transform {
  
  @scala.inline
  def apply(
    WebkitTransform: String,
    left: String,
    msTransform: String,
    position: String,
    top: String,
    transform: String
  ): Transform = {
    val __obj = js.Dynamic.literal(WebkitTransform = WebkitTransform.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], msTransform = msTransform.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit class TransformMutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsTransform(value: String): Self = StObject.set(x, "msTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitTransform(value: String): Self = StObject.set(x, "WebkitTransform", value.asInstanceOf[js.Any])
  }
}
