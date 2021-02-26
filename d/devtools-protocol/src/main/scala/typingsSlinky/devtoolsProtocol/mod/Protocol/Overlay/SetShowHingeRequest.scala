package typingsSlinky.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetShowHingeRequest extends StObject {
  
  /**
    * hinge data, null means hideHinge
    */
  var hingeConfig: js.UndefOr[HingeConfig] = js.native
}
object SetShowHingeRequest {
  
  @scala.inline
  def apply(): SetShowHingeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetShowHingeRequest]
  }
  
  @scala.inline
  implicit class SetShowHingeRequestMutableBuilder[Self <: SetShowHingeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHingeConfig(value: HingeConfig): Self = StObject.set(x, "hingeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHingeConfigUndefined: Self = StObject.set(x, "hingeConfig", js.undefined)
  }
}
