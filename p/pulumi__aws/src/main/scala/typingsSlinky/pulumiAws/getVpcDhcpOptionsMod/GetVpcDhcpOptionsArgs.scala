package typingsSlinky.pulumiAws.getVpcDhcpOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.GetVpcDhcpOptionsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcDhcpOptionsArgs extends js.Object {
  /**
    * The EC2 DHCP Options ID.
    */
  val dhcpOptionsId: js.UndefOr[String] = js.native
  /**
    * List of custom filters as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpcDhcpOptionsFilter]] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetVpcDhcpOptionsArgs {
  @scala.inline
  def apply(): GetVpcDhcpOptionsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcDhcpOptionsArgs]
  }
  @scala.inline
  implicit class GetVpcDhcpOptionsArgsOps[Self <: GetVpcDhcpOptionsArgs] (val x: Self) extends AnyVal {
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
    def withoutDhcpOptionsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dhcpOptionsId")(js.undefined)
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
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
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

