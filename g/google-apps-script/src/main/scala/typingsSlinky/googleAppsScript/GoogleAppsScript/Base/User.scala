package typingsSlinky.googleAppsScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a user, suitable for scripting.
  */
@js.native
trait User extends js.Object {
  def getEmail(): String = js.native
  /** @deprecated DO NOT USE */ def getUserLoginId(): String = js.native
}

object User {
  @scala.inline
  def apply(getEmail: () => String, getUserLoginId: () => String): User = {
    val __obj = js.Dynamic.literal(getEmail = js.Any.fromFunction0(getEmail), getUserLoginId = js.Any.fromFunction0(getUserLoginId))
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEmail(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEmail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUserLoginId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserLoginId")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

