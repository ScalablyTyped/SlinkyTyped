package typingsSlinky.ol.interactionSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Select", "SelectEvent")
@js.native
class SelectEvent protected ()
  extends typingsSlinky.ol.eventsEventMod.default {
  def this(
    `type`: SelectEventType,
    selected: js.Array[typingsSlinky.ol.featureMod.default],
    deselected: js.Array[typingsSlinky.ol.featureMod.default],
    mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default
  ) = this()
  var deselected: js.Array[typingsSlinky.ol.featureMod.default] = js.native
  var mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default = js.native
  var selected: js.Array[typingsSlinky.ol.featureMod.default] = js.native
}

