package typingsSlinky.ionicCore.datetimeUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleData extends js.Object {
  var dayNames: js.UndefOr[js.Array[String]] = js.native
  var dayShortNames: js.UndefOr[js.Array[String]] = js.native
  var monthNames: js.UndefOr[js.Array[String]] = js.native
  var monthShortNames: js.UndefOr[js.Array[String]] = js.native
}

object LocaleData {
  @scala.inline
  def apply(): LocaleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleData]
  }
  @scala.inline
  implicit class LocaleDataOps[Self <: LocaleData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(js.undefined)
        ret
    }
    @scala.inline
    def withDayShortNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayShortNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayShortNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayShortNames")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthShortNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthShortNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthShortNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthShortNames")(js.undefined)
        ret
    }
  }
  
}

