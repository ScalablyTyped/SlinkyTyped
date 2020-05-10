package typingsSlinky.pulumiAws.regexPatternSetMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexPatternSetArgs extends js.Object {
  /**
    * The name or description of the Regex Pattern Set.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of regular expression (regex) patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`.
    */
  val regexPatternStrings: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object RegexPatternSetArgs {
  @scala.inline
  def apply(): RegexPatternSetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexPatternSetArgs]
  }
  @scala.inline
  implicit class RegexPatternSetArgsOps[Self <: RegexPatternSetArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRegexPatternStrings(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexPatternStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexPatternStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexPatternStrings")(js.undefined)
        ret
    }
  }
  
}

