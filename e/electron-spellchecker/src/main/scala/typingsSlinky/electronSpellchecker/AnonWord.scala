package typingsSlinky.electronSpellchecker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWord extends js.Object {
  var word: String = js.native
}

object AnonWord {
  @scala.inline
  def apply(word: String): AnonWord = {
    val __obj = js.Dynamic.literal(word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWord]
  }
  @scala.inline
  implicit class AnonWordOps[Self <: AnonWord] (val x: Self) extends AnyVal {
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

