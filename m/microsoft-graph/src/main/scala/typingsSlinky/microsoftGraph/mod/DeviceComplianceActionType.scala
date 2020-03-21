package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.noAction
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notification
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.block
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.retire
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.wipe
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.removeResourceAccessProfiles
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.pushNotification
*/
trait DeviceComplianceActionType extends js.Object

object DeviceComplianceActionType {
  @scala.inline
  def block: typingsSlinky.microsoftGraph.microsoftGraphStrings.block = this.cast("block")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def noAction: typingsSlinky.microsoftGraph.microsoftGraphStrings.noAction = this.cast("noAction")
  @scala.inline
  def notification: typingsSlinky.microsoftGraph.microsoftGraphStrings.notification = this.cast("notification")
  @scala.inline
  def pushNotification: typingsSlinky.microsoftGraph.microsoftGraphStrings.pushNotification = this.cast("pushNotification")
  @scala.inline
  def removeResourceAccessProfiles: typingsSlinky.microsoftGraph.microsoftGraphStrings.removeResourceAccessProfiles = this.cast("removeResourceAccessProfiles")
  @scala.inline
  def retire: typingsSlinky.microsoftGraph.microsoftGraphStrings.retire = this.cast("retire")
  @scala.inline
  def wipe: typingsSlinky.microsoftGraph.microsoftGraphStrings.wipe = this.cast("wipe")
}

