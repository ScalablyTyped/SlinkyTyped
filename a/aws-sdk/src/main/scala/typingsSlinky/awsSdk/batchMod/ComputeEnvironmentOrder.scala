package typingsSlinky.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeEnvironmentOrder extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  var computeEnvironment: String = js.native
  
  /**
    * The order of the compute environment.
    */
  var order: Integer = js.native
}
object ComputeEnvironmentOrder {
  
  @scala.inline
  def apply(computeEnvironment: String, order: Integer): ComputeEnvironmentOrder = {
    val __obj = js.Dynamic.literal(computeEnvironment = computeEnvironment.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeEnvironmentOrder]
  }
  
  @scala.inline
  implicit class ComputeEnvironmentOrderMutableBuilder[Self <: ComputeEnvironmentOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeEnvironment(value: String): Self = StObject.set(x, "computeEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Integer): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
