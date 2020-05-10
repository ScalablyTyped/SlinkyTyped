package typingsSlinky.reactMapGl.mod

import typingsSlinky.mapboxGl.mod.AnyLayout
import typingsSlinky.mapboxGl.mod.BackgroundPaint
import typingsSlinky.mapboxGl.mod.CirclePaint
import typingsSlinky.mapboxGl.mod.FillExtrusionPaint
import typingsSlinky.mapboxGl.mod.FillPaint
import typingsSlinky.mapboxGl.mod.HeatmapPaint
import typingsSlinky.mapboxGl.mod.HillshadePaint
import typingsSlinky.mapboxGl.mod.LinePaint
import typingsSlinky.mapboxGl.mod.RasterPaint
import typingsSlinky.mapboxGl.mod.SymbolPaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerProps extends js.Object {
  var beforeId: js.UndefOr[String] = js.native
  var filter: js.UndefOr[js.Array[_]] = js.native
  var id: js.UndefOr[String] = js.native
  var layout: js.UndefOr[AnyLayout] = js.native
  var maxzoom: js.UndefOr[Double] = js.native
  var minzoom: js.UndefOr[Double] = js.native
  var paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint = js.native
  var source: js.UndefOr[String] = js.native
  var `type`: String = js.native
}

object LayerProps {
  @scala.inline
  def apply(
    paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint,
    `type`: String
  ): LayerProps = {
    val __obj = js.Dynamic.literal(paint = paint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerProps]
  }
  @scala.inline
  implicit class LayerPropsOps[Self <: LayerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaint(
      value: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeId")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: AnyLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxzoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxzoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxzoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxzoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinzoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minzoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinzoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minzoom")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

