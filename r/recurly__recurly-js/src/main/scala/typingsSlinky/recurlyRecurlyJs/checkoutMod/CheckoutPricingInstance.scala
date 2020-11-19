package typingsSlinky.recurlyRecurlyJs.checkoutMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.recurlyRecurlyJs.pricingMod.PricingInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckoutPricingInstance
  extends PricingInstance[CheckoutPricingPromise]
     with CheckoutPricingMethods {
  
  def attach(element: String): Unit = js.native
  def attach(element: HTMLElement): Unit = js.native
}
