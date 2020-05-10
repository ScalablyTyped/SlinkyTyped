package typingsSlinky.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordsOptions extends BaseOptions {
  /**
    * `true` to ignore leading and trailing whitespace. This is the same as `diffWords()`.
    */
  var ignoreWhitespace: js.UndefOr[Boolean] = js.native
}

object WordsOptions {
  @scala.inline
  def apply(): WordsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordsOptions]
  }
  @scala.inline
  implicit class WordsOptionsOps[Self <: WordsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWhitespace")(js.undefined)
        ret
    }
  }
  
}

