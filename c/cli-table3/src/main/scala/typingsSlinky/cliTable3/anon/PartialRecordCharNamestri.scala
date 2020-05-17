package typingsSlinky.cliTable3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<cli-table3.cli-table3.CharName, string>> */
@js.native
trait PartialRecordCharNamestri extends js.Object {
  var bottom: js.UndefOr[String] = js.native
  var `bottom-left`: js.UndefOr[String] = js.native
  var `bottom-mid`: js.UndefOr[String] = js.native
  var `bottom-right`: js.UndefOr[String] = js.native
  var left: js.UndefOr[String] = js.native
  var `left-mid`: js.UndefOr[String] = js.native
  var mid: js.UndefOr[String] = js.native
  var `mid-mid`: js.UndefOr[String] = js.native
  var middle: js.UndefOr[String] = js.native
  var right: js.UndefOr[String] = js.native
  var `right-mid`: js.UndefOr[String] = js.native
  var top: js.UndefOr[String] = js.native
  var `top-left`: js.UndefOr[String] = js.native
  var `top-mid`: js.UndefOr[String] = js.native
  var `top-right`: js.UndefOr[String] = js.native
}

object PartialRecordCharNamestri {
  @scala.inline
  def apply(): PartialRecordCharNamestri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordCharNamestri]
  }
  @scala.inline
  implicit class PartialRecordCharNamestriOps[Self <: PartialRecordCharNamestri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def `withBottom-left`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBottom-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withBottom-mid`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBottom-mid`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-mid")(js.undefined)
        ret
    }
    @scala.inline
    def `withBottom-right`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBottom-right`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom-right")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def `withLeft-mid`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left-mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLeft-mid`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left-mid")(js.undefined)
        ret
    }
    @scala.inline
    def withMid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid")(js.undefined)
        ret
    }
    @scala.inline
    def `withMid-mid`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMid-mid`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid-mid")(js.undefined)
        ret
    }
    @scala.inline
    def withMiddle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiddle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("middle")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def `withRight-mid`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right-mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRight-mid`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right-mid")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def `withTop-left`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTop-left`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-left")(js.undefined)
        ret
    }
    @scala.inline
    def `withTop-mid`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTop-mid`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-mid")(js.undefined)
        ret
    }
    @scala.inline
    def `withTop-right`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTop-right`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top-right")(js.undefined)
        ret
    }
  }
  
}

