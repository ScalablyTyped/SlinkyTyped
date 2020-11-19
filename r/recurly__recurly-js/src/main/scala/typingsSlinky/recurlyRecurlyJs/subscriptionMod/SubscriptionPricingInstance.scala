package typingsSlinky.recurlyRecurlyJs.subscriptionMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.recurlyRecurlyJs.pricingMod.PricingInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionPricingInstance
  extends PricingInstance[SubscriptionPricingPromise]
     with SubscriptionPricingMethods {
  
  def attach(element: String): Unit = js.native
  def attach(element: HTMLElement): Unit = js.native
}
