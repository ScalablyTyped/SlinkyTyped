package typingsSlinky.ol.modifyMod

import org.scalajs.dom.raw.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/interaction/Modify", "ModifyEvent")
@js.native
class ModifyEvent protected ()
  extends typingsSlinky.ol.eventMod.default {
  def this(
    `type`: ModifyEventType,
    features: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
    MapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent]
  ) = this()
  
  /**
    * The features being modified.
    */
  var features: typingsSlinky.ol.collectionMod.default[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
  
  /**
    * Associated {@link module:ol/MapBrowserEvent}.
    */
  var mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent] = js.native
}
