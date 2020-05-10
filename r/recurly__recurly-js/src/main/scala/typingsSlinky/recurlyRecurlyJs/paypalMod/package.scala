package typingsSlinky.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object paypalMod {
  type PayPal = js.Function1[
    /* config */ js.UndefOr[typingsSlinky.recurlyRecurlyJs.paypalMod.PayPalConfig], 
    typingsSlinky.recurlyRecurlyJs.paypalMod.PayPalInstance
  ]
}
