package typingsSlinky.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutCorsPolicyInput extends StObject {
  
  /**
    * The name of the container that you want to assign the CORS policy to.
    */
  var ContainerName: typingsSlinky.awsSdk.mediastoreMod.ContainerName = js.native
  
  /**
    * The CORS policy to apply to the container. 
    */
  var CorsPolicy: typingsSlinky.awsSdk.mediastoreMod.CorsPolicy = js.native
}
object PutCorsPolicyInput {
  
  @scala.inline
  def apply(ContainerName: ContainerName, CorsPolicy: CorsPolicy): PutCorsPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any], CorsPolicy = CorsPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutCorsPolicyInput]
  }
  
  @scala.inline
  implicit class PutCorsPolicyInputMutableBuilder[Self <: PutCorsPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsPolicy(value: CorsPolicy): Self = StObject.set(x, "CorsPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsPolicyVarargs(value: CorsRule*): Self = StObject.set(x, "CorsPolicy", js.Array(value :_*))
  }
}
