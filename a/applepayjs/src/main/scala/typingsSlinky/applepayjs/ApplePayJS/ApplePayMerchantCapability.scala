package typingsSlinky.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The payment capabilities supported by the merchant.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.applepayjs.applepayjsStrings.supports3DS
  - typingsSlinky.applepayjs.applepayjsStrings.supportsEMV
  - typingsSlinky.applepayjs.applepayjsStrings.supportsCredit
  - typingsSlinky.applepayjs.applepayjsStrings.supportsDebit
*/
trait ApplePayMerchantCapability extends js.Object
object ApplePayMerchantCapability {
  
  @scala.inline
  def supports3DS: typingsSlinky.applepayjs.applepayjsStrings.supports3DS = "supports3DS".asInstanceOf[typingsSlinky.applepayjs.applepayjsStrings.supports3DS]
  
  @scala.inline
  def supportsCredit: typingsSlinky.applepayjs.applepayjsStrings.supportsCredit = "supportsCredit".asInstanceOf[typingsSlinky.applepayjs.applepayjsStrings.supportsCredit]
  
  @scala.inline
  def supportsDebit: typingsSlinky.applepayjs.applepayjsStrings.supportsDebit = "supportsDebit".asInstanceOf[typingsSlinky.applepayjs.applepayjsStrings.supportsDebit]
  
  @scala.inline
  def supportsEMV: typingsSlinky.applepayjs.applepayjsStrings.supportsEMV = "supportsEMV".asInstanceOf[typingsSlinky.applepayjs.applepayjsStrings.supportsEMV]
}
