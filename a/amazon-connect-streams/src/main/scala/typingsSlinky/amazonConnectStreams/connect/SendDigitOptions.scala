package typingsSlinky.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendDigitOptions extends SuccessFailOptions {
  /*
    * A string containing digits to send.
    */
  var digits: String = js.native
}

object SendDigitOptions {
  @scala.inline
  def apply(digits: String): SendDigitOptions = {
    val __obj = js.Dynamic.literal(digits = digits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendDigitOptions]
  }
  @scala.inline
  implicit class SendDigitOptionsOps[Self <: SendDigitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDigits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

