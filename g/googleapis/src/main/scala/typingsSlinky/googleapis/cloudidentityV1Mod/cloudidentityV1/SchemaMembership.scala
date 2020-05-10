package typingsSlinky.googleapis.cloudidentityV1Mod.cloudidentityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource representing a Membership within a Group
  */
@js.native
trait SchemaMembership extends js.Object {
  /**
    * Creation timestamp of the Membership. Output only.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Membership in the format:
    * `groups/{group_id}/memberships/{member_id}`, where group_id is the unique
    * ID assigned to the Group to which Membership belongs to, and member_id is
    * the unique ID assigned to the member  Must be left blank while creating a
    * Membership.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * EntityKey of the entity to be added as the member. Must be set while
    * creating a Membership, read-only afterwards.  Currently allowed entity
    * types: `Users`, `Groups`.
    */
  var preferredMemberKey: js.UndefOr[SchemaEntityKey] = js.native
  /**
    * Roles for a member within the Group.  Currently supported
    * MembershipRoles: `&quot;MEMBER&quot;`.
    */
  var roles: js.UndefOr[js.Array[SchemaMembershipRole]] = js.native
  /**
    * Last updated timestamp of the Membership. Output only.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaMembership {
  @scala.inline
  def apply(): SchemaMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembership]
  }
  @scala.inline
  implicit class SchemaMembershipOps[Self <: SchemaMembership] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredMemberKey(value: SchemaEntityKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredMemberKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredMemberKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredMemberKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRoles(value: js.Array[SchemaMembershipRole]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

