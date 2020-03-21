package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.standard
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.power
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.administrator
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait UserAccountSecurityType extends js.Object

object UserAccountSecurityType {
  @scala.inline
  def administrator: typingsSlinky.microsoftGraph.microsoftGraphStrings.administrator = this.cast("administrator")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def power: typingsSlinky.microsoftGraph.microsoftGraphStrings.power = this.cast("power")
  @scala.inline
  def standard: typingsSlinky.microsoftGraph.microsoftGraphStrings.standard = this.cast("standard")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsSlinky.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

