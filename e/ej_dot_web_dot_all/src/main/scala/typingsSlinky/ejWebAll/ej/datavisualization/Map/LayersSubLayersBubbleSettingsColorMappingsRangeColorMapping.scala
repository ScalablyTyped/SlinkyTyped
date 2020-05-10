package typingsSlinky.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping extends js.Object {
  /** Color of the bubble layer.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  /** Start range colorMappings in the bubble layer.
    * @Default {null}
    */
  var from: js.UndefOr[Double] = js.native
  /** GradientColors in the bubble layer of map.
    */
  var gradientColors: js.UndefOr[js.Array[_]] = js.native
  /** End range colorMappings in the bubble layer.
    * @Default {null}
    */
  var to: js.UndefOr[Double] = js.native
}

object LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping {
  @scala.inline
  def apply(): LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping]
  }
  @scala.inline
  implicit class LayersSubLayersBubbleSettingsColorMappingsRangeColorMappingOps[Self <: LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping] (val x: Self) extends AnyVal {
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
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientColors(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradientColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradientColors")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

