package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentResourcesDescription extends StObject {
  
  /**
    * Describes the LoadBalancer.
    */
  var LoadBalancer: js.UndefOr[LoadBalancerDescription] = js.native
}
object EnvironmentResourcesDescription {
  
  @scala.inline
  def apply(): EnvironmentResourcesDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentResourcesDescription]
  }
  
  @scala.inline
  implicit class EnvironmentResourcesDescriptionMutableBuilder[Self <: EnvironmentResourcesDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancer(value: LoadBalancerDescription): Self = StObject.set(x, "LoadBalancer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerUndefined: Self = StObject.set(x, "LoadBalancer", js.undefined)
  }
}
