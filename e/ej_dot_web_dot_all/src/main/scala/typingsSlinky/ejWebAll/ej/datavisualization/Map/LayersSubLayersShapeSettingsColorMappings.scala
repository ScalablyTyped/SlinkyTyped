package typingsSlinky.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersSubLayersShapeSettingsColorMappings extends js.Object {
  /** Specifies the equalColorMapping in the shape layer of map.
    * @Default {null}
    */
  var equalColorMapping: js.UndefOr[js.Array[LayersSubLayersShapeSettingsColorMappingsEqualColorMapping]] = js.native
  /** Specifies the range colorMappings in the shape layer of map.
    * @Default {null}
    */
  var rangeColorMapping: js.UndefOr[js.Array[LayersSubLayersShapeSettingsColorMappingsRangeColorMapping]] = js.native
}

object LayersSubLayersShapeSettingsColorMappings {
  @scala.inline
  def apply(): LayersSubLayersShapeSettingsColorMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersSubLayersShapeSettingsColorMappings]
  }
  @scala.inline
  implicit class LayersSubLayersShapeSettingsColorMappingsOps[Self <: LayersSubLayersShapeSettingsColorMappings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEqualColorMapping(value: js.Array[LayersSubLayersShapeSettingsColorMappingsEqualColorMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalColorMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEqualColorMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalColorMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeColorMapping(value: js.Array[LayersSubLayersShapeSettingsColorMappingsRangeColorMapping]): Self = {
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

