package typingsSlinky.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinesOptions extends BaseOptions {
  /**
    * `true` to ignore leading and trailing whitespace. This is the same as `diffTrimmedLines()`.
    */
  var ignoreWhitespace: js.UndefOr[Boolean] = js.native
  /**
    * `true` to treat newline characters as separate tokens. This allows for changes to the newline structure
    * to occur independently of the line content and to be treated as such. In general this is the more
    * human friendly form of `diffLines()` and `diffLines()` is better suited for patches and other computer
    * friendly output.
    */
  var newlineIsToken: js.UndefOr[Boolean] = js.native
}

object LinesOptions {
  @scala.inline
  def apply(): LinesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinesOptions]
  }
  @scala.inline
  implicit class LinesOptionsOps[Self <: LinesOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withNewlineIsToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newlineIsToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewlineIsToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newlineIsToken")(js.undefined)
        ret
    }
  }
  
}

