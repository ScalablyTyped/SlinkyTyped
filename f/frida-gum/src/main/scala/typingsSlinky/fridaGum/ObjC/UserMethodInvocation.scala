package typingsSlinky.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserMethodInvocation[D, T, S] extends js.Object {
  var data: D = js.native
  var self: T = js.native
  var `super`: S = js.native
}

object UserMethodInvocation {
  @scala.inline
  def apply[D, T, S](data: D, self: T, `super`: S): UserMethodInvocation[D, T, S] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.updateDynamic("super")(`super`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserMethodInvocation[D, T, S]]
  }
  @scala.inline
  implicit class UserMethodInvocationOps[Self[d, t, s] <: UserMethodInvocation[d, t, s], D, T, S] (val x: Self[D, T, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, T, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, T, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, T, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, T, S]) with Other]
    @scala.inline
    def withData(value: D): Self[D, T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelf(value: T): Self[D, T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("self")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuper(value: S): Self[D, T, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("super")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

