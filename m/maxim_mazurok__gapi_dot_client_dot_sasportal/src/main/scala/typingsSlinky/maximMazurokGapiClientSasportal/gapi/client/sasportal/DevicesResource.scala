package typingsSlinky.maximMazurokGapiClientSasportal.gapi.client.sasportal

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSasportal.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientSasportal.anon.Alt
import typingsSlinky.maximMazurokGapiClientSasportal.anon.Callback
import typingsSlinky.maximMazurokGapiClientSasportal.anon.Fields
import typingsSlinky.maximMazurokGapiClientSasportal.anon.Key
import typingsSlinky.maximMazurokGapiClientSasportal.anon.Name
import typingsSlinky.maximMazurokGapiClientSasportal.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientSasportal.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientSasportal.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientSasportal.anon.Resource
import typingsSlinky.maximMazurokGapiClientSasportal.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesResource extends StObject {
  
  def bulk(request: Alt, body: SasPortalBulkCreateDeviceRequest): Request[SasPortalBulkCreateDeviceResponse] = js.native
  /** Creates a device under a node or customer. Returned devices are unordered. */
  def bulk(request: Key): Request[SasPortalBulkCreateDeviceResponse] = js.native
  
  /** Creates a device under a node or customer. */
  def create(request: Accesstoken): Request[SasPortalDevice] = js.native
  def create(request: Alt, body: SasPortalDevice): Request[SasPortalDevice] = js.native
  
  def createSigned(request: Alt, body: SasPortalCreateSignedDeviceRequest): Request[SasPortalDevice] = js.native
  /** Creates a signed device under a node or customer. */
  def createSigned(request: Callback): Request[SasPortalDevice] = js.native
  
  /** Deletes a device. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Gets details about a device. */
  def get(): Request[SasPortalDevice] = js.native
  def get(request: Name): Request[SasPortalDevice] = js.native
  
  /** Lists devices under a node or customer. */
  def list(): Request[SasPortalListDevicesResponse] = js.native
  def list(request: Fields): Request[SasPortalListDevicesResponse] = js.native
  
  def move(request: Name, body: SasPortalMoveDeviceRequest): Request[SasPortalOperation] = js.native
  /** Moves a device under another node or customer. */
  def move(request: Oauthtoken): Request[SasPortalOperation] = js.native
  
  /** Updates a device. */
  def patch(request: PrettyPrint): Request[SasPortalDevice] = js.native
  def patch(request: QuotaUser, body: SasPortalDevice): Request[SasPortalDevice] = js.native
  
  def signDevice(request: Name, body: SasPortalSignDeviceRequest): Request[js.Object] = js.native
  /** Signs a device. */
  def signDevice(request: Resource): Request[js.Object] = js.native
  
  def updateSigned(request: Name, body: SasPortalUpdateSignedDeviceRequest): Request[SasPortalDevice] = js.native
  /** Updates a signed device. */
  def updateSigned(request: UploadType): Request[SasPortalDevice] = js.native
}
