package typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a private connection resource. A private connection is
  * implemented as a VPC Network Peering connection between a service
  * producer&#39;s VPC network and a service consumer&#39;s VPC network.
  */
@js.native
trait SchemaConnection extends js.Object {
  /**
    * The name of service consumer&#39;s VPC network that&#39;s connected with
    * service producer network, in the following format:
    * `projects/{project}/global/networks/{network}`. `{project}` is a project
    * number, such as in `12345` that includes the VPC service consumer&#39;s
    * VPC network. `{network}` is the name of the service consumer&#39;s VPC
    * network.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * Output only. The name of the VPC Network Peering connection that was
    * created by the service producer.
    */
  var peering: js.UndefOr[String] = js.native
  /**
    * The name of one or more allocated IP address ranges for this service
    * producer of type `PEERING`. Note that invoking CreateConnection method
    * with a different range when connection is already established will not
    * modify already provisioned service producer subnetworks. If
    * CreateConnection method is invoked repeatedly to reconnect when peering
    * connection had been disconnected on the consumer side, leaving this field
    * empty will restore previously allocated IP ranges.
    */
  var reservedPeeringRanges: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. The name of the peering service that&#39;s associated with
    * this connection, in the following format: `services/{service name}`.
    */
  var service: js.UndefOr[String] = js.native
}

object SchemaConnection {
  @scala.inline
  def apply(): SchemaConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnection]
  }
  @scala.inline
  implicit class SchemaConnectionOps[Self <: SchemaConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
        ret
    }
    @scala.inline
    def withPeering(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peering")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedPeeringRanges(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedPeeringRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedPeeringRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservedPeeringRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
  }
  
}

