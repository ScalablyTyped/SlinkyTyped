package typingsSlinky.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAcceleratorResponse extends StObject {
  
  /**
    * Information about the updated accelerator.
    */
  var Accelerator: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.Accelerator] = js.native
}
object UpdateAcceleratorResponse {
  
  @scala.inline
  def apply(): UpdateAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAcceleratorResponse]
  }
  
  @scala.inline
  implicit class UpdateAcceleratorResponseMutableBuilder[Self <: UpdateAcceleratorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerator(value: Accelerator): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorUndefined: Self = StObject.set(x, "Accelerator", js.undefined)
  }
}
