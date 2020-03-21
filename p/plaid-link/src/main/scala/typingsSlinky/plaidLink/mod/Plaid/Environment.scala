package typingsSlinky.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.plaidLink.plaidLinkStrings.development
  - typingsSlinky.plaidLink.plaidLinkStrings.sandbox
  - typingsSlinky.plaidLink.plaidLinkStrings.production
*/
trait Environment extends js.Object

object Environment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def development: typingsSlinky.plaidLink.plaidLinkStrings.development = this.cast("development")
  @scala.inline
  def production: typingsSlinky.plaidLink.plaidLinkStrings.production = this.cast("production")
  @scala.inline
  def sandbox: typingsSlinky.plaidLink.plaidLinkStrings.sandbox = this.cast("sandbox")
}

