package typingsSlinky.ejWebAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelSettingsHigherLevel extends js.Object {
  /** Options for customizing the border of grid lines in higher level.
    */
  var border: js.UndefOr[LabelSettingsHigherLevelBorder] = js.native
  /** Specifies the fill color of higher level labels.
    * @Default {transparent}
    */
  var fill: js.UndefOr[String] = js.native
  /** Options for customizing the grid line colors, width, dashArray, border.
    */
  var gridLineStyle: js.UndefOr[LabelSettingsHigherLevelGridLineStyle] = js.native
  /** Specifies the intervalType for higher level labels. See
    * @Default {auto}
    */
  var intervalType: js.UndefOr[IntervalType | String] = js.native
  /** Specifies to hide the labels when it intersects with each other.
    * @Default {none}
    */
  var labelIntersectAction: js.UndefOr[LabelIntersectAction | String] = js.native
  /** Specifies the position of the labels to render either inside or outside of plot area
    * @Default {outside}
    */
  var labelPlacement: js.UndefOr[LabelPlacement | String] = js.native
  /** Specifies the position of the labels in higher level
    * @Default {top}
    */
  var position: js.UndefOr[Position | String] = js.native
  /** Options for customizing the style of higher level labels.
    */
  var style: js.UndefOr[LabelSettingsHigherLevelStyle] = js.native
  /** Toggles the visibility of higher level labels.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object LabelSettingsHigherLevel {
  @scala.inline
  def apply(): LabelSettingsHigherLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSettingsHigherLevel]
  }
  @scala.inline
  implicit class LabelSettingsHigherLevelOps[Self <: LabelSettingsHigherLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: LabelSettingsHigherLevelBorder): Self = {
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
    def withGridLineStyle(value: LabelSettingsHigherLevelGridLineStyle): Self = {
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
    def withStyle(value: LabelSettingsHigherLevelStyle): Self = {
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

