package typingsSlinky.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersSubLayersShapeSettings extends js.Object {
  /** Enables or Disables the auto fill colors for shape layer in map. When this property value set to true, shapes will be filled with palette colors.
    * @Default {false}
    */
  var autoFill: js.UndefOr[Boolean] = js.native
  /** Specifies the colorMappings of the shape layer in map
    * @Default {null}
    */
  var colorMappings: js.UndefOr[LayersSubLayersShapeSettingsColorMappings] = js.native
  /** Specifies the shape color palette value of the shape layer in map. Accepted colorPalette values are palette1, palette2, palette3 and custompalette.
    * @Default {palette1}
    */
  var colorPalette: js.UndefOr[ColorPalette | String] = js.native
  /** Specifies the shape color valuePath of the shape layer in map
    * @Default {null}
    */
  var colorValuePath: js.UndefOr[String] = js.native
  /** Enables or Disables the gradient colors for map shapes.
    * @Default {false}
    */
  var enableGradient: js.UndefOr[Boolean] = js.native
  /** Specifies the shape fill color of the shape layer in map
    * @Default {#E5E5E5}
    */
  var fill: js.UndefOr[String] = js.native
  /** Specifies the mouse over width of the shape layer in map
    * @Default {1}
    */
  var highlightBorderWidth: js.UndefOr[Double] = js.native
  /** Specifies the mouse hover color of the shape layer in map
    * @Default {gray}
    */
  var highlightColor: js.UndefOr[String] = js.native
  /** Specifies the mouse over stroke color of the shape layer in map
    * @Default {#C1C1C1}
    */
  var highlightStroke: js.UndefOr[String] = js.native
  /** Specifies the shape selection color of the shape layer in map
    * @Default {gray}
    */
  var selectionColor: js.UndefOr[String] = js.native
  /** Specifies the shape selection stroke color of the shape layer in map
    * @Default {#C1C1C1}
    */
  var selectionStroke: js.UndefOr[String] = js.native
  /** Specifies the shape selection stroke width of the shape layer in map
    * @Default {1}
    */
  var selectionStrokeWidth: js.UndefOr[Double] = js.native
  /** Specifies the shape stroke color of the shape layer in map
    * @Default {#C1C1C1}
    */
  var stroke: js.UndefOr[String] = js.native
  /** Specifies the shape stroke thickness value of the shape layer in map
    * @Default {0.2}
    */
  var strokeThickness: js.UndefOr[Double] = js.native
  /** Specifies the shape valuePath of the shape layer in map
    * @Default {null}
    */
  var valuePath: js.UndefOr[String] = js.native
}

object LayersSubLayersShapeSettings {
  @scala.inline
  def apply(): LayersSubLayersShapeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersSubLayersShapeSettings]
  }
  @scala.inline
  implicit class LayersSubLayersShapeSettingsOps[Self <: LayersSubLayersShapeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFill")(js.undefined)
        ret
    }
    @scala.inline
    def withColorMappings(value: LayersSubLayersShapeSettingsColorMappings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withColorPalette(value: ColorPalette | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPalette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPalette")(js.undefined)
        ret
    }
    @scala.inline
    def withColorValuePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValuePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorValuePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorValuePath")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableGradient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableGradient")(js.undefined)
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
    def withHighlightBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightBorderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightBorderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStrokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionStrokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withValuePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePath")(js.undefined)
        ret
    }
  }
  
}

