package typingsSlinky.pulumiAws.defaultVpcDhcpOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultVpcDhcpOptionsArgs extends js.Object {
  /**
    * List of NETBIOS name servers.
    */
  val netbiosNameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
    */
  val netbiosNodeType: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object DefaultVpcDhcpOptionsArgs {
  @scala.inline
  def apply(): DefaultVpcDhcpOptionsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultVpcDhcpOptionsArgs]
  }
  @scala.inline
  implicit class DefaultVpcDhcpOptionsArgsOps[Self <: DefaultVpcDhcpOptionsArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

