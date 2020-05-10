package typingsSlinky.actionsOnGoogle.datetimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeOptions extends js.Object {
  /**
    * Prompts for the user
    * @public
    */
  var prompts: js.UndefOr[DateTimeOptionsPrompts] = js.native
}

object DateTimeOptions {
  @scala.inline
  def apply(): DateTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeOptions]
  }
  @scala.inline
  implicit class DateTimeOptionsOps[Self <: DateTimeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrompts(value: DateTimeOptionsPrompts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompts")(js.undefined)
        ret
    }
  }
  
}

