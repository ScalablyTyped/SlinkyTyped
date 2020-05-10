package typingsSlinky.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersSubLayersShapeSettingsColorMappingsEqualColorMapping extends js.Object {
  /** Specifies the equalColorMapping color in the shape layer of map.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  /** Specifies the equalColorMapping value in the shape layer of map.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.native
}

object LayersSubLayersShapeSettingsColorMappingsEqualColorMapping {
  @scala.inline
  def apply(): LayersSubLayersShapeSettingsColorMappingsEqualColorMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersSubLayersShapeSettingsColorMappingsEqualColorMapping]
  }
  @scala.inline
  implicit class LayersSubLayersShapeSettingsColorMappingsEqualColorMappingOps[Self <: LayersSubLayersShapeSettingsColorMappingsEqualColorMapping] (val x: Self) extends AnyVal {
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
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

