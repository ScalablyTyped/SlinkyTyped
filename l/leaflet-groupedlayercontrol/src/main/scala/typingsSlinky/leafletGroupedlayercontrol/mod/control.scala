package typingsSlinky.leafletGroupedlayercontrol.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.leaflet.mod.Layer
import typingsSlinky.leaflet.mod.LayerGroup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "control")
@js.native
object control extends js.Object {
  
  def groupedLayers(
    baseLayers: StringDictionary[Layer],
    groupedOverlays: StringDictionary[StringDictionary[LayerGroup_[_]]],
    options: GroupedLayersOptions
  ): typingsSlinky.leaflet.mod.Control_ = js.native
}
