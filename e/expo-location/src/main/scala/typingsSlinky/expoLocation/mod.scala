package typingsSlinky.expoLocation

import typingsSlinky.expoLocation.anon.PickLocationGeocodedLocat
import typingsSlinky.expoLocation.anon.Remove
import typingsSlinky.expoLocation.locationTypesMod.LocationAccuracy
import typingsSlinky.expoLocation.locationTypesMod.LocationActivityType
import typingsSlinky.expoLocation.locationTypesMod.LocationCallback
import typingsSlinky.expoLocation.locationTypesMod.LocationGeocodedAddress
import typingsSlinky.expoLocation.locationTypesMod.LocationGeocodedLocation
import typingsSlinky.expoLocation.locationTypesMod.LocationGeocodingOptions
import typingsSlinky.expoLocation.locationTypesMod.LocationGeofencingEventType
import typingsSlinky.expoLocation.locationTypesMod.LocationGeofencingRegionState
import typingsSlinky.expoLocation.locationTypesMod.LocationHeadingCallback
import typingsSlinky.expoLocation.locationTypesMod.LocationHeadingObject
import typingsSlinky.expoLocation.locationTypesMod.LocationLastKnownOptions
import typingsSlinky.expoLocation.locationTypesMod.LocationObject
import typingsSlinky.expoLocation.locationTypesMod.LocationOptions
import typingsSlinky.expoLocation.locationTypesMod.LocationPermissionResponse
import typingsSlinky.expoLocation.locationTypesMod.LocationProviderStatus
import typingsSlinky.expoLocation.locationTypesMod.LocationRegion
import typingsSlinky.expoLocation.locationTypesMod.LocationSubscription
import typingsSlinky.expoLocation.locationTypesMod.LocationTaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-location", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val EventEmitter: typingsSlinky.unimodulesCore.mod.EventEmitter = js.native
  
  def enableNetworkProviderAsync(): js.Promise[Unit] = js.native
  
  def geocodeAsync(address: String): js.Promise[js.Array[LocationGeocodedLocation]] = js.native
  def geocodeAsync(address: String, options: LocationGeocodingOptions): js.Promise[js.Array[LocationGeocodedLocation]] = js.native
  
  def getCurrentPositionAsync(): js.Promise[LocationObject] = js.native
  def getCurrentPositionAsync(options: LocationOptions): js.Promise[LocationObject] = js.native
  
  @JSName("_getCurrentWatchId")
  def getCurrentWatchId(): Double = js.native
  
  def getHeadingAsync(): js.Promise[LocationHeadingObject] = js.native
  
  def getLastKnownPositionAsync(): js.Promise[LocationObject | Null] = js.native
  def getLastKnownPositionAsync(options: LocationLastKnownOptions): js.Promise[LocationObject | Null] = js.native
  
  def getPermissionsAsync(): js.Promise[LocationPermissionResponse] = js.native
  
  def getProviderStatusAsync(): js.Promise[LocationProviderStatus] = js.native
  
  def hasServicesEnabledAsync(): js.Promise[Boolean] = js.native
  
  def hasStartedGeofencingAsync(taskName: String): js.Promise[Boolean] = js.native
  
  def hasStartedLocationUpdatesAsync(taskName: String): js.Promise[Boolean] = js.native
  
  def installWebGeolocationPolyfill(): Unit = js.native
  
  def isBackgroundLocationAvailableAsync(): js.Promise[Boolean] = js.native
  
  def requestPermissionsAsync(): js.Promise[LocationPermissionResponse] = js.native
  
  def reverseGeocodeAsync(location: PickLocationGeocodedLocat): js.Promise[js.Array[LocationGeocodedAddress]] = js.native
  def reverseGeocodeAsync(location: PickLocationGeocodedLocat, options: LocationGeocodingOptions): js.Promise[js.Array[LocationGeocodedAddress]] = js.native
  
  def setApiKey(apiKey: String): Unit = js.native
  
  def setGoogleApiKey(apiKey: String): Unit = js.native
  
  def startGeofencingAsync(taskName: String): js.Promise[Unit] = js.native
  def startGeofencingAsync(taskName: String, regions: js.Array[LocationRegion]): js.Promise[Unit] = js.native
  
  def startLocationUpdatesAsync(taskName: String): js.Promise[Unit] = js.native
  def startLocationUpdatesAsync(taskName: String, options: LocationTaskOptions): js.Promise[Unit] = js.native
  
  def stopGeofencingAsync(taskName: String): js.Promise[Unit] = js.native
  
  def stopLocationUpdatesAsync(taskName: String): js.Promise[Unit] = js.native
  
  def watchHeadingAsync(callback: LocationHeadingCallback): js.Promise[LocationSubscription] = js.native
  
  def watchPositionAsync(options: LocationOptions, callback: LocationCallback): js.Promise[Remove] = js.native
  
  @js.native
  object Accuracy extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationAccuracy with Double] = js.native
    
    /* 3 */ val Balanced: typingsSlinky.expoLocation.locationTypesMod.LocationAccuracy.Balanced with Double = js.native
    
    /* 6 */ val BestForNavigation: typingsSlinky.expoLocation.locationTypesMod.LocationAccuracy.BestForNavigation with Double = js.native
    
    /* 4 */ val High: typingsSlinky.expoLocation.locationTypesMod.LocationAccuracy.High with Double = js.native
    
    /* 5 */ val Highest: typingsSlinky.expoLocation.locationTypesMod.LocationAccuracy.Highest with Double = js.native
    
    /* 2 */ val Low: typingsSlinky.expoLocation.locationTypesMod.LocationAccuracy.Low with Double = js.native
    
    /* 1 */ val Lowest: typingsSlinky.expoLocation.locationTypesMod.LocationAccuracy.Lowest with Double = js.native
  }
  
  @js.native
  object ActivityType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationActivityType with Double] = js.native
    
    /* 5 */ val Airborne: typingsSlinky.expoLocation.locationTypesMod.LocationActivityType.Airborne with Double = js.native
    
    /* 2 */ val AutomotiveNavigation: typingsSlinky.expoLocation.locationTypesMod.LocationActivityType.AutomotiveNavigation with Double = js.native
    
    /* 3 */ val Fitness: typingsSlinky.expoLocation.locationTypesMod.LocationActivityType.Fitness with Double = js.native
    
    /* 1 */ val Other: typingsSlinky.expoLocation.locationTypesMod.LocationActivityType.Other with Double = js.native
    
    /* 4 */ val OtherNavigation: typingsSlinky.expoLocation.locationTypesMod.LocationActivityType.OtherNavigation with Double = js.native
  }
  
  @js.native
  object GeofencingEventType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationGeofencingEventType with Double] = js.native
    
    /* 1 */ val Enter: typingsSlinky.expoLocation.locationTypesMod.LocationGeofencingEventType.Enter with Double = js.native
    
    /* 2 */ val Exit: typingsSlinky.expoLocation.locationTypesMod.LocationGeofencingEventType.Exit with Double = js.native
  }
  
  @js.native
  object GeofencingRegionState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationGeofencingRegionState with Double] = js.native
    
    /* 1 */ val Inside: typingsSlinky.expoLocation.locationTypesMod.LocationGeofencingRegionState.Inside with Double = js.native
    
    /* 2 */ val Outside: typingsSlinky.expoLocation.locationTypesMod.LocationGeofencingRegionState.Outside with Double = js.native
    
    /* 0 */ val Unknown: typingsSlinky.expoLocation.locationTypesMod.LocationGeofencingRegionState.Unknown with Double = js.native
  }
  
  @js.native
  object LocationAccuracy extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.expoLocation.locationTypesMod.LocationAccuracy with Double] = js.native
    
    /* 3 */ val Balanced: typingsSlinky.expoLocation.locationTypesMod.LocationAccuracy.Balanced with Double = js.native
    
    /* 6 */ val BestForNavigation: typingsSlinky.expoLocation.locationTypesMod.LocationAccuracy.BestForNavigation with Double = js.native
    
    /* 4 */ val High: typingsSlinky.expoLocation.locationTypesMod.LocationAccuracy.High with Double = js.native
    
    /* 5 */ val Highest: typingsSlinky.expoLocation.locationTypesMod.LocationAccuracy.Highest with Double = js.native
    
    /* 2 */ val Low: typingsSlinky.expoLocation.locationTypesMod.LocationAccuracy.Low with Double = js.native
    
    /* 1 */ val Lowest: typingsSlinky.expoLocation.locationTypesMod.LocationAccuracy.Lowest with Double = js.native
  }
  
  @js.native
  object LocationActivityType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.expoLocation.locationTypesMod.LocationActivityType with Double] = js.native
    
    /* 5 */ val Airborne: typingsSlinky.expoLocation.locationTypesMod.LocationActivityType.Airborne with Double = js.native
    
    /* 2 */ val AutomotiveNavigation: typingsSlinky.expoLocation.locationTypesMod.LocationActivityType.AutomotiveNavigation with Double = js.native
    
    /* 3 */ val Fitness: typingsSlinky.expoLocation.locationTypesMod.LocationActivityType.Fitness with Double = js.native
    
    /* 1 */ val Other: typingsSlinky.expoLocation.locationTypesMod.LocationActivityType.Other with Double = js.native
    
    /* 4 */ val OtherNavigation: typingsSlinky.expoLocation.locationTypesMod.LocationActivityType.OtherNavigation with Double = js.native
  }
  
  @js.native
  object LocationGeofencingEventType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.expoLocation.locationTypesMod.LocationGeofencingEventType with Double
      ] = js.native
    
    /* 1 */ val Enter: typingsSlinky.expoLocation.locationTypesMod.LocationGeofencingEventType.Enter with Double = js.native
    
    /* 2 */ val Exit: typingsSlinky.expoLocation.locationTypesMod.LocationGeofencingEventType.Exit with Double = js.native
  }
  
  @js.native
  object LocationGeofencingRegionState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.expoLocation.locationTypesMod.LocationGeofencingRegionState with Double
      ] = js.native
    
    /* 1 */ val Inside: typingsSlinky.expoLocation.locationTypesMod.LocationGeofencingRegionState.Inside with Double = js.native
    
    /* 2 */ val Outside: typingsSlinky.expoLocation.locationTypesMod.LocationGeofencingRegionState.Outside with Double = js.native
    
    /* 0 */ val Unknown: typingsSlinky.expoLocation.locationTypesMod.LocationGeofencingRegionState.Unknown with Double = js.native
  }
  
  @js.native
  object PermissionStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus with String] = js.native
    
    /* "denied" */ val DENIED: typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus.DENIED with String = js.native
    
    /* "granted" */ val GRANTED: typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus.GRANTED with String = js.native
    
    /* "undetermined" */ val UNDETERMINED: typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus.UNDETERMINED with String = js.native
  }
}
