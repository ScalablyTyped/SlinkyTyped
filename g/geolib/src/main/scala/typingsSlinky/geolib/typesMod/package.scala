package typingsSlinky.geolib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type GeolibAltitudeInputValue = scala.Double
  
  type GeolibDistanceFn = js.Function2[
    /* point */ typingsSlinky.geolib.typesMod.GeolibInputCoordinates, 
    /* dest */ typingsSlinky.geolib.typesMod.GeolibInputCoordinates, 
    scala.Double
  ]
  
  type GeolibGeoJSONPoint = js.Tuple3[
    typingsSlinky.geolib.typesMod.GeolibLongitudeInputValue, 
    typingsSlinky.geolib.typesMod.GeolibLatitudeInputValue, 
    js.UndefOr[typingsSlinky.geolib.typesMod.GeolibAltitudeInputValue]
  ]
  
  type GeolibInputCoordinates = typingsSlinky.geolib.typesMod.UserInputCoordinates | typingsSlinky.geolib.typesMod.GeolibGeoJSONPoint
  
  type GeolibInputCoordinatesWithTime = typingsSlinky.geolib.typesMod.GeolibInputCoordinates with typingsSlinky.geolib.anon.Time
  
  type GeolibLatitudeInputValue = scala.Double | java.lang.String
  
  type GeolibLongitudeInputValue = scala.Double | java.lang.String
  
  type Timestamp = scala.Double
  
  type UserInputCoordinates = typingsSlinky.geolib.typesMod.GeolibInputLongitude with typingsSlinky.geolib.typesMod.GeolibInputLatitude with typingsSlinky.geolib.typesMod.GeolibInputAltitude
}
