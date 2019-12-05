package typingsSlinky.ethereumDashProtocol.ethereumDashProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OpCode extends js.Object

@JSImport("ethereum-protocol", "OpCode")
@js.native
object OpCode extends js.Object {
  @js.native
  sealed trait Call extends OpCode
  
  @js.native
  sealed trait CallCode extends OpCode
  
  @js.native
  sealed trait Create extends OpCode
  
  @js.native
  sealed trait DelegateCall extends OpCode
  
  @js.native
  sealed trait Invalid extends OpCode
  
  @js.native
  sealed trait Return extends OpCode
  
  @js.native
  sealed trait Revert extends OpCode
  
  @js.native
  sealed trait SelfDestruct extends OpCode
  
  @js.native
  sealed trait StaticCall extends OpCode
  
  @js.native
  sealed trait Stop extends OpCode
  
  /* "CALL" */ val Call: typingsSlinky.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.Call with String = js.native
  /* "CALLCODE" */ val CallCode: typingsSlinky.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.CallCode with String = js.native
  /* "CREATE" */ val Create: typingsSlinky.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.Create with String = js.native
  /* "DELEGATECALL" */ val DelegateCall: typingsSlinky.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.DelegateCall with String = js.native
  /* "INVALID" */ val Invalid: typingsSlinky.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.Invalid with String = js.native
  /* "RETURN" */ val Return: typingsSlinky.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.Return with String = js.native
  /* "REVERT" */ val Revert: typingsSlinky.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.Revert with String = js.native
  /* "SELFDESTRUCT" */ val SelfDestruct: typingsSlinky.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.SelfDestruct with String = js.native
  /* "STATICCALL" */ val StaticCall: typingsSlinky.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.StaticCall with String = js.native
  /* "STOP" */ val Stop: typingsSlinky.ethereumDashProtocol.ethereumDashProtocolMod.OpCode.Stop with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OpCode with String] = js.native
}

