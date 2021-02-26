package typingsSlinky.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameRequestDialogResponse extends DialogResponse {
  
  var request: String = js.native
  
  var to: js.Array[String] = js.native
}
object GameRequestDialogResponse {
  
  @scala.inline
  def apply(request: String, to: js.Array[String]): GameRequestDialogResponse = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameRequestDialogResponse]
  }
  
  @scala.inline
  implicit class GameRequestDialogResponseMutableBuilder[Self <: GameRequestDialogResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value :_*))
  }
}
