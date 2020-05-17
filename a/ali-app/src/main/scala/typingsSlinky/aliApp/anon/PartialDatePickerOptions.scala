package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.aliAppNumbers.`11`
import typingsSlinky.aliApp.aliAppStrings.HHColonmm
import typingsSlinky.aliApp.aliAppStrings.`yyyy-MM-dd HHColonmm`
import typingsSlinky.aliApp.aliAppStrings.`yyyy-MM-dd`
import typingsSlinky.aliApp.aliAppStrings.`yyyy-MM`
import typingsSlinky.aliApp.aliAppStrings.yyyy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.DatePickerOptions> */
@js.native
trait PartialDatePickerOptions extends js.Object {
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var currentDate: js.UndefOr[String] = js.native
  var endDate: js.UndefOr[String] = js.native
  var fail: js.UndefOr[js.Function1[`11`, Unit]] = js.native
  var format: js.UndefOr[`yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy] = js.native
  var startDate: js.UndefOr[String] = js.native
  var success: js.UndefOr[js.Function1[/* result */ Date, Unit]] = js.native
}

object PartialDatePickerOptions {
  @scala.inline
  def apply(): PartialDatePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDatePickerOptions]
  }
  @scala.inline
  implicit class PartialDatePickerOptionsOps[Self <: PartialDatePickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: /* res */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: `11` => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy): Self = {
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
    def withStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* result */ Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

