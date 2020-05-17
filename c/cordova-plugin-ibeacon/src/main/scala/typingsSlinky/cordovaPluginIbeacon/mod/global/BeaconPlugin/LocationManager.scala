package typingsSlinky.cordovaPluginIbeacon.mod.global.BeaconPlugin

import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationManager extends js.Object {
  var BeaconRegion: typingsSlinky.cordovaPluginIbeacon.mod.global.BeaconPlugin.BeaconRegion = js.native
  var Region: typingsSlinky.cordovaPluginIbeacon.mod.global.BeaconPlugin.Region = js.native
  var delegate: Delegate = js.native
  def appendToDeviceLog(message: String): Promise[String] = js.native
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
  implicit class LocationManagerOps[Self <: LocationManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeaconRegion(value: BeaconRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeaconRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendToDeviceLog(value: String => Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToDeviceLog")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelegate(value: Delegate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableBluetooth(value: () => Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableBluetooth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisableDebugLogs(value: () => Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDebugLogs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisableDebugNotifications(value: () => Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDebugNotifications")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableBluetooth(value: () => Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBluetooth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableDebugLogs(value: () => Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDebugLogs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableDebugNotifications(value: () => Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDebugNotifications")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAuthorizationStatus(value: () => Promise[PluginResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAuthorizationStatus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMonitoredRegions(value: () => Promise[js.Array[Region]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMonitoredRegions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRangedRegions(value: () => Promise[js.Array[Region]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRangedRegions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsAdvertising(value: () => Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAdvertising")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsAdvertisingAvailable(value: () => Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAdvertisingAvailable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsBluetoothEnabled(value: () => Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBluetoothEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsMonitoringAvailableForClass(value: Region => Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMonitoringAvailableForClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsRangingAvailable(value: () => Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRangingAvailable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDomDelegateReady(value: () => Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDomDelegateReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequestAlwaysAuthorization(value: () => Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAlwaysAuthorization")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequestStateForRegion(value: Region => Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestStateForRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestWhenInUseAuthorization(value: () => Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestWhenInUseAuthorization")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartAdvertising(value: (Region, Boolean) => Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAdvertising")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStartMonitoringForRegion(value: Region => Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMonitoringForRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartRangingBeaconsInRegion(value: Region => Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRangingBeaconsInRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStopAdvertising(value: () => Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAdvertising")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopMonitoringForRegion(value: Region => Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopMonitoringForRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStopRangingBeaconsInRegion(value: Region => Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopRangingBeaconsInRegion")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

