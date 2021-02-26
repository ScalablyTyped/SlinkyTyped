package typingsSlinky.googleAppsScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows for direction finding, geocoding, elevation sampling and the creation of static map
  * images.
  */
@js.native
trait Maps extends StObject {
  
  var DirectionFinder: DirectionFinderEnums = js.native
  
  var StaticMap: StaticMapEnums = js.native
  
  def decodePolyline(polyline: String): js.Array[Double] = js.native
  
  def encodePolyline(points: js.Array[Double]): String = js.native
  
  def newDirectionFinder(): DirectionFinder = js.native
  
  def newElevationSampler(): ElevationSampler = js.native
  
  def newGeocoder(): Geocoder = js.native
  
  def newStaticMap(): StaticMap = js.native
  
  def setAuthentication(clientId: String, signingKey: String): Unit = js.native
}
object Maps {
  
  @scala.inline
  def apply(
    DirectionFinder: DirectionFinderEnums,
    StaticMap: StaticMapEnums,
    decodePolyline: String => js.Array[Double],
    encodePolyline: js.Array[Double] => String,
    newDirectionFinder: () => DirectionFinder,
    newElevationSampler: () => ElevationSampler,
    newGeocoder: () => Geocoder,
    newStaticMap: () => StaticMap,
    setAuthentication: (String, String) => Unit
  ): typingsSlinky.googleAppsScript.GoogleAppsScript.Maps.Maps = {
    val __obj = js.Dynamic.literal(DirectionFinder = DirectionFinder.asInstanceOf[js.Any], StaticMap = StaticMap.asInstanceOf[js.Any], decodePolyline = js.Any.fromFunction1(decodePolyline), encodePolyline = js.Any.fromFunction1(encodePolyline), newDirectionFinder = js.Any.fromFunction0(newDirectionFinder), newElevationSampler = js.Any.fromFunction0(newElevationSampler), newGeocoder = js.Any.fromFunction0(newGeocoder), newStaticMap = js.Any.fromFunction0(newStaticMap), setAuthentication = js.Any.fromFunction2(setAuthentication))
    __obj.asInstanceOf[typingsSlinky.googleAppsScript.GoogleAppsScript.Maps.Maps]
  }
  
  @scala.inline
  implicit class MapsMutableBuilder[Self <: typingsSlinky.googleAppsScript.GoogleAppsScript.Maps.Maps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecodePolyline(value: String => js.Array[Double]): Self = StObject.set(x, "decodePolyline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDirectionFinder(value: DirectionFinderEnums): Self = StObject.set(x, "DirectionFinder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodePolyline(value: js.Array[Double] => String): Self = StObject.set(x, "encodePolyline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewDirectionFinder(value: () => DirectionFinder): Self = StObject.set(x, "newDirectionFinder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewElevationSampler(value: () => ElevationSampler): Self = StObject.set(x, "newElevationSampler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGeocoder(value: () => Geocoder): Self = StObject.set(x, "newGeocoder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewStaticMap(value: () => StaticMap): Self = StObject.set(x, "newStaticMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAuthentication(value: (String, String) => Unit): Self = StObject.set(x, "setAuthentication", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStaticMap(value: StaticMapEnums): Self = StObject.set(x, "StaticMap", value.asInstanceOf[js.Any])
  }
}
