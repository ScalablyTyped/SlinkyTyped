package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableAllFeaturesResponse extends StObject {
  
  /**
    * A structure that contains details about the handshake created to support this request to enable all features in the organization.
    */
  var Handshake: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.Handshake] = js.native
}
object EnableAllFeaturesResponse {
  
  @scala.inline
  def apply(): EnableAllFeaturesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableAllFeaturesResponse]
  }
  
  @scala.inline
  implicit class EnableAllFeaturesResponseMutableBuilder[Self <: EnableAllFeaturesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandshake(value: Handshake): Self = StObject.set(x, "Handshake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandshakeUndefined: Self = StObject.set(x, "Handshake", js.undefined)
  }
}
