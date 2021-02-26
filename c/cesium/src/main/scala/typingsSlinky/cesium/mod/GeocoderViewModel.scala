package typingsSlinky.cesium.mod

import typingsSlinky.cesium.anon.FlightDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GeocoderViewModel")
@js.native
class GeocoderViewModel protected () extends StObject {
  def this(options: FlightDuration) = this()
  
  var complete: Event[js.Array[_]] = js.native
  
  var flightDuration: Double = js.native
  
  var isSearchInProgress: Boolean = js.native
  
  var key: String = js.native
  
  var scene: Scene = js.native
  
  var search: Command = js.native
  
  var searchText: String = js.native
  
  var url: String = js.native
}
