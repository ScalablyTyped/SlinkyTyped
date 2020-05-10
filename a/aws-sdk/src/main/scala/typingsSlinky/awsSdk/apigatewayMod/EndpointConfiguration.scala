package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointConfiguration extends js.Object {
  /**
    * A list of endpoint types of an API (RestApi) or its custom domain name (DomainName). For an edge-optimized API and its custom domain name, the endpoint type is "EDGE". For a regional API and its custom domain name, the endpoint type is REGIONAL. For a private API, the endpoint type is PRIVATE.
    */
  var types: js.UndefOr[ListOfEndpointType] = js.native
  /**
    * A list of VpcEndpointIds of an API (RestApi) against which to create Route53 ALIASes. It is only supported for PRIVATE endpoint type.
    */
  var vpcEndpointIds: js.UndefOr[ListOfString] = js.native
}

object EndpointConfiguration {
  @scala.inline
  def apply(): EndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointConfiguration]
  }
  @scala.inline
  implicit class EndpointConfigurationOps[Self <: EndpointConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTypes(value: ListOfEndpointType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcEndpointIds(value: ListOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcEndpointIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcEndpointIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcEndpointIds")(js.undefined)
        ret
    }
  }
  
}

