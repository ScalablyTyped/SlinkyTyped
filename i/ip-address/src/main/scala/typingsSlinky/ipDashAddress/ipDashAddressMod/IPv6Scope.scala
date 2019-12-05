package typingsSlinky.ipDashAddress.ipDashAddressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ipDashAddress.ipDashAddressStrings.Reserved
  - typings.ipDashAddress.ipDashAddressStrings.`Interface local`
  - typings.ipDashAddress.ipDashAddressStrings.`Link local`
  - typings.ipDashAddress.ipDashAddressStrings.`Admin local`
  - typings.ipDashAddress.ipDashAddressStrings.`Site local`
  - typings.ipDashAddress.ipDashAddressStrings.`Organization local`
  - typings.ipDashAddress.ipDashAddressStrings.Global
*/
trait IPv6Scope extends js.Object

object IPv6Scope {
  @scala.inline
  def `Admin local`: typingsSlinky.ipDashAddress.ipDashAddressStrings.`Admin local` = this.cast("Admin local")
  @scala.inline
  def Global: typingsSlinky.ipDashAddress.ipDashAddressStrings.Global = this.cast("Global")
  @scala.inline
  def `Interface local`: typingsSlinky.ipDashAddress.ipDashAddressStrings.`Interface local` = this.cast("Interface local")
  @scala.inline
  def `Link local`: typingsSlinky.ipDashAddress.ipDashAddressStrings.`Link local` = this.cast("Link local")
  @scala.inline
  def `Organization local`: typingsSlinky.ipDashAddress.ipDashAddressStrings.`Organization local` = this.cast("Organization local")
  @scala.inline
  def Reserved: typingsSlinky.ipDashAddress.ipDashAddressStrings.Reserved = this.cast("Reserved")
  @scala.inline
  def `Site local`: typingsSlinky.ipDashAddress.ipDashAddressStrings.`Site local` = this.cast("Site local")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

