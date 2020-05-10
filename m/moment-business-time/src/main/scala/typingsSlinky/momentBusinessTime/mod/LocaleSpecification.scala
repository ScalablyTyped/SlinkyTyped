package typingsSlinky.momentBusinessTime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleSpecification extends js.Object {
  var holidays: js.UndefOr[js.Array[String]] = js.native
  var workinghours: js.UndefOr[WorkingHoursMap] = js.native
}

object LocaleSpecification {
  @scala.inline
  def apply(): LocaleSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleSpecification]
  }
  @scala.inline
  implicit class LocaleSpecificationOps[Self <: LocaleSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHolidays(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holidays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHolidays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holidays")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkinghours(value: WorkingHoursMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workinghours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkinghours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workinghours")(js.undefined)
        ret
    }
  }
  
}

