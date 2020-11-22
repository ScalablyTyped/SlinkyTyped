package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientContent.anon.AccesstokenAccountIdAlt
import typingsSlinky.maximMazurokGapiClientContent.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientContent.anon.Key
import typingsSlinky.maximMazurokGapiClientContent.anon.OauthtokenPrettyPrintQuotaUserResource
import typingsSlinky.maximMazurokGapiClientContent.anon.UploadType
import typingsSlinky.maximMazurokGapiClientContent.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShippingsettingsResource extends js.Object {
  
  def custombatch(request: Key, body: ShippingsettingsCustomBatchRequest): Request[ShippingsettingsCustomBatchResponse] = js.native
  /** Retrieves and updates the shipping settings of multiple accounts in a single request. */
  def custombatch(request: OauthtokenPrettyPrintQuotaUserResource): Request[ShippingsettingsCustomBatchResponse] = js.native
  
  /** Retrieves the shipping settings of the account. */
  def get(): Request[ShippingSettings] = js.native
  def get(request: Uploadprotocol): Request[ShippingSettings] = js.native
  
  /** Retrieves supported carriers and carrier services for an account. */
  def getsupportedcarriers(): Request[ShippingsettingsGetSupportedCarriersResponse] = js.native
  def getsupportedcarriers(request: UploadType): Request[ShippingsettingsGetSupportedCarriersResponse] = js.native
  
  /** Retrieves supported holidays for an account. */
  def getsupportedholidays(): Request[ShippingsettingsGetSupportedHolidaysResponse] = js.native
  def getsupportedholidays(request: UploadType): Request[ShippingsettingsGetSupportedHolidaysResponse] = js.native
  
  /** Retrieves supported pickup services for an account. */
  def getsupportedpickupservices(): Request[ShippingsettingsGetSupportedPickupServicesResponse] = js.native
  def getsupportedpickupservices(request: UploadType): Request[ShippingsettingsGetSupportedPickupServicesResponse] = js.native
  
  /** Lists the shipping settings of the sub-accounts in your Merchant Center account. */
  def list(): Request[ShippingsettingsListResponse] = js.native
  def list(request: CallbackFields): Request[ShippingsettingsListResponse] = js.native
  
  /** Updates the shipping settings of the account. Any fields that are not provided are deleted from the resource. */
  def update(request: AccesstokenAccountIdAlt): Request[ShippingSettings] = js.native
  def update(request: Uploadprotocol, body: ShippingSettings): Request[ShippingSettings] = js.native
}
