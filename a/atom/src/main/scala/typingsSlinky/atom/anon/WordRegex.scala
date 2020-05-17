package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordRegex extends js.Object {
  var wordRegex: js.UndefOr[js.RegExp] = js.native
}

object WordRegex {
  @scala.inline
  def apply(): WordRegex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordRegex]
  }
  @scala.inline
  implicit class WordRegexOps[Self <: WordRegex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWordRegex(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordRegex")(js.undefined)
        ret
    }
  }
  
}

