package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.home
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.business
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.other
*/
trait PhysicalAddressType extends js.Object

object PhysicalAddressType {
  @scala.inline
  def business: typingsSlinky.microsoftGraph.microsoftGraphStrings.business = this.cast("business")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def home: typingsSlinky.microsoftGraph.microsoftGraphStrings.home = this.cast("home")
  @scala.inline
  def other: typingsSlinky.microsoftGraph.microsoftGraphStrings.other = this.cast("other")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

