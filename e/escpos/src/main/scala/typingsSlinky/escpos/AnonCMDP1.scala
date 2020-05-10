package typingsSlinky.escpos

import typingsSlinky.escpos.escposStrings.InformationseparatorthreeLeftparenthesisk
import typingsSlinky.escpos.escposStrings.`1P0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCMDP1 extends js.Object {
  // Format= CMD_P1{LEN_2BYTE}CMD_P2{DATA}
  // DATA Max Length= 256*256 - 3 (65533)
  var CMD_P1: InformationseparatorthreeLeftparenthesisk = js.native
  var CMD_P2: `1P0` = js.native
}

object AnonCMDP1 {
  @scala.inline
  def apply(CMD_P1: InformationseparatorthreeLeftparenthesisk, CMD_P2: `1P0`): AnonCMDP1 = {
    val __obj = js.Dynamic.literal(CMD_P1 = CMD_P1.asInstanceOf[js.Any], CMD_P2 = CMD_P2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCMDP1]
  }
  @scala.inline
  implicit class AnonCMDP1Ops[Self <: AnonCMDP1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCMD_P1(value: InformationseparatorthreeLeftparenthesisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CMD_P1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCMD_P2(value: `1P0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CMD_P2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

