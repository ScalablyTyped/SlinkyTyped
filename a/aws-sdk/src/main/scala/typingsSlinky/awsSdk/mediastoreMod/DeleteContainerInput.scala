package typingsSlinky.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteContainerInput extends StObject {
  
  /**
    * The name of the container to delete. 
    */
  var ContainerName: typingsSlinky.awsSdk.mediastoreMod.ContainerName = js.native
}
object DeleteContainerInput {
  
  @scala.inline
  def apply(ContainerName: ContainerName): DeleteContainerInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContainerInput]
  }
  
  @scala.inline
  implicit class DeleteContainerInputMutableBuilder[Self <: DeleteContainerInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
