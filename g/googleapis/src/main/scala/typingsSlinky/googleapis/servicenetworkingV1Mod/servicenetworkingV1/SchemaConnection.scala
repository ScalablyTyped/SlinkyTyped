package typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a private connection resource. A private connection is
  * implemented as a VPC Network Peering connection between a service
  * producer&#39;s VPC network and a service consumer&#39;s VPC network.
  */
@js.native
trait SchemaConnection extends StObject {
  
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
  implicit class SchemaConnectionMutableBuilder[Self <: SchemaConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setPeering(value: String): Self = StObject.set(x, "peering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeeringUndefined: Self = StObject.set(x, "peering", js.undefined)
    
    @scala.inline
    def setReservedPeeringRanges(value: js.Array[String]): Self = StObject.set(x, "reservedPeeringRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedPeeringRangesUndefined: Self = StObject.set(x, "reservedPeeringRanges", js.undefined)
    
    @scala.inline
    def setReservedPeeringRangesVarargs(value: String*): Self = StObject.set(x, "reservedPeeringRanges", js.Array(value :_*))
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
