package typingsSlinky.actionsOnGoogle.mod

import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsOrdersV3OrderUpdate
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2OrdersOrderUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google", "OrderUpdate")
@js.native
class OrderUpdate protected ()
  extends typingsSlinky.actionsOnGoogle.actionssdkMod.OrderUpdate {
  def this(options: GoogleActionsOrdersV3OrderUpdate) = this()
  /**
    * @param options The raw {@link GoogleActionsV2OrdersOrderUpdate}
    *     or {@link GoogleActionsOrdersV3OrderUpdate}
    *     if using ordersv3
    * @public
    */
  def this(options: GoogleActionsV2OrdersOrderUpdate) = this()
}
