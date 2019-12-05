package typingsSlinky.reactDashNativeDashZeroconf.reactDashNativeDashZeroconfMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.NodeJS.EventEmitter
import typingsSlinky.reactDashNativeDashZeroconf.reactDashNativeDashZeroconfStrings.error
import typingsSlinky.reactDashNativeDashZeroconf.reactDashNativeDashZeroconfStrings.found
import typingsSlinky.reactDashNativeDashZeroconf.reactDashNativeDashZeroconfStrings.remove
import typingsSlinky.reactDashNativeDashZeroconf.reactDashNativeDashZeroconfStrings.resolved
import typingsSlinky.reactDashNativeDashZeroconf.reactDashNativeDashZeroconfStrings.start
import typingsSlinky.reactDashNativeDashZeroconf.reactDashNativeDashZeroconfStrings.stop
import typingsSlinky.reactDashNativeDashZeroconf.reactDashNativeDashZeroconfStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zeroconf extends EventEmitter {
  /**
    * Add listeners
    *
    * @description If you cleaned the listeners and need to get them back
    * on.
    */
  def addDeviceListeners(): Unit = js.native
  /**
    * Returns resolved services.
    *
    * @description Will return all names of services that have been
    * resolved.
    */
  def getServices(): StringDictionary[Service] = js.native
  /**
    * Triggered when an error occurs.
    */
  @JSName("on")
  def on_error(e: error, listener: js.Function1[/* err */ js.Error, _]): this.type = js.native
  /**
    * @param name Name of the the service.
    */
  @JSName("on")
  def on_found(e: found, listener: js.Function1[/* name */ String, _]): this.type = js.native
  @JSName("on")
  def on_remove(e: remove, listener: js.Function1[/* name */ String, _]): this.type = js.native
  /**
    * Triggered when a service is resolved.
    * @description Broadcast a service object once it is fully resolved.
    */
  @JSName("on")
  def on_resolved(e: resolved, listener: js.Function1[/* service */ Service, _]): this.type = js.native
  @JSName("on")
  def on_start(e: start, listener: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_stop(e: stop, listener: js.Function0[_]): this.type = js.native
  @JSName("on")
  def on_update(e: update, listener: js.Function0[_]): this.type = js.native
  /**
    * Remove listeners.
    *
    * @description Allow you to clean the listeners, avoiding potential
    * memory leaks.
    *
    * @see https://github.com/balthazar/react-native-zeroconf/issues/33
    */
  def removeDeviceListeners(): Unit = js.native
  /**
    * Start the zeroconf scan.
    *
    * @description This will initialize the scan from the `Zeroconf`
    * instance. Will stop another scan if any is running.
    *
    * @param type Default `http`
    * @param protocol Default `tcp`
    * @param domain Default `local`
    */
  def scan(): Unit = js.native
  def scan(`type`: String): Unit = js.native
  def scan(`type`: String, protocol: String): Unit = js.native
  def scan(`type`: String, protocol: String, domain: String): Unit = js.native
  /**
    * Stop the scan.
    *
    * @description If any scan is running, stop it. Otherwise do nothing.
    */
  def stop(): Unit = js.native
}

