package typingsSlinky.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permissions extends js.Object {
  var excluded_permissions: js.Array[String] = js.native
  var interactions: FollowingBoolean = js.native
  var permissions: js.Array[String] = js.native
}

object Permissions {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    interactions: FollowingBoolean,
    permissions: js.Array[String]
  ): Permissions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permissions]
  }
  @scala.inline
  implicit class PermissionsOps[Self <: Permissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcluded_permissions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excluded_permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteractions(value: FollowingBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

