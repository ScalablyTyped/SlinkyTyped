package typingsSlinky.firstMate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxLineLength extends js.Object {
  var maxLineLength: js.UndefOr[Double] = js.native
  var maxTokensPerLine: js.UndefOr[Double] = js.native
}

object MaxLineLength {
  @scala.inline
  def apply(): MaxLineLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxLineLength]
  }
  @scala.inline
  implicit class MaxLineLengthOps[Self <: MaxLineLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxLineLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLineLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLineLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLineLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTokensPerLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTokensPerLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTokensPerLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTokensPerLine")(js.undefined)
        ret
    }
  }
  
}

