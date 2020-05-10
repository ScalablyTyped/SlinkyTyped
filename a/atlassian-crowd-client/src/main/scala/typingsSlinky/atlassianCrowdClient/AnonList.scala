package typingsSlinky.atlassianCrowdClient

import typingsSlinky.atlassianCrowdClient.attributesMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonList extends js.Object {
  var password: AnonReset = js.native
  var username: AnonRequest = js.native
  def list(username: String): js.Promise[^] = js.native
  def remove(username: String, attributename: String): js.Promise[Unit] = js.native
  def set(username: String, attributes: ^): js.Promise[^] = js.native
}

object AnonList {
  @scala.inline
  def apply(
    list: String => js.Promise[^],
    password: AnonReset,
    remove: (String, String) => js.Promise[Unit],
    set: (String, ^) => js.Promise[^],
    username: AnonRequest
  ): AnonList = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), password = password.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set), username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonList]
  }
  @scala.inline
  implicit class AnonListOps[Self <: AnonList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: String => js.Promise[^]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPassword(value: AnonReset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: (String, String) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSet(value: (String, ^) => js.Promise[^]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUsername(value: AnonRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

