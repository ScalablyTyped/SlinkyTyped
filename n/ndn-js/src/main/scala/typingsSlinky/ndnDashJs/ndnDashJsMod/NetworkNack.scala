package typingsSlinky.ndnDashJs.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "NetworkNack")
@js.native
class NetworkNack ()
  extends typingsSlinky.ndnDashJs.networkDashNackMod.NetworkNack

@JSImport("ndn-js", "NetworkNack")
@js.native
object NetworkNack extends js.Object {
  @js.native
  object Reason extends js.Object {
    /* 50 */ val CONGESTION: typingsSlinky.ndnDashJs.networkDashNackMod.NetworkNack.Reason.CONGESTION with Double = js.native
    /* 100 */ val DUPLICATE: typingsSlinky.ndnDashJs.networkDashNackMod.NetworkNack.Reason.DUPLICATE with Double = js.native
    /* 0 */ val NONE: typingsSlinky.ndnDashJs.networkDashNackMod.NetworkNack.Reason.NONE with Double = js.native
    /* 150 */ val NO_ROUTE: typingsSlinky.ndnDashJs.networkDashNackMod.NetworkNack.Reason.NO_ROUTE with Double = js.native
    /* 0x7fff */ val OTHER_CODE: typingsSlinky.ndnDashJs.networkDashNackMod.NetworkNack.Reason.OTHER_CODE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ndnDashJs.networkDashNackMod.NetworkNack.Reason with Double] = js.native
  }
  
}

