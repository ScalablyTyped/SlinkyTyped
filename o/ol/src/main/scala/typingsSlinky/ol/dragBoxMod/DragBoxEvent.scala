package typingsSlinky.ol.dragBoxMod

import org.scalajs.dom.raw.UIEvent
import typingsSlinky.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragBoxEvent
  extends typingsSlinky.ol.eventMod.default {
  
  /**
    * The coordinate of the drag event.
    */
  var coordinate: Coordinate = js.native
  
  var mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent] = js.native
}
