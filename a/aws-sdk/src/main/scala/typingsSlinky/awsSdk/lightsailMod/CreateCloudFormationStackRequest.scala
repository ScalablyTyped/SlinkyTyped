package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCloudFormationStackRequest extends StObject {
  
  /**
    * An array of parameters that will be used to create the new Amazon EC2 instance. You can only pass one instance entry at a time in this array. You will get an invalid parameter error if you pass more than one instance entry in this array.
    */
  var instances: InstanceEntryList = js.native
}
object CreateCloudFormationStackRequest {
  
  @scala.inline
  def apply(instances: InstanceEntryList): CreateCloudFormationStackRequest = {
    val __obj = js.Dynamic.literal(instances = instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCloudFormationStackRequest]
  }
  
  @scala.inline
  implicit class CreateCloudFormationStackRequestMutableBuilder[Self <: CreateCloudFormationStackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: InstanceEntryList): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesVarargs(value: InstanceEntry*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
