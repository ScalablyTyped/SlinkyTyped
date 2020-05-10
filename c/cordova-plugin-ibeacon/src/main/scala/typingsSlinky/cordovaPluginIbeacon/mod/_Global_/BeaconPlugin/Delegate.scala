package typingsSlinky.cordovaPluginIbeacon.mod._Global_.BeaconPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delegate extends js.Object {
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
  implicit class DelegateOps[Self <: Delegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDidChangeAuthorizationStatus(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didChangeAuthorizationStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDidDetermineStateForRegion(value: PluginResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didDetermineStateForRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDidEnterRegion(value: PluginResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didEnterRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDidExitRegion(value: PluginResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didExitRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDidRangeBeaconsInRegion(value: PluginResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didRangeBeaconsInRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDidStartMonitoringForRegion(value: PluginResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didStartMonitoringForRegion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMonitoringDidFailForRegionWithError(value: PluginResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoringDidFailForRegionWithError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPeripheralManagerDidStartAdvertising(value: PluginResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peripheralManagerDidStartAdvertising")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPeripheralManagerDidUpdateState(value: PluginResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peripheralManagerDidUpdateState")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

