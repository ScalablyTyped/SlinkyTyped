package typingsSlinky.bitcoinjsDashLib

import typingsSlinky.bitcoinjsDashLib.typesPaymentsMod.Payment
import typingsSlinky.bitcoinjsDashLib.typesPaymentsMod.PaymentOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/payments/embed", JSImport.Namespace)
@js.native
object typesPaymentsEmbedMod extends js.Object {
  def p2data(a: Payment): Payment = js.native
  def p2data(a: Payment, opts: PaymentOpts): Payment = js.native
}

