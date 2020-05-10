package typingsSlinky.nodeOsUtils.usersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Users extends js.Object {
  def openedCount(): js.Promise[Double | String] = js.native
}

object Users {
  @scala.inline
  def apply(openedCount: () => js.Promise[Double | String]): Users = {
    val __obj = js.Dynamic.literal(openedCount = js.Any.fromFunction0(openedCount))
    __obj.asInstanceOf[Users]
  }
  @scala.inline
  implicit class UsersOps[Self <: Users] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenedCount(value: () => js.Promise[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openedCount")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

