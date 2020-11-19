package typingsSlinky.recurlyRecurlyJs.paypalMod

import typingsSlinky.recurlyRecurlyJs.anon.ClientAuthorization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.recurlyRecurlyJs.paypalMod.BraintreeConfig
  - typingsSlinky.recurlyRecurlyJs.paypalMod.DirectConfig
*/
trait PayPalConfig extends js.Object
object PayPalConfig {
  
  @scala.inline
  def BraintreeConfig(braintree: ClientAuthorization): PayPalConfig = {
    val __obj = js.Dynamic.literal(braintree = braintree.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalConfig]
  }
  
  @scala.inline
  def DirectConfig(): PayPalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayPalConfig]
  }
}
