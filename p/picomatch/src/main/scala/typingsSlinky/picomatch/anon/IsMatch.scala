package typingsSlinky.picomatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsMatch extends js.Object {
  var isMatch: Boolean = js.native
  var `match`: Boolean = js.native
  var output: js.Any = js.native
}

object IsMatch {
  @scala.inline
  def apply(isMatch: Boolean, `match`: Boolean, output: js.Any): IsMatch = {
    val __obj = js.Dynamic.literal(isMatch = isMatch.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMatch]
  }
  @scala.inline
  implicit class IsMatchOps[Self <: IsMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

