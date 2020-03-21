package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.noProtection
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.encryptAndAuditOnly
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.encryptAuditAndPrompt
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.encryptAuditAndBlock
*/
trait WindowsInformationProtectionEnforcementLevel extends js.Object

object WindowsInformationProtectionEnforcementLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def encryptAndAuditOnly: typingsSlinky.microsoftGraph.microsoftGraphStrings.encryptAndAuditOnly = this.cast("encryptAndAuditOnly")
  @scala.inline
  def encryptAuditAndBlock: typingsSlinky.microsoftGraph.microsoftGraphStrings.encryptAuditAndBlock = this.cast("encryptAuditAndBlock")
  @scala.inline
  def encryptAuditAndPrompt: typingsSlinky.microsoftGraph.microsoftGraphStrings.encryptAuditAndPrompt = this.cast("encryptAuditAndPrompt")
  @scala.inline
  def noProtection: typingsSlinky.microsoftGraph.microsoftGraphStrings.noProtection = this.cast("noProtection")
}

