package typingsSlinky.braintreeWebDropIn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type RequestPaymentMethodCallback = js.Function2[
    /* error */ js.Object | scala.Null, 
    /* payload */ typingsSlinky.braintreeWebDropIn.mod.PaymentMethodPayload, 
    scala.Unit
  ]
}
