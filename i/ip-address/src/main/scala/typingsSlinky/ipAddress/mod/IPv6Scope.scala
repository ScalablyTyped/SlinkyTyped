package typingsSlinky.ipAddress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ipAddress.ipAddressStrings.Reserved
  - typingsSlinky.ipAddress.ipAddressStrings.`Interface local`
  - typingsSlinky.ipAddress.ipAddressStrings.`Link local`
  - typingsSlinky.ipAddress.ipAddressStrings.`Admin local`
  - typingsSlinky.ipAddress.ipAddressStrings.`Site local`
  - typingsSlinky.ipAddress.ipAddressStrings.`Organization local`
  - typingsSlinky.ipAddress.ipAddressStrings.Global
*/
trait IPv6Scope extends js.Object

object IPv6Scope {
  @scala.inline
  def `Admin local`: typingsSlinky.ipAddress.ipAddressStrings.`Admin local` = this.cast("Admin local")
  @scala.inline
  def Global: typingsSlinky.ipAddress.ipAddressStrings.Global = this.cast("Global")
  @scala.inline
  def `Interface local`: typingsSlinky.ipAddress.ipAddressStrings.`Interface local` = this.cast("Interface local")
  @scala.inline
  def `Link local`: typingsSlinky.ipAddress.ipAddressStrings.`Link local` = this.cast("Link local")
  @scala.inline
  def `Organization local`: typingsSlinky.ipAddress.ipAddressStrings.`Organization local` = this.cast("Organization local")
  @scala.inline
  def Reserved: typingsSlinky.ipAddress.ipAddressStrings.Reserved = this.cast("Reserved")
  @scala.inline
  def `Site local`: typingsSlinky.ipAddress.ipAddressStrings.`Site local` = this.cast("Site local")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

