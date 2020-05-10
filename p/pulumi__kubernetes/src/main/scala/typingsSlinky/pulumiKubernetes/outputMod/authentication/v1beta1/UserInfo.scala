package typingsSlinky.pulumiKubernetes.outputMod.authentication.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UserInfo holds the information about the user needed to implement the user.Info interface.
  */
@js.native
trait UserInfo extends js.Object {
  /**
    * Any additional information provided by the authenticator.
    */
  val extra: js.Object = js.native
  /**
    * The names of groups this user is a part of.
    */
  val groups: js.Array[String] = js.native
  /**
    * A unique value that identifies this user across time. If this user is deleted and another
    * user by the same name is added, they will have different UIDs.
    */
  val uid: String = js.native
  /**
    * The name that uniquely identifies this user among all active users.
    */
  val username: String = js.native
}

object UserInfo {
  @scala.inline
  def apply(extra: js.Object, groups: js.Array[String], uid: String, username: String): UserInfo = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
  @scala.inline
  implicit class UserInfoOps[Self <: UserInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtra(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

