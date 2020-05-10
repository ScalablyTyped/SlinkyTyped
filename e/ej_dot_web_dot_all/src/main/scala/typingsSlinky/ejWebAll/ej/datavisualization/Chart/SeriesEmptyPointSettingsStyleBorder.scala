package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesEmptyPointSettingsStyleBorder extends js.Object {
  /** Border color of the empty point.
    */
  var color: js.UndefOr[String] = js.native
  /** Border width of the empty point.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}

object SeriesEmptyPointSettingsStyleBorder {
  @scala.inline
  def apply(): SeriesEmptyPointSettingsStyleBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesEmptyPointSettingsStyleBorder]
  }
  @scala.inline
  implicit class SeriesEmptyPointSettingsStyleBorderOps[Self <: SeriesEmptyPointSettingsStyleBorder] (val x: Self) extends AnyVal {
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
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

