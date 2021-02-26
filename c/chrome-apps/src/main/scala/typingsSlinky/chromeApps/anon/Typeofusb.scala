package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.integer
import typingsSlinky.chromeApps.chrome.usb.ConfigDescriptor
import typingsSlinky.chromeApps.chrome.usb.ConnectionHandle
import typingsSlinky.chromeApps.chrome.usb.Device
import typingsSlinky.chromeApps.chrome.usb.DeviceEvent
import typingsSlinky.chromeApps.chrome.usb.GenericTransferInfo
import typingsSlinky.chromeApps.chrome.usb.InterfaceDescriptor
import typingsSlinky.chromeApps.chrome.usb.IsochronousTransferInfo
import typingsSlinky.chromeApps.chrome.usb.TransferInfo
import typingsSlinky.chromeApps.chrome.usb.TransferResultInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofusb extends StObject {
  
  /** Direction, Recipient, RequestType, and TransferType all map to their namesakes within the USB specification. */
  val Direction: IN = js.native
  
  /** Direction, Recipient, RequestType, and TransferType all map to their namesakes within the USB specification. */
  val Recipient: DEVICE = js.native
  
  /** Direction, Recipient, RequestType, and TransferType all map to their namesakes within the USB specification. */
  val RequestType: CLASS = js.native
  
  val SynchronizationType: ADAPTIVE = js.native
  
  /** Direction, Recipient, RequestType, and TransferType all map to their namesakes within the USB specification. */
  val TransferType: BULK = js.native
  
  val UsageType: DATA_ = js.native
  
  /**
    * @description Performs a bulk transfer on the specified device.
    * @param handle An open connection to the device.
    * @param transferInfo The transfer parameters.
    * @param callback
    */
  def bulkTransfer(
    handle: ConnectionHandle,
    transferInfo: GenericTransferInfo,
    callback: js.Function1[/* info */ TransferResultInfo, Unit]
  ): Unit = js.native
  
  /**
    * Claims an interface on a USB device.
    * Before data can be transfered to an interface or associated endpoints the interface must be claimed.
    * Only one connection handle can claim an interface at any given time.
    * If the interface is already claimed, this call will fail.
    *
    * **releaseInterface** should be called when the interface is no longer needed.
    * @param handle An open connection to the device.
    * @param interfaceNumber The interface to be claimed.
    * @param callback
    */
  def claimInterface(handle: ConnectionHandle, interfaceNumber: integer, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Closes a connection handle.
    * Invoking operations on a handle after it has been closed is a safe operation but causes no action to be taken.
    * @param handle The ConnectionHandle to close.
    * @param [callback]
    */
  def closeDevice(handle: ConnectionHandle): Unit = js.native
  def closeDevice(handle: ConnectionHandle, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Performs a control transfer on the specified device.
    * Control transfers refer to either the device, an interface or an endpoint.
    * Transfers to an interface or endpoint require the interface to be claimed.
    * @param handle An open connection to the device.
    * @param transferInfo Transfer info
    * @param callback
    */
  def controlTransfer(
    handle: ConnectionHandle,
    transferInfo: TransferInfo,
    callback: js.Function1[/* info */ TransferResultInfo, Unit]
  ): Unit = js.native
  
  /**
    * Finds USB devices specified by the vendor, product and (optionally) interface IDs and if permissions allow opens them for use.
    * If the access request is rejected or the device fails to be opened a connection handle will not be created or returned.
    * Calling this method is equivalent to calling *getDevices* followed by *openDevice* for each device.
    * @param options The properties to search for on target devices.
    *                  - vendorId: The device vendor ID.
    *                  - productId: The product ID.
    *                  - The interface ID to request access to. Only available on Chrome OS. It has no effect on other platforms.
    * @requires(CrOS) Chrome OS if you specify *interfaceId*
    * @param callback
    */
  def findDevices(options: InterfaceId, callback: js.Function1[/* handles */ js.Array[ConnectionHandle], Unit]): Unit = js.native
  /**
    * Finds USB devices specified by the vendor, product and (optionally) interface IDs and if permissions allow opens them for use.
    * If the access request is rejected or the device fails to be opened a connection handle will not be created or returned.
    * Calling this method is equivalent to calling *getDevices* followed by *openDevice* for each device.
    * @param options The properties to search for on target devices.
    *                  - vendorId: The device vendor ID.
    *                  - productId: The product ID.
    * @param callback
    */
  def findDevices(options: ProductId, callback: js.Function1[/* handles */ js.Array[ConnectionHandle], Unit]): Unit = js.native
  
  /**
    * Gets the configuration descriptor for the currently selected configuration.
    * @since Chrome 39.
    * @param handle An open connection to the device.
    * @param callback
    */
  def getConfiguration(handle: ConnectionHandle, callback: js.Function1[/* config */ ConfigDescriptor, Unit]): Unit = js.native
  
  /**
    * Returns the full set of device configuration descriptors.
    * @since Chrome 47.
    * @param device The Device to fetch descriptors from.
    * @param callback
    */
  def getConfigurations(device: Device, callback: js.Function1[/* configs */ js.Array[ConfigDescriptor], Unit]): Unit = js.native
  
  /**
    * @description Enumerates connected USB devices.
    * @since Chrome 39.
    * @param options The properties to search for on target devices.
    * @param callback
    */
  def getDevices(options: Filters, callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
  
  /**
    * Presents a device picker to the user and returns the Devices selected.
    * If the user cancels the picker devices will be empty.
    * A user gesture is required for the dialog to display. Without a user gesture,
    * the callback will run as though the user cancelled.
    * @since Chrome 40.
    * @param options Configuration of the device picker dialog box.
    *               - multiple: Allow the user to select multiple devices.
    *               - filters: Filter the list of devices presented to the user.
    *                   If multiple filters are provided, devices matching any filter will be displayed.
    * @param callback Invoked with a list of chosen Devices.
    */
  def getUserSelectedDevices(options: Multiple, callback: js.Function1[/* devices */ js.Array[Device], Unit]): Unit = js.native
  
  /**
    * @description Performs an interrupt transfer on the specified device.
    * @param handle An open connection to the device.
    * @param transferInfo The transfer parameters.
    * @param callback
    */
  def interruptTransfer(
    handle: ConnectionHandle,
    transferInfo: GenericTransferInfo,
    callback: js.Function1[/* info */ TransferResultInfo, Unit]
  ): Unit = js.native
  
  /**
    * @description Performs an isochronous transfer on the specific device.
    * @param handle An open connection to the device.
    * @param transferInfo
    * @param callback
    */
  def isochronousTransfer(
    handle: ConnectionHandle,
    transferInfo: IsochronousTransferInfo,
    callback: js.Function1[/* info */ TransferResultInfo, Unit]
  ): Unit = js.native
  
  /**
    * @description Lists all interfaces on a USB device.
    * @param handle An open connection to the device.
    * @param callback
    */
  def listInterfaces(
    handle: ConnectionHandle,
    callback: js.Function1[/* descriptors */ js.Array[InterfaceDescriptor], Unit]
  ): Unit = js.native
  
  /**
    * Event generated when a device is added to the system.
    * Events are only broadcast to apps that have permission to access the device.
    * Permission may have been granted at install time, when the user accepted an optional permission
    * (@see[permissions.request]{https://developer.chrome.com/apps/permissions#method-request}),
    * or through **getUserSelectedDevices**.
    * @since Chrome 42.
    */
  val onDeviceAdded: DeviceEvent = js.native
  
  /**
    * Event generated when a device is removed from the system.
    * See **onDeviceAdded** for which events are delivered.
    * @since Chrome 42.
    */
  val onDeviceRemoved: DeviceEvent = js.native
  
  /**
    * Opens a USB device returned by *getDevices*
    * @since Chrome 31.
    * @param device The device to open.
    * @param callback
    */
  def openDevice(device: Device, callback: js.Function1[/* handle */ ConnectionHandle, Unit]): Unit = js.native
  
  /**
    * @description Releases a claimed interface.
    * @param handle An open connection to the device.
    * @param interfaceNumber The interface to be released.
    * @param callback
    */
  def releaseInterface(handle: ConnectionHandle, interfaceNumber: integer, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * @deprecated Since Chrome 40.
    * @requires(CrOS) Chrome OS specific. This operation is now implicitly performed as a part of *openDevice*.
    */
  def requestAccess(device: Device, interfaceId: integer, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  
  /**
    * Tries to reset the USB device. If the reset fails, the given connection handle will be closed
    * and the USB device will appear to be disconnected then reconnected.
    * In this case **getDevices** or **findDevices** must be called again to acquire the device.
    * @param handle A connection handle to reset.
    * @param callback
    */
  def resetDevice(handle: ConnectionHandle, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  
  /**
    * Select a device configuration.
    * This function effectively resets the device by selecting one of the
    * device's available configurations. Only configuration values greater
    * than 0 are valid however some buggy devices have a working
    * configuration 0 and so this value is allowed.
    * @since Chrome 42.
    * @param handle An open connection to the device.
    * @param configurationValue
    * @param callback
    */
  def setConfiguration(handle: ConnectionHandle, configurationValue: integer, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * @description Selects an alternate setting on a previously claimed interface.
    * @param handle An open connection to the device where this interface has been claimed.
    * @param interfaceNumber The interface to configure.
    * @param alternateSetting The alternate setting to configure.
    * @param callback
    */
  def setInterfaceAlternateSetting(
    handle: ConnectionHandle,
    interfaceNumber: integer,
    alternateSetting: integer,
    callback: js.Function0[Unit]
  ): Unit = js.native
}
