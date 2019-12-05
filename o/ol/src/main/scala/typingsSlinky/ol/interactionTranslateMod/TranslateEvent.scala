package typingsSlinky.ol.interactionTranslateMod

import typingsSlinky.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Translate", "TranslateEvent")
@js.native
class TranslateEvent ()
  extends typingsSlinky.ol.eventsEventMod.default {
  var coordinate: Coordinate = js.native
  var features: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.featureMod.default] = js.native
}

