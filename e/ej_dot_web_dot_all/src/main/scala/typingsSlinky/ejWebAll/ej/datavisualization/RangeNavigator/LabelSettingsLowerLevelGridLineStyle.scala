package typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSettingsLowerLevelGridLineStyle extends js.Object {
  /** Specifies the color of grid lines in lower level.
    * @Default {#B5B5B5}
    */
  var color: js.UndefOr[String] = js.native
  /** Specifies the dashArray of gridLines in lowerLevel.
    * @Default {20 5 0}
    */
  var dashArray: js.UndefOr[String] = js.native
  /** Specifies the width of grid lines in lower level.
    * @Default {#B5B5B5}
    */
  var width: js.UndefOr[String] = js.native
}

object LabelSettingsLowerLevelGridLineStyle {
  @scala.inline
  def apply(): LabelSettingsLowerLevelGridLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSettingsLowerLevelGridLineStyle]
  }
  @scala.inline
  implicit class LabelSettingsLowerLevelGridLineStyleOps[Self <: LabelSettingsLowerLevelGridLineStyle] (val x: Self) extends AnyVal {
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
    def withDashArray(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashArray")(js.undefined)
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

