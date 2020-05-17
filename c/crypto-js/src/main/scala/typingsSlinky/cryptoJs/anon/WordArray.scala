package typingsSlinky.cryptoJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordArray extends js.Object {
  var WordArray: Create = js.native
}

object WordArray {
  @scala.inline
  def apply(WordArray: Create): WordArray = {
    val __obj = js.Dynamic.literal(WordArray = WordArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordArray]
  }
  @scala.inline
  implicit class WordArrayOps[Self <: WordArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWordArray(value: Create): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordArray")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

