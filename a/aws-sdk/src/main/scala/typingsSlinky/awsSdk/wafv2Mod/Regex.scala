package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Regex extends js.Object {
  /**
    * The string representing the regular expression.
    */
  var RegexString: js.UndefOr[RegexPatternString] = js.native
}

object Regex {
  @scala.inline
  def apply(): Regex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Regex]
  }
  @scala.inline
  implicit class RegexOps[Self <: Regex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegexString(value: RegexPatternString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexString")(js.undefined)
        ret
    }
  }
  
}

