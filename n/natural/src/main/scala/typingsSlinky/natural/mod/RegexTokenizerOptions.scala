package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexTokenizerOptions extends js.Object {
  var discardEmpty: js.UndefOr[Boolean] = js.native
  var pattern: js.RegExp = js.native
}

object RegexTokenizerOptions {
  @scala.inline
  def apply(pattern: js.RegExp): RegexTokenizerOptions = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexTokenizerOptions]
  }
  @scala.inline
  implicit class RegexTokenizerOptionsOps[Self <: RegexTokenizerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscardEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discardEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscardEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discardEmpty")(js.undefined)
        ret
    }
  }
  
}

