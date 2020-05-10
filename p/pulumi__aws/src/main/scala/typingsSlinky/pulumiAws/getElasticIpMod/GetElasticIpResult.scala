package typingsSlinky.pulumiAws.getElasticIpMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.GetElasticIpFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetElasticIpResult extends js.Object {
  /**
    * The ID representing the association of the address with an instance in a VPC.
    */
  val associationId: String = js.native
  /**
    * Indicates whether the address is for use in EC2-Classic (standard) or in a VPC (vpc).
    */
  val domain: String = js.native
  val filters: js.UndefOr[js.Array[GetElasticIpFilter]] = js.native
  /**
    * If VPC Elastic IP, the allocation identifier. If EC2-Classic Elastic IP, the public IP address.
    */
  val id: String = js.native
  /**
    * The ID of the instance that the address is associated with (if any).
    */
  val instanceId: String = js.native
  /**
    * The ID of the network interface.
    */
  val networkInterfaceId: String = js.native
  /**
    * The ID of the AWS account that owns the network interface.
    */
  val networkInterfaceOwnerId: String = js.native
  /**
    * The Private DNS associated with the Elastic IP address.
    */
  val privateDns: String = js.native
  /**
    * The private IP address associated with the Elastic IP address.
    */
  val privateIp: String = js.native
  /**
    * Public DNS associated with the Elastic IP address.
    */
  val publicDns: String = js.native
  /**
    * Public IP address of Elastic IP.
    */
  val publicIp: String = js.native
  /**
    * The ID of an address pool.
    */
  val publicIpv4Pool: String = js.native
  /**
    * Key-value map of tags associated with Elastic IP.
    */
  val tags: StringDictionary[js.Any] = js.native
}

object GetElasticIpResult {
  @scala.inline
  def apply(
    associationId: String,
    domain: String,
    id: String,
    instanceId: String,
    networkInterfaceId: String,
    networkInterfaceOwnerId: String,
    privateDns: String,
    privateIp: String,
    publicDns: String,
    publicIp: String,
    publicIpv4Pool: String,
    tags: StringDictionary[js.Any]
  ): GetElasticIpResult = {
    val __obj = js.Dynamic.literal(associationId = associationId.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], networkInterfaceOwnerId = networkInterfaceOwnerId.asInstanceOf[js.Any], privateDns = privateDns.asInstanceOf[js.Any], privateIp = privateIp.asInstanceOf[js.Any], publicDns = publicDns.asInstanceOf[js.Any], publicIp = publicIp.asInstanceOf[js.Any], publicIpv4Pool = publicIpv4Pool.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetElasticIpResult]
  }
  @scala.inline
  implicit class GetElasticIpResultOps[Self <: GetElasticIpResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkInterfaceOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateDns(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateDns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicDns(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicDns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicIpv4Pool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIpv4Pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetElasticIpFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
  }
  
}

