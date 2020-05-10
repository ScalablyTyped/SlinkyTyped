package typingsSlinky.reactNativePermissions

import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.blocked
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.denied
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.granted
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.unavailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  UNAVAILABLE  :'unavailable',   DENIED  :'denied',   BLOCKED  :'blocked',   GRANTED  :'granted'}> */
@js.native
trait ReadonlyUNAVAILABLEunavai extends js.Object {
  val BLOCKED: blocked = js.native
  val DENIED: denied = js.native
  val GRANTED: granted = js.native
  val UNAVAILABLE: unavailable = js.native
}

object ReadonlyUNAVAILABLEunavai {
  @scala.inline
  def apply(BLOCKED: blocked, DENIED: denied, GRANTED: granted, UNAVAILABLE: unavailable): ReadonlyUNAVAILABLEunavai = {
    val __obj = js.Dynamic.literal(BLOCKED = BLOCKED.asInstanceOf[js.Any], DENIED = DENIED.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any], UNAVAILABLE = UNAVAILABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyUNAVAILABLEunavai]
  }
  @scala.inline
  implicit class ReadonlyUNAVAILABLEunavaiOps[Self <: ReadonlyUNAVAILABLEunavai] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBLOCKED(value: blocked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BLOCKED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDENIED(value: denied): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DENIED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGRANTED(value: granted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GRANTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNAVAILABLE(value: unavailable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNAVAILABLE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

