package typingsSlinky.nodeZendesk.mod.Users.Fields

import typingsSlinky.nodeZendesk.mod.ZendeskCallback
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  def create(field: js.Any, cb: ZendeskCallback[_, _]): js.Any = js.native
  def delete(fieldId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any = js.native
  def list(cb: ZendeskCallback[_, _]): js.Any = js.native
  def show(fieldId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any = js.native
  def update(fieldId: ZendeskID, field: js.Any, cb: ZendeskCallback[_, _]): js.Any = js.native
}

object Methods {
  @scala.inline
  def apply(
    create: (js.Any, ZendeskCallback[_, _]) => js.Any,
    delete: (ZendeskID, ZendeskCallback[_, _]) => js.Any,
    list: ZendeskCallback[_, _] => js.Any,
    show: (ZendeskID, ZendeskCallback[_, _]) => js.Any,
    update: (ZendeskID, js.Any, ZendeskCallback[_, _]) => js.Any
  ): Methods = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), delete = js.Any.fromFunction2(delete), list = js.Any.fromFunction1(list), show = js.Any.fromFunction2(show), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[Methods]
  }
  @scala.inline
  implicit class MethodsOps[Self <: Methods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: (js.Any, ZendeskCallback[_, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDelete(value: (ZendeskID, ZendeskCallback[_, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withList(value: ZendeskCallback[_, _] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: (ZendeskID, ZendeskCallback[_, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (ZendeskID, js.Any, ZendeskCallback[_, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

