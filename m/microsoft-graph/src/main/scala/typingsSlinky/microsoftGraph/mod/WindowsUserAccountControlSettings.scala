package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.alwaysNotify
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notifyOnAppChanges
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notifyOnAppChangesWithoutDimming
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.neverNotify
*/
trait WindowsUserAccountControlSettings extends js.Object

object WindowsUserAccountControlSettings {
  @scala.inline
  def alwaysNotify: typingsSlinky.microsoftGraph.microsoftGraphStrings.alwaysNotify = this.cast("alwaysNotify")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def neverNotify: typingsSlinky.microsoftGraph.microsoftGraphStrings.neverNotify = this.cast("neverNotify")
  @scala.inline
  def notifyOnAppChanges: typingsSlinky.microsoftGraph.microsoftGraphStrings.notifyOnAppChanges = this.cast("notifyOnAppChanges")
  @scala.inline
  def notifyOnAppChangesWithoutDimming: typingsSlinky.microsoftGraph.microsoftGraphStrings.notifyOnAppChangesWithoutDimming = this.cast("notifyOnAppChangesWithoutDimming")
  @scala.inline
  def userDefined: typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

