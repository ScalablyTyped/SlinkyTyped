package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.low
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.mediumLow
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.medium
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.mediumHigh
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.high
*/
trait SiteSecurityLevel extends js.Object

object SiteSecurityLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsSlinky.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def low: typingsSlinky.microsoftGraph.microsoftGraphStrings.low = this.cast("low")
  @scala.inline
  def medium: typingsSlinky.microsoftGraph.microsoftGraphStrings.medium = this.cast("medium")
  @scala.inline
  def mediumHigh: typingsSlinky.microsoftGraph.microsoftGraphStrings.mediumHigh = this.cast("mediumHigh")
  @scala.inline
  def mediumLow: typingsSlinky.microsoftGraph.microsoftGraphStrings.mediumLow = this.cast("mediumLow")
  @scala.inline
  def userDefined: typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

