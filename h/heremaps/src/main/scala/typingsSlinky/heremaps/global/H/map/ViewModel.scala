package typingsSlinky.heremaps.global.H.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a view of the map. It consists of a virtual camera and a look-at point both of which have a position in geo-space and orientation angles. The view model allows to
  * change the values of these objects in order to move or rotate the map or zoom in and out.
  */
@JSGlobal("H.map.ViewModel")
@js.native
class ViewModel ()
  extends typingsSlinky.heremaps.H.map.ViewModel
object ViewModel {
  
  /**
    * Update event is fired whenever view model data is changed. It contains property which hold currently requested data
    * @fixme find documentation and update constructor typings
    * @property target {*} - Object which triggered the event
    * @property currentTarget {*} - Object which has listener attached
    * @property type {string} - Name of the dispatched event
    * @property defaultPrevented {boolean} - Indicates if preventDefault was called on the current event
    */
  @JSGlobal("H.map.ViewModel.UpdateEvent")
  @js.native
  class UpdateEvent protected ()
    extends typingsSlinky.heremaps.H.map.ViewModel.UpdateEvent {
    /**
      * Constructor
      * @param requested {any}
      */
    def this(requested: js.Any) = this()
  }
}
