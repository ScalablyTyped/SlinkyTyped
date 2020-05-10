package typingsSlinky.pulumiAws.vpcDhcpOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcDhcpOptionsArgs extends js.Object {
  /**
    * the suffix domain name to use by default when resolving non Fully Qualified Domain Names. In other words, this is what ends up being the `search` value in the `/etc/resolv.conf` file.
    */
  val domainName: js.UndefOr[Input[String]] = js.native
  /**
    * List of name servers to configure in `/etc/resolv.conf`. If you want to use the default AWS nameservers you should set this to `AmazonProvidedDNS`.
    */
  val domainNameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of NETBIOS name servers.
    */
  val netbiosNameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
    */
  val netbiosNodeType: js.UndefOr[Input[String]] = js.native
  /**
    * List of NTP servers to configure.
    */
  val ntpServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object VpcDhcpOptionsArgs {
  @scala.inline
  def apply(): VpcDhcpOptionsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcDhcpOptionsArgs]
  }
  @scala.inline
  implicit class VpcDhcpOptionsArgsOps[Self <: VpcDhcpOptionsArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainNameServers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainNameServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainNameServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainNameServers")(js.undefined)
        ret
    }
    @scala.inline
    def withNetbiosNameServers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netbiosNameServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetbiosNameServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netbiosNameServers")(js.undefined)
        ret
    }
    @scala.inline
    def withNetbiosNodeType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netbiosNodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetbiosNodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netbiosNodeType")(js.undefined)
        ret
    }
    @scala.inline
    def withNtpServers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ntpServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNtpServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ntpServers")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

