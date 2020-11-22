package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.mapboxGlStrings.`fill-extrusion`
import typingsSlinky.mapboxGl.mapboxGlStrings.background
import typingsSlinky.mapboxGl.mapboxGlStrings.circle
import typingsSlinky.mapboxGl.mapboxGlStrings.fill
import typingsSlinky.mapboxGl.mapboxGlStrings.heatmap
import typingsSlinky.mapboxGl.mapboxGlStrings.hillshade
import typingsSlinky.mapboxGl.mapboxGlStrings.line
import typingsSlinky.mapboxGl.mapboxGlStrings.raster
import typingsSlinky.mapboxGl.mapboxGlStrings.symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mapboxGl.mod.BackgroundLayer
  - typingsSlinky.mapboxGl.mod.CircleLayer
  - typingsSlinky.mapboxGl.mod.FillExtrusionLayer
  - typingsSlinky.mapboxGl.mod.FillLayer
  - typingsSlinky.mapboxGl.mod.HeatmapLayer
  - typingsSlinky.mapboxGl.mod.HillshadeLayer
  - typingsSlinky.mapboxGl.mod.LineLayer
  - typingsSlinky.mapboxGl.mod.RasterLayer
  - typingsSlinky.mapboxGl.mod.SymbolLayer
*/
trait Layer extends js.Object
object Layer {
  
  @scala.inline
  def SymbolLayer(id: String, `type`: symbol): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  def LineLayer(id: String, `type`: line): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  def HeatmapLayer(id: String, `type`: heatmap): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  def CircleLayer(id: String, `type`: circle): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  def RasterLayer(id: String, `type`: raster): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  def HillshadeLayer(id: String, `type`: hillshade): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  def BackgroundLayer(id: String, `type`: background): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  def FillLayer(id: String, `type`: fill): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  def FillExtrusionLayer(id: String, `type`: `fill-extrusion`): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
}
