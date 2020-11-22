package typingsSlinky.ol.translateMod

import org.scalajs.dom.raw.UIEvent
import typingsSlinky.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/interaction/Translate", "TranslateEvent")
@js.native
class TranslateEvent protected ()
  extends typingsSlinky.ol.eventMod.default {
  def this(
    `type`: TranslateEventType,
    features: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
    coordinate: Coordinate,
    startCoordinate: Coordinate,
    mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent]
  ) = this()
  
  /**
    * The coordinate of the drag event.
    */
  var coordinate: Coordinate = js.native
  
  /**
    * The features being translated.
    */
  var features: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
  
  /**
    * Associated {@link module:ol/MapBrowserEvent}.
    */
  var mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent] = js.native
  
  /**
    * The coordinate of the start position before translation started.
    */
  var startCoordinate: Coordinate = js.native
}
