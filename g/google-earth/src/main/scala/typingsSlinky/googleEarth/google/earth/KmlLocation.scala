package typingsSlinky.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlLocation extends KmlObject {
  
  /**
    * Specifies the distance above the earth's surface.
    */
  def getAltitude(): Double = js.native
  
  /**
    * Latitude of the camera location.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def getLatitude(): Double = js.native
  
  /**
    * Longitude of the Model's location.
    * Angular distance in degrees, relative to the Prime Meridian.
    * Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def getLongitude(): Double = js.native
  
  /**
    * Specifies the distance above the earth's surface.
    */
  def setAltitude(altitude: Double): Unit = js.native
  
  /**
    * Sets the latitude, longitude, and altitude of the Model.
    */
  def setLatLngAlt(lat: Double, lng: Double, alt: Double): Unit = js.native
  
  /**
    * Latitude of the camera location.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def setLatitude(latitude: Double): Unit = js.native
  
  /**
    * Longitude of the Model's location.
    * Angular distance in degrees, relative to the Prime Meridian.
    * Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def setLongitude(longitude: Double): Unit = js.native
}
object KmlLocation {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getAltitude: () => Double,
    getId: () => String,
    getLatitude: () => Double,
    getLongitude: () => Double,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setAltitude: Double => Unit,
    setLatLngAlt: (Double, Double, Double) => Unit,
    setLatitude: Double => Unit,
    setLongitude: Double => Unit
  ): KmlLocation = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getAltitude = js.Any.fromFunction0(getAltitude), getId = js.Any.fromFunction0(getId), getLatitude = js.Any.fromFunction0(getLatitude), getLongitude = js.Any.fromFunction0(getLongitude), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAltitude = js.Any.fromFunction1(setAltitude), setLatLngAlt = js.Any.fromFunction3(setLatLngAlt), setLatitude = js.Any.fromFunction1(setLatitude), setLongitude = js.Any.fromFunction1(setLongitude))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlLocation]
  }
  
  @scala.inline
  implicit class KmlLocationMutableBuilder[Self <: KmlLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAltitude(value: () => Double): Self = StObject.set(x, "getAltitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLatitude(value: () => Double): Self = StObject.set(x, "getLatitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLongitude(value: () => Double): Self = StObject.set(x, "getLongitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAltitude(value: Double => Unit): Self = StObject.set(x, "setAltitude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLatLngAlt(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setLatLngAlt", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetLatitude(value: Double => Unit): Self = StObject.set(x, "setLatitude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLongitude(value: Double => Unit): Self = StObject.set(x, "setLongitude", js.Any.fromFunction1(value))
  }
}
