package typingsSlinky.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.plaidLink.plaidLinkStrings.US
  - typingsSlinky.plaidLink.plaidLinkStrings.CA
  - typingsSlinky.plaidLink.plaidLinkStrings.GB
*/
trait Country extends js.Object

object Country {
  @scala.inline
  def CA: typingsSlinky.plaidLink.plaidLinkStrings.CA = this.cast("CA")
  @scala.inline
  def GB: typingsSlinky.plaidLink.plaidLinkStrings.GB = this.cast("GB")
  @scala.inline
  def US: typingsSlinky.plaidLink.plaidLinkStrings.US = this.cast("US")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

