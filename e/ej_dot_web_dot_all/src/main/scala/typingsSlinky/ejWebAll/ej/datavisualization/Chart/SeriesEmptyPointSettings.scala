package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesEmptyPointSettings extends js.Object {
  /** Specifies the mode of empty point.
    * @Default {gap}
    */
  var displayMode: js.UndefOr[EmptyPointMode | String] = js.native
  /** Options for customizing the color and border of the empty point in the series.
    */
  var style: js.UndefOr[SeriesEmptyPointSettingsStyle] = js.native
  /** Controls the visibility of the empty point.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object SeriesEmptyPointSettings {
  @scala.inline
  def apply(): SeriesEmptyPointSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesEmptyPointSettings]
  }
  @scala.inline
  implicit class SeriesEmptyPointSettingsOps[Self <: SeriesEmptyPointSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayMode(value: EmptyPointMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: SeriesEmptyPointSettingsStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

