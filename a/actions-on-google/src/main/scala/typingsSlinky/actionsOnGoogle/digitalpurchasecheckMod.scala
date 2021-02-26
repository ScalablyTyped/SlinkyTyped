package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDIGITAL_PURCHASE_CHECK
import typingsSlinky.actionsOnGoogle.helperHelperMod.SoloHelper
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckResult
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object digitalpurchasecheckMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/digitalpurchasecheck", "DigitalPurchaseCheck")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3DigitalPurchaseCheckSpec}
    * @public
    */
  class DigitalPurchaseCheck () extends SoloHelper[
          actionsDotintentDotDIGITAL_PURCHASE_CHECK, 
          GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
        ] {
    def this(options: GoogleActionsTransactionsV3DigitalPurchaseCheckSpec) = this()
  }
  
  type DigitalPurchaseCheckArgument = GoogleActionsTransactionsV3DigitalPurchaseCheckResult
}
