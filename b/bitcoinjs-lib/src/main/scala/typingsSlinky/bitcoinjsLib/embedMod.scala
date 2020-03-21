package typingsSlinky.bitcoinjsLib

import typingsSlinky.bitcoinjsLib.paymentsMod.Payment
import typingsSlinky.bitcoinjsLib.paymentsMod.PaymentOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/payments/embed", JSImport.Namespace)
@js.native
object embedMod extends js.Object {
  def p2data(a: Payment): Payment = js.native
  def p2data(a: Payment, opts: PaymentOpts): Payment = js.native
}

