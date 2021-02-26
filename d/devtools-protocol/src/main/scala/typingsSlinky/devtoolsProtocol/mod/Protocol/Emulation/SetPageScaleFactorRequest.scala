package typingsSlinky.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetPageScaleFactorRequest extends StObject {
  
  /**
    * Page scale factor.
    */
  var pageScaleFactor: Double = js.native
}
object SetPageScaleFactorRequest {
  
  @scala.inline
  def apply(pageScaleFactor: Double): SetPageScaleFactorRequest = {
    val __obj = js.Dynamic.literal(pageScaleFactor = pageScaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPageScaleFactorRequest]
  }
  
  @scala.inline
  implicit class SetPageScaleFactorRequestMutableBuilder[Self <: SetPageScaleFactorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageScaleFactor(value: Double): Self = StObject.set(x, "pageScaleFactor", value.asInstanceOf[js.Any])
  }
}
