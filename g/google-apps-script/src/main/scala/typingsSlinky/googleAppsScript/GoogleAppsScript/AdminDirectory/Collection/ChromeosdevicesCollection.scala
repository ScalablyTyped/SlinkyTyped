package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDevice
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceAction
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDevices
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsMoveDevicesToOu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChromeosdevicesCollection extends js.Object {
  
  // Take action on Chrome OS Device
  def action(resource: ChromeOsDeviceAction, customerId: String, resourceId: String): Unit = js.native
  
  // Retrieve Chrome OS Device
  def get(customerId: String, deviceId: String): ChromeOsDevice = js.native
  // Retrieve Chrome OS Device
  def get(customerId: String, deviceId: String, optionalArgs: js.Object): ChromeOsDevice = js.native
  
  // Retrieve all Chrome OS Devices of a customer (paginated)
  def list(customerId: String): ChromeOsDevices = js.native
  // Retrieve all Chrome OS Devices of a customer (paginated)
  def list(customerId: String, optionalArgs: js.Object): ChromeOsDevices = js.native
  
  // Move or insert multiple Chrome OS Devices to organizational unit
  def moveDevicesToOu(resource: ChromeOsMoveDevicesToOu, customerId: String, orgUnitPath: String): Unit = js.native
  
  // Update Chrome OS Device. This method supports patch semantics.
  def patch(resource: ChromeOsDevice, customerId: String, deviceId: String): ChromeOsDevice = js.native
  // Update Chrome OS Device. This method supports patch semantics.
  def patch(resource: ChromeOsDevice, customerId: String, deviceId: String, optionalArgs: js.Object): ChromeOsDevice = js.native
  
  // Update Chrome OS Device
  def update(resource: ChromeOsDevice, customerId: String, deviceId: String): ChromeOsDevice = js.native
  // Update Chrome OS Device
  def update(resource: ChromeOsDevice, customerId: String, deviceId: String, optionalArgs: js.Object): ChromeOsDevice = js.native
}
