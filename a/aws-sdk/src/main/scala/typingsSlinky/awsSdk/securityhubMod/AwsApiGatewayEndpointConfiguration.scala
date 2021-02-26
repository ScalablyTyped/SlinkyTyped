package typingsSlinky.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsApiGatewayEndpointConfiguration extends StObject {
  
  /**
    * A list of endpoint types for the REST API. For an edge-optimized API, the endpoint type is EDGE. For a Regional API, the endpoint type is REGIONAL. For a private API, the endpoint type is PRIVATE.
    */
  var Types: js.UndefOr[NonEmptyStringList] = js.native
}
object AwsApiGatewayEndpointConfiguration {
  
  @scala.inline
  def apply(): AwsApiGatewayEndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayEndpointConfiguration]
  }
  
  @scala.inline
  implicit class AwsApiGatewayEndpointConfigurationMutableBuilder[Self <: AwsApiGatewayEndpointConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypes(value: NonEmptyStringList): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "Types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: NonEmptyString*): Self = StObject.set(x, "Types", js.Array(value :_*))
  }
}
