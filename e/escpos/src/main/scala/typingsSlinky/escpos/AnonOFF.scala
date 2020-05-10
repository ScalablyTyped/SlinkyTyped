package typingsSlinky.escpos

import typingsSlinky.escpos.escposStrings.InformationseparatorthreeECNull
import typingsSlinky.escpos.escposStrings.InformationseparatorthreeECStartofheading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOFF extends js.Object {
   // Barcode mode on
  var OFF: InformationseparatorthreeECNull = js.native
  var ON: InformationseparatorthreeECStartofheading = js.native
}

object AnonOFF {
  @scala.inline
  def apply(OFF: InformationseparatorthreeECNull, ON: InformationseparatorthreeECStartofheading): AnonOFF = {
    val __obj = js.Dynamic.literal(OFF = OFF.asInstanceOf[js.Any], ON = ON.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOFF]
  }
  @scala.inline
  implicit class AnonOFFOps[Self <: AnonOFF] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOFF(value: InformationseparatorthreeECNull): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OFF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withON(value: InformationseparatorthreeECStartofheading): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ON")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

