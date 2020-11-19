package typingsSlinky.ol.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/interaction/Select", "SelectEvent")
@js.native
class SelectEvent protected ()
  extends typingsSlinky.ol.eventMod.default {
  def this(
    `type`: SelectEventType,
    selected: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
    deselected: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
    mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default
  ) = this()
  
  var deselected: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
  
  var mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default = js.native
  
  var selected: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
}
