package typingsSlinky.nodeZendesk

import typingsSlinky.nodeZendesk.mod.Requests.Comments.RequestType
import typingsSlinky.nodeZendesk.mod.Tickets.Priority
import typingsSlinky.nodeZendesk.mod.Tickets.Status
import typingsSlinky.nodeZendesk.mod.Tickets.TicketType
import typingsSlinky.nodeZendesk.mod.Tickets.ViaChannel
import typingsSlinky.nodeZendesk.mod.Users.Fields.UserFieldType
import typingsSlinky.nodeZendesk.mod.Users.Identities.DeliverableState
import typingsSlinky.nodeZendesk.mod.Users.Identities.IdentityType
import typingsSlinky.nodeZendesk.mod.Users.Role
import typingsSlinky.nodeZendesk.mod.Users.TicketRestriction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeZendeskStrings {
  
  @js.native
  sealed trait Comment extends RequestType
  @scala.inline
  def Comment: Comment = "Comment".asInstanceOf[Comment]
  
  @js.native
  sealed trait VoiceComment extends RequestType
  @scala.inline
  def VoiceComment: VoiceComment = "VoiceComment".asInstanceOf[VoiceComment]
  
  @js.native
  sealed trait admin extends Role
  @scala.inline
  def admin: admin = "admin".asInstanceOf[admin]
  
  @js.native
  sealed trait agent extends Role
  @scala.inline
  def agent: agent = "agent".asInstanceOf[agent]
  
  @js.native
  sealed trait agent_forwarding extends IdentityType
  @scala.inline
  def agent_forwarding: agent_forwarding = "agent_forwarding".asInstanceOf[agent_forwarding]
  
  @js.native
  sealed trait api extends ViaChannel
  @scala.inline
  def api: api = "api".asInstanceOf[api]
  
  @js.native
  sealed trait assigned extends TicketRestriction
  @scala.inline
  def assigned: assigned = "assigned".asInstanceOf[assigned]
  
  @js.native
  sealed trait checkbox extends UserFieldType
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @js.native
  sealed trait closed extends Status
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait completed
    extends typingsSlinky.nodeZendesk.mod.JobStatuses.Status
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait date extends UserFieldType
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait decimal extends UserFieldType
  @scala.inline
  def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @js.native
  sealed trait deliverable extends DeliverableState
  @scala.inline
  def deliverable: deliverable = "deliverable".asInstanceOf[deliverable]
  
  @js.native
  sealed trait email extends IdentityType
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait `end-user` extends Role
  @scala.inline
  def `end-user`: `end-user` = "end-user".asInstanceOf[`end-user`]
  
  @js.native
  sealed trait facebook extends IdentityType
  @scala.inline
  def facebook: facebook = "facebook".asInstanceOf[facebook]
  
  @js.native
  sealed trait failed
    extends typingsSlinky.nodeZendesk.mod.JobStatuses.Status
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait google extends IdentityType
  @scala.inline
  def google: google = "google".asInstanceOf[google]
  
  @js.native
  sealed trait groups extends TicketRestriction
  @scala.inline
  def groups: groups = "groups".asInstanceOf[groups]
  
  @js.native
  sealed trait high extends Priority
  @scala.inline
  def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait hold extends Status
  @scala.inline
  def hold: hold = "hold".asInstanceOf[hold]
  
  @js.native
  sealed trait incident extends TicketType
  @scala.inline
  def incident: incident = "incident".asInstanceOf[incident]
  
  @js.native
  sealed trait integer extends UserFieldType
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait killed
    extends typingsSlinky.nodeZendesk.mod.JobStatuses.Status
  @scala.inline
  def killed: killed = "killed".asInstanceOf[killed]
  
  @js.native
  sealed trait low extends Priority
  @scala.inline
  def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait mobile extends ViaChannel
  @scala.inline
  def mobile: mobile = "mobile".asInstanceOf[mobile]
  
  @js.native
  sealed trait `new` extends Status
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait normal extends Priority
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait open extends Status
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait organization extends TicketRestriction
  @scala.inline
  def organization: organization = "organization".asInstanceOf[organization]
  
  @js.native
  sealed trait pending extends Status
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait phone_number extends IdentityType
  @scala.inline
  def phone_number: phone_number = "phone_number".asInstanceOf[phone_number]
  
  @js.native
  sealed trait problem extends TicketType
  @scala.inline
  def problem: problem = "problem".asInstanceOf[problem]
  
  @js.native
  sealed trait question extends TicketType
  @scala.inline
  def question: question = "question".asInstanceOf[question]
  
  @js.native
  sealed trait queued
    extends typingsSlinky.nodeZendesk.mod.JobStatuses.Status
  @scala.inline
  def queued: queued = "queued".asInstanceOf[queued]
  
  @js.native
  sealed trait regexp extends UserFieldType
  @scala.inline
  def regexp: regexp = "regexp".asInstanceOf[regexp]
  
  @js.native
  sealed trait requested extends TicketRestriction
  @scala.inline
  def requested: requested = "requested".asInstanceOf[requested]
  
  @js.native
  sealed trait rule extends ViaChannel
  @scala.inline
  def rule: rule = "rule".asInstanceOf[rule]
  
  @js.native
  sealed trait sdk extends IdentityType
  @scala.inline
  def sdk: sdk = "sdk".asInstanceOf[sdk]
  
  @js.native
  sealed trait solved extends Status
  @scala.inline
  def solved: solved = "solved".asInstanceOf[solved]
  
  @js.native
  sealed trait system extends ViaChannel
  @scala.inline
  def system: system = "system".asInstanceOf[system]
  
  @js.native
  sealed trait tagger extends UserFieldType
  @scala.inline
  def tagger: tagger = "tagger".asInstanceOf[tagger]
  
  @js.native
  sealed trait task extends TicketType
  @scala.inline
  def task: task = "task".asInstanceOf[task]
  
  @js.native
  sealed trait text extends UserFieldType
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait textarea extends UserFieldType
  @scala.inline
  def textarea: textarea = "textarea".asInstanceOf[textarea]
  
  @js.native
  sealed trait undeliverable extends DeliverableState
  @scala.inline
  def undeliverable: undeliverable = "undeliverable".asInstanceOf[undeliverable]
  
  @js.native
  sealed trait urgent extends Priority
  @scala.inline
  def urgent: urgent = "urgent".asInstanceOf[urgent]
  
  @js.native
  sealed trait web extends ViaChannel
  @scala.inline
  def web: web = "web".asInstanceOf[web]
  
  @js.native
  sealed trait working
    extends typingsSlinky.nodeZendesk.mod.JobStatuses.Status
  @scala.inline
  def working: working = "working".asInstanceOf[working]
}
