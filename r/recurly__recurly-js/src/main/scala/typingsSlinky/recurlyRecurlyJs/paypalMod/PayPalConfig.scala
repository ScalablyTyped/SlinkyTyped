package typingsSlinky.recurlyRecurlyJs.paypalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.recurlyRecurlyJs.paypalMod.BraintreeConfig
  - typingsSlinky.recurlyRecurlyJs.paypalMod.DirectConfig
*/
trait PayPalConfig extends js.Object

object PayPalConfig {
  @scala.inline
  implicit def apply(value: BraintreeConfig): PayPalConfig = value.asInstanceOf[PayPalConfig]
  @scala.inline
  implicit def apply(value: DirectConfig): PayPalConfig = value.asInstanceOf[PayPalConfig]
}

