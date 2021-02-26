package typingsSlinky.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCloudMapServiceDiscovery extends StObject {
  
  /**
    * A string map that contains attributes with values that you can use to filter instances by any custom attribute that you specified when you registered the instance. Only instances that match all of the specified key/value pairs will be returned.
    */
  var attributes: js.UndefOr[AwsCloudMapInstanceAttributes] = js.native
  
  /**
    * The name of the AWS Cloud Map namespace to use.
    */
  var namespaceName: AwsCloudMapName = js.native
  
  /**
    * The name of the AWS Cloud Map service to use.
    */
  var serviceName: AwsCloudMapName = js.native
}
object AwsCloudMapServiceDiscovery {
  
  @scala.inline
  def apply(namespaceName: AwsCloudMapName, serviceName: AwsCloudMapName): AwsCloudMapServiceDiscovery = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsCloudMapServiceDiscovery]
  }
  
  @scala.inline
  implicit class AwsCloudMapServiceDiscoveryMutableBuilder[Self <: AwsCloudMapServiceDiscovery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AwsCloudMapInstanceAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: AwsCloudMapInstanceAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setNamespaceName(value: AwsCloudMapName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: AwsCloudMapName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
