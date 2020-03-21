package typingsSlinky.ol.translateMod

import typingsSlinky.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Translate", "TranslateEvent")
@js.native
class TranslateEvent ()
  extends typingsSlinky.ol.eventMod.default {
  var coordinate: Coordinate = js.native
  var features: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
  var mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default = js.native
  var startCoordinate: Coordinate = js.native
}

