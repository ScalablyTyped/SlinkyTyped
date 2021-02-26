package typingsSlinky.cordovaPluginIbeacon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typingsSlinky.cordovaPluginIbeacon.mod.global.BeaconPlugin.LocationManager
import typingsSlinky.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    object BeaconPlugin {
      
      @js.native
      trait Beacon extends StObject {
        
        var accuracy: Double = js.native
        
        var major: String = js.native
        
        var minor: String = js.native
        
        var proximity: String = js.native
        
        var rssi: Double = js.native
        
        var tx: Double = js.native
        
        var uuid: String = js.native
      }
      object Beacon {
        
        @scala.inline
        def apply(
          accuracy: Double,
          major: String,
          minor: String,
          proximity: String,
          rssi: Double,
          tx: Double,
          uuid: String
        ): Beacon = {
          val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], proximity = proximity.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
          __obj.asInstanceOf[Beacon]
        }
        
        @scala.inline
        implicit class BeaconMutableBuilder[Self <: Beacon] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setProximity(value: String): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRssi(value: Double): Self = StObject.set(x, "rssi", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTx(value: Double): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait BeaconRegion
        extends Region
           with Instantiable2[/* identifier */ String, /* uuid */ String, BeaconRegion]
           with Instantiable3[/* identifier */ String, /* uuid */ String, /* major */ Double, BeaconRegion]
           with Instantiable4[
                  /* identifier */ String, 
                  /* uuid */ String, 
                  js.UndefOr[/* major */ Double], 
                  /* minor */ Double, 
                  BeaconRegion
                ]
           with Instantiable5[
                  /* identifier */ String, 
                  /* uuid */ String, 
                  js.UndefOr[/* major */ Double], 
                  js.UndefOr[/* minor */ Double], 
                  /* notifyEntryStateOnDisplay */ Boolean, 
                  BeaconRegion
                ] {
        
        var major: String = js.native
        
        var minor: String = js.native
        
        var notifyEntryStateOnDisplay: Boolean = js.native
        
        var uuid: String = js.native
      }
      
      @js.native
      trait CircularRegion
        extends Region
           with Instantiable4[
                  /* identifier */ String, 
                  /* latitude */ Double, 
                  /* longitude */ Double, 
                  /* radius */ Double, 
                  CircularRegion
                ] {
        
        var latitude: Double = js.native
        
        var longitude: Double = js.native
        
        var radius: Double = js.native
      }
      
      @js.native
      trait Delegate extends StObject {
        
        def didChangeAuthorizationStatus(authorizationStatus: String): Unit = js.native
        
        def didDetermineStateForRegion(pluginResult: PluginResult): Unit = js.native
        
        def didEnterRegion(pluginResult: PluginResult): Unit = js.native
        
        def didExitRegion(pluginResult: PluginResult): Unit = js.native
        
        def didRangeBeaconsInRegion(pluginResult: PluginResult): Unit = js.native
        
        def didStartMonitoringForRegion(pluginResult: PluginResult): Unit = js.native
        
        def monitoringDidFailForRegionWithError(pluginResult: PluginResult): Unit = js.native
        
        def peripheralManagerDidStartAdvertising(pluginResult: PluginResult): Unit = js.native
        
        def peripheralManagerDidUpdateState(pluginResult: PluginResult): Unit = js.native
      }
      object Delegate {
        
        @scala.inline
        def apply(
          didChangeAuthorizationStatus: String => Unit,
          didDetermineStateForRegion: PluginResult => Unit,
          didEnterRegion: PluginResult => Unit,
          didExitRegion: PluginResult => Unit,
          didRangeBeaconsInRegion: PluginResult => Unit,
          didStartMonitoringForRegion: PluginResult => Unit,
          monitoringDidFailForRegionWithError: PluginResult => Unit,
          peripheralManagerDidStartAdvertising: PluginResult => Unit,
          peripheralManagerDidUpdateState: PluginResult => Unit
        ): Delegate = {
          val __obj = js.Dynamic.literal(didChangeAuthorizationStatus = js.Any.fromFunction1(didChangeAuthorizationStatus), didDetermineStateForRegion = js.Any.fromFunction1(didDetermineStateForRegion), didEnterRegion = js.Any.fromFunction1(didEnterRegion), didExitRegion = js.Any.fromFunction1(didExitRegion), didRangeBeaconsInRegion = js.Any.fromFunction1(didRangeBeaconsInRegion), didStartMonitoringForRegion = js.Any.fromFunction1(didStartMonitoringForRegion), monitoringDidFailForRegionWithError = js.Any.fromFunction1(monitoringDidFailForRegionWithError), peripheralManagerDidStartAdvertising = js.Any.fromFunction1(peripheralManagerDidStartAdvertising), peripheralManagerDidUpdateState = js.Any.fromFunction1(peripheralManagerDidUpdateState))
          __obj.asInstanceOf[Delegate]
        }
        
        @scala.inline
        implicit class DelegateMutableBuilder[Self <: Delegate] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDidChangeAuthorizationStatus(value: String => Unit): Self = StObject.set(x, "didChangeAuthorizationStatus", js.Any.fromFunction1(value))
          
          @scala.inline
          def setDidDetermineStateForRegion(value: PluginResult => Unit): Self = StObject.set(x, "didDetermineStateForRegion", js.Any.fromFunction1(value))
          
          @scala.inline
          def setDidEnterRegion(value: PluginResult => Unit): Self = StObject.set(x, "didEnterRegion", js.Any.fromFunction1(value))
          
          @scala.inline
          def setDidExitRegion(value: PluginResult => Unit): Self = StObject.set(x, "didExitRegion", js.Any.fromFunction1(value))
          
          @scala.inline
          def setDidRangeBeaconsInRegion(value: PluginResult => Unit): Self = StObject.set(x, "didRangeBeaconsInRegion", js.Any.fromFunction1(value))
          
          @scala.inline
          def setDidStartMonitoringForRegion(value: PluginResult => Unit): Self = StObject.set(x, "didStartMonitoringForRegion", js.Any.fromFunction1(value))
          
          @scala.inline
          def setMonitoringDidFailForRegionWithError(value: PluginResult => Unit): Self = StObject.set(x, "monitoringDidFailForRegionWithError", js.Any.fromFunction1(value))
          
          @scala.inline
          def setPeripheralManagerDidStartAdvertising(value: PluginResult => Unit): Self = StObject.set(x, "peripheralManagerDidStartAdvertising", js.Any.fromFunction1(value))
          
          @scala.inline
          def setPeripheralManagerDidUpdateState(value: PluginResult => Unit): Self = StObject.set(x, "peripheralManagerDidUpdateState", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait LocationManager extends StObject {
        
        var BeaconRegion: typingsSlinky.cordovaPluginIbeacon.mod.global.BeaconPlugin.BeaconRegion = js.native
        
        var Region: typingsSlinky.cordovaPluginIbeacon.mod.global.BeaconPlugin.Region = js.native
        
        def appendToDeviceLog(message: String): Promise[String] = js.native
        
        var delegate: Delegate = js.native
        
        def disableBluetooth(): Promise[Unit] = js.native
        
        def disableDebugLogs(): Promise[Unit] = js.native
        
        def disableDebugNotifications(): Promise[Unit] = js.native
        
        def enableBluetooth(): Promise[Unit] = js.native
        
        def enableDebugLogs(): Promise[Unit] = js.native
        
        def enableDebugNotifications(): Promise[Unit] = js.native
        
        def getAuthorizationStatus(): Promise[PluginResult] = js.native
        
        def getMonitoredRegions(): Promise[js.Array[Region]] = js.native
        
        def getRangedRegions(): Promise[js.Array[Region]] = js.native
        
        def isAdvertising(): Promise[Boolean] = js.native
        
        def isAdvertisingAvailable(): Promise[Boolean] = js.native
        
        def isBluetoothEnabled(): Promise[Boolean] = js.native
        
        def isMonitoringAvailableForClass(region: Region): Promise[Boolean] = js.native
        
        def isRangingAvailable(): Promise[Boolean] = js.native
        
        def onDomDelegateReady(): Promise[Unit] = js.native
        
        def requestAlwaysAuthorization(): Promise[Unit] = js.native
        
        def requestStateForRegion(region: Region): Promise[Unit] = js.native
        
        def requestWhenInUseAuthorization(): Promise[Unit] = js.native
        
        def startAdvertising(region: Region, measuredPower: Boolean): Promise[Unit] = js.native
        
        def startMonitoringForRegion(region: Region): Promise[Unit] = js.native
        
        def startRangingBeaconsInRegion(region: Region): Promise[Unit] = js.native
        
        def stopAdvertising(): Promise[Unit] = js.native
        
        def stopMonitoringForRegion(region: Region): Promise[Unit] = js.native
        
        def stopRangingBeaconsInRegion(region: Region): Promise[Unit] = js.native
      }
      object LocationManager {
        
        @scala.inline
        def apply(
          BeaconRegion: BeaconRegion,
          Region: Region,
          appendToDeviceLog: String => Promise[String],
          delegate: Delegate,
          disableBluetooth: () => Promise[Unit],
          disableDebugLogs: () => Promise[Unit],
          disableDebugNotifications: () => Promise[Unit],
          enableBluetooth: () => Promise[Unit],
          enableDebugLogs: () => Promise[Unit],
          enableDebugNotifications: () => Promise[Unit],
          getAuthorizationStatus: () => Promise[PluginResult],
          getMonitoredRegions: () => Promise[js.Array[Region]],
          getRangedRegions: () => Promise[js.Array[Region]],
          isAdvertising: () => Promise[Boolean],
          isAdvertisingAvailable: () => Promise[Boolean],
          isBluetoothEnabled: () => Promise[Boolean],
          isMonitoringAvailableForClass: Region => Promise[Boolean],
          isRangingAvailable: () => Promise[Boolean],
          onDomDelegateReady: () => Promise[Unit],
          requestAlwaysAuthorization: () => Promise[Unit],
          requestStateForRegion: Region => Promise[Unit],
          requestWhenInUseAuthorization: () => Promise[Unit],
          startAdvertising: (Region, Boolean) => Promise[Unit],
          startMonitoringForRegion: Region => Promise[Unit],
          startRangingBeaconsInRegion: Region => Promise[Unit],
          stopAdvertising: () => Promise[Unit],
          stopMonitoringForRegion: Region => Promise[Unit],
          stopRangingBeaconsInRegion: Region => Promise[Unit]
        ): LocationManager = {
          val __obj = js.Dynamic.literal(BeaconRegion = BeaconRegion.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any], appendToDeviceLog = js.Any.fromFunction1(appendToDeviceLog), delegate = delegate.asInstanceOf[js.Any], disableBluetooth = js.Any.fromFunction0(disableBluetooth), disableDebugLogs = js.Any.fromFunction0(disableDebugLogs), disableDebugNotifications = js.Any.fromFunction0(disableDebugNotifications), enableBluetooth = js.Any.fromFunction0(enableBluetooth), enableDebugLogs = js.Any.fromFunction0(enableDebugLogs), enableDebugNotifications = js.Any.fromFunction0(enableDebugNotifications), getAuthorizationStatus = js.Any.fromFunction0(getAuthorizationStatus), getMonitoredRegions = js.Any.fromFunction0(getMonitoredRegions), getRangedRegions = js.Any.fromFunction0(getRangedRegions), isAdvertising = js.Any.fromFunction0(isAdvertising), isAdvertisingAvailable = js.Any.fromFunction0(isAdvertisingAvailable), isBluetoothEnabled = js.Any.fromFunction0(isBluetoothEnabled), isMonitoringAvailableForClass = js.Any.fromFunction1(isMonitoringAvailableForClass), isRangingAvailable = js.Any.fromFunction0(isRangingAvailable), onDomDelegateReady = js.Any.fromFunction0(onDomDelegateReady), requestAlwaysAuthorization = js.Any.fromFunction0(requestAlwaysAuthorization), requestStateForRegion = js.Any.fromFunction1(requestStateForRegion), requestWhenInUseAuthorization = js.Any.fromFunction0(requestWhenInUseAuthorization), startAdvertising = js.Any.fromFunction2(startAdvertising), startMonitoringForRegion = js.Any.fromFunction1(startMonitoringForRegion), startRangingBeaconsInRegion = js.Any.fromFunction1(startRangingBeaconsInRegion), stopAdvertising = js.Any.fromFunction0(stopAdvertising), stopMonitoringForRegion = js.Any.fromFunction1(stopMonitoringForRegion), stopRangingBeaconsInRegion = js.Any.fromFunction1(stopRangingBeaconsInRegion))
          __obj.asInstanceOf[LocationManager]
        }
        
        @scala.inline
        implicit class LocationManagerMutableBuilder[Self <: LocationManager] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAppendToDeviceLog(value: String => Promise[String]): Self = StObject.set(x, "appendToDeviceLog", js.Any.fromFunction1(value))
          
          @scala.inline
          def setBeaconRegion(value: BeaconRegion): Self = StObject.set(x, "BeaconRegion", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDelegate(value: Delegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisableBluetooth(value: () => Promise[Unit]): Self = StObject.set(x, "disableBluetooth", js.Any.fromFunction0(value))
          
          @scala.inline
          def setDisableDebugLogs(value: () => Promise[Unit]): Self = StObject.set(x, "disableDebugLogs", js.Any.fromFunction0(value))
          
          @scala.inline
          def setDisableDebugNotifications(value: () => Promise[Unit]): Self = StObject.set(x, "disableDebugNotifications", js.Any.fromFunction0(value))
          
          @scala.inline
          def setEnableBluetooth(value: () => Promise[Unit]): Self = StObject.set(x, "enableBluetooth", js.Any.fromFunction0(value))
          
          @scala.inline
          def setEnableDebugLogs(value: () => Promise[Unit]): Self = StObject.set(x, "enableDebugLogs", js.Any.fromFunction0(value))
          
          @scala.inline
          def setEnableDebugNotifications(value: () => Promise[Unit]): Self = StObject.set(x, "enableDebugNotifications", js.Any.fromFunction0(value))
          
          @scala.inline
          def setGetAuthorizationStatus(value: () => Promise[PluginResult]): Self = StObject.set(x, "getAuthorizationStatus", js.Any.fromFunction0(value))
          
          @scala.inline
          def setGetMonitoredRegions(value: () => Promise[js.Array[Region]]): Self = StObject.set(x, "getMonitoredRegions", js.Any.fromFunction0(value))
          
          @scala.inline
          def setGetRangedRegions(value: () => Promise[js.Array[Region]]): Self = StObject.set(x, "getRangedRegions", js.Any.fromFunction0(value))
          
          @scala.inline
          def setIsAdvertising(value: () => Promise[Boolean]): Self = StObject.set(x, "isAdvertising", js.Any.fromFunction0(value))
          
          @scala.inline
          def setIsAdvertisingAvailable(value: () => Promise[Boolean]): Self = StObject.set(x, "isAdvertisingAvailable", js.Any.fromFunction0(value))
          
          @scala.inline
          def setIsBluetoothEnabled(value: () => Promise[Boolean]): Self = StObject.set(x, "isBluetoothEnabled", js.Any.fromFunction0(value))
          
          @scala.inline
          def setIsMonitoringAvailableForClass(value: Region => Promise[Boolean]): Self = StObject.set(x, "isMonitoringAvailableForClass", js.Any.fromFunction1(value))
          
          @scala.inline
          def setIsRangingAvailable(value: () => Promise[Boolean]): Self = StObject.set(x, "isRangingAvailable", js.Any.fromFunction0(value))
          
          @scala.inline
          def setOnDomDelegateReady(value: () => Promise[Unit]): Self = StObject.set(x, "onDomDelegateReady", js.Any.fromFunction0(value))
          
          @scala.inline
          def setRegion(value: Region): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRequestAlwaysAuthorization(value: () => Promise[Unit]): Self = StObject.set(x, "requestAlwaysAuthorization", js.Any.fromFunction0(value))
          
          @scala.inline
          def setRequestStateForRegion(value: Region => Promise[Unit]): Self = StObject.set(x, "requestStateForRegion", js.Any.fromFunction1(value))
          
          @scala.inline
          def setRequestWhenInUseAuthorization(value: () => Promise[Unit]): Self = StObject.set(x, "requestWhenInUseAuthorization", js.Any.fromFunction0(value))
          
          @scala.inline
          def setStartAdvertising(value: (Region, Boolean) => Promise[Unit]): Self = StObject.set(x, "startAdvertising", js.Any.fromFunction2(value))
          
          @scala.inline
          def setStartMonitoringForRegion(value: Region => Promise[Unit]): Self = StObject.set(x, "startMonitoringForRegion", js.Any.fromFunction1(value))
          
          @scala.inline
          def setStartRangingBeaconsInRegion(value: Region => Promise[Unit]): Self = StObject.set(x, "startRangingBeaconsInRegion", js.Any.fromFunction1(value))
          
          @scala.inline
          def setStopAdvertising(value: () => Promise[Unit]): Self = StObject.set(x, "stopAdvertising", js.Any.fromFunction0(value))
          
          @scala.inline
          def setStopMonitoringForRegion(value: Region => Promise[Unit]): Self = StObject.set(x, "stopMonitoringForRegion", js.Any.fromFunction1(value))
          
          @scala.inline
          def setStopRangingBeaconsInRegion(value: Region => Promise[Unit]): Self = StObject.set(x, "stopRangingBeaconsInRegion", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait PluginResult extends StObject {
        
        var authorizationStatus: String = js.native
        
        var beacons: js.Array[Beacon] = js.native
        
        var error: String = js.native
        
        var eventType: String = js.native
        
        var region: Region = js.native
        
        var state: String = js.native
      }
      object PluginResult {
        
        @scala.inline
        def apply(
          authorizationStatus: String,
          beacons: js.Array[Beacon],
          error: String,
          eventType: String,
          region: Region,
          state: String
        ): PluginResult = {
          val __obj = js.Dynamic.literal(authorizationStatus = authorizationStatus.asInstanceOf[js.Any], beacons = beacons.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
          __obj.asInstanceOf[PluginResult]
        }
        
        @scala.inline
        implicit class PluginResultMutableBuilder[Self <: PluginResult] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAuthorizationStatus(value: String): Self = StObject.set(x, "authorizationStatus", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBeacons(value: js.Array[Beacon]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBeaconsVarargs(value: Beacon*): Self = StObject.set(x, "beacons", js.Array(value :_*))
          
          @scala.inline
          def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait Region extends Instantiable1[/* identifier */ String, Region] {
        
        var identifier: String = js.native
      }
    }
    
    @js.native
    trait CordovaPlugins extends StObject {
      
      var locationManager: LocationManager = js.native
    }
    object CordovaPlugins {
      
      @scala.inline
      def apply(locationManager: LocationManager): CordovaPlugins = {
        val __obj = js.Dynamic.literal(locationManager = locationManager.asInstanceOf[js.Any])
        __obj.asInstanceOf[CordovaPlugins]
      }
      
      @scala.inline
      implicit class CordovaPluginsMutableBuilder[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLocationManager(value: LocationManager): Self = StObject.set(x, "locationManager", value.asInstanceOf[js.Any])
      }
    }
  }
}
