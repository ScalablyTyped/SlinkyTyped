package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEndpointRequest extends js.Object {
  /**
    * The endpoint type. Valid endpoint types include:    iot:Data - Returns a VeriSign signed data endpoint.      iot:Data-ATS - Returns an ATS signed data endpoint.      iot:CredentialProvider - Returns an AWS IoT credentials provider API endpoint.      iot:Jobs - Returns an AWS IoT device management Jobs API endpoint.   We strongly recommend that customers use the newer iot:Data-ATS endpoint type to avoid issues related to the widespread distrust of Symantec certificate authorities.
    */
  var endpointType: js.UndefOr[EndpointType] = js.native
}

object DescribeEndpointRequest {
  @scala.inline
  def apply(): DescribeEndpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointRequest]
  }
  @scala.inline
  implicit class DescribeEndpointRequestOps[Self <: DescribeEndpointRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointType(value: EndpointType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointType")(js.undefined)
        ret
    }
  }
  
}

