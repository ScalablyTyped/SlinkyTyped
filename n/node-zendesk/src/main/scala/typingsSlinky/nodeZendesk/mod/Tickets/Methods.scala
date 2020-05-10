package typingsSlinky.nodeZendesk.mod.Tickets

import typingsSlinky.nodeZendesk.mod.ZendeskCallback
import typingsSlinky.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  /** Adding Tags */
  def addTags(ticketId: ZendeskID, tags: js.Array[String], cb: ZendeskCallback[_, _]): TagsPayload = js.native
  /** Creating Tickets */
  def create(ticket: CreatePayload, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def createMany(tickets: CreateManyPayload, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
  /** Deleting Tickets */
  def delete(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any = js.native
  def deleteMany(ticketIds: js.Array[ZendeskID], cb: ZendeskCallback[_, _]): js.Any = js.native
  /** Ticket Exports */
  def export(startTime: Double, cb: ZendeskCallback[_, _]): js.Any = js.native
  /** Listing Audits */
  def exportAudit(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): AuditsListPayload = js.native
  def exportSample(startTime: Double, options: js.Any): js.Any = js.native
  /** Listing Comments */
  def getComments(requestId: ZendeskID, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.Tickets.Comments.ListPayload = js.native
  def incremental(startTime: Double, cb: ZendeskCallback[_, _]): js.Any = js.native
  def incrementalInclude(startTime: Double, include: js.Any, cb: ZendeskCallback[_, _]): js.Any = js.native
  def incrementalSample(startTime: Double, cb: ZendeskCallback[_, _]): js.Any = js.native
  /** Listing Tickets */
  def list(cb: ZendeskCallback[_, _]): ListPayload = js.native
  def listAssigned(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def listByOrganization(organizationId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def listByUserCCD(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def listByUserRequested(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def listCollaborators(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.Users.ListPayload = js.native
  def listIncidents(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def listMetrics(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponsePayload = js.native
  def listRecent(cb: ZendeskCallback[_, _]): ListPayload = js.native
  def listWithFilter(`type`: String, value: js.Any, cb: ZendeskCallback[_, _]): ListPayload = js.native
  /** Merging Tickets */
  def merge(ticketId: ZendeskID, mergingTickets: MergePayload, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
  /** Viewing Tickets */
  def show(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def showMany(ticketIds: js.Array[ZendeskID], cb: ZendeskCallback[_, _]): ListPayload = js.native
  /** Updating Tickets */
  def update(ticketId: ZendeskID, ticket: UpdatePayload, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def updateMany(tickets: UpdateManyPayload, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
}

object Methods {
  @scala.inline
  def apply(
    addTags: (ZendeskID, js.Array[String], ZendeskCallback[_, _]) => TagsPayload,
    create: (CreatePayload, ZendeskCallback[_, _]) => ResponsePayload,
    createMany: (CreateManyPayload, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload,
    delete: (ZendeskID, ZendeskCallback[_, _]) => js.Any,
    deleteMany: (js.Array[ZendeskID], ZendeskCallback[_, _]) => js.Any,
    export: (Double, ZendeskCallback[_, _]) => js.Any,
    exportAudit: (ZendeskID, ZendeskCallback[_, _]) => AuditsListPayload,
    exportSample: (Double, js.Any) => js.Any,
    getComments: (ZendeskID, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.Tickets.Comments.ListPayload,
    incremental: (Double, ZendeskCallback[_, _]) => js.Any,
    incrementalInclude: (Double, js.Any, ZendeskCallback[_, _]) => js.Any,
    incrementalSample: (Double, ZendeskCallback[_, _]) => js.Any,
    list: ZendeskCallback[_, _] => ListPayload,
    listAssigned: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listByOrganization: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listByUserCCD: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listByUserRequested: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listCollaborators: (ZendeskID, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.Users.ListPayload,
    listIncidents: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listMetrics: (ZendeskID, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponsePayload,
    listRecent: ZendeskCallback[_, _] => ListPayload,
    listWithFilter: (String, js.Any, ZendeskCallback[_, _]) => ListPayload,
    merge: (ZendeskID, MergePayload, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload,
    show: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload,
    showMany: (js.Array[ZendeskID], ZendeskCallback[_, _]) => ListPayload,
    update: (ZendeskID, UpdatePayload, ZendeskCallback[_, _]) => ResponsePayload,
    updateMany: (UpdateManyPayload, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload
  ): Methods = {
    val __obj = js.Dynamic.literal(addTags = js.Any.fromFunction3(addTags), create = js.Any.fromFunction2(create), createMany = js.Any.fromFunction2(createMany), delete = js.Any.fromFunction2(delete), deleteMany = js.Any.fromFunction2(deleteMany), export = js.Any.fromFunction2(export), exportAudit = js.Any.fromFunction2(exportAudit), exportSample = js.Any.fromFunction2(exportSample), getComments = js.Any.fromFunction2(getComments), incremental = js.Any.fromFunction2(incremental), incrementalInclude = js.Any.fromFunction3(incrementalInclude), incrementalSample = js.Any.fromFunction2(incrementalSample), list = js.Any.fromFunction1(list), listAssigned = js.Any.fromFunction2(listAssigned), listByOrganization = js.Any.fromFunction2(listByOrganization), listByUserCCD = js.Any.fromFunction2(listByUserCCD), listByUserRequested = js.Any.fromFunction2(listByUserRequested), listCollaborators = js.Any.fromFunction2(listCollaborators), listIncidents = js.Any.fromFunction2(listIncidents), listMetrics = js.Any.fromFunction2(listMetrics), listRecent = js.Any.fromFunction1(listRecent), listWithFilter = js.Any.fromFunction3(listWithFilter), merge = js.Any.fromFunction3(merge), show = js.Any.fromFunction2(show), showMany = js.Any.fromFunction2(showMany), update = js.Any.fromFunction3(update), updateMany = js.Any.fromFunction2(updateMany))
    __obj.asInstanceOf[Methods]
  }
  @scala.inline
  implicit class MethodsOps[Self <: Methods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTags(value: (ZendeskID, js.Array[String], ZendeskCallback[_, _]) => TagsPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTags")(js.Any.fromFunction3(value))
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
    def withDelete(value: (ZendeskID, ZendeskCallback[_, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteMany(value: (js.Array[ZendeskID], ZendeskCallback[_, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteMany")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExport(value: (Double, ZendeskCallback[_, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExportAudit(value: (ZendeskID, ZendeskCallback[_, _]) => AuditsListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportAudit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withExportSample(value: (Double, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSample")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetComments(
      value: (ZendeskID, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.Tickets.Comments.ListPayload
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComments")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIncremental(value: (Double, ZendeskCallback[_, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incremental")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIncrementalInclude(value: (Double, js.Any, ZendeskCallback[_, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementalInclude")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIncrementalSample(value: (Double, ZendeskCallback[_, _]) => js.Any): Self = {
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
    def withListAssigned(value: (ZendeskID, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAssigned")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListByOrganization(value: (ZendeskID, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByOrganization")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListByUserCCD(value: (ZendeskID, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByUserCCD")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListByUserRequested(value: (ZendeskID, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listByUserRequested")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListCollaborators(value: (ZendeskID, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.Users.ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCollaborators")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListIncidents(value: (ZendeskID, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listIncidents")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListMetrics(
      value: (ZendeskID, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponsePayload
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listMetrics")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withListRecent(value: ZendeskCallback[_, _] => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listRecent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListWithFilter(value: (String, js.Any, ZendeskCallback[_, _]) => ListPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWithFilter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMerge(
      value: (ZendeskID, MergePayload, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(js.Any.fromFunction3(value))
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
    def withUpdate(value: (ZendeskID, UpdatePayload, ZendeskCallback[_, _]) => ResponsePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdateMany(
      value: (UpdateManyPayload, ZendeskCallback[_, _]) => typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMany")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

