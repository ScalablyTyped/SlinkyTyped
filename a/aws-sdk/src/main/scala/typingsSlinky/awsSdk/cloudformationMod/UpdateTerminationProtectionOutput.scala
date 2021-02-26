package typingsSlinky.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTerminationProtectionOutput extends StObject {
  
  /**
    * The unique ID of the stack.
    */
  var StackId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackId] = js.native
}
object UpdateTerminationProtectionOutput {
  
  @scala.inline
  def apply(): UpdateTerminationProtectionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTerminationProtectionOutput]
  }
  
  @scala.inline
  implicit class UpdateTerminationProtectionOutputMutableBuilder[Self <: UpdateTerminationProtectionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
