package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Where messages should be sent
  */
@js.native
trait CapabilityStatementMessagingEndpoint extends BackboneElement {
  /**
    * Contains extended information for property 'address'.
    */
  var _address: js.UndefOr[Element] = js.native
  /**
    * Network address or identifier of the end-point
    */
  var address: uri = js.native
  /**
    * http | ftp | mllp +
    */
  var protocol: Coding = js.native
}

object CapabilityStatementMessagingEndpoint {
  @scala.inline
  def apply(address: uri, protocol: Coding): CapabilityStatementMessagingEndpoint = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementMessagingEndpoint]
  }
  @scala.inline
  implicit class CapabilityStatementMessagingEndpointOps[Self <: CapabilityStatementMessagingEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_address(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_address")(js.undefined)
        ret
    }
  }
  
}

