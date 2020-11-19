package typingsSlinky.ndnJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "NetworkNack")
@js.native
class NetworkNack ()
  extends typingsSlinky.ndnJs.networkNackMod.NetworkNack
@JSImport("ndn-js", "NetworkNack")
@js.native
object NetworkNack extends js.Object {
  
  @js.native
  object Reason extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ndnJs.networkNackMod.NetworkNack.Reason with Double] = js.native
    
    /* 50 */ val CONGESTION: typingsSlinky.ndnJs.networkNackMod.NetworkNack.Reason.CONGESTION with Double = js.native
    
    /* 100 */ val DUPLICATE: typingsSlinky.ndnJs.networkNackMod.NetworkNack.Reason.DUPLICATE with Double = js.native
    
    /* 0 */ val NONE: typingsSlinky.ndnJs.networkNackMod.NetworkNack.Reason.NONE with Double = js.native
    
    /* 150 */ val NO_ROUTE: typingsSlinky.ndnJs.networkNackMod.NetworkNack.Reason.NO_ROUTE with Double = js.native
    
    /* 0x7fff */ val OTHER_CODE: typingsSlinky.ndnJs.networkNackMod.NetworkNack.Reason.OTHER_CODE with Double = js.native
  }
}
