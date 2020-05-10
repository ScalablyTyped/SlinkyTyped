package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointDetails extends js.Object {
  /**
    * A dataflow endpoint.
    */
  var endpoint: js.UndefOr[DataflowEndpoint] = js.native
  /**
    * Endpoint security details.
    */
  var securityDetails: js.UndefOr[SecurityDetails] = js.native
}

object EndpointDetails {
  @scala.inline
  def apply(): EndpointDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointDetails]
  }
  @scala.inline
  implicit class EndpointDetailsOps[Self <: EndpointDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: DataflowEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityDetails(value: SecurityDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityDetails")(js.undefined)
        ret
    }
  }
  
}

