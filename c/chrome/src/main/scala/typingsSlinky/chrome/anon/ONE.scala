package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chromeStrings.one
import typingsSlinky.chrome.chromeStrings.two
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ONE extends js.Object {
  var ONE: one = js.native
  var TWO: two = js.native
}

object ONE {
  @scala.inline
  def apply(ONE: one, TWO: two): ONE = {
    val __obj = js.Dynamic.literal(ONE = ONE.asInstanceOf[js.Any], TWO = TWO.asInstanceOf[js.Any])
    __obj.asInstanceOf[ONE]
  }
  @scala.inline
  implicit class ONEOps[Self <: ONE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withONE(value: one): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ONE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTWO(value: two): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TWO")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

