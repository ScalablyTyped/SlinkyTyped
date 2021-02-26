package typingsSlinky.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateHsmResponse extends StObject {
  
  /**
    * Information about the HSM that was created.
    */
  var Hsm: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.Hsm] = js.native
}
object CreateHsmResponse {
  
  @scala.inline
  def apply(): CreateHsmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHsmResponse]
  }
  
  @scala.inline
  implicit class CreateHsmResponseMutableBuilder[Self <: CreateHsmResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsm(value: Hsm): Self = StObject.set(x, "Hsm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmUndefined: Self = StObject.set(x, "Hsm", js.undefined)
  }
}
