package typingsSlinky.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteHsmResponse extends StObject {
  
  /**
    * The identifier (ID) of the HSM that was deleted.
    */
  var HsmId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.HsmId] = js.native
}
object DeleteHsmResponse {
  
  @scala.inline
  def apply(): DeleteHsmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteHsmResponse]
  }
  
  @scala.inline
  implicit class DeleteHsmResponseMutableBuilder[Self <: DeleteHsmResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsmId(value: HsmId): Self = StObject.set(x, "HsmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmIdUndefined: Self = StObject.set(x, "HsmId", js.undefined)
  }
}
