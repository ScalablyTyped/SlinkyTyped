package typingsSlinky.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnAppShowCallbackResult extends StObject {
  
  var `object`: ResultOption = js.native
}
object OnAppShowCallbackResult {
  
  @scala.inline
  def apply(`object`: ResultOption): OnAppShowCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAppShowCallbackResult]
  }
  
  @scala.inline
  implicit class OnAppShowCallbackResultMutableBuilder[Self <: OnAppShowCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: ResultOption): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
