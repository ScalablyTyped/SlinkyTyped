package typingsSlinky.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseAnimationsRequest extends StObject {
  
  /**
    * List of animation ids to seek.
    */
  var animations: js.Array[String] = js.native
}
object ReleaseAnimationsRequest {
  
  @scala.inline
  def apply(animations: js.Array[String]): ReleaseAnimationsRequest = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseAnimationsRequest]
  }
  
  @scala.inline
  implicit class ReleaseAnimationsRequestMutableBuilder[Self <: ReleaseAnimationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimations(value: js.Array[String]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsVarargs(value: String*): Self = StObject.set(x, "animations", js.Array(value :_*))
  }
}
