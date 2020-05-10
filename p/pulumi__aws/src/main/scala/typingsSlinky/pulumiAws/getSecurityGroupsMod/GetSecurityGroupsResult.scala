package typingsSlinky.pulumiAws.getSecurityGroupsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.GetSecurityGroupsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecurityGroupsResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetSecurityGroupsFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * IDs of the matches security groups.
    */
  val ids: js.Array[String] = js.native
  val tags: StringDictionary[js.Any] = js.native
  /**
    * The VPC IDs of the matched security groups. The data source's tag or filter *will span VPCs*
    * unless the `vpc-id` filter is also used.
    */
  val vpcIds: js.Array[String] = js.native
}

object GetSecurityGroupsResult {
  @scala.inline
  def apply(id: String, ids: js.Array[String], tags: StringDictionary[js.Any], vpcIds: js.Array[String]): GetSecurityGroupsResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcIds = vpcIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecurityGroupsResult]
  }
  @scala.inline
  implicit class GetSecurityGroupsResultOps[Self <: GetSecurityGroupsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetSecurityGroupsFilter]): Self = {
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

