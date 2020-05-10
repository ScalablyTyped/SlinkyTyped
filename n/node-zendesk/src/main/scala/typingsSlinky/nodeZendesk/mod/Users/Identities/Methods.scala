package typingsSlinky.nodeZendesk.mod.Users.Identities

import typingsSlinky.nodeZendesk.mod.ZendeskCallback
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  /** Creating Identities */
  def create(userId: ZendeskID, identity: CreatePayload, cb: ZendeskCallback[_, _]): ResponseModel = js.native
  /** Deleting Identities */
  def delete(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any = js.native
  /** Listing Identities */
  def list(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def makePrimary(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def requestVerification(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any = js.native
  /** Viewing Identities */
  def show(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  /** Updating Identities */
  def update(userId: ZendeskID, identityId: ZendeskID, identity: UpdatePayload, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def verify(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
}

object Methods {
  @scala.inline
  def apply(
    create: (ZendeskID, CreatePayload, ZendeskCallback[_, _]) => ResponseModel,
    delete: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => js.Any,
    list: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    makePrimary: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    requestVerification: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => js.Any,
    show: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => ResponsePayload,
    update: (ZendeskID, ZendeskID, UpdatePayload, ZendeskCallback[_, _]) => ResponsePayload,
    verify: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => ResponsePayload
  ): Methods = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), delete = js.Any.fromFunction3(delete), list = js.Any.fromFunction2(list), makePrimary = js.Any.fromFunction3(makePrimary), requestVerification = js.Any.fromFunction3(requestVerification), show = js.Any.fromFunction3(show), update = js.Any.fromFunction4(update), verify = js.Any.fromFunction3(verify))
    __obj.asInstanceOf[Methods]
  }
  @scala.inline
  implicit class MethodsOps[Self <: Methods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: (ZendeskID, CreatePayload, ZendeskCallback[_, _]) => ResponseModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDelete(value: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withList(value: (ZendeskID, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMakePrimary(value: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makePrimary")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRequestVerification(value: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestVerification")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withShow(value: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => ResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (ZendeskID, ZendeskID, UpdatePayload, ZendeskCallback[_, _]) => ResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withVerify(value: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => ResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

