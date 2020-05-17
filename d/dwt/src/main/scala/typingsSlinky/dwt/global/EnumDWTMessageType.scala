package typingsSlinky.dwt.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** For query the operation that are supported by the data source on a capability .
  *  Application gets these through DG_CONTROL/DAT_CAPABILITY/MSG_QUERYSUPPORT
  */
@JSGlobal("EnumDWT_MessageType")
@js.native
object EnumDWTMessageType extends js.Object {
  /* 1 */ val TWQC_GET: typingsSlinky.dwt.EnumDWTMessageType.TWQC_GET with Double = js.native
  /* 8 */ val TWQC_GETCURRENT: typingsSlinky.dwt.EnumDWTMessageType.TWQC_GETCURRENT with Double = js.native
  /* 4 */ val TWQC_GETDEFAULT: typingsSlinky.dwt.EnumDWTMessageType.TWQC_GETDEFAULT with Double = js.native
  /* 16 */ val TWQC_RESET: typingsSlinky.dwt.EnumDWTMessageType.TWQC_RESET with Double = js.native
  /* 2 */ val TWQC_SET: typingsSlinky.dwt.EnumDWTMessageType.TWQC_SET with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.dwt.EnumDWTMessageType with Double] = js.native
}

