package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDIGITAL_PURCHASE_CHECK
import typingsSlinky.actionsOnGoogle.helperHelperMod.Helper
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckResult
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/digitalpurchasecheck", JSImport.Namespace)
@js.native
object digitalpurchasecheckMod extends js.Object {
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3DigitalPurchaseCheckSpec}
    * @public
    */
  class DigitalPurchaseCheck () extends Helper[
          actionsDotintentDotDIGITAL_PURCHASE_CHECK, 
          GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
        ] {
    def this(options: GoogleActionsTransactionsV3DigitalPurchaseCheckSpec) = this()
  }
  
  type DigitalPurchaseCheckArgument = GoogleActionsTransactionsV3DigitalPurchaseCheckResult
}

