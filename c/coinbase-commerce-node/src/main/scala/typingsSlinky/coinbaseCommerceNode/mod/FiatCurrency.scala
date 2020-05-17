package typingsSlinky.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fiat currency.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.USD
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.GBP
  - typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EUR
  - java.lang.String
*/
trait FiatCurrency extends js.Object

object FiatCurrency {
  @scala.inline
  def USD: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.USD = "USD".asInstanceOf[typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.USD]
  @scala.inline
  def GBP: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.GBP = "GBP".asInstanceOf[typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.GBP]
  @scala.inline
  def EUR: typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EUR = "EUR".asInstanceOf[typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EUR]
  @scala.inline
  implicit def apply(value: String): FiatCurrency = value.asInstanceOf[FiatCurrency]
}

