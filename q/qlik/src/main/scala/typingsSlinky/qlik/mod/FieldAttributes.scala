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

trait FieldAttributes extends js.Object {
  var qDec: String
  var qFmt: String
  var qSAFEARRAY: js.Array[_]
  var qThou: String
  var qType: U | A | I | R | F | M | D | T | TS | IV
  var qUseThou: `0` | `1`
  var qnDec: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
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
}

