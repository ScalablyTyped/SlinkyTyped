package typingsSlinky.actionsOnGoogle.datetimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeOptionsPrompts extends js.Object {
  /**
    * The prompt used to specifically ask for the date if not provided by user.
    * If not provided, Google will use a generic prompt.
    * @public
    */
  var date: js.UndefOr[String] = js.native
  /**
    * The initial prompt used to ask for a date and time.
    * If not provided, Google will use a generic prompt.
    * @public
    */
  var initial: js.UndefOr[String] = js.native
  /**
    * The prompt used to specifically ask for the time if not provided by user.
    * If not provided, Google will use a generic prompt.
    * @public
    */
  var time: js.UndefOr[String] = js.native
}

object DateTimeOptionsPrompts {
  @scala.inline
  def apply(): DateTimeOptionsPrompts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeOptionsPrompts]
  }
  @scala.inline
  implicit class DateTimeOptionsPromptsOps[Self <: DateTimeOptionsPrompts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withInitial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

