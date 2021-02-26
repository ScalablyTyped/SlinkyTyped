package typingsSlinky.nodeZendesk.mod.Tickets

import typingsSlinky.nodeZendesk.mod.ZendeskCallback
import typingsSlinky.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Methods extends StObject {
  
  def addTags(ticketId: ZendeskID, tags: js.Array[String]): js.Promise[TagsPayload] = js.native
  /** Adding Tags */
  def addTags(ticketId: ZendeskID, tags: js.Array[String], cb: ZendeskCallback[_, _]): TagsPayload = js.native
  
  def create(ticket: CreatePayload): js.Promise[ResponsePayload] = js.native
  /** Creating Tickets */
  def create(ticket: CreatePayload, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  
  def createMany(tickets: CreateManyPayload): js.Promise[typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload] = js.native
  def createMany(tickets: CreateManyPayload, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
  
  def delete(ticketId: ZendeskID): js.Promise[_] = js.native
  /** Deleting Tickets */
  def delete(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any = js.native
  
  def deleteMany(ticketIds: js.Array[ZendeskID]): js.Promise[_] = js.native
  def deleteMany(ticketIds: js.Array[ZendeskID], cb: ZendeskCallback[_, _]): js.Any = js.native
  
  def export(startTime: Double): js.Promise[_] = js.native
  /** Ticket Exports */
  def export(startTime: Double, cb: ZendeskCallback[_, _]): js.Any = js.native
  
  def exportAudit(ticketId: ZendeskID): js.Promise[AuditsListPayload] = js.native
  /** Listing Audits */
  def exportAudit(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): AuditsListPayload = js.native
  
  def exportSample(startTime: Double, options: js.Any): js.Any = js.native
  
  def getComments(requestId: ZendeskID): js.Promise[typingsSlinky.nodeZendesk.mod.Tickets.Comments.ListPayload] = js.native
  /** Listing Comments */
  def getComments(requestId: ZendeskID, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.Tickets.Comments.ListPayload = js.native
  
  def incremental(startTime: Double): js.Promise[_] = js.native
  def incremental(startTime: Double, cb: ZendeskCallback[_, _]): js.Any = js.native
  
  def incrementalInclude(startTime: Double, include: js.Any): js.Promise[_] = js.native
  def incrementalInclude(startTime: Double, include: js.Any, cb: ZendeskCallback[_, _]): js.Any = js.native
  
  def incrementalSample(startTime: Double): js.Promise[_] = js.native
  def incrementalSample(startTime: Double, cb: ZendeskCallback[_, _]): js.Any = js.native
  
  def list(): js.Promise[ListPayload] = js.native
  /** Listing Tickets */
  def list(cb: ZendeskCallback[_, _]): ListPayload = js.native
  
  def listAssigned(userId: ZendeskID): js.Promise[ListPayload] = js.native
  def listAssigned(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  
  def listByOrganization(organizationId: ZendeskID): js.Promise[ListPayload] = js.native
  def listByOrganization(organizationId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  
  def listByUserCCD(userId: ZendeskID): js.Promise[ListPayload] = js.native
  def listByUserCCD(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  
  def listByUserRequested(userId: ZendeskID): js.Promise[ListPayload] = js.native
  def listByUserRequested(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  
  def listCollaborators(ticketId: ZendeskID): js.Promise[typingsSlinky.nodeZendesk.mod.Users.ListPayload] = js.native
  def listCollaborators(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.Users.ListPayload = js.native
  
  def listIncidents(ticketId: ZendeskID): js.Promise[ListPayload] = js.native
  def listIncidents(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  
  def listMetrics(ticketId: ZendeskID): js.Promise[typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponsePayload] = js.native
  def listMetrics(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.Tickets.Metrics.ResponsePayload = js.native
  
  def listRecent(): js.Promise[ListPayload] = js.native
  def listRecent(cb: ZendeskCallback[_, _]): ListPayload = js.native
  
  def listWithFilter(`type`: String, value: js.Any): js.Promise[ListPayload] = js.native
  def listWithFilter(`type`: String, value: js.Any, cb: ZendeskCallback[_, _]): ListPayload = js.native
  
  def merge(ticketId: ZendeskID, mergingTickets: MergePayload): js.Promise[typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload] = js.native
  /** Merging Tickets */
  def merge(ticketId: ZendeskID, mergingTickets: MergePayload, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
  
  def show(ticketId: ZendeskID): js.Promise[ResponsePayload] = js.native
  /** Viewing Tickets */
  def show(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  
  def showMany(ticketIds: js.Array[ZendeskID]): js.Promise[ListPayload] = js.native
  def showMany(ticketIds: js.Array[ZendeskID], cb: ZendeskCallback[_, _]): ListPayload = js.native
  
  def update(ticketId: ZendeskID, ticket: UpdatePayload): js.Promise[ResponsePayload] = js.native
  /** Updating Tickets */
  def update(ticketId: ZendeskID, ticket: UpdatePayload, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  
  def updateMany(tickets: UpdateManyPayload): js.Promise[typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload] = js.native
  def updateMany(tickets: UpdateManyPayload, cb: ZendeskCallback[_, _]): typingsSlinky.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
}
