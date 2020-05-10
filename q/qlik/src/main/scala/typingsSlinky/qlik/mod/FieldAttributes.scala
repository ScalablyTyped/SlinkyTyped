package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikNumbers.`0`
import typingsSlinky.qlik.qlikNumbers.`10`
import typingsSlinky.qlik.qlikNumbers.`11`
import typingsSlinky.qlik.qlikNumbers.`12`
import typingsSlinky.qlik.qlikNumbers.`13`
import typingsSlinky.qlik.qlikNumbers.`14`
import typingsSlinky.qlik.qlikNumbers.`15`
import typingsSlinky.qlik.qlikNumbers.`1`
import typingsSlinky.qlik.qlikNumbers.`2`
import typingsSlinky.qlik.qlikNumbers.`3`
import typingsSlinky.qlik.qlikNumbers.`4`
import typingsSlinky.qlik.qlikNumbers.`5`
import typingsSlinky.qlik.qlikNumbers.`6`
import typingsSlinky.qlik.qlikNumbers.`7`
import typingsSlinky.qlik.qlikNumbers.`8`
import typingsSlinky.qlik.qlikNumbers.`9`
import typingsSlinky.qlik.qlikStrings.A
import typingsSlinky.qlik.qlikStrings.D
import typingsSlinky.qlik.qlikStrings.F
import typingsSlinky.qlik.qlikStrings.I
import typingsSlinky.qlik.qlikStrings.IV
import typingsSlinky.qlik.qlikStrings.M
import typingsSlinky.qlik.qlikStrings.R
import typingsSlinky.qlik.qlikStrings.T
import typingsSlinky.qlik.qlikStrings.TS
import typingsSlinky.qlik.qlikStrings.U
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldAttributes extends js.Object {
  var qDec: String = js.native
  var qFmt: String = js.native
  var qSAFEARRAY: js.Array[_] = js.native
  var qThou: String = js.native
  var qType: U | A | I | R | F | M | D | T | TS | IV = js.native
  var qUseThou: `0` | `1` = js.native
  var qnDec: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` = js.native
}

object FieldAttributes {
  @scala.inline
  def apply(
    qDec: String,
    qFmt: String,
    qSAFEARRAY: js.Array[_],
    qThou: String,
    qType: U | A | I | R | F | M | D | T | TS | IV,
    qUseThou: `0` | `1`,
    qnDec: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
  ): FieldAttributes = {
    val __obj = js.Dynamic.literal(qDec = qDec.asInstanceOf[js.Any], qFmt = qFmt.asInstanceOf[js.Any], qSAFEARRAY = qSAFEARRAY.asInstanceOf[js.Any], qThou = qThou.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUseThou = qUseThou.asInstanceOf[js.Any], qnDec = qnDec.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldAttributes]
  }
  @scala.inline
  implicit class FieldAttributesOps[Self <: FieldAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQDec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qDec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFmt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFmt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSAFEARRAY(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSAFEARRAY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQThou(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qThou")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQType(value: U | A | I | R | F | M | D | T | TS | IV): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQUseThou(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qUseThou")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQnDec(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qnDec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

