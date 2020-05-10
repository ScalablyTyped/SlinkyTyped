package typingsSlinky.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Supported methods for presenting the Google Pay button.
  *
  * Options:
  *
  * - `long`:
  *   "Buy with Google Pay" button. A translated button label may
  *   appear if a language specified in the viewer's browser matches an
  *   [available
  *   language](https://developers.google.com/pay/api/web/guides/brand-guidelines#payment-buttons-assets).
  *
  * - `short`:
  *   Google Pay payment button without the "Buy with" text.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.long
  - typingsSlinky.googlepay.googlepayStrings.short
*/
trait ButtonType extends js.Object

object ButtonType {
  @scala.inline
  def long: typingsSlinky.googlepay.googlepayStrings.long = "long".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.long]
  @scala.inline
  def short: typingsSlinky.googlepay.googlepayStrings.short = "short".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.short]
}

