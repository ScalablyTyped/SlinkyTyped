package typingsSlinky.paystack

import typingsSlinky.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisable extends js.Object {
  def create(params: AnonAuthorization): js.Promise[Response] = js.native
  def disable(params: AnonCode): js.Promise[Responsedataundefined] = js.native
  def enable(params: AnonCode): js.Promise[Responsedataundefined] = js.native
  def get(id_or_subscription_code: String): js.Promise[Response] = js.native
  def list(): js.Promise[ResponsedataArrayanymetaaDictothers] = js.native
}

object AnonDisable {
  @scala.inline
  def apply(
    create: AnonAuthorization => js.Promise[Response],
    disable: AnonCode => js.Promise[Responsedataundefined],
    enable: AnonCode => js.Promise[Responsedataundefined],
    get: String => js.Promise[Response],
    list: () => js.Promise[ResponsedataArrayanymetaaDictothers]
  ): AnonDisable = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), disable = js.Any.fromFunction1(disable), enable = js.Any.fromFunction1(enable), get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list))
    __obj.asInstanceOf[AnonDisable]
  }
  @scala.inline
  implicit class AnonDisableOps[Self <: AnonDisable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAuthorization => js.Promise[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisable(value: AnonCode => js.Promise[Responsedataundefined]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnable(value: AnonCode => js.Promise[Responsedataundefined]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: String => js.Promise[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: () => js.Promise[ResponsedataArrayanymetaaDictothers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

