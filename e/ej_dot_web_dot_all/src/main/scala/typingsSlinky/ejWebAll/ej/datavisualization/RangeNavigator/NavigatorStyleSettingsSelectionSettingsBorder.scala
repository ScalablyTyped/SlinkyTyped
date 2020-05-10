package typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorStyleSettingsSelectionSettingsBorder extends js.Object {
  /** To set the border color to the selection.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  /** To set the border width to the selection.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}

object NavigatorStyleSettingsSelectionSettingsBorder {
  @scala.inline
  def apply(): NavigatorStyleSettingsSelectionSettingsBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorStyleSettingsSelectionSettingsBorder]
  }
  @scala.inline
  implicit class NavigatorStyleSettingsSelectionSettingsBorderOps[Self <: NavigatorStyleSettingsSelectionSettingsBorder] (val x: Self) extends AnyVal {
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

