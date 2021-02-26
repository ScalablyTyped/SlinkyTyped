package typingsSlinky.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supported methods for presenting the Google Pay button.
  *
  * A translated button label may appear if a language specified in the
  * viewer's browser matches an [available
  * language](https://developers.google.com/pay/api/web/guides/brand-guidelines#payment-buttons-assets).
  *
  *
  * Options:
  *
  * - `buy`:
  *   "Buy with Google Pay" button.
  *
  * - `donate`:
  *   "Donate with Google Pay" button.
  *
  * - `plain`:
  *   "Google Pay" button without text.
  *
  * - `long`:
  *   Same as "buy".
  *
  * - `short`:
  *   Same as "plain".
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googlepay.googlepayStrings.buy
  - typingsSlinky.googlepay.googlepayStrings.donate
  - typingsSlinky.googlepay.googlepayStrings.plain
  - typingsSlinky.googlepay.googlepayStrings.long
  - typingsSlinky.googlepay.googlepayStrings.short
*/
trait ButtonType extends StObject
object ButtonType {
  
  @scala.inline
  def buy: typingsSlinky.googlepay.googlepayStrings.buy = "buy".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.buy]
  
  @scala.inline
  def donate: typingsSlinky.googlepay.googlepayStrings.donate = "donate".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.donate]
  
  @scala.inline
  def long: typingsSlinky.googlepay.googlepayStrings.long = "long".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.long]
  
  @scala.inline
  def plain: typingsSlinky.googlepay.googlepayStrings.plain = "plain".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.plain]
  
  @scala.inline
  def short: typingsSlinky.googlepay.googlepayStrings.short = "short".asInstanceOf[typingsSlinky.googlepay.googlepayStrings.short]
}
