package typingsSlinky.ejWebAll.ej.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeBandSettings extends js.Object {
  /** Range band color of the series.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.native
  /** End value of the range band.
    * @Default {null}
    */
  var endRange: js.UndefOr[Double] = js.native
  /** Range band opacity of the series.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Start value of the range band.
    * @Default {null}
    */
  var startRange: js.UndefOr[Double] = js.native
}

object RangeBandSettings {
  @scala.inline
  def apply(): RangeBandSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeBandSettings]
  }
  @scala.inline
  implicit class RangeBandSettingsOps[Self <: RangeBandSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withEndRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRange")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRange")(js.undefined)
        ret
    }
  }
  
}

