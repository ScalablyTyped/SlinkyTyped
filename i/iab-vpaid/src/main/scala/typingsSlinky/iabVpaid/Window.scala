package typingsSlinky.iabVpaid

import typingsSlinky.iabVpaid.iab.vpaid.VpaidCreative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  /** VPAID entry point */
  var getVPAIDAd: js.UndefOr[js.Function0[VpaidCreative]] = js.native
}
object Window {
  
  @scala.inline
  def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetVPAIDAd(value: () => VpaidCreative): Self = StObject.set(x, "getVPAIDAd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVPAIDAdUndefined: Self = StObject.set(x, "getVPAIDAd", js.undefined)
  }
}
