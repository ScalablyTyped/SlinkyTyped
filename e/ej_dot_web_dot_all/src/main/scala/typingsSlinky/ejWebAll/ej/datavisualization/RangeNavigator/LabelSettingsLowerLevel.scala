package typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSettingsLowerLevel extends js.Object {
  /** Options for customizing the border of grid lines in lower level.
    */
  var border: js.UndefOr[LabelSettingsLowerLevelBorder] = js.native
  /** Specifies the fill color of labels in lower level.
    * @Default {transparent}
    */
  var fill: js.UndefOr[String] = js.native
  /** Options for customizing the grid lines in lower level.
    */
  var gridLineStyle: js.UndefOr[LabelSettingsLowerLevelGridLineStyle] = js.native
  /** Specifies the intervalType of the labels in lower level.See IntervalType
    * @Default {auto}
    */
  var intervalType: js.UndefOr[IntervalType | String] = js.native
  /** Specifies to hide the labels when it intersects with each other.
    * @Default {none}
    */
  var labelIntersectAction: js.UndefOr[LabelIntersectAction | String] = js.native
  /** Specifies the position of the labels to render either inside or outside of plot area. See LabelPlacement
    * @Default {outside}
    */
  var labelPlacement: js.UndefOr[LabelPlacement | String] = js.native
  /** Specifies the position of the labels in lower level.See Position
    * @Default {bottom}
    */
  var position: js.UndefOr[Position | String] = js.native
  /** Options for customizing the style of labels.
    */
  var style: js.UndefOr[LabelSettingsLowerLevelStyle] = js.native
  /** Toggles the visibility of labels in lower level.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object LabelSettingsLowerLevel {
  @scala.inline
  def apply(): LabelSettingsLowerLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSettingsLowerLevel]
  }
  @scala.inline
  implicit class LabelSettingsLowerLevelOps[Self <: LabelSettingsLowerLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: LabelSettingsLowerLevelBorder): Self = {
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
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLineStyle(value: LabelSettingsLowerLevelGridLineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervalType(value: IntervalType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntervalType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalType")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelIntersectAction(value: LabelIntersectAction | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelIntersectAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelIntersectAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelIntersectAction")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPlacement(value: LabelPlacement | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Position | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: LabelSettingsLowerLevelStyle): Self = {
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

