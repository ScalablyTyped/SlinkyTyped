package typingsSlinky.chartJs.mod

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartFontOptions extends js.Object {
  var defaultFontColor: js.UndefOr[ChartColor] = js.native
  var defaultFontFamily: js.UndefOr[String] = js.native
  var defaultFontSize: js.UndefOr[Double] = js.native
  var defaultFontStyle: js.UndefOr[String] = js.native
}

object ChartFontOptions {
  @scala.inline
  def apply(): ChartFontOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartFontOptions]
  }
  @scala.inline
  implicit class ChartFontOptionsOps[Self <: ChartFontOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultFontColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultFontColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultFontColor(value: ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFontColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultFontStyle")(js.undefined)
        ret
    }
  }
  
}

