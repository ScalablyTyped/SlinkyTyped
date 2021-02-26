package typingsSlinky.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetKeepScreenOnArgs extends AsyncCallback[Unit] {
  
  var keepScreenOn: Boolean = js.native
}
object SetKeepScreenOnArgs {
  
  @scala.inline
  def apply(keepScreenOn: Boolean): SetKeepScreenOnArgs = {
    val __obj = js.Dynamic.literal(keepScreenOn = keepScreenOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetKeepScreenOnArgs]
  }
  
  @scala.inline
  implicit class SetKeepScreenOnArgsMutableBuilder[Self <: SetKeepScreenOnArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeepScreenOn(value: Boolean): Self = StObject.set(x, "keepScreenOn", value.asInstanceOf[js.Any])
  }
}
