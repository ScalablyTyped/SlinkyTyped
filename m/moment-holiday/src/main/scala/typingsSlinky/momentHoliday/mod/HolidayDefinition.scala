package typingsSlinky.momentHoliday.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HolidayDefinition extends js.Object {
  var date: String = js.native
  var keywords: js.UndefOr[js.Array[String]] = js.native
  var keywords_n: js.UndefOr[js.Array[String]] = js.native
  var keywords_y: js.UndefOr[js.Array[String]] = js.native
  var regions: js.UndefOr[js.Array[String]] = js.native
  var regions_n: js.UndefOr[js.Array[String]] = js.native
}

object HolidayDefinition {
  @scala.inline
  def apply(date: String): HolidayDefinition = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolidayDefinition]
  }
  @scala.inline
  implicit class HolidayDefinitionOps[Self <: HolidayDefinition] (val x: Self) extends AnyVal {
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
    def withKeywords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords_n(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords_n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords_n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords_n")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords_y(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords_y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords_y: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords_y")(js.undefined)
        ret
    }
    @scala.inline
    def withRegions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions")(js.undefined)
        ret
    }
    @scala.inline
    def withRegions_n(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions_n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegions_n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regions_n")(js.undefined)
        ret
    }
  }
  
}

