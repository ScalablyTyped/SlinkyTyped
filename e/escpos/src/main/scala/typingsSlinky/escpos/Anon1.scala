package typingsSlinky.escpos

import typingsSlinky.escpos.escposStrings.Acknowledge
import typingsSlinky.escpos.escposStrings.Bell
import typingsSlinky.escpos.escposStrings.Endoftext
import typingsSlinky.escpos.escposStrings.Endoftransmission
import typingsSlinky.escpos.escposStrings.Enquiry
import typingsSlinky.escpos.escposStrings.Null
import typingsSlinky.escpos.escposStrings.Startofheading
import typingsSlinky.escpos.escposStrings.Startoftext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon1 extends js.Object {
  var `1`: Null = js.native
  var `2`: Startofheading = js.native
  var `3`: Startoftext = js.native
  var `4`: Endoftext = js.native
  var `5`: Endoftransmission = js.native
  var `6`: Enquiry = js.native
  var `7`: Acknowledge = js.native
  var `8`: Bell = js.native
}

object Anon1 {
  @scala.inline
  def apply(
    `1`: Null,
    `2`: Startofheading,
    `3`: Startoftext,
    `4`: Endoftext,
    `5`: Endoftransmission,
    `6`: Enquiry,
    `7`: Acknowledge,
    `8`: Bell
  ): Anon1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
  @scala.inline
  implicit class Anon1Ops[Self <: Anon1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with1(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with2(value: Startofheading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with3(value: Startoftext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with4(value: Endoftext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with5(value: Endoftransmission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with6(value: Enquiry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with7(value: Acknowledge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with8(value: Bell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("8")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

