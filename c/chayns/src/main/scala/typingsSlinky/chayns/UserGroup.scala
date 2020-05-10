package typingsSlinky.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enviroment Variables
  * User
  * interfaces
  */
// chayns.env.user.groups
@js.native
trait UserGroup extends js.Object {
  var id: Double = js.native
  var isActive: js.UndefOr[Boolean] = js.native
  var isSystemGroup: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var showName: js.UndefOr[String] = js.native
}

object UserGroup {
  @scala.inline
  def apply(id: Double, name: String): UserGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserGroup]
  }
  @scala.inline
  implicit class UserGroupOps[Self <: UserGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSystemGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSystemGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSystemGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSystemGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withShowName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showName")(js.undefined)
        ret
    }
  }
  
}

