package typingsSlinky.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.anon.Alt
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.anon.Callback
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.anon.Fields
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.anon.Key
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.anon.Name
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.anon.Resource
import typingsSlinky.maximMazurokGapiClientProdTtSasportal.anon.UploadType
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
