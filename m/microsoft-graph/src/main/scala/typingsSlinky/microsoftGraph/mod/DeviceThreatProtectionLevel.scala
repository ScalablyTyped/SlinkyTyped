package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unavailable
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.secured
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.low
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.medium
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.high
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notSet
*/
trait DeviceThreatProtectionLevel extends js.Object

object DeviceThreatProtectionLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsSlinky.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def low: typingsSlinky.microsoftGraph.microsoftGraphStrings.low = this.cast("low")
  @scala.inline
  def medium: typingsSlinky.microsoftGraph.microsoftGraphStrings.medium = this.cast("medium")
  @scala.inline
  def notSet: typingsSlinky.microsoftGraph.microsoftGraphStrings.notSet = this.cast("notSet")
  @scala.inline
  def secured: typingsSlinky.microsoftGraph.microsoftGraphStrings.secured = this.cast("secured")
  @scala.inline
  def unavailable: typingsSlinky.microsoftGraph.microsoftGraphStrings.unavailable = this.cast("unavailable")
}

