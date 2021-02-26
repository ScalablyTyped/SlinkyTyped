package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomChangingEventUIParam extends StObject {
  
  /**
    * Gets reference to igZoombar.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object ZoomChangingEventUIParam {
  
  @scala.inline
  def apply(): ZoomChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomChangingEventUIParam]
  }
  
  @scala.inline
  implicit class ZoomChangingEventUIParamMutableBuilder[Self <: ZoomChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
