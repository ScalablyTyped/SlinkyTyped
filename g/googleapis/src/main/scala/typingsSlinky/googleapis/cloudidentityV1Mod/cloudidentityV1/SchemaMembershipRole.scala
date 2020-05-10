package typingsSlinky.googleapis.cloudidentityV1Mod.cloudidentityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource representing a role within a Membership.
  */
@js.native
trait SchemaMembershipRole extends js.Object {
  /**
    * MembershipRole in string format.  Currently supported MembershipRoles:
    * `&quot;MEMBER&quot;`.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaMembershipRole {
  @scala.inline
  def apply(): SchemaMembershipRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipRole]
  }
  @scala.inline
  implicit class SchemaMembershipRoleOps[Self <: SchemaMembershipRole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

