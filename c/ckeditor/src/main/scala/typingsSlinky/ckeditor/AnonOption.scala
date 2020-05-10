package typingsSlinky.ckeditor

import typingsSlinky.ckeditor.CKEDITOR.htmlParser.fragment
import typingsSlinky.ckeditor.CKEDITOR.htmlParser.node
import typingsSlinky.ckeditor.CKEDITOR.htmlParser.rule
import typingsSlinky.ckeditor.CKEDITOR.htmlParser.ruleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOption extends js.Object {
  var option: ruleOptions = js.native
  var priority: Double = js.native
  var value: rule = js.native
}

object AnonOption {
  @scala.inline
  def apply(option: ruleOptions, priority: Double, value: rule): AnonOption = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOption]
  }
  @scala.inline
  implicit class AnonOptionOps[Self <: AnonOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOption(value: ruleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueFunction1(value: /* value */ node | fragment | String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: rule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

