package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaProjectsSetDefaultNetworkTierRequest extends StObject {
  
  /**
    * Default network tier to be set.
    */
  var networkTier: js.UndefOr[String] = js.native
}
object SchemaProjectsSetDefaultNetworkTierRequest {
  
  @scala.inline
  def apply(): SchemaProjectsSetDefaultNetworkTierRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectsSetDefaultNetworkTierRequest]
  }
  
  @scala.inline
  implicit class SchemaProjectsSetDefaultNetworkTierRequestMutableBuilder[Self <: SchemaProjectsSetDefaultNetworkTierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkTier(value: String): Self = StObject.set(x, "networkTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkTierUndefined: Self = StObject.set(x, "networkTier", js.undefined)
  }
}
