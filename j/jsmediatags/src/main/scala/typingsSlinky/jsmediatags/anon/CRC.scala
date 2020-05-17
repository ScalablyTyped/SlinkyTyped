package typingsSlinky.jsmediatags.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CRC extends js.Object {
  var CRC: Double = js.native
  var RESTRICTIONS: Double = js.native
  var UPDATE: Double = js.native
}

object CRC {
  @scala.inline
  def apply(CRC: Double, RESTRICTIONS: Double, UPDATE: Double): CRC = {
    val __obj = js.Dynamic.literal(CRC = CRC.asInstanceOf[js.Any], RESTRICTIONS = RESTRICTIONS.asInstanceOf[js.Any], UPDATE = UPDATE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CRC]
  }
  @scala.inline
  implicit class CRCOps[Self <: CRC] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCRC(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CRC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRESTRICTIONS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESTRICTIONS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUPDATE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

