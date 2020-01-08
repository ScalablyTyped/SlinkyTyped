package typingsSlinky.actionsDashOnDashGoogle

import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.actionsDotintentDotDELIVERY_ADDRESS
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DeliveryAddressValue
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DeliveryAddressValueSpec
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperHelperMod.Helper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/deliveryaddress", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationHelperTransactionDeliveryaddressMod extends js.Object {
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2DeliveryAddressValueSpec}
    * @public
    */
  class DeliveryAddress () extends Helper[actionsDotintentDotDELIVERY_ADDRESS, GoogleActionsV2DeliveryAddressValueSpec] {
    def this(options: GoogleActionsV2DeliveryAddressValueSpec) = this()
  }
  
  type DeliveryAddressArgument = GoogleActionsV2DeliveryAddressValue
}

