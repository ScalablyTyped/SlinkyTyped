package typingsSlinky.geolib

import typingsSlinky.geolib.anon.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.geolib.geolibNumbers.`2`
    - typingsSlinky.geolib.geolibStrings.alt
    - typingsSlinky.geolib.geolibStrings.altitude
    - typingsSlinky.geolib.geolibStrings.elevation
    - typingsSlinky.geolib.geolibStrings.elev
  */
  trait AltitudeKeys extends StObject
  object AltitudeKeys {
    
    @scala.inline
    def `2`: typingsSlinky.geolib.geolibNumbers.`2` = 2.asInstanceOf[typingsSlinky.geolib.geolibNumbers.`2`]
    
    @scala.inline
    def alt: typingsSlinky.geolib.geolibStrings.alt = "alt".asInstanceOf[typingsSlinky.geolib.geolibStrings.alt]
    
    @scala.inline
    def altitude: typingsSlinky.geolib.geolibStrings.altitude = "altitude".asInstanceOf[typingsSlinky.geolib.geolibStrings.altitude]
    
    @scala.inline
    def elev: typingsSlinky.geolib.geolibStrings.elev = "elev".asInstanceOf[typingsSlinky.geolib.geolibStrings.elev]
    
    @scala.inline
    def elevation: typingsSlinky.geolib.geolibStrings.elevation = "elevation".asInstanceOf[typingsSlinky.geolib.geolibStrings.elevation]
  }
  
  type GeolibAltitudeInputValue = Double
  
  type GeolibDistanceFn = js.Function2[/* point */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, Double]
  
  type GeolibGeoJSONPoint = js.Tuple3[
    GeolibLongitudeInputValue, 
    GeolibLatitudeInputValue, 
    js.UndefOr[GeolibAltitudeInputValue]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.geolib.anon.Alt
    - typingsSlinky.geolib.anon.`0`
    - typingsSlinky.geolib.anon.Elevation
    - typingsSlinky.geolib.anon.Elev
  */
  trait GeolibInputAltitude extends StObject
  object GeolibInputAltitude {
    
    @scala.inline
    def `0`(): typingsSlinky.geolib.anon.`0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.geolib.anon.`0`]
    }
    
    @scala.inline
    def Alt(): typingsSlinky.geolib.anon.Alt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.geolib.anon.Alt]
    }
    
    @scala.inline
    def Elev(): typingsSlinky.geolib.anon.Elev = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.geolib.anon.Elev]
    }
    
    @scala.inline
    def Elevation(): typingsSlinky.geolib.anon.Elevation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.geolib.anon.Elevation]
    }
  }
  
  type GeolibInputCoordinates = UserInputCoordinates | GeolibGeoJSONPoint
  
  type GeolibInputCoordinatesWithTime = GeolibInputCoordinates with Time
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.geolib.anon.Lat
    - typingsSlinky.geolib.anon.LatitudeGeolibLatitudeInputValue
  */
  trait GeolibInputLatitude extends StObject
  object GeolibInputLatitude {
    
    @scala.inline
    def Lat(lat: GeolibLatitudeInputValue): typingsSlinky.geolib.anon.Lat = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.geolib.anon.Lat]
    }
    
    @scala.inline
    def LatitudeGeolibLatitudeInputValue(latitude: GeolibLatitudeInputValue): typingsSlinky.geolib.anon.LatitudeGeolibLatitudeInputValue = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.geolib.anon.LatitudeGeolibLatitudeInputValue]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.geolib.anon.Lng
    - typingsSlinky.geolib.anon.Lon
    - typingsSlinky.geolib.anon.LongitudeGeolibLongitudeInputValue
  */
  trait GeolibInputLongitude extends StObject
  object GeolibInputLongitude {
    
    @scala.inline
    def Lng(lng: GeolibLongitudeInputValue): typingsSlinky.geolib.anon.Lng = {
      val __obj = js.Dynamic.literal(lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.geolib.anon.Lng]
    }
    
    @scala.inline
    def Lon(lon: GeolibLongitudeInputValue): typingsSlinky.geolib.anon.Lon = {
      val __obj = js.Dynamic.literal(lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.geolib.anon.Lon]
    }
    
    @scala.inline
    def LongitudeGeolibLongitudeInputValue(longitude: GeolibLongitudeInputValue): typingsSlinky.geolib.anon.LongitudeGeolibLongitudeInputValue = {
      val __obj = js.Dynamic.literal(longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.geolib.anon.LongitudeGeolibLongitudeInputValue]
    }
  }
  
  type GeolibLatitudeInputValue = Double | String
  
  type GeolibLongitudeInputValue = Double | String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.geolib.geolibNumbers.`1`
    - typingsSlinky.geolib.geolibStrings.lat
    - typingsSlinky.geolib.geolibStrings.latitude
  */
  trait LatitudeKeys extends StObject
  object LatitudeKeys {
    
    @scala.inline
    def `1`: typingsSlinky.geolib.geolibNumbers.`1` = 1.asInstanceOf[typingsSlinky.geolib.geolibNumbers.`1`]
    
    @scala.inline
    def lat: typingsSlinky.geolib.geolibStrings.lat = "lat".asInstanceOf[typingsSlinky.geolib.geolibStrings.lat]
    
    @scala.inline
    def latitude: typingsSlinky.geolib.geolibStrings.latitude = "latitude".asInstanceOf[typingsSlinky.geolib.geolibStrings.latitude]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.geolib.geolibNumbers.`0`
    - typingsSlinky.geolib.geolibStrings.lng
    - typingsSlinky.geolib.geolibStrings.lon
    - typingsSlinky.geolib.geolibStrings.longitude
  */
  trait LongitudeKeys extends StObject
  object LongitudeKeys {
    
    @scala.inline
    def `0`: typingsSlinky.geolib.geolibNumbers.`0` = 0.asInstanceOf[typingsSlinky.geolib.geolibNumbers.`0`]
    
    @scala.inline
    def lng: typingsSlinky.geolib.geolibStrings.lng = "lng".asInstanceOf[typingsSlinky.geolib.geolibStrings.lng]
    
    @scala.inline
    def lon: typingsSlinky.geolib.geolibStrings.lon = "lon".asInstanceOf[typingsSlinky.geolib.geolibStrings.lon]
    
    @scala.inline
    def longitude: typingsSlinky.geolib.geolibStrings.longitude = "longitude".asInstanceOf[typingsSlinky.geolib.geolibStrings.longitude]
  }
  
  type Timestamp = Double
  
  type UserInputCoordinates = GeolibInputLongitude with GeolibInputLatitude with GeolibInputAltitude
}
