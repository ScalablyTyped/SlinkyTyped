package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberFabricAttributes extends js.Object {
  /**
    * The user name for the initial administrator user for the member.
    */
  var AdminUsername: js.UndefOr[UsernameString] = js.native
  /**
    * The endpoint used to access the member's certificate authority.
    */
  var CaEndpoint: js.UndefOr[String] = js.native
}

object MemberFabricAttributes {
  @scala.inline
  def apply(): MemberFabricAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberFabricAttributes]
  }
  @scala.inline
  implicit class MemberFabricAttributesOps[Self <: MemberFabricAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminUsername(value: UsernameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdminUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdminUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdminUsername")(js.undefined)
        ret
    }
    @scala.inline
    def withCaEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaEndpoint")(js.undefined)
        ret
    }
  }
  
}

