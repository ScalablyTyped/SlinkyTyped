package typingsSlinky.pako.pakoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReturnCodes extends js.Object

@JSImport("pako", "ReturnCodes")
@js.native
object ReturnCodes extends js.Object {
  @js.native
  sealed trait Z_BUF_ERROR extends ReturnCodes
  
  @js.native
  sealed trait Z_DATA_ERROR extends ReturnCodes
  
  @js.native
  sealed trait Z_ERRNO extends ReturnCodes
  
  @js.native
  sealed trait Z_NEED_DICT extends ReturnCodes
  
  @js.native
  sealed trait Z_OK extends ReturnCodes
  
  @js.native
  sealed trait Z_STREAM_END extends ReturnCodes
  
  @js.native
  sealed trait Z_STREAM_ERROR extends ReturnCodes
  
  /* -5 */ val Z_BUF_ERROR: typingsSlinky.pako.pakoMod.ReturnCodes.Z_BUF_ERROR with Double = js.native
  /* -3 */ val Z_DATA_ERROR: typingsSlinky.pako.pakoMod.ReturnCodes.Z_DATA_ERROR with Double = js.native
  /* -1 */ val Z_ERRNO: typingsSlinky.pako.pakoMod.ReturnCodes.Z_ERRNO with Double = js.native
  /* 2 */ val Z_NEED_DICT: typingsSlinky.pako.pakoMod.ReturnCodes.Z_NEED_DICT with Double = js.native
  /* 0 */ val Z_OK: typingsSlinky.pako.pakoMod.ReturnCodes.Z_OK with Double = js.native
  /* 1 */ val Z_STREAM_END: typingsSlinky.pako.pakoMod.ReturnCodes.Z_STREAM_END with Double = js.native
  /* -2 */ val Z_STREAM_ERROR: typingsSlinky.pako.pakoMod.ReturnCodes.Z_STREAM_ERROR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReturnCodes with Double] = js.native
}

