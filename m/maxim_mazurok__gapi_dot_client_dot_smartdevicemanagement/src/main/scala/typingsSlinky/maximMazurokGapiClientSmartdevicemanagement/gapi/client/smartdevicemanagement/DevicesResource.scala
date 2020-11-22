package typingsSlinky.maximMazurokGapiClientSmartdevicemanagement.gapi.client.smartdevicemanagement

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSmartdevicemanagement.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientSmartdevicemanagement.anon.Alt
import typingsSlinky.maximMazurokGapiClientSmartdevicemanagement.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesResource extends js.Object {
  
  /** Executes a command to device managed by the enterprise. */
  def executeCommand(request: Accesstoken): Request[GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse] = js.native
  def executeCommand(request: Alt, body: GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandRequest): Request[GoogleHomeEnterpriseSdmV1ExecuteDeviceCommandResponse] = js.native
  
  /** Gets a device managed by the enterprise. */
  def get(): Request[GoogleHomeEnterpriseSdmV1Device] = js.native
  def get(request: Alt): Request[GoogleHomeEnterpriseSdmV1Device] = js.native
  
  /** Lists devices managed by the enterprise. */
  def list(): Request[GoogleHomeEnterpriseSdmV1ListDevicesResponse] = js.native
  def list(request: Callback): Request[GoogleHomeEnterpriseSdmV1ListDevicesResponse] = js.native
}
