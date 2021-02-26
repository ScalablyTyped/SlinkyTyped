package typingsSlinky.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocoderControl_ extends StObject {
  
  def getURL(): String = js.native
  
  /**
    * Bind a listener to an event emitted by the geocoder control. Supported additional events are
    */
  def on(event: String, callback: js.Function): js.Any = js.native
  
  def onAdd(map: Map_): js.Any = js.native
  
  /**
    * Set the map id used for geocoding.
    */
  def setID(id: String): js.Any = js.native
  
  /**
    * Set the TileJSON used for geocoding.
    */
  def setTileJSON(tilejson: js.Any): js.Any = js.native
  
  /**
    * Set the url used for geocoding.
    */
  def setURL(url: String): js.Any = js.native
}
object GeocoderControl_ {
  
  @scala.inline
  def apply(
    getURL: () => String,
    on: (String, js.Function) => js.Any,
    onAdd: Map_ => js.Any,
    setID: String => js.Any,
    setTileJSON: js.Any => js.Any,
    setURL: String => js.Any
  ): GeocoderControl_ = {
    val __obj = js.Dynamic.literal(getURL = js.Any.fromFunction0(getURL), on = js.Any.fromFunction2(on), onAdd = js.Any.fromFunction1(onAdd), setID = js.Any.fromFunction1(setID), setTileJSON = js.Any.fromFunction1(setTileJSON), setURL = js.Any.fromFunction1(setURL))
    __obj.asInstanceOf[GeocoderControl_]
  }
  
  @scala.inline
  implicit class GeocoderControl_MutableBuilder[Self <: GeocoderControl_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetURL(value: () => String): Self = StObject.set(x, "getURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn(value: (String, js.Function) => js.Any): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnAdd(value: Map_ => js.Any): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetID(value: String => js.Any): Self = StObject.set(x, "setID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTileJSON(value: js.Any => js.Any): Self = StObject.set(x, "setTileJSON", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetURL(value: String => js.Any): Self = StObject.set(x, "setURL", js.Any.fromFunction1(value))
  }
}
