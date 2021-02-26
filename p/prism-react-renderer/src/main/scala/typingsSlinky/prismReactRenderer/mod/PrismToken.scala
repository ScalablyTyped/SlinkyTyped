package typingsSlinky.prismReactRenderer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrismToken extends StObject {
  
  var content: (js.Array[PrismToken | String]) | String = js.native
  
  var `type`: String = js.native
}
object PrismToken {
  
  @scala.inline
  def apply(content: (js.Array[PrismToken | String]) | String, `type`: String): PrismToken = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrismToken]
  }
  
  @scala.inline
  implicit class PrismTokenMutableBuilder[Self <: PrismToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: (js.Array[PrismToken | String]) | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVarargs(value: (PrismToken | String)*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
