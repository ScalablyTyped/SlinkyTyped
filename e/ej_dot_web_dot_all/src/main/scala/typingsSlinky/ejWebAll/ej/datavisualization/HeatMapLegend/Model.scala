package typingsSlinky.ejWebAll.ej.datavisualization.HeatMapLegend

import typingsSlinky.ejWebAll.ej.datavisualization.HeatMap.LegendMode
import typingsSlinky.ejWebAll.ej.datavisualization.HeatMap.LegendOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Specifies the color values of the column data.
    * @Default {[]}
    */
  var colorMappingCollection: js.UndefOr[js.Array[ColorMappingCollection]] = js.native
  /** Specifies the height of the heatmap legend.
    * @Default {null}
    */
  var height: js.UndefOr[js.Any] = js.native
  /** Specifies can enable responsive mode or not for heatmap legend.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Specifies the legend mode as gradient or list.
    * @Default {ej.HeatMap.LegendMode.Gradient}
    */
  var legendMode: js.UndefOr[LegendMode | String] = js.native
  /** Specifies the orientation of the heatmap legend
    * @Default {ej.HeatMap.LegendOrientation.Horizontal}
    */
  var orientation: js.UndefOr[LegendOrientation | String] = js.native
  /** Specifies whether the cell label can be shown or not.
    * @Default {false}
    */
  var showLabel: js.UndefOr[Boolean] = js.native
  /** Specifies the width of the heatmap legend.
    * @Default {null}
    */
  var width: js.UndefOr[js.Any] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorMappingCollection(value: js.Array[ColorMappingCollection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMappingCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMappingCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMappingCollection")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: js.Any): Self = {
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
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendMode(value: LegendMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: LegendOrientation | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: js.Any): Self = {
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

