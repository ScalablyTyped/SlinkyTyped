package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerInstance extends StObject {
  
  /**
    * The instance identifier.
    */
  var InstanceId: js.UndefOr[NonEmptyString] = js.native
}
object AwsElbLoadBalancerInstance {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerInstance]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerInstanceMutableBuilder[Self <: AwsElbLoadBalancerInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: NonEmptyString): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
