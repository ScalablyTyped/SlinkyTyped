package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DaySize extends js.Object {
  var daySize: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[String] = js.native
  var lineHeight: js.UndefOr[Double] = js.native
  var slideDuration: js.UndefOr[String] = js.native
}

object DaySize {
  @scala.inline
  def apply(): DaySize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaySize]
  }
  @scala.inline
  implicit class DaySizeOps[Self <: DaySize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaySize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daySize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideDuration")(js.undefined)
        ret
    }
  }
  
}

