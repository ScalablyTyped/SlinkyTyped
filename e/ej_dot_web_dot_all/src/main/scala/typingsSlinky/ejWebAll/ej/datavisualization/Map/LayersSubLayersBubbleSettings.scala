package typingsSlinky.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersSubLayersBubbleSettings extends js.Object {
  /** Specifies the bubble Opacity value of bubbles for shape layer in map
    * @Default {0.9}
    */
  var bubbleOpacity: js.UndefOr[Double] = js.native
  /** Specifies the mouse hover color of the shape layer in map
    * @Default {gray}
    */
  var color: js.UndefOr[String] = js.native
  /** Specifies the colorMappings of the shape layer in map
    * @Default {null}
    */
  var colorMappings: js.UndefOr[LayersSubLayersBubbleSettingsColorMappings] = js.native
  /** Specifies the field name in the datasource that contains color values for each bubbles.
    * @Default {null}
    */
  var colorPath: js.UndefOr[String] = js.native
  /** Specifies the bubble color valuePath of the shape layer in map
    * @Default {null}
    */
  var colorValuePath: js.UndefOr[String] = js.native
  /** Specifies the maximum size value of bubbles for shape layer in map
    * @Default {20}
    */
  var maxValue: js.UndefOr[Double] = js.native
  /** Specifies the minimum size value of bubbles for shape layer in map
    * @Default {10}
    */
  var minValue: js.UndefOr[Double] = js.native
  /** Specifies the showBubble visibility status map
    * @Default {true}
    */
  var showBubble: js.UndefOr[Boolean] = js.native
  /** Specifies the tooltip visibility status of the shape layer in map
    * @Default {false}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** Specifies the bubble tooltip template of the shape layer in map
    * @Default {null}
    */
  var tooltipTemplate: js.UndefOr[String] = js.native
  /** Specifies the bubble valuePath of the shape layer in map
    * @Default {null}
    */
  var valuePath: js.UndefOr[String] = js.native
}

object LayersSubLayersBubbleSettings {
  @scala.inline
  def apply(): LayersSubLayersBubbleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersSubLayersBubbleSettings]
  }
  @scala.inline
  implicit class LayersSubLayersBubbleSettingsOps[Self <: LayersSubLayersBubbleSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubbleOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleOpacity")(js.undefined)
        ret
    }
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
    def withColorMappings(value: LayersSubLayersBubbleSettingsColorMappings): Self = {
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
    def withColorPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorPath")(js.undefined)
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
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBubble(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBubble")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBubble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBubble")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(js.undefined)
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

