package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotTRANSACTION_REQUIREMENTS_CHECK
import typingsSlinky.actionsOnGoogle.helperHelperMod.SoloHelper
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionRequirementsCheckSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requirementsMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/requirements", "TransactionRequirements")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionRequirementsCheckSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionRequirementsCheckSpec}
    *     if using ordersv3
    * @public
    */
  class TransactionRequirements () extends SoloHelper[
          actionsDotintentDotTRANSACTION_REQUIREMENTS_CHECK, 
          GoogleActionsV2TransactionRequirementsCheckSpec | GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
        ] {
    def this(options: GoogleActionsTransactionsV3TransactionRequirementsCheckSpec) = this()
    def this(options: GoogleActionsV2TransactionRequirementsCheckSpec) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionRequirementsCheckResult
    - typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckResult
  */
  trait TransactionRequirementsArgument extends StObject
  object TransactionRequirementsArgument {
    
    @scala.inline
    def GoogleActionsTransactionsV3TransactionRequirementsCheckResult(): typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckResult]
    }
    
    @scala.inline
    def GoogleActionsV2TransactionRequirementsCheckResult(): typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionRequirementsCheckResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionRequirementsCheckResult]
    }
  }
}
