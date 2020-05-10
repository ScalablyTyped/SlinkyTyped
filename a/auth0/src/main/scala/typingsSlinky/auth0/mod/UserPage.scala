package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPage[A, U] extends Page {
  var users: js.Array[User[A, U]] = js.native
}

object UserPage {
  @scala.inline
  def apply[A, U](length: Double, limit: Double, start: Double, total: Double, users: js.Array[User[A, U]]): UserPage[A, U] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPage[A, U]]
  }
  @scala.inline
  implicit class UserPageOps[Self[a, u] <: UserPage[a, u], A, U] (val x: Self[A, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[A, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[A, U]) with Other]
    @scala.inline
    def withUsers(value: js.Array[User[A, U]]): Self[A, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

