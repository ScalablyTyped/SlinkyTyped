package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.disable
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.monitorAllFiles
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.monitorIncomingFilesOnly
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.monitorOutgoingFilesOnly
*/
trait DefenderMonitorFileActivity extends js.Object

object DefenderMonitorFileActivity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disable: typingsSlinky.microsoftGraph.microsoftGraphStrings.disable = this.cast("disable")
  @scala.inline
  def monitorAllFiles: typingsSlinky.microsoftGraph.microsoftGraphStrings.monitorAllFiles = this.cast("monitorAllFiles")
  @scala.inline
  def monitorIncomingFilesOnly: typingsSlinky.microsoftGraph.microsoftGraphStrings.monitorIncomingFilesOnly = this.cast("monitorIncomingFilesOnly")
  @scala.inline
  def monitorOutgoingFilesOnly: typingsSlinky.microsoftGraph.microsoftGraphStrings.monitorOutgoingFilesOnly = this.cast("monitorOutgoingFilesOnly")
  @scala.inline
  def userDefined: typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

