package typingsSlinky.nodeDashZendesk.nodeDashZendeskMod.Users

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashZendesk.nodeDashZendeskStrings.admin
  - typings.nodeDashZendesk.nodeDashZendeskStrings.agent
  - typings.nodeDashZendesk.nodeDashZendeskStrings.`end-user`
*/
trait Role extends js.Object

object Role {
  @scala.inline
  def admin: typingsSlinky.nodeDashZendesk.nodeDashZendeskStrings.admin = this.cast("admin")
  @scala.inline
  def agent: typingsSlinky.nodeDashZendesk.nodeDashZendeskStrings.agent = this.cast("agent")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `end-user`: typingsSlinky.nodeDashZendesk.nodeDashZendeskStrings.`end-user` = this.cast("end-user")
}

