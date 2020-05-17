package typingsSlinky.nivoLegends.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  itemTextColor  :string,   itemBackground  :string,   itemOpacity  :number,   symbolSize  :number,   symbolBorderWidth  :number,   symbolBorderColor  :string}> */
@js.native
trait PartialitemTextColorstrin extends js.Object {
  var itemBackground: js.UndefOr[String] = js.native
  var itemOpacity: js.UndefOr[Double] = js.native
  var itemTextColor: js.UndefOr[String] = js.native
  var symbolBorderColor: js.UndefOr[String] = js.native
  var symbolBorderWidth: js.UndefOr[Double] = js.native
  var symbolSize: js.UndefOr[Double] = js.native
}

object PartialitemTextColorstrin {
  @scala.inline
  def apply(): PartialitemTextColorstrin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialitemTextColorstrin]
  }
  @scala.inline
  implicit class PartialitemTextColorstrinOps[Self <: PartialitemTextColorstrin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withItemOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(js.undefined)
        ret
    }
  }
  
}

