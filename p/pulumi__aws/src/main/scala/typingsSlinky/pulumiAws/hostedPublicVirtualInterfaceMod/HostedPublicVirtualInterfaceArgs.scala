package typingsSlinky.pulumiAws.hostedPublicVirtualInterfaceMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedPublicVirtualInterfaceArgs extends js.Object {
  
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: Input[String] = js.native
  
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
    */
  val amazonAddress: js.UndefOr[Input[String]] = js.native
  
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  val bgpAsn: Input[Double] = js.native
  
  /**
    * The authentication key for BGP configuration.
    */
  val bgpAuthKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
    */
  val connectionId: Input[String] = js.native
  
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
    */
  val customerAddress: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name for the virtual interface.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The AWS account that will own the new virtual interface.
    */
  val ownerAccountId: Input[String] = js.native
  
  /**
    * A list of routes to be advertised to the AWS network in this region.
    */
  val routeFilterPrefixes: Input[js.Array[Input[String]]] = js.native
  
  /**
    * The VLAN ID.
    */
  val vlan: Input[Double] = js.native
}
object HostedPublicVirtualInterfaceArgs {
  
  @scala.inline
  def apply(
    addressFamily: Input[String],
    bgpAsn: Input[Double],
    connectionId: Input[String],
    ownerAccountId: Input[String],
    routeFilterPrefixes: Input[js.Array[Input[String]]],
    vlan: Input[Double]
  ): HostedPublicVirtualInterfaceArgs = {
    val __obj = js.Dynamic.literal(addressFamily = addressFamily.asInstanceOf[js.Any], bgpAsn = bgpAsn.asInstanceOf[js.Any], connectionId = connectionId.asInstanceOf[js.Any], ownerAccountId = ownerAccountId.asInstanceOf[js.Any], routeFilterPrefixes = routeFilterPrefixes.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedPublicVirtualInterfaceArgs]
  }
  
  @scala.inline
  implicit class HostedPublicVirtualInterfaceArgsOps[Self <: HostedPublicVirtualInterfaceArgs] (val x: Self) extends AnyVal {
    
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
    def setAddressFamily(value: Input[String]): Self = this.set("addressFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgpAsn(value: Input[Double]): Self = this.set("bgpAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionId(value: Input[String]): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccountId(value: Input[String]): Self = this.set("ownerAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteFilterPrefixesVarargs(value: Input[String]*): Self = this.set("routeFilterPrefixes", js.Array(value :_*))
    
    @scala.inline
    def setRouteFilterPrefixes(value: Input[js.Array[Input[String]]]): Self = this.set("routeFilterPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVlan(value: Input[Double]): Self = this.set("vlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmazonAddress(value: Input[String]): Self = this.set("amazonAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmazonAddress: Self = this.set("amazonAddress", js.undefined)
    
    @scala.inline
    def setBgpAuthKey(value: Input[String]): Self = this.set("bgpAuthKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgpAuthKey: Self = this.set("bgpAuthKey", js.undefined)
    
    @scala.inline
    def setCustomerAddress(value: Input[String]): Self = this.set("customerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerAddress: Self = this.set("customerAddress", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
