package typingsSlinky.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplaySettings extends js.Object {
  /** Allows you to customize the display of the pivot chart and pivot grid widgets in the tabs or tiles.
    * @Default {ej.PivotClient.ControlPlacement.Tab}
    */
  var controlPlacement: js.UndefOr[ControlPlacement | String] = js.native
  /** Allows you to set either the chart or grid as the start-up widget.
    * @Default {ej.PivotClient.DefaultView.Grid}
    */
  var defaultView: js.UndefOr[DefaultView | String] = js.native
  /** Allows you to switch to full screen view of the pivot chart and the pivot grid from default view in the pivot client.
    * @Default {false}
    */
  var enableFullScreen: js.UndefOr[Boolean] = js.native
  /** Enables an option to enhance the space for the pivot grid and pivot chart by hiding the cube browser and the axis element builder.
    * @Default {false}
    */
  var enableTogglePanel: js.UndefOr[Boolean] = js.native
  /** Sets the display mode (only chart/only grid/both) in the pivot client.
    * @Default {ej.PivotClient.DisplayMode.ChartAndGrid}
    */
  var mode: js.UndefOr[DisplayMode | String] = js.native
}

object DisplaySettings {
  @scala.inline
  def apply(): DisplaySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplaySettings]
  }
  @scala.inline
  implicit class DisplaySettingsOps[Self <: DisplaySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlPlacement(value: ControlPlacement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultView(value: DefaultView | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultView")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableFullScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTogglePanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTogglePanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTogglePanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTogglePanel")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: DisplayMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

