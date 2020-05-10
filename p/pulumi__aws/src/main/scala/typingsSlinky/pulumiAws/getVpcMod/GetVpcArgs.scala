package typingsSlinky.pulumiAws.getVpcMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.GetVpcFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcArgs extends js.Object {
  /**
    * The cidr block of the desired VPC.
    */
  val cidrBlock: js.UndefOr[String] = js.native
  /**
    * Boolean constraint on whether the desired VPC is
    * the default VPC for the region.
    */
  val default: js.UndefOr[Boolean] = js.native
  /**
    * The DHCP options id of the desired VPC.
    */
  val dhcpOptionsId: js.UndefOr[String] = js.native
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpcFilter]] = js.native
  /**
    * The id of the specific VPC to retrieve.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The current state of the desired VPC.
    * Can be either `"pending"` or `"available"`.
    */
  val state: js.UndefOr[String] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired VPC.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetVpcArgs {
  @scala.inline
  def apply(): GetVpcArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcArgs]
  }
  @scala.inline
  implicit class GetVpcArgsOps[Self <: GetVpcArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
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
    def withFilters(value: js.Array[GetVpcFilter]): Self = {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
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

