package typingsSlinky.reactMapGl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
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
import typingsSlinky.reactMapGl.mod.LayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Layer {
  
  @scala.inline
  def apply(
    paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint,
    `type`: String
  ): Builder = {
    val __props = js.Dynamic.literal(paint = paint.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LayerProps]))
  }
  
  @JSImport("react-map-gl", "Layer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.Layer] {
    
    @scala.inline
    def beforeId(value: String): this.type = set("beforeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filter(value: js.Array[_]): this.type = set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterVarargs(value: js.Any*): this.type = set("filter", js.Array(value :_*))
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layout(value: AnyLayout): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxzoom(value: Double): this.type = set("maxzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minzoom(value: Double): this.type = set("minzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def source(value: String): this.type = set("source", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
