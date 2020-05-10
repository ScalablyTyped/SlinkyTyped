package typingsSlinky.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersSubLayersShapeSettingsColorMappingsRangeColorMapping extends js.Object {
  /** Specifies the start range colorMappings in the shape layer of map.
    * @Default {null}
    */
  var from: js.UndefOr[Double] = js.native
  /** Specifies the gradientColors in the shape layer of map.
    * @Default {null}
    */
  var gradientColors: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the to range colorMappings in the shape layer of map.
    * @Default {null}
    */
  var to: js.UndefOr[Double] = js.native
}

object LayersSubLayersShapeSettingsColorMappingsRangeColorMapping {
  @scala.inline
  def apply(): LayersSubLayersShapeSettingsColorMappingsRangeColorMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersSubLayersShapeSettingsColorMappingsRangeColorMapping]
  }
  @scala.inline
  implicit class LayersSubLayersShapeSettingsColorMappingsRangeColorMappingOps[Self <: LayersSubLayersShapeSettingsColorMappingsRangeColorMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

