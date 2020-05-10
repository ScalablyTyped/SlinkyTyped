package typingsSlinky.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersLegendSettings extends js.Object {
  /** Determines whether the legend should be placed outside or inside the map bounds
    * @Default {false}
    */
  var dockOnMap: js.UndefOr[Boolean] = js.native
  /** Determines the legend placement and it is valid only when dockOnMap is true
    * @Default {top}
    */
  var dockPosition: js.UndefOr[DockPosition | String] = js.native
  /** height value for legend setting
    * @Default {0}
    */
  var height: js.UndefOr[Double] = js.native
  /** to get icon value for legend setting
    * @Default {rectangle}
    */
  var icon: js.UndefOr[LegendIcons | String] = js.native
  /** icon height value for legend setting
    * @Default {20}
    */
  var iconHeight: js.UndefOr[Double] = js.native
  /** icon Width value for legend setting
    * @Default {20}
    */
  var iconWidth: js.UndefOr[Double] = js.native
  /** set the orientation of legend labels
    * @Default {vertical}
    */
  var labelOrientation: js.UndefOr[LabelOrientation | String] = js.native
  /** to get leftLabel value for legend setting
    * @Default {null}
    */
  var leftLabel: js.UndefOr[String] = js.native
  /** to get mode of legend setting
    * @Default {default}
    */
  var mode: js.UndefOr[Mode | String] = js.native
  /** set the position of legend settings
    * @Default {topleft}
    */
  var position: js.UndefOr[Position | String] = js.native
  /** x position value for legend setting
    * @Default {0}
    */
  var positionX: js.UndefOr[Double] = js.native
  /** y position value for legend setting
    * @Default {0}
    */
  var positionY: js.UndefOr[Double] = js.native
  /** to get rightLabel value for legend setting
    * @Default {null}
    */
  var rightLabel: js.UndefOr[String] = js.native
  /** Enables or Disables the showLabels
    * @Default {false}
    */
  var showLabels: js.UndefOr[Boolean] = js.native
  /** Enables or Disables the showLegend
    * @Default {false}
    */
  var showLegend: js.UndefOr[Boolean] = js.native
  /** To get the field name in the datasource for generating legend items.
    * @Default {null}
    */
  var textPath: js.UndefOr[String] = js.native
  /** to get title of legend setting
    * @Default {null}
    */
  var title: js.UndefOr[String] = js.native
  /** Toggle the visibility of the legend.
    * @Default {false}
    */
  var toggleVisibility: js.UndefOr[Boolean] = js.native
  /** to get type of legend setting
    * @Default {layers}
    */
  var `type`: js.UndefOr[LegendType | String] = js.native
  /** width value for legend setting
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.native
}

object LayersLegendSettings {
  @scala.inline
  def apply(): LayersLegendSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersLegendSettings]
  }
  @scala.inline
  implicit class LayersLegendSettingsOps[Self <: LayersLegendSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDockOnMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockOnMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockOnMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockOnMap")(js.undefined)
        ret
    }
    @scala.inline
    def withDockPosition(value: DockPosition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: LegendIcons | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withIconWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOrientation(value: LabelOrientation | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: Mode | String): Self = {
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
    def withPositionX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionX")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionY")(js.undefined)
        ret
    }
    @scala.inline
    def withRightLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withTextPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleVisibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: LegendType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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

