package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.settingsOnly
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.settingsAndExperimentations
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notAllowed
*/
trait PrereleaseFeatures extends js.Object

object PrereleaseFeatures {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notAllowed: typingsSlinky.microsoftGraph.microsoftGraphStrings.notAllowed = this.cast("notAllowed")
  @scala.inline
  def settingsAndExperimentations: typingsSlinky.microsoftGraph.microsoftGraphStrings.settingsAndExperimentations = this.cast("settingsAndExperimentations")
  @scala.inline
  def settingsOnly: typingsSlinky.microsoftGraph.microsoftGraphStrings.settingsOnly = this.cast("settingsOnly")
  @scala.inline
  def userDefined: typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

