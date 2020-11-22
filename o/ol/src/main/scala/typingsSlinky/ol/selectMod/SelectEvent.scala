package typingsSlinky.ol.selectMod

import org.scalajs.dom.raw.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectEvent
  extends typingsSlinky.ol.eventMod.default {
  
  /**
    * Deselected features array.
    */
  var deselected: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
  
  /**
    * Associated {@link module:ol/MapBrowserEvent}.
    */
  var mapBrowserEvent: typingsSlinky.ol.mapBrowserEventMod.default[UIEvent] = js.native
  
  /**
    * Selected features array.
    */
  var selected: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
}
