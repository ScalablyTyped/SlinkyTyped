package typingsSlinky.sawtoothSdk.protobufMod.ClientStatusGetResponse

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Status extends js.Object
/** Status enum. */
@JSImport("sawtooth-sdk/protobuf", "ClientStatusGetResponse.Status")
@js.native
object Status extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Status with Double] = js.native
  
  @js.native
  sealed trait ERROR extends Status
  /* 2 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  @js.native
  sealed trait OK extends Status
  /* 1 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  @js.native
  sealed trait STATUS_UNSET extends Status
  /* 0 */ @js.native
  object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
}
