package typingsSlinky.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomSettings extends js.Object {
  /** Specifies animation duration for map shapes while zooming.
    * @Default {600}
    */
  var animationDuration: js.UndefOr[String] = js.native
  /** Enables or Disables the zoom on mouse wheel the map.
    * @Default {true}
    */
  var enableMouseWheelZoom: js.UndefOr[Boolean] = js.native
  /** Enables or Disables the zooming of map
    * @Default {true}
    */
  var enableZoom: js.UndefOr[Boolean] = js.native
  /** Enables or Disables the zoom on selecting the map shape
    * @Default {false}
    */
  var enableZoomOnSelection: js.UndefOr[Boolean] = js.native
  /** Specifies the zoom factor for map zoom value.
    * @Default {1}
    */
  var factor: js.UndefOr[Double] = js.native
  /** Specifies the zoom level value for which map to be zoomed
    * @Default {1}
    */
  var level: js.UndefOr[Double] = js.native
  /** Specifies the maximum zoom level of the map
    * @Default {100}
    */
  var maxValue: js.UndefOr[Double] = js.native
  /** Specifies the minimum zoomSettings level of the map
    * @Default {1}
    */
  var minValue: js.UndefOr[Double] = js.native
}

object ZoomSettings {
  @scala.inline
  def apply(): ZoomSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomSettings]
  }
  @scala.inline
  implicit class ZoomSettingsOps[Self <: ZoomSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMouseWheelZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMouseWheelZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMouseWheelZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMouseWheelZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableZoomOnSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableZoomOnSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableZoomOnSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableZoomOnSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factor")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
  }
  
}

