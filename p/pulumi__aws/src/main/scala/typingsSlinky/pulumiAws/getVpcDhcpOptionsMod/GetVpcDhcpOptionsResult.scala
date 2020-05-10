package typingsSlinky.pulumiAws.getVpcDhcpOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.GetVpcDhcpOptionsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcDhcpOptionsResult extends js.Object {
  /**
    * EC2 DHCP Options ID
    */
  val dhcpOptionsId: String = js.native
  /**
    * The suffix domain name to used when resolving non Fully Qualified Domain Names. e.g. the `search` value in the `/etc/resolv.conf` file.
    */
  val domainName: String = js.native
  /**
    * List of name servers.
    */
  val domainNameServers: js.Array[String] = js.native
  val filters: js.UndefOr[js.Array[GetVpcDhcpOptionsFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * List of NETBIOS name servers.
    */
  val netbiosNameServers: js.Array[String] = js.native
  /**
    * The NetBIOS node type (1, 2, 4, or 8). For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
    */
  val netbiosNodeType: String = js.native
  /**
    * List of NTP servers.
    */
  val ntpServers: js.Array[String] = js.native
  /**
    * The ID of the AWS account that owns the DHCP options set.
    */
  val ownerId: String = js.native
  /**
    * A mapping of tags assigned to the resource.
    */
  val tags: StringDictionary[js.Any] = js.native
}

object GetVpcDhcpOptionsResult {
  @scala.inline
  def apply(
    dhcpOptionsId: String,
    domainName: String,
    domainNameServers: js.Array[String],
    id: String,
    netbiosNameServers: js.Array[String],
    netbiosNodeType: String,
    ntpServers: js.Array[String],
    ownerId: String,
    tags: StringDictionary[js.Any]
  ): GetVpcDhcpOptionsResult = {
    val __obj = js.Dynamic.literal(dhcpOptionsId = dhcpOptionsId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], domainNameServers = domainNameServers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], netbiosNameServers = netbiosNameServers.asInstanceOf[js.Any], netbiosNodeType = netbiosNodeType.asInstanceOf[js.Any], ntpServers = ntpServers.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcDhcpOptionsResult]
  }
  @scala.inline
  implicit class GetVpcDhcpOptionsResultOps[Self <: GetVpcDhcpOptionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDhcpOptionsId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dhcpOptionsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainNameServers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainNameServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetbiosNameServers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netbiosNameServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetbiosNodeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netbiosNodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNtpServers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ntpServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetVpcDhcpOptionsFilter]): Self = {
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

