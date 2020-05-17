package typingsSlinky.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  val id: String = js.native
  val mayManage: js.UndefOr[Boolean] = js.native
  val mayRead: js.UndefOr[Boolean] = js.native
  val mayWrite: js.UndefOr[Boolean] = js.native
  val path: String = js.native
  val updatedAt: js.Date = js.native
  val userId: String = js.native
}

object Permission {
  @scala.inline
  def apply(id: String, path: String, updatedAt: js.Date, userId: String): Permission = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMayManage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayManage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMayManage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayManage")(js.undefined)
        ret
    }
    @scala.inline
    def withMayRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMayRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayRead")(js.undefined)
        ret
    }
    @scala.inline
    def withMayWrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMayWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayWrite")(js.undefined)
        ret
    }
  }
  
}

