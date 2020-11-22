package typingsSlinky.expoLocation

import typingsSlinky.expoLocation.anon.Latitude
import typingsSlinky.expoLocation.locationTypesMod.LocationGeocodedAddress
import typingsSlinky.expoLocation.locationTypesMod.LocationGeocodedLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-location/build/LocationGoogleGeocoding", JSImport.Namespace)
@js.native
object locationGoogleGeocodingMod extends js.Object {
  
  def googleGeocodeAsync(address: String): js.Promise[js.Array[LocationGeocodedLocation]] = js.native
  
  def googleReverseGeocodeAsync(options: Latitude): js.Promise[js.Array[LocationGeocodedAddress]] = js.native
  
  def setGoogleApiKey(apiKey: String): Unit = js.native
}
