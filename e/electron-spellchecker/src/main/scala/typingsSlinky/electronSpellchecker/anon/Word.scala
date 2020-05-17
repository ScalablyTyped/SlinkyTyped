package typingsSlinky.electronSpellchecker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Word extends js.Object {
  var word: String = js.native
}

object Word {
  @scala.inline
  def apply(word: String): Word = {
    val __obj = js.Dynamic.literal(word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[Word]
  }
  @scala.inline
  implicit class WordOps[Self <: Word] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

