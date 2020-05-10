package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartCommonPaneSettings extends js.Object {
  /** Specifies the color of the pane's background. */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Configures the pane border. */
  var border: js.UndefOr[AnonLeft] = js.native
}

object dxChartCommonPaneSettings {
  @scala.inline
  def apply(): dxChartCommonPaneSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonPaneSettings]
  }
  @scala.inline
  implicit class dxChartCommonPaneSettingsOps[Self <: dxChartCommonPaneSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: AnonLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
  }
  
}

