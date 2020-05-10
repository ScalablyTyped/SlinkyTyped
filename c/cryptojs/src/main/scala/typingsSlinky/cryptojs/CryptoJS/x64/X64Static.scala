package typingsSlinky.cryptojs.CryptoJS.x64

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait X64Static extends js.Object {
  var Word: typingsSlinky.cryptojs.CryptoJS.x64.Word = js.native
  var WordArray: typingsSlinky.cryptojs.CryptoJS.x64.WordArray = js.native
}

object X64Static {
  @scala.inline
  def apply(Word: Word, WordArray: WordArray): X64Static = {
    val __obj = js.Dynamic.literal(Word = Word.asInstanceOf[js.Any], WordArray = WordArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[X64Static]
  }
  @scala.inline
  implicit class X64StaticOps[Self <: X64Static] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWord(value: Word): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Word")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordArray(value: WordArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WordArray")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

