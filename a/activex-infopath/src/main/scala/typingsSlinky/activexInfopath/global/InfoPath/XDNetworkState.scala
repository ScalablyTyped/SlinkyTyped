package typingsSlinky.activexInfopath.global.InfoPath

import typingsSlinky.activexInfopath.InfoPath.XdMachineOnlineState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.XDNetworkState")
@js.native
class XDNetworkState protected ()
  extends typingsSlinky.activexInfopath.InfoPath.XDNetworkState {
  /* CompleteClass */
  @JSName("InfoPath.XDNetworkState_typekey")
  override var InfoPathDotXDNetworkState_typekey: typingsSlinky.activexInfopath.InfoPath.XDNetworkState = js.native
  /* CompleteClass */
  override val MachineOnlineState: XdMachineOnlineState = js.native
  /* CompleteClass */
  override def IsDestinationReachable(bstrDestination: String): Boolean = js.native
}

