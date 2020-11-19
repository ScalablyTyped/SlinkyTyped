package typingsSlinky.expoLocation.expoLocationWebMod

import typingsSlinky.expoLocation.anon.LocationServicesEnabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-location/build/ExpoLocation.web", JSImport.Default)
@js.native
object default extends js.Object {
  
  def geocodeAsync(): js.Promise[js.Array[_]] = js.native
  
  def getCurrentPositionAsync(options: js.Object): js.Promise[Position | Null] = js.native
  
  def getProviderStatusAsync(): js.Promise[LocationServicesEnabled] = js.native
  
  def hasServicesEnabledAsync(): js.Promise[Boolean] = js.native
  
  val name: String = js.native
  
  def removeWatchAsync(watchId: js.Any): js.Promise[Unit] = js.native
  
  def requestPermissionsAsync(): js.Promise[PermissionResult] = js.native
  
  def reverseGeocodeAsync(): js.Promise[js.Array[_]] = js.native
  
  def watchDeviceHeading(headingId: js.Any): js.Promise[Unit] = js.native
  
  def watchPositionImplAsync(watchId: String, options: js.Object): js.Promise[String] = js.native
}
