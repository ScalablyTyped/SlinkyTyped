package typingsSlinky.easyRbac.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleObject extends js.Object {
  var name: String = js.native
  def when(params: js.Object): js.Promise[Boolean] = js.native
}

object RoleObject {
  @scala.inline
  def apply(name: String, when: js.Object => js.Promise[Boolean]): RoleObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], when = js.Any.fromFunction1(when))
    __obj.asInstanceOf[RoleObject]
  }
  @scala.inline
  implicit class RoleObjectOps[Self <: RoleObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhen(value: js.Object => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

