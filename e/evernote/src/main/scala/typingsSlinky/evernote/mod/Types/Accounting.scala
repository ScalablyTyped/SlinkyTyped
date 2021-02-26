package typingsSlinky.evernote.mod.Types

import typingsSlinky.evernote.anon.AvailablePoints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.Accounting")
@js.native
class Accounting () extends StObject {
  def this(args: AvailablePoints) = this()
  
  var availablePoints: js.UndefOr[Double] = js.native
  
  var businessId: js.UndefOr[Double] = js.native
  
  var businessName: js.UndefOr[String] = js.native
  
  var businessRole: js.UndefOr[BusinessUserRole] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var lastFailedCharge: js.UndefOr[Timestamp] = js.native
  
  var lastFailedChargeReason: js.UndefOr[String] = js.native
  
  var lastRequestedCharge: js.UndefOr[Timestamp] = js.native
  
  var lastSuccessfulCharge: js.UndefOr[Timestamp] = js.native
  
  var nextChargeDate: js.UndefOr[Timestamp] = js.native
  
  var nextPaymentDue: js.UndefOr[Timestamp] = js.native
  
  var premiumCommerceService: js.UndefOr[String] = js.native
  
  var premiumLockUntil: js.UndefOr[Timestamp] = js.native
  
  var premiumOrderNumber: js.UndefOr[String] = js.native
  
  var premiumServiceSKU: js.UndefOr[String] = js.native
  
  var premiumServiceStart: js.UndefOr[Timestamp] = js.native
  
  var premiumServiceStatus: js.UndefOr[PremiumOrderStatus] = js.native
  
  var premiumSubscriptionNumber: js.UndefOr[String] = js.native
  
  var unitDiscount: js.UndefOr[Double] = js.native
  
  var unitPrice: js.UndefOr[Double] = js.native
  
  var updated: js.UndefOr[Timestamp] = js.native
  
  var uploadLimitEnd: js.UndefOr[Timestamp] = js.native
  
  var uploadLimitNextMonth: js.UndefOr[Double] = js.native
}
