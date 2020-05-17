package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.aliAppNumbers.`11`
import typingsSlinky.aliApp.aliAppStrings.HHColonmm
import typingsSlinky.aliApp.aliAppStrings.`yyyy-MM-dd HHColonmm`
import typingsSlinky.aliApp.aliAppStrings.`yyyy-MM-dd`
import typingsSlinky.aliApp.aliAppStrings.`yyyy-MM`
import typingsSlinky.aliApp.aliAppStrings.yyyy
import typingsSlinky.aliApp.anon.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 选择日期 https://docs.alipay.com/mini/api/ui-date
@js.native
trait DatePickerOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 初始选择的日期时间，默认当前时间 */
  var currentDate: String = js.native
  /** 最大日期时间 */
  var endDate: String = js.native
  /**
  		 * 返回的日期格式，
  		 * 1. yyyy-MM-dd（默认）
  		 * 2. HH:mm
  		 * 3. yyyy-MM-dd HH:mm
  		 * 4. yyyy-MM （最低基础库：1.1.1, 可用 canIUse('datePicker.object.format.yyyy-MM') 判断）
  		 * 5. yyyy （最低基础库：1.1.1,可用 canIUse('datePicker.object.format.yyyy') 判断）
  		 */
  var format: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy = js.native
  /** 最小日期时间 */
  var startDate: String = js.native
  /** 11 用户取消操作 */
  @JSName("fail")
  def fail_11(error: `11`): Unit = js.native
  @JSName("success")
  def success_MDatePickerOptions(result: Date): Unit = js.native
}

object DatePickerOptions {
  @scala.inline
  def apply(
    currentDate: String,
    endDate: String,
    fail: `11` => Unit,
    format: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy,
    startDate: String,
    success: Date => Unit
  ): DatePickerOptions = {
    val __obj = js.Dynamic.literal(currentDate = currentDate.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], fail = js.Any.fromFunction1(fail), format = format.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[DatePickerOptions]
  }
  @scala.inline
  implicit class DatePickerOptionsOps[Self <: DatePickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFail(value: `11` => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

