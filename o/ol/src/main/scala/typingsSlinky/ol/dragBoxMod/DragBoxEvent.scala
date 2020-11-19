package typingsSlinky.ol.dragBoxMod

import typingsSlinky.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/interaction/DragBox", "DragBoxEvent")
@js.native
class DragBoxEvent protected ()
  extends typingsSlinky.ol.eventMod.default {
  def this(
    `type`: String,
    coordinate: Coordinate,
    mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default
  ) = this()
  
  var coordinate: Coordinate = js.native
  
  var mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default = js.native
}
