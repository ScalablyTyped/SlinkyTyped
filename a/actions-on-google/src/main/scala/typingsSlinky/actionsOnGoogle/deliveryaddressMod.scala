package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotDELIVERY_ADDRESS
import typingsSlinky.actionsOnGoogle.helperHelperMod.SoloHelper
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2DeliveryAddressValue
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2DeliveryAddressValueSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deliveryaddressMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/transaction/deliveryaddress", "DeliveryAddress")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2DeliveryAddressValueSpec}
    * @public
    */
  class DeliveryAddress () extends SoloHelper[actionsDotintentDotDELIVERY_ADDRESS, GoogleActionsV2DeliveryAddressValueSpec] {
    def this(options: GoogleActionsV2DeliveryAddressValueSpec) = this()
  }
  
  type DeliveryAddressArgument = GoogleActionsV2DeliveryAddressValue
}
