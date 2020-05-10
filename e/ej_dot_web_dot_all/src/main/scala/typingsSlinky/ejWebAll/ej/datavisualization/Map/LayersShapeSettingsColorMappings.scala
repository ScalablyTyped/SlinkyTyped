package typingsSlinky.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersShapeSettingsColorMappings extends js.Object {
  /** Specifies the equalColorMapping in the shape layer of map.
    * @Default {null}
    */
  var equalColorMapping: js.UndefOr[js.Array[LayersShapeSettingsColorMappingsEqualColorMapping]] = js.native
  /** Specifies the range colorMappings in the shape layer of map.
    * @Default {null}
    */
  var rangeColorMapping: js.UndefOr[js.Array[LayersShapeSettingsColorMappingsRangeColorMapping]] = js.native
}

object LayersShapeSettingsColorMappings {
  @scala.inline
  def apply(): LayersShapeSettingsColorMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersShapeSettingsColorMappings]
  }
  @scala.inline
  implicit class LayersShapeSettingsColorMappingsOps[Self <: LayersShapeSettingsColorMappings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEqualColorMapping(value: js.Array[LayersShapeSettingsColorMappingsEqualColorMapping]): Self = {
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
    def withRangeColorMapping(value: js.Array[LayersShapeSettingsColorMappingsRangeColorMapping]): Self = {
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

