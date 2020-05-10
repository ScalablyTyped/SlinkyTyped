package typingsSlinky.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapsePinSettings extends js.Object {
  /** Specifies the custom tooltip for collapse pin.Refer to ejRibbon#tabs-&gt;groups-&gt;content-&gt;groups-&gt;customToolTip for its inner properties.
    * @Default {Object}
    */
  var customToolTip: js.UndefOr[js.Any] = js.native
  /** Sets tooltip for the collapse pin .
    * @Default {null}
    */
  var toolTip: js.UndefOr[String] = js.native
}

object CollapsePinSettings {
  @scala.inline
  def apply(): CollapsePinSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsePinSettings]
  }
  @scala.inline
  implicit class CollapsePinSettingsOps[Self <: CollapsePinSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomToolTip(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomToolTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customToolTip")(js.undefined)
        ret
    }
    @scala.inline
    def withToolTip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolTip")(js.undefined)
        ret
    }
  }
  
}

