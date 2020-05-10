package typingsSlinky.chrome

import typingsSlinky.chrome.chromeStrings.eight
import typingsSlinky.chrome.chromeStrings.seven
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEIGHT extends js.Object {
  var EIGHT: eight = js.native
  var SEVEN: seven = js.native
}

object AnonEIGHT {
  @scala.inline
  def apply(EIGHT: eight, SEVEN: seven): AnonEIGHT = {
    val __obj = js.Dynamic.literal(EIGHT = EIGHT.asInstanceOf[js.Any], SEVEN = SEVEN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEIGHT]
  }
  @scala.inline
  implicit class AnonEIGHTOps[Self <: AnonEIGHT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEIGHT(value: eight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EIGHT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSEVEN(value: seven): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SEVEN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

