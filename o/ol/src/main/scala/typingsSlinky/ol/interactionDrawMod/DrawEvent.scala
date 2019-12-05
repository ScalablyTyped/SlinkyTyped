package typingsSlinky.ol.interactionDrawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Draw", "DrawEvent")
@js.native
class DrawEvent protected ()
  extends typingsSlinky.ol.eventsEventMod.default {
  def this(`type`: DrawEventType, feature: typingsSlinky.ol.featureMod.default) = this()
  var feature: typingsSlinky.ol.featureMod.default = js.native
}

