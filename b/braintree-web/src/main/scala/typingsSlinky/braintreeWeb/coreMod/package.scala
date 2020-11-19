package typingsSlinky.braintreeWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object coreMod {
  
  type callback = js.Function2[
    /* err */ js.UndefOr[typingsSlinky.braintreeWeb.coreMod.BraintreeError], 
    /* data */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
