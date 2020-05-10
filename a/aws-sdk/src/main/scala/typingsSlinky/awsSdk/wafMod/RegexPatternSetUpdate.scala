package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexPatternSetUpdate extends js.Object {
  /**
    * Specifies whether to insert or delete a RegexPatternString.
    */
  var Action: ChangeAction = js.native
  /**
    * Specifies the regular expression (regex) pattern that you want AWS WAF to search for, such as B[a@]dB[o0]t.
    */
  var RegexPatternString: typingsSlinky.awsSdk.wafMod.RegexPatternString = js.native
}

object RegexPatternSetUpdate {
  @scala.inline
  def apply(Action: ChangeAction, RegexPatternString: RegexPatternString): RegexPatternSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], RegexPatternString = RegexPatternString.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexPatternSetUpdate]
  }
  @scala.inline
  implicit class RegexPatternSetUpdateOps[Self <: RegexPatternSetUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: ChangeAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegexPatternString(value: RegexPatternString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegexPatternString")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

