package typingsSlinky.figlet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontOptions extends js.Object {
  var baseline: Double = js.native
  var codeTagCount: Double | Null = js.native
  var fittingRules: FittingRules = js.native
  var fullLayout: Double | Null = js.native
  var hardBlank: String = js.native
  var height: Double = js.native
  var maxLength: Double = js.native
  var numCommentLines: Double = js.native
  var oldLayout: Double = js.native
  var printDirection: PrintDirection = js.native
}

object FontOptions {
  @scala.inline
  def apply(
    baseline: Double,
    fittingRules: FittingRules,
    hardBlank: String,
    height: Double,
    maxLength: Double,
    numCommentLines: Double,
    oldLayout: Double,
    printDirection: PrintDirection
  ): FontOptions = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], fittingRules = fittingRules.asInstanceOf[js.Any], hardBlank = hardBlank.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], numCommentLines = numCommentLines.asInstanceOf[js.Any], oldLayout = oldLayout.asInstanceOf[js.Any], printDirection = printDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontOptions]
  }
  @scala.inline
  implicit class FontOptionsOps[Self <: FontOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFittingRules(value: FittingRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fittingRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHardBlank(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardBlank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumCommentLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numCommentLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldLayout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintDirection(value: PrintDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeTagCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeTagCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeTagCountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeTagCount")(null)
        ret
    }
    @scala.inline
    def withFullLayout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullLayoutNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullLayout")(null)
        ret
    }
  }
  
}

