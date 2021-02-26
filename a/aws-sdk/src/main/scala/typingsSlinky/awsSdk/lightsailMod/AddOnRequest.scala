package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddOnRequest extends StObject {
  
  /**
    * The add-on type.
    */
  var addOnType: AddOnType = js.native
  
  /**
    * An object that represents additional parameters when enabling or modifying the automatic snapshot add-on.
    */
  var autoSnapshotAddOnRequest: js.UndefOr[AutoSnapshotAddOnRequest] = js.native
}
object AddOnRequest {
  
  @scala.inline
  def apply(addOnType: AddOnType): AddOnRequest = {
    val __obj = js.Dynamic.literal(addOnType = addOnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOnRequest]
  }
  
  @scala.inline
  implicit class AddOnRequestMutableBuilder[Self <: AddOnRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOnType(value: AddOnType): Self = StObject.set(x, "addOnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSnapshotAddOnRequest(value: AutoSnapshotAddOnRequest): Self = StObject.set(x, "autoSnapshotAddOnRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSnapshotAddOnRequestUndefined: Self = StObject.set(x, "autoSnapshotAddOnRequest", js.undefined)
  }
}
