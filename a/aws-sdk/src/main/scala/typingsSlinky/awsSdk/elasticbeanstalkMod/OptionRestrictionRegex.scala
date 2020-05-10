package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionRestrictionRegex extends js.Object {
  /**
    * A unique name representing this regular expression.
    */
  var Label: js.UndefOr[RegexLabel] = js.native
  /**
    * The regular expression pattern that a string configuration option value with this restriction must match.
    */
  var Pattern: js.UndefOr[RegexPattern] = js.native
}

object OptionRestrictionRegex {
  @scala.inline
  def apply(): OptionRestrictionRegex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionRestrictionRegex]
  }
  @scala.inline
  implicit class OptionRestrictionRegexOps[Self <: OptionRestrictionRegex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: RegexLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(value: RegexPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(js.undefined)
        ret
    }
  }
  
}

