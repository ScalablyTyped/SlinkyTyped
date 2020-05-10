package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGroupsToOverride extends js.Object {
  var groupsToOverride: js.UndefOr[js.Array[String]] = js.native
  var iamRolesToOverride: js.UndefOr[js.Array[String]] = js.native
  var preferredRole: js.UndefOr[String] = js.native
}

object AnonGroupsToOverride {
  @scala.inline
  def apply(): AnonGroupsToOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonGroupsToOverride]
  }
  @scala.inline
  implicit class AnonGroupsToOverrideOps[Self <: AnonGroupsToOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupsToOverride(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupsToOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupsToOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupsToOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRolesToOverride(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRolesToOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRolesToOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRolesToOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredRole")(js.undefined)
        ret
    }
  }
  
}

