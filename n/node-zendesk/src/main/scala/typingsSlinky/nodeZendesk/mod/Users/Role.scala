package typingsSlinky.nodeZendesk.mod.Users

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.admin
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.agent
  - typingsSlinky.nodeZendesk.nodeZendeskStrings.`end-user`
*/
trait Role extends js.Object

object Role {
  @scala.inline
  def admin: typingsSlinky.nodeZendesk.nodeZendeskStrings.admin = this.cast("admin")
  @scala.inline
  def agent: typingsSlinky.nodeZendesk.nodeZendeskStrings.agent = this.cast("agent")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `end-user`: typingsSlinky.nodeZendesk.nodeZendeskStrings.`end-user` = this.cast("end-user")
}

