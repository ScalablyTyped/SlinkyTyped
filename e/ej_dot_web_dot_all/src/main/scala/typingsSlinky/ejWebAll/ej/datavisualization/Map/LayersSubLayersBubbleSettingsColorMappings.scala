package typingsSlinky.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersSubLayersBubbleSettingsColorMappings extends js.Object {
  /** Specifies the range colorMappings in the bubble layer.
    * @Default {null}
    */
  var rangeColorMapping: js.UndefOr[js.Array[LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping]] = js.native
}

object LayersSubLayersBubbleSettingsColorMappings {
  @scala.inline
  def apply(): LayersSubLayersBubbleSettingsColorMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersSubLayersBubbleSettingsColorMappings]
  }
  @scala.inline
  implicit class LayersSubLayersBubbleSettingsColorMappingsOps[Self <: LayersSubLayersBubbleSettingsColorMappings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRangeColorMapping(value: js.Array[LayersSubLayersBubbleSettingsColorMappingsRangeColorMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeColorMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeColorMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeColorMapping")(js.undefined)
        ret
    }
  }
  
}

