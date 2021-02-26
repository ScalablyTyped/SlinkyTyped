package typingsSlinky.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLifecyclePolicyInput extends StObject {
  
  /**
    * The name of the container that holds the object lifecycle policy.
    */
  var ContainerName: typingsSlinky.awsSdk.mediastoreMod.ContainerName = js.native
}
object DeleteLifecyclePolicyInput {
  
  @scala.inline
  def apply(ContainerName: ContainerName): DeleteLifecyclePolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLifecyclePolicyInput]
  }
  
  @scala.inline
  implicit class DeleteLifecyclePolicyInputMutableBuilder[Self <: DeleteLifecyclePolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
