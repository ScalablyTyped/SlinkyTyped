package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRoleAliasesResponse extends js.Object {
  /**
    * A marker used to get the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
  /**
    * The role aliases.
    */
  var roleAliases: js.UndefOr[RoleAliases] = js.native
}

object ListRoleAliasesResponse {
  @scala.inline
  def apply(): ListRoleAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoleAliasesResponse]
  }
  @scala.inline
  implicit class ListRoleAliasesResponseOps[Self <: ListRoleAliasesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleAliases(value: RoleAliases): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAliases")(js.undefined)
        ret
    }
  }
  
}

