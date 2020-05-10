package typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSettingsLowerLevelBorder extends js.Object {
  /** Specifies the border color of grid lines.
    * @Default {transparent}
    */
  var color: js.UndefOr[String] = js.native
  /** Specifies the border width of grid lines.
    * @Default {0.5}
    */
  var width: js.UndefOr[String] = js.native
}

object LabelSettingsLowerLevelBorder {
  @scala.inline
  def apply(): LabelSettingsLowerLevelBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSettingsLowerLevelBorder]
  }
  @scala.inline
  implicit class LabelSettingsLowerLevelBorderOps[Self <: LabelSettingsLowerLevelBorder] (val x: Self) extends AnyVal {
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
    def withWidth(value: String): Self = {
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

