package typingsSlinky.nodeDashSnap7.nodeDashSnap7Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParamNumber extends js.Object

@JSImport("node-snap7", "ParamNumber")
@js.native
object ParamNumber extends js.Object {
  @js.native
  sealed trait DstRef extends ParamNumber
  
  @js.native
  sealed trait PDURequest extends ParamNumber
  
  @js.native
  sealed trait PingTimeout extends ParamNumber
  
  @js.native
  sealed trait RecvTimeout extends ParamNumber
  
  @js.native
  sealed trait RemotePort extends ParamNumber
  
  @js.native
  sealed trait SendTimeout extends ParamNumber
  
  @js.native
  sealed trait SrcRef extends ParamNumber
  
  @js.native
  sealed trait SrcTSap extends ParamNumber
  
  /* 8 */ val DstRef: typingsSlinky.nodeDashSnap7.nodeDashSnap7Mod.ParamNumber.DstRef with Double = js.native
  /* 10 */ val PDURequest: typingsSlinky.nodeDashSnap7.nodeDashSnap7Mod.ParamNumber.PDURequest with Double = js.native
  /* 3 */ val PingTimeout: typingsSlinky.nodeDashSnap7.nodeDashSnap7Mod.ParamNumber.PingTimeout with Double = js.native
  /* 5 */ val RecvTimeout: typingsSlinky.nodeDashSnap7.nodeDashSnap7Mod.ParamNumber.RecvTimeout with Double = js.native
  /* 2 */ val RemotePort: typingsSlinky.nodeDashSnap7.nodeDashSnap7Mod.ParamNumber.RemotePort with Double = js.native
  /* 4 */ val SendTimeout: typingsSlinky.nodeDashSnap7.nodeDashSnap7Mod.ParamNumber.SendTimeout with Double = js.native
  /* 7 */ val SrcRef: typingsSlinky.nodeDashSnap7.nodeDashSnap7Mod.ParamNumber.SrcRef with Double = js.native
  /* 9 */ val SrcTSap: typingsSlinky.nodeDashSnap7.nodeDashSnap7Mod.ParamNumber.SrcTSap with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParamNumber with Double] = js.native
}

