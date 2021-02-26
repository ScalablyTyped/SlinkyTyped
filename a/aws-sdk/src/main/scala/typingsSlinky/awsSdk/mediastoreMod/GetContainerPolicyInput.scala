package typingsSlinky.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContainerPolicyInput extends StObject {
  
  /**
    * The name of the container. 
    */
  var ContainerName: typingsSlinky.awsSdk.mediastoreMod.ContainerName = js.native
}
object GetContainerPolicyInput {
  
  @scala.inline
  def apply(ContainerName: ContainerName): GetContainerPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerPolicyInput]
  }
  
  @scala.inline
  implicit class GetContainerPolicyInputMutableBuilder[Self <: GetContainerPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
