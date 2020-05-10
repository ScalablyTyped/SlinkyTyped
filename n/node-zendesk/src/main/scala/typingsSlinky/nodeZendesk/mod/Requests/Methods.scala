package typingsSlinky.nodeZendesk.mod.Requests

import typingsSlinky.nodeZendesk.mod.ZendeskCallback
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  /** Creating Requests */
  def create(request: CreatePayload, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  /** Get Comment */
  def getComment(requestId: ZendeskID, commentId: ZendeskID, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.Requests.Comments.ResponsePayload = js.native
  /** Viewing Requests */
  def getRequest(requestId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  /** Listing Requests */
  def list(cb: ZendeskCallback[_, _]): ListPayload = js.native
  def listByOrganization(organizationId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def listByUser(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def listCCD(organizationId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  /** Listing Comments */
  def listComments(requestId: ZendeskID, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.Requests.Comments.ListPayload = js.native
  def listOpen(cb: ZendeskCallback[_, _]): ListPayload = js.native
  def listSolved(cb: ZendeskCallback[_, _]): ListPayload = js.native
  /** Inherited */
  def requestAll(httpMethod: String, fields: js.Any, cb: ZendeskCallback[_, _]): ListPayload = js.native
  /** Updating Requests */
  def update(requestId: ZendeskID, request: UpdatePayload, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
}

object Methods {
  @scala.inline
  def apply(
    create: (CreatePayload, ZendeskCallback[_, _]) => ResponsePayload,
    getComment: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.Requests.Comments.ResponsePayload,
    getRequest: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload,
    list: ZendeskCallback[_, _] => ListPayload,
    listByOrganization: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listByUser: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listCCD: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listComments: (ZendeskID, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.Requests.Comments.ListPayload,
    listOpen: ZendeskCallback[_, _] => ListPayload,
    listSolved: ZendeskCallback[_, _] => ListPayload,
    requestAll: (String, js.Any, ZendeskCallback[_, _]) => ListPayload,
    update: (ZendeskID, UpdatePayload, ZendeskCallback[_, _]) => ResponsePayload
  ): Methods = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), getComment = js.Any.fromFunction3(getComment), getRequest = js.Any.fromFunction2(getRequest), list = js.Any.fromFunction1(list), listByOrganization = js.Any.fromFunction2(listByOrganization), listByUser = js.Any.fromFunction2(listByUser), listCCD = js.Any.fromFunction2(listCCD), listComments = js.Any.fromFunction2(listComments), listOpen = js.Any.fromFunction1(listOpen), listSolved = js.Any.fromFunction1(listSolved), requestAll = js.Any.fromFunction3(requestAll), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[Methods]
  }
  @scala.inline
  implicit class MethodsOps[Self <: Methods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: (CreatePayload, ZendeskCallback[_, _]) => ResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetComment(
      value: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.Requests.Comments.ResponsePayload
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComment")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetRequest(value: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRequest")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withList(value: ZendeskCallback[_, _] => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListByOrganization(value: (ZendeskID, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByOrganization")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListByUser(value: (ZendeskID, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByUser")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListCCD(value: (ZendeskID, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCCD")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListComments(
      value: (ZendeskID, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.Requests.Comments.ListPayload
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listComments")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListOpen(value: ZendeskCallback[_, _] => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListSolved(value: ZendeskCallback[_, _] => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSolved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestAll(value: (String, js.Any, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAll")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (ZendeskID, UpdatePayload, ZendeskCallback[_, _]) => ResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

