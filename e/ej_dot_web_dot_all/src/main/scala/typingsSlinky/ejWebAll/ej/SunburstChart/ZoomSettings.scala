package typingsSlinky.ejWebAll.ej.SunburstChart

import typingsSlinky.ejWebAll.ej.datavisualization.Sunburst.SunburstHorizontalAlignment
import typingsSlinky.ejWebAll.ej.datavisualization.Sunburst.SunburstVerticalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomSettings extends js.Object {
  /** Enables or disables zooming.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
  /** Toolbar horizontal alignment
    * @Default {right. See Alignment}
    */
  var toolbarHorizontalAlignment: js.UndefOr[SunburstHorizontalAlignment | String] = js.native
  /** Toolbar vertical alignment
    * @Default {top. See Alignment}
    */
  var toolbarVerticalAlignment: js.UndefOr[SunburstVerticalAlignment | String] = js.native
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
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarHorizontalAlignment(value: SunburstHorizontalAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarHorizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarHorizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarVerticalAlignment(value: SunburstVerticalAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarVerticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarVerticalAlignment")(js.undefined)
        ret
    }
  }
  
}

