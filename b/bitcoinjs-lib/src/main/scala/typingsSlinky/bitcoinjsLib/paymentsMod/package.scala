package typingsSlinky.bitcoinjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object paymentsMod {
  
  type PaymentCreator = js.Function2[
    /* a */ typingsSlinky.bitcoinjsLib.paymentsMod.Payment, 
    /* opts */ js.UndefOr[typingsSlinky.bitcoinjsLib.paymentsMod.PaymentOpts], 
    typingsSlinky.bitcoinjsLib.paymentsMod.Payment
  ]
  
  type PaymentFunction = js.Function0[typingsSlinky.bitcoinjsLib.paymentsMod.Payment]
  
  type Stack = js.Array[typingsSlinky.bitcoinjsLib.paymentsMod.StackElement]
  
  type StackElement = typingsSlinky.node.Buffer | scala.Double
  
  type StackFunction = js.Function0[typingsSlinky.bitcoinjsLib.paymentsMod.Stack]
}
