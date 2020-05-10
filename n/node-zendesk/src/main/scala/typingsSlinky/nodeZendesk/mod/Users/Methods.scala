package typingsSlinky.nodeZendesk.mod.Users

import typingsSlinky.nodeZendesk.mod.ZendeskCallback
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  /** User Auth */
  def auth(cb: ZendeskCallback[_, _]): js.Any = js.native
  /** Creating Users */
  def create(user: CreatePayload, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def createMany(users: CreateManyPayload, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
  def createOrUpdate(user: CreatePayload, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def createOrUpdateMany(users: CreateManyPayload, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
  /** Deleting Users */
  def delete(userId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any = js.native
  def incremental(startTime: Double, cb: ZendeskCallback[_, _]): ListPayload = js.native
  /** Users Export */
  def incrementalInclude(startTime: Double, include: js.Any, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def incrementalSample(startTime: Double, cb: ZendeskCallback[_, _]): ListPayload = js.native
  /** Listing Users */
  def list(cb: ZendeskCallback[_, _]): ListPayload = js.native
  def listByGroup(groupId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def listByOrganization(organizationId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  /** Getting own User */
  def me(cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  /** Merging Users */
  def merge(userId: ZendeskID, targetUserId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  /** Changing User Password */
  def password(userId: ZendeskID, oldPassword: String, newPassword: String, cb: ZendeskCallback[_, _]): js.Any = js.native
  /** Searching Users */
  def search(params: js.Any, cb: ZendeskCallback[_, _]): ListPayload = js.native
  /** Showing Users */
  def show(userId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def showMany(userIds: js.Array[ZendeskID], cb: ZendeskCallback[_, _]): ListPayload = js.native
  /** Suspending Users */
  def suspend(userId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def unsuspend(userId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  /** Updating Users */
  def update(userId: ZendeskID, user: UpdatePayload, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def updateMany(userIds: UpdateIdPayload, users: UpdateManyPayload, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
}

object Methods {
  @scala.inline
  def apply(
    auth: ZendeskCallback[_, _] => js.Any,
    create: (CreatePayload, ZendeskCallback[_, _]) => ResponsePayload,
    createMany: (CreateManyPayload, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload,
    createOrUpdate: (CreatePayload, ZendeskCallback[_, _]) => ResponsePayload,
    createOrUpdateMany: (CreateManyPayload, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload,
    delete: (ZendeskID, ZendeskCallback[_, _]) => js.Any,
    incremental: (Double, ZendeskCallback[_, _]) => ListPayload,
    incrementalInclude: (Double, js.Any, ZendeskCallback[_, _]) => ListPayload,
    incrementalSample: (Double, ZendeskCallback[_, _]) => ListPayload,
    list: ZendeskCallback[_, _] => ListPayload,
    listByGroup: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listByOrganization: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    me: ZendeskCallback[_, _] => ResponsePayload,
    merge: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => ResponsePayload,
    password: (ZendeskID, String, String, ZendeskCallback[_, _]) => js.Any,
    search: (js.Any, ZendeskCallback[_, _]) => ListPayload,
    show: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload,
    showMany: (js.Array[ZendeskID], ZendeskCallback[_, _]) => ListPayload,
    suspend: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload,
    unsuspend: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload,
    update: (ZendeskID, UpdatePayload, ZendeskCallback[_, _]) => ResponsePayload,
    updateMany: (UpdateIdPayload, UpdateManyPayload, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload
  ): Methods = {
    val __obj = js.Dynamic.literal(auth = js.Any.fromFunction1(auth), create = js.Any.fromFunction2(create), createMany = js.Any.fromFunction2(createMany), createOrUpdate = js.Any.fromFunction2(createOrUpdate), createOrUpdateMany = js.Any.fromFunction2(createOrUpdateMany), delete = js.Any.fromFunction2(delete), incremental = js.Any.fromFunction2(incremental), incrementalInclude = js.Any.fromFunction3(incrementalInclude), incrementalSample = js.Any.fromFunction2(incrementalSample), list = js.Any.fromFunction1(list), listByGroup = js.Any.fromFunction2(listByGroup), listByOrganization = js.Any.fromFunction2(listByOrganization), me = js.Any.fromFunction1(me), merge = js.Any.fromFunction3(merge), password = js.Any.fromFunction4(password), search = js.Any.fromFunction2(search), show = js.Any.fromFunction2(show), showMany = js.Any.fromFunction2(showMany), suspend = js.Any.fromFunction2(suspend), unsuspend = js.Any.fromFunction2(unsuspend), update = js.Any.fromFunction3(update), updateMany = js.Any.fromFunction3(updateMany))
    __obj.asInstanceOf[Methods]
  }
  @scala.inline
  implicit class MethodsOps[Self <: Methods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: ZendeskCallback[_, _] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: (CreatePayload, ZendeskCallback[_, _]) => ResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateMany(
      value: (CreateManyPayload, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createMany")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateOrUpdate(value: (CreatePayload, ZendeskCallback[_, _]) => ResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOrUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateOrUpdateMany(
      value: (CreateManyPayload, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createOrUpdateMany")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDelete(value: (ZendeskID, ZendeskCallback[_, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIncremental(value: (Double, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incremental")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIncrementalInclude(value: (Double, js.Any, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementalInclude")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIncrementalSample(value: (Double, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementalSample")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withList(value: ZendeskCallback[_, _] => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListByGroup(value: (ZendeskID, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByGroup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListByOrganization(value: (ZendeskID, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByOrganization")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMe(value: ZendeskCallback[_, _] => ResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("me")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMerge(value: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => ResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPassword(value: (ZendeskID, String, String, ZendeskCallback[_, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSearch(value: (js.Any, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShow(value: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShowMany(value: (js.Array[ZendeskID], ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMany")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSuspend(value: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspend")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnsuspend(value: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsuspend")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (ZendeskID, UpdatePayload, ZendeskCallback[_, _]) => ResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdateMany(
      value: (UpdateIdPayload, UpdateManyPayload, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMany")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

