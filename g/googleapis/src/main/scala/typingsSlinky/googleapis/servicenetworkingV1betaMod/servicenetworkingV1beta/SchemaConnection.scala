package typingsSlinky.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * producer of type `PEERING`. Note that invoking this method with a
    * different range when connection is already established will not modify
    * already provisioned service producer subnetworks.
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setPeering(value: String): Self = this.set("peering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeering: Self = this.set("peering", js.undefined)
    
    @scala.inline
    def setReservedPeeringRangesVarargs(value: String*): Self = this.set("reservedPeeringRanges", js.Array(value :_*))
    
    @scala.inline
    def setReservedPeeringRanges(value: js.Array[String]): Self = this.set("reservedPeeringRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedPeeringRanges: Self = this.set("reservedPeeringRanges", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
}
