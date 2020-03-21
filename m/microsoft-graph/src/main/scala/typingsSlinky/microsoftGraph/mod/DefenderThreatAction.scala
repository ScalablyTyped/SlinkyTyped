package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.deviceDefault
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.clean
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.quarantine
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.remove
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.allow
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.block
*/
trait DefenderThreatAction extends js.Object

object DefenderThreatAction {
  @scala.inline
  def allow: typingsSlinky.microsoftGraph.microsoftGraphStrings.allow = this.cast("allow")
  @scala.inline
  def block: typingsSlinky.microsoftGraph.microsoftGraphStrings.block = this.cast("block")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clean: typingsSlinky.microsoftGraph.microsoftGraphStrings.clean = this.cast("clean")
  @scala.inline
  def deviceDefault: typingsSlinky.microsoftGraph.microsoftGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def quarantine: typingsSlinky.microsoftGraph.microsoftGraphStrings.quarantine = this.cast("quarantine")
  @scala.inline
  def remove: typingsSlinky.microsoftGraph.microsoftGraphStrings.remove = this.cast("remove")
  @scala.inline
  def userDefined: typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

