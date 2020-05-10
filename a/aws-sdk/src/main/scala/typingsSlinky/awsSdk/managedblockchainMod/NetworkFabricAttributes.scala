package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkFabricAttributes extends js.Object {
  /**
    * The edition of Amazon Managed Blockchain that Hyperledger Fabric uses. For more information, see Amazon Managed Blockchain Pricing.
    */
  var Edition: js.UndefOr[typingsSlinky.awsSdk.managedblockchainMod.Edition] = js.native
  /**
    * The endpoint of the ordering service for the network.
    */
  var OrderingServiceEndpoint: js.UndefOr[String] = js.native
}

object NetworkFabricAttributes {
  @scala.inline
  def apply(): NetworkFabricAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFabricAttributes]
  }
  @scala.inline
  implicit class NetworkFabricAttributesOps[Self <: NetworkFabricAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdition(value: Edition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Edition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Edition")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderingServiceEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrderingServiceEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderingServiceEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrderingServiceEndpoint")(js.undefined)
        ret
    }
  }
  
}

