package typingsSlinky.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceMetadataOptions extends StObject {
  
  /**
    * This parameter enables or disables the HTTP metadata endpoint on your instances. If the parameter is not specified, the default state is enabled.  If you specify a value of disabled, you will not be able to access your instance metadata.  
    */
  var HttpEndpoint: js.UndefOr[InstanceMetadataEndpointState] = js.native
  
  /**
    * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Default: 1 Possible values: Integers from 1 to 64
    */
  var HttpPutResponseHopLimit: js.UndefOr[InstanceMetadataHttpPutResponseHopLimit] = js.native
  
  /**
    * The state of token usage for your instance metadata requests. If the parameter is not specified in the request, the default state is optional. If the state is optional, you can choose to retrieve instance metadata with or without a signed token header on your request. If you retrieve the IAM role credentials without a token, the version 1.0 role credentials are returned. If you retrieve the IAM role credentials using a valid signed token, the version 2.0 role credentials are returned. If the state is required, you must send a signed token header with any instance metadata retrieval requests. In this state, retrieving the IAM role credentials always returns the version 2.0 credentials; the version 1.0 credentials are not available.
    */
  var HttpTokens: js.UndefOr[InstanceMetadataHttpTokensState] = js.native
}
object InstanceMetadataOptions {
  
  @scala.inline
  def apply(): InstanceMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceMetadataOptions]
  }
  
  @scala.inline
  implicit class InstanceMetadataOptionsMutableBuilder[Self <: InstanceMetadataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpEndpoint(value: InstanceMetadataEndpointState): Self = StObject.set(x, "HttpEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpEndpointUndefined: Self = StObject.set(x, "HttpEndpoint", js.undefined)
    
    @scala.inline
    def setHttpPutResponseHopLimit(value: InstanceMetadataHttpPutResponseHopLimit): Self = StObject.set(x, "HttpPutResponseHopLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpPutResponseHopLimitUndefined: Self = StObject.set(x, "HttpPutResponseHopLimit", js.undefined)
    
    @scala.inline
    def setHttpTokens(value: InstanceMetadataHttpTokensState): Self = StObject.set(x, "HttpTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpTokensUndefined: Self = StObject.set(x, "HttpTokens", js.undefined)
  }
}
