package typingsSlinky.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait To extends StObject {
  
  var _from: String = js.native
  
  var _to: String = js.native
}
object To {
  
  @scala.inline
  def apply(_from: String, _to: String): To = {
    val __obj = js.Dynamic.literal(_from = _from.asInstanceOf[js.Any], _to = _to.asInstanceOf[js.Any])
    __obj.asInstanceOf[To]
  }
  
  @scala.inline
  implicit class ToMutableBuilder[Self <: To] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_from(value: String): Self = StObject.set(x, "_from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_to(value: String): Self = StObject.set(x, "_to", value.asInstanceOf[js.Any])
  }
}
