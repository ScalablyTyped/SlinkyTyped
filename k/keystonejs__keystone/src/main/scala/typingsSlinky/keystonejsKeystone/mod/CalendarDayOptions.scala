package typingsSlinky.keystonejsKeystone.mod

import typingsSlinky.keystonejsFields.mod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.keystonejsKeystone.mod.AllFieldsOptions because Already inherited */ @js.native
trait CalendarDayOptions extends BaseFieldOptions {
  var format: js.UndefOr[String] = js.native
  var yearPickerType: js.UndefOr[String] = js.native
  var yearRangeFrom: js.UndefOr[Double] = js.native
  var yearRangeTo: js.UndefOr[Double] = js.native
}

object CalendarDayOptions {
  @scala.inline
  def apply(`type`: FieldType): CalendarDayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDayOptions]
  }
  @scala.inline
  implicit class CalendarDayOptionsOps[Self <: CalendarDayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withYearPickerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearPickerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearPickerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearPickerType")(js.undefined)
        ret
    }
    @scala.inline
    def withYearRangeFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearRangeFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearRangeFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearRangeFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withYearRangeTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearRangeTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearRangeTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearRangeTo")(js.undefined)
        ret
    }
  }
  
}

