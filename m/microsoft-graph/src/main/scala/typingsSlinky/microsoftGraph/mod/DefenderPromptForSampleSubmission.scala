package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.alwaysPrompt
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.promptBeforeSendingPersonalData
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.neverSendData
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.sendAllDataWithoutPrompting
*/
trait DefenderPromptForSampleSubmission extends js.Object

object DefenderPromptForSampleSubmission {
  @scala.inline
  def alwaysPrompt: typingsSlinky.microsoftGraph.microsoftGraphStrings.alwaysPrompt = this.cast("alwaysPrompt")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def neverSendData: typingsSlinky.microsoftGraph.microsoftGraphStrings.neverSendData = this.cast("neverSendData")
  @scala.inline
  def promptBeforeSendingPersonalData: typingsSlinky.microsoftGraph.microsoftGraphStrings.promptBeforeSendingPersonalData = this.cast("promptBeforeSendingPersonalData")
  @scala.inline
  def sendAllDataWithoutPrompting: typingsSlinky.microsoftGraph.microsoftGraphStrings.sendAllDataWithoutPrompting = this.cast("sendAllDataWithoutPrompting")
  @scala.inline
  def userDefined: typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

