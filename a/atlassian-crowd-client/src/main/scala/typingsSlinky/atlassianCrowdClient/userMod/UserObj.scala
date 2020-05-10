package typingsSlinky.atlassianCrowdClient.userMod

import typingsSlinky.atlassianCrowdClient.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserObj extends js.Object {
  val active: Boolean = js.native
  val `display-name`: String = js.native
  val email: String = js.native
  val `first-name`: String = js.native
  val `last-name`: String = js.native
  val name: String = js.native
  val password: js.UndefOr[AnonValue] = js.native
}

object UserObj {
  @scala.inline
  def apply(
    active: Boolean,
    `display-name`: String,
    email: String,
    `first-name`: String,
    `last-name`: String,
    name: String
  ): UserObj = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("display-name")(`display-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("first-name")(`first-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("last-name")(`last-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserObj]
  }
  @scala.inline
  implicit class UserObjOps[Self <: UserObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDisplay-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFirst-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withLast-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: AnonValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
  }
  
}

