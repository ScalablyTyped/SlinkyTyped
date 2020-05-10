package typingsSlinky.cryptoJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWordArray extends js.Object {
  var WordArray: AnonCreate = js.native
}

object AnonWordArray {
  @scala.inline
  def apply(WordArray: AnonCreate): AnonWordArray = {
    val __obj = js.Dynamic.literal(WordArray = WordArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWordArray]
  }
  @scala.inline
  implicit class AnonWordArrayOps[Self <: AnonWordArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWordArray(value: AnonCreate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordArray")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

